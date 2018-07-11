package com.cg.studentdetails.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StudentDto {
	String sname;
	int sid;
	String sphone;
	String semail;
	String sage;
    String sgender;
    String scity;
    LocalDate sappointmentdate;
    String status="Not Approved";
    String collegename=null;
    public String getCollegename() {
		return collegename;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSphone() {
		return sphone;
	}
	public void setSphone(String sphone2) {
		this.sphone = sphone2;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public String getSage() {
		return sage;
	}
	public void setSage(String sage) {
		this.sage = sage;
	}
	public String getSgender() {
		return sgender;
	}
	public void setSgender(String sgender2) {
		this.sgender = sgender2;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	public LocalDate getSappointmentdate() {
		return sappointmentdate;
	}
	public void setSappointmentdate(LocalDate dateTimeFormatter) {
		this.sappointmentdate = dateTimeFormatter;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	
}
