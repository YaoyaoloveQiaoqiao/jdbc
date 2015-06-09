package com.redknot.data;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;

import com.redknot.modle.Student;

public class SQL{
	
	public static void main(String[] args) throws SQLException{
//		try {
//			Student s = selectStudent("1");
//			System.out.println(s.getSnum());
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		createStudent("5","yao","fem","mem","13343564","software");
	}
	
	public Student selectStudent(String num) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
	
		
		Student s = null;

		try {

			conn = jdbcUtils.getConnection();
			String sql = "select * from student where snum=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, num);
			rs = ps.executeQuery();
			
			while(rs.next()){
				String snum = (String)rs.getObject("snum");
				String sname = (String) rs.getObject("sname");
				String ssex = (String) rs.getObject("ssex");
				String saddress = (String) rs.getObject("saddress");
				String sphone = (String) rs.getObject("sphone");
				String smajor = (String) rs.getObject("smajor");

				
				s = new Student(snum,sname,ssex,saddress,sphone,smajor);
			}
			

		} finally {
			jdbcUtils.free(rs, ps, conn);
		}
		
		
		//Student s = new Student();
		
		return s;
	}
	
	 public static void createStudent(String num,String name,String sex,String address,String phone,String major) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {

			conn = jdbcUtils.getConnection();
			String sql = "insert into student(snum,sname,ssex,saddress,sphone,smajor)values(?,?,?,?,?,?) ";
		//	'?','?','?','?','?','?'
			ps = conn.prepareStatement(sql);
			ps.setString(1, num);
			ps.setString(2, name);
			ps.setString(3, sex);
			ps.setString(4, address);
			ps.setString(5, phone);
			ps.setString(6, major);
			int i = ps.executeUpdate();
			System.out.println("i=" + i);
		} finally {
			jdbcUtils.free(rs, ps, conn);
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
	
		
	
	}

