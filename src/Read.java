
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
		// 设置窗体属性
		this.setSize(400, 500);
		this.setLocation(100, 100);
		this.setTitle(title);

		// new一大堆组件
		JButton btnQuery = new JButton("查询");
		// JButton btnWrite = new JButton("录入") ;
		JLabel labNum = new JLabel("学号：");
		JLabel labName = new JLabel("姓名：");
		JLabel labSex = new JLabel("性别：");
		JLabel labAddress = new JLabel("地址：");
		JLabel labPhone = new JLabel("电话：");
		JLabel labMajor = new JLabel("专业：");
		
		

		// 注册事件
		btnQuery.addActionListener(this);

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
		panSmall.setLayout(new GridLayout(1, 2));
		
		// panSmall.add(btnWrite);
		panSmall.add(txtNum);
		panSmall.add(btnQuery);

		// 布置窗体
		this.setLayout(new BorderLayout());
		this.add(panSmall, BorderLayout.NORTH);
		this.add(panInput,BorderLayout.CENTER);

		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		// System.out.println("click");
		if (e.getActionCommand().equals("查询")) {
            String num=txtNum.getText();
			txtSex.setText("hahahha");
			
		}
	}

}
