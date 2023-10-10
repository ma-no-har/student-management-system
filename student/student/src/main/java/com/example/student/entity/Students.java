package com.example.student.entity;

import jakarta.persistence.Entity;
//import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {
	@Id
	private String first_Name;
	private String last_Name;
	private String mail_id;
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getMail_id() {
		return mail_id;
	}
	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}
	public Students(String first_Name, String last_Name, String mail_id) {
		super();
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.mail_id = mail_id;
	}
	public Students()
	{
		
	}
	

}
