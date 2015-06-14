package com.redknot.view;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import com.redknot.data.SQL;
import com.redknot.modle.Student;

public class Delete extends JFrame implements ActionListener {

	JTextField txtNum = new JTextField();
	

	public Delete(String title) {
		// ���ô�������
		this.setSize(600, 500);
		this.setLocation(400, 200);
		this.setTitle(title);

		// newһ������
		JButton btnDelete = new JButton("ɾ��");
		JButton btnBack=new JButton("������ҳ");
		
		JLabel labNum = new JLabel("������Ҫɾ��ѧ��ѧ�ţ�");
		JLabel labName = new JLabel("������");
		JLabel labSex = new JLabel("�Ա�");
		JLabel labAddress = new JLabel("��ַ��");
		JLabel labPhone = new JLabel("�绰��");
		JLabel labMajor = new JLabel("רҵ��");
		
		// ע���¼�
		btnDelete.addActionListener(this);
		btnBack.addActionListener(this);

		
		JPanel panSmall = new JPanel();
		panSmall.setLayout(new GridLayout(1, 3));
		
		// panSmall.add(btnWrite);
		panSmall.add(labNum);
		panSmall.add(txtNum);
		panSmall.add(btnDelete);
		panSmall.add(btnBack);

		// ���ô���
		this.setLayout(new BorderLayout());
		this.add(panSmall, BorderLayout.NORTH);
		

		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("������ҳ")) {

			Welcome welcom = new Welcome();
			welcom.setVisible(true);
			this.setVisible(false);
		}
		// System.out.println("click");
		if (e.getActionCommand().equals("ɾ��")) {
            String num=txtNum.getText();
           
            
            SQL sqlWrite=new SQL();
          
            try {
				sqlWrite.deleteStudent(num);
				
					JOptionPane.showMessageDialog(null, "�h���ɹ�", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
				
            	//sqlRead.createStudent("5yao","yaoyao","female","memeda","13343564","software");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
           
          
			
		}
	}

}
