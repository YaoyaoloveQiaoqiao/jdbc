import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.redknot.data.jdbcUtils;
import com.redknot.view.QQLogin;



public class Base {
	public static void main(String args[]) throws Exception{
		QQLogin w = new QQLogin() ;
        w.setVisible(true);
	}
	
	static void template() throws Exception{
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			
		    conn=jdbcUtils.getConnection();
			st=conn.createStatement();
			rs=st.executeQuery("select * from exam_student");
			while(rs.next()){
				System.out.println(rs.getObject(1)+"\t"+rs.getObject(2));
			}
		} finally{
			jdbcUtils.free(rs, st, conn);
		}
		}
		
		
	
	static void test() throws SQLException{
		//1驱动注册
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		//2建立连接
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","0314www");
		//3创建语句
		Statement st=conn.createStatement();
		//4执行语句
		ResultSet rs=st.executeQuery("select * from exam_student");
		//5处理结果
		while(rs.next()){
			 System.out.println(rs.getObject(1)+"\t"+rs.getObject(2));
			 
			
		}
		//6释放资源
		rs.close();
		st.close();
		conn.close();
		
	}

}
