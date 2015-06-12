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
	//	updateStudent("'4'","'yao'","'fem'","'mem'","'13343564'","'software'");
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
	
	 public static int createStudent(String num,String name,String sex,String address,String phone,String major) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int i;
		try {

			conn = jdbcUtils.getConnection();
			String sql = "insert into student(snum,sname,ssex,saddress,sphone,smajor)values(?,?,?,?,?,?) ";
	
			ps = conn.prepareStatement(sql);
			ps.setString(1, num);
			ps.setString(2, name);
			ps.setString(3, sex);
			ps.setString(4, address);
			ps.setString(5, phone);
			ps.setString(6, major);
			 i = ps.executeUpdate();
			//System.out.println("i=" + i);
		} finally {
			jdbcUtils.free(rs, ps, conn);
		}
		return i;
	}

	public static void updateStudent(String num,String name,String sex,String address,String phone,String major) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int i;
		try {

			conn = jdbcUtils.getConnection();
			String sql = "update student set sname=?,ssex=?,saddress=?,sphone=?,smajor=? where snum=?";
			ps = conn.prepareStatement(sql);
			ps.setString(6, num);
			ps.setString(1, name);
			ps.setString(2, sex);
			ps.setString(3, address);
			ps.setString(4, phone);
			ps.setString(5, major);
			 i = ps.executeUpdate();
			System.out.println("i=" + i);
		} finally {
			jdbcUtils.free(rs, ps, conn);
		}
		
	}

	public void deleteStudent(String num) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {

			conn = jdbcUtils.getConnection();
			String sql = "delete from student where snum=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, num);
			
			int i = ps.executeUpdate();
			System.out.println("i=" + i);
		} finally {
			jdbcUtils.free(rs, ps, conn);
		}
	}
	
		
	
	}

