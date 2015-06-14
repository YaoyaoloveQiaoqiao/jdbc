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
		// 设置窗体属性
		this.setSize(600, 500);
		this.setLocation(400, 200);
		this.setTitle(title);

		// new一大堆组件
		JButton btnDelete = new JButton("删除");
		JButton btnBack=new JButton("返回主页");
		
		JLabel labNum = new JLabel("请输入要删除学生学号：");
		JLabel labName = new JLabel("姓名：");
		JLabel labSex = new JLabel("性别：");
		JLabel labAddress = new JLabel("地址：");
		JLabel labPhone = new JLabel("电话：");
		JLabel labMajor = new JLabel("专业：");
		
		// 注册事件
		btnDelete.addActionListener(this);
		btnBack.addActionListener(this);

		
		JPanel panSmall = new JPanel();
		panSmall.setLayout(new GridLayout(1, 3));
		
		// panSmall.add(btnWrite);
		panSmall.add(labNum);
		panSmall.add(txtNum);
		panSmall.add(btnDelete);
		panSmall.add(btnBack);

		// 布置窗体
		this.setLayout(new BorderLayout());
		this.add(panSmall, BorderLayout.NORTH);
		

		

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
		if (e.getActionCommand().equals("删除")) {
            String num=txtNum.getText();
           
            
            SQL sqlWrite=new SQL();
          
            try {
				sqlWrite.deleteStudent(num);
				
					JOptionPane.showMessageDialog(null, "刪除成功", "提示", JOptionPane.INFORMATION_MESSAGE);
				
            	//sqlRead.createStudent("5yao","yaoyao","female","memeda","13343564","software");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
           
          
			
		}
	}

}
