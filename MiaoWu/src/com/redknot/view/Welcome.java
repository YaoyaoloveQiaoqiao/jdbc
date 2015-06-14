package com.redknot.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.redknot.data.SQL;

public class Welcome extends JFrame implements ActionListener {

	public Welcome() {
		// ���ô�������
		this.setSize(600, 500);
		this.setLocation(400, 200);
		this.setTitle("ѧ����Ϣ����ϵͳ");

		// newһ������
		JLabel labNum = new JLabel("ѧ����Ϣ����ϵͳ",JLabel.CENTER);
		Font font =new Font("����",Font.CENTER_BASELINE,36);
		labNum.setFont(font);

		JButton btnLogin = new JButton("��Ϣ¼��");
		JButton btnQuery = new JButton("��Ϣ��ѯ");
		JButton btnUpdate = new JButton("��Ϣ����");
		JButton btnCancel = new JButton("��Ϣɾ��");
		JButton btnBack = new JButton("�˳�ϵͳ");
		

		// ע���¼�
		btnLogin.addActionListener(this);
		btnQuery.addActionListener(this);
		btnCancel.addActionListener(this);
		btnUpdate.addActionListener(this);
		btnBack.addActionListener(this);
		

		// ���ð�ť���
		JPanel panButton = new JPanel();
		panButton.setLayout(new FlowLayout());

		panButton.add(btnLogin);
		panButton.add(btnQuery);
		panButton.add(btnUpdate);
		panButton.add(btnCancel);
		panButton.add(btnBack);

		

		// ���ô���
		this.setLayout(new BorderLayout());

		this.add(panButton, BorderLayout.NORTH);
		
		this.add(labNum, BorderLayout.CENTER);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("��Ϣ��ѯ")) {
			Read readMes = new Read("��Ϣ��ѯ");
			readMes.setVisible(true);
			this.setVisible(false);
		} else if (e.getActionCommand().equals("��Ϣ¼��")) {
			Write writeMes = new Write("��Ϣ¼��");
			writeMes.setVisible(true);
			this.setVisible(false);
		} else if (e.getActionCommand().equals("��Ϣ����")) {
			Update updateMes = new Update("��Ϣ����");
			updateMes.setVisible(true);
			this.setVisible(false);
		} else if (e.getActionCommand().equals("��Ϣɾ��")) {

			Delete deleteMes = new Delete("��Ϣ�h��");
			deleteMes.setVisible(true);
			this.setVisible(false);
		}else if (e.getActionCommand().equals("�˳�ϵͳ")) {
			this.setVisible(false);
		}
	}
}