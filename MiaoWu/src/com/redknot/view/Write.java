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

public class Write extends JFrame implements ActionListener {

	JTextField txtNum = new JTextField();
	JTextField txtName = new JTextField();
	JTextField txtSex = new JTextField();
	JTextField txtAddress = new JTextField();
	JTextField txtPhone = new JTextField();
	JTextField txtMajor = new JTextField();
    JTextField txtUser = new JTextField();

	public Write(String title) {
		// 设置窗体属性
		this.setSize(600, 500);
		this.setLocation(400, 200);
		this.setTitle(title);

		// new一大堆组件
		JButton btnWrite = new JButton("录入");
		JButton btnBack=new JButton("返回主页");
		JLabel labNum = new JLabel("学号：");
		JLabel labName = new JLabel("姓名：");
		JLabel labSex = new JLabel("性别：");
		JLabel labAddress = new JLabel("地址：");
		JLabel labPhone = new JLabel("电话：");
		JLabel labMajor = new JLabel("专业：");
		
		// 注册事件
		btnWrite.addActionListener(this);
		btnBack.addActionListener(this);

		// 布置小面板
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
		panSmall.setLayout(new GridLayout(1, 3));
		
		// panSmall.add(btnWrite);
		panSmall.add(labNum);
		panSmall.add(txtNum);
		panSmall.add(btnWrite);
		panSmall.add(btnBack);

		// 布置窗体
		this.setLayout(new BorderLayout());
		this.add(panSmall, BorderLayout.NORTH);
		this.add(panInput,BorderLayout.CENTER);

		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("返回主页")) {

			Welcome welcom = new Welcome();
			welcom.setVisible(true);
			this.setVisible(false);
		}
		// System.out.println("click");
		if (e.getActionCommand().equals("录入")) {
            String num=txtNum.getText();
            String name=txtName.getText();
            String sex=txtSex.getText();
            String address=txtAddress.getText();
            String phone=txtPhone.getText();
            String major=txtMajor.getText();
            
            
            SQL sqlWrite=new SQL();
          
            try {
				int i=sqlWrite.createStudent(num,name,sex,address,phone,major);
				if( i==1){
					JOptionPane.showMessageDialog(null, "录入成功", "提示", JOptionPane.INFORMATION_MESSAGE);
				}
            	//sqlRead.createStudent("5yao","yaoyao","female","memeda","13343564","software");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
           
          
			
		}
	}

}
