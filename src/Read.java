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
		//���ô�������
		this.setSize(400 , 500);
		this.setLocation(100, 100);
		this.setTitle(title);
		this.setFont(new Font("",Font.BOLD,40));
		
		//newһ������
		JButton btnSend = new JButton("����") ;
		
		
	
		
		//ע���¼�
		
		
		//����С���
		JPanel panSmall=new JPanel();
		panSmall.add(btnSend) ;
		
		//���ô����
	
 		
		//���ô���
 		this.setLayout(new BorderLayout());
 		
 		this.add(panSmall, BorderLayout.NORTH) ;
 		
	}	

}
