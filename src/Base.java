import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Base {
	public static void main(String args[]) throws SQLException{
		test();
	}
	static void template(){
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		try{
			conn=jdbc
		}
		
	}
	static void test() throws SQLException{
		//1����ע��
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		//2��������
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","0314www");
		//3�������
		Statement st=conn.createStatement();
		//4ִ�����
		ResultSet rs=st.executeQuery("select * from exam_student");
		//5������
		while(rs.next()){
			 System.out.println(rs.getObject(1)+"\t"+rs.getObject(2));
			 
			
		}
		//6�ͷ���Դ
		rs.close();
		st.close();
		conn.close();
		
	}

}
