import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;




public class CRUD extends JFrame  implements ActionListener {
	public static void main(String args[]) throws SQLException{
		//read();
		//create();
		//update();
		delete();
	}
	static void read() throws SQLException{
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			
		    conn=jdbcUtils.getConnection();
			st=conn.createStatement();
			rs=st.executeQuery("select stu_no,score from exam_student");
			while(rs.next()){
				System.out.println(rs.getObject("stu_no")+"\t"+rs.getObject("score"));
			}
		} finally{
			jdbcUtils.free(rs, st, conn);
		}
	}
     

static void create() throws SQLException{
	Connection conn=null;
	Statement st=null;
	ResultSet rs=null;
	try {
		
	    conn=jdbcUtils.getConnection();
		st=conn.createStatement();
		String sql ="insert into exam_student(stu_no,score)values(95003,99)";
		int i=st.executeUpdate(sql);
		System.out.println("i="+i);
	} finally{
		jdbcUtils.free(rs, st, conn);
	}
}

static void update() throws SQLException{
	Connection conn=null;
	Statement st=null;
	ResultSet rs=null;
	try {
		
	    conn=jdbcUtils.getConnection();
		st=conn.createStatement();
		String sql ="update exam_student set score=score+1";
		int i=st.executeUpdate(sql);
		System.out.println("i="+i);
	} finally{
		jdbcUtils.free(rs, st, conn);
	}
}
static void delete() throws SQLException{
	Connection conn=null;
	Statement st=null;
	ResultSet rs=null;
	try {
		
	    conn=jdbcUtils.getConnection();
		st=conn.createStatement();
		String sql ="delete from exam_student where score=100";
		int i=st.executeUpdate(sql);
		System.out.println("i="+i);
	} finally{
		jdbcUtils.free(rs, st, conn);
	}
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	}
}

