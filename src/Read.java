import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;




public class Read extends JFrame{
	public Read(String title){
		//设置窗体属性
		this.setSize(400 , 500);
		this.setLocation(100, 100);
		this.setTitle(title);
		this.setFont(new Font("",Font.BOLD,40));
		
		//new一大堆组件
		JButton btnSend = new JButton("发送") ;
		
		
	
		
		//注册事件
		
		
		//布置小面板
		JPanel panSmall=new JPanel();
		panSmall.add(btnSend) ;
		
		//布置大面板
	
 		
		//布置窗体
 		this.setLayout(new BorderLayout());
 		
 		this.add(panSmall, BorderLayout.NORTH) ;
 		
	}	

}
