import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;




public class Read extends JFrame implements ActionListener{

	JTextField txtNum = new JTextField() ;
	JTextField txtSex = new JTextField() ;
	JTextField txtAddress = new JTextField() ;
	
	public Read(String title){
		//设置窗体属性
		this.setSize(400 , 500);
		this.setLocation(100, 100);
		this.setTitle(title);
		
		
		//new一大堆组件
		JButton btnSend = new JButton("查询") ;
		//JButton btnWrite = new JButton("录入") ;
	
		//注册事件
		btnSend.addActionListener(this); 
		
		
		
		
		//布置小面板
		JPanel panSmall=new JPanel();
		panSmall.setLayout(new GridLayout(1,2));
		panSmall.add(btnSend) ;
		//panSmall.add(btnWrite);
		panSmall.add(txtNum);
		
		
		//布置窗体
 		this.setLayout(new BorderLayout());
 		
 		this.add(panSmall, BorderLayout.CENTER) ;
 		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//System.out.println("click");
		if(e.getActionCommand().equals("查询")){
			
			
			
			String snum = txtNum.getText() ;
			String read="select * from student where snum = " + snum;
			CRUD r=new CRUD();
			try {
				r.read(read);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}	

}
