package com.redknot.view;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
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

public class Full extends JFrame implements ActionListener {

	public Full() {
		// 设置窗体属性
		this.setSize(500, 500);
		this.setLocation(400, 300);
		this.setTitle("学生信息管理系统");

		// new一大堆组件
		JLabel labNum = new JLabel("学号：");
		JLabel labName = new JLabel("姓名：");
		JLabel labSex = new JLabel("性别：");
		JLabel labAddress = new JLabel("地址：");
		JLabel labPhone = new JLabel("电话：");
		JLabel labMajor = new JLabel("专业：");

		JButton btnLogin = new JButton("信息录入");
		JButton btnQuery = new JButton("信息查询");
		JButton btnUpdate = new JButton("信息更新");
		JButton btnCancel = new JButton("信息删除");
		JButton btnBack = new JButton("退出系统");
		JButton btnEnter = new JButton("录入");
		JButton btnReset = new JButton("重置");

		JTextField txtNum = new JTextField();
		JTextField txtName = new JTextField();
		JTextField txtSex = new JTextField();
		JTextField txtAddress = new JTextField();
		JTextField txtPhone = new JTextField();
		JTextField txtMajor = new JTextField();
        JTextField txtUser = new JTextField();

		// 注册事件
		btnLogin.addActionListener(this);
		btnQuery.addActionListener(this);
		btnCancel.addActionListener(this);
		btnUpdate.addActionListener(this);
		btnBack.addActionListener(this);
		btnEnter.addActionListener(this);
		btnReset.addActionListener(this);

		// 布置输入面板
		JPanel panInput = new JPanel();
		panInput.setLayout(new GridLayout(6, 1));

		panInput.add(labNum);
		panInput.add(txtNum);

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

		// 布置按钮面板
		JPanel panButton = new JPanel();
		panButton.setLayout(new FlowLayout());

		panButton.add(btnLogin);
		panButton.add(btnQuery);
		panButton.add(btnUpdate);
		panButton.add(btnCancel);
		panButton.add(btnBack);

		// 布置下面的按钮面板
		JPanel panButton_South = new JPanel();
		panButton.setLayout(new GridLayout(1,2));

		panButton.add(btnEnter);
		panButton.add(btnReset);

		
		// 布置窗体
		this.setLayout(new BorderLayout());

		this.add(panButton, BorderLayout.NORTH);
		this.add(panButton_South,BorderLayout.SOUTH);
		this.add(panInput, BorderLayout.CENTER);

	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("信息查询")) {
			Read readMes = new Read("信息查询");
			readMes.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getActionCommand().equals("信息录入")){
			Write writeMes=new Write("信息录入");
			writeMes.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getActionCommand().equals("信息更新")){
			Update updateMes=new Update("信息更新");
			updateMes.setVisible(true);
			this.setVisible(false);
		}
	}
}