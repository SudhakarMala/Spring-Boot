package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login_data")
public class MemberData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer member_id;
	private String password;
	
	public Integer getMember_id() {
		return member_id;
	}
	public String getPassword() {
		return password;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "MemberData [member_id=" + member_id + ", password=" + password + "]";
	}
}
