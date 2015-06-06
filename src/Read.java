
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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Read extends JFrame implements ActionListener {
/*
	JTextField txtNum = new JTextField();
	JLabel txtSex = new JLabel();
	JTextField txtAddress = new JTextField();
	*/
	
	
	JTextField txtNum = new JTextField();
	JTextField txtName = new JTextField();
	JTextField txtSex = new JTextField();
	JTextField txtAddress = new JTextField();
	JTextField txtPhone = new JTextField();
	JTextField txtMajor = new JTextField();
    JTextField txtUser = new JTextField();

	public Read(String title) {
		// ���ô�������
		this.setSize(400, 500);
		this.setLocation(100, 100);
		this.setTitle(title);

		// newһ������
		JButton btnQuery = new JButton("��ѯ");
		// JButton btnWrite = new JButton("¼��") ;
		JLabel labNum = new JLabel("ѧ�ţ�");
		JLabel labName = new JLabel("������");
		JLabel labSex = new JLabel("�Ա�");
		JLabel labAddress = new JLabel("��ַ��");
		JLabel labPhone = new JLabel("�绰��");
		JLabel labMajor = new JLabel("רҵ��");
		
		

		// ע���¼�
		btnQuery.addActionListener(this);

		// ����С���
		JPanel panInput = new JPanel();
		panInput.setLayout(new GridLayout(6, 1));

	

		panInput.add(labName);
		panInput.add(txtName);

		panInput.add(labSex);
		panInput.add(txtSex);

		panInput.add(labAddress);
		panInput.add(txtAddress);

		panInput.add(labPhone);
		panInput.add(txtPhone);

		panInput.add(labMajor);
		panInput.add(txtMajor);
		
		JPanel panSmall = new JPanel();
		panSmall.setLayout(new GridLayout(1, 2));
		
		// panSmall.add(btnWrite);
		panSmall.add(txtNum);
		panSmall.add(btnQuery);

		// ���ô���
		this.setLayout(new BorderLayout());
		this.add(panSmall, BorderLayout.NORTH);
		this.add(panInput,BorderLayout.CENTER);

		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		// System.out.println("click");
		if (e.getActionCommand().equals("��ѯ")) {
            String num=txtNum.getText();
			txtSex.setText("hahahha");
			
		}
	}

}
