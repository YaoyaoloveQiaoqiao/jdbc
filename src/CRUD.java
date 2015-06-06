import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;

public class CRUD extends JFrame implements ActionListener {
	public static void main(String args[]) throws SQLException {
		// read("2");
		// create();
		// update();
		// delete();
	}

	public ResultSet read(String sqlRead) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String result = null;

		// String read = "select * from student";

		try {

			conn = jdbcUtils.getConnection();
			String sql = "select * from student where snum=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, sqlRead);
			rs = ps.executeQuery();
			while(rs.next()){
				rs.getObject(0);
			}
			

			// result=rs.getObject("snum") + "%"
			// + rs.getObject("sname");

		} finally {
			jdbcUtils.free(rs, ps, conn);
		}
		return rs;
	}

	static void selectStudent(String sqlRead) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String result = null;

		// String read = "select * from student";

		try {

			conn = jdbcUtils.getConnection();
			String sql = "select * from student where snum=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, sqlRead);
			rs = ps.executeQuery();

			// result=rs.getObject("snum") + "%"
			// + rs.getObject("sname");

		} finally {
			jdbcUtils.free(rs, ps, conn);
		}
		
	}

	static void create() throws SQLException {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {

			conn = jdbcUtils.getConnection();
			st = conn.createStatement();
			String sql = "insert into exam_student(stu_no,score)values(95003,99)";
			int i = st.executeUpdate(sql);
			System.out.println("i=" + i);
		} finally {
			jdbcUtils.free(rs, st, conn);
		}
	}

	static void update() throws SQLException {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {

			conn = jdbcUtils.getConnection();
			st = conn.createStatement();
			String sql = "update exam_student set score=score+1";
			int i = st.executeUpdate(sql);
			System.out.println("i=" + i);
		} finally {
			jdbcUtils.free(rs, st, conn);
		}
	}

	static void delete() throws SQLException {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {

			conn = jdbcUtils.getConnection();
			st = conn.createStatement();
			String sql = "delete from exam_student where score=100";
			int i = st.executeUpdate(sql);
			System.out.println("i=" + i);
		} finally {
			jdbcUtils.free(rs, st, conn);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
