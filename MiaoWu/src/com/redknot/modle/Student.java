package com.redknot.modle;

public class Student {
	
	private String sname;
	private String snum;
	private String ssex;
	private String saddress;
	private String sphone;
	private String smajor;
	
	public Student(){
		sname = "";
		snum = "";
	}
	
	public Student(String snum,String sname,String ssex,String saddress,String sphone,String smajor){
		this.sname = sname;
		this.snum = snum;
		this.setSsex(ssex);
		this.setSaddress(saddress);
		this.setSphone(sphone);
		this.setSmajor(smajor);

	}
	
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSnum() {
		return snum;
	}
	public void setSnum(String snum) {
		this.snum = snum;
	}

	public String getSsex() {
		return ssex;
	}

	public void setSsex(String ssex) {
		this.ssex = ssex;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public String getSphone() {
		return sphone;
	}

	public void setSphone(String sphone) {
		this.sphone = sphone;
	}

	public String getSmajor() {
		return smajor;
	}

	public void setSmajor(String smajor) {
		this.smajor = smajor;
	}
}
