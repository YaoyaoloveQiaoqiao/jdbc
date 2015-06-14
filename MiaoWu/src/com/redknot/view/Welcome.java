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
		// 设置窗体属性
		this.setSize(600, 500);
		this.setLocation(400, 200);
		this.setTitle("学生信息管理系统");

		// new一大堆组件
		JLabel labNum = new JLabel("学生信息管理系统",JLabel.CENTER);
		Font font =new Font("宋体",Font.CENTER_BASELINE,36);
		labNum.setFont(font);

		JButton btnLogin = new JButton("信息录入");
		JButton btnQuery = new JButton("信息查询");
		JButton btnUpdate = new JButton("信息更新");
		JButton btnCancel = new JButton("信息删除");
		JButton btnBack = new JButton("退出系统");
		

		// 注册事件
		btnLogin.addActionListener(this);
		btnQuery.addActionListener(this);
		btnCancel.addActionListener(this);
		btnUpdate.addActionListener(this);
		btnBack.addActionListener(this);
		

		// 布置按钮面板
		JPanel panButton = new JPanel();
		panButton.setLayout(new FlowLayout());

		panButton.add(btnLogin);
		panButton.add(btnQuery);
		panButton.add(btnUpdate);
		panButton.add(btnCancel);
		panButton.add(btnBack);

		

		// 布置窗体
		this.setLayout(new BorderLayout());

		this.add(panButton, BorderLayout.NORTH);
		
		this.add(labNum, BorderLayout.CENTER);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("信息查询")) {
			Read readMes = new Read("信息查询");
			readMes.setVisible(true);
			this.setVisible(false);
		} else if (e.getActionCommand().equals("信息录入")) {
			Write writeMes = new Write("信息录入");
			writeMes.setVisible(true);
			this.setVisible(false);
		} else if (e.getActionCommand().equals("信息更新")) {
			Update updateMes = new Update("信息更新");
			updateMes.setVisible(true);
			this.setVisible(false);
		} else if (e.getActionCommand().equals("信息删除")) {

			Delete deleteMes = new Delete("信息刪除");
			deleteMes.setVisible(true);
			this.setVisible(false);
		}else if (e.getActionCommand().equals("退出系统")) {
			this.setVisible(false);
		}
	}
}