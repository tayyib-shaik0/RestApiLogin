package com.io.login.restapi.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="USER_TABLE")

public class User {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id;
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;

	@Column(name = "phone_number")
	private int phone;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "birthday")
	private int birthday;
	
	@Column(name = "preacher")
	private String preacher;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "countryCode")
	private int countryCode;
	
	@Column(name = "avatar")
	private String avatar;
	
	@Column(name = "chruchname")
	private String chruchname;
	
	@Column(name = "pastorname")
	private String pastorname;
	
	@Column(name = "latitude")
	private int latitude;
	
	@Column(name = "longitude")
	private int longitude;
	
	
	
	
	
	
//	Getters and setters
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	public String getPreacher() {
		return preacher;
	}
	public void setPreacher(String preacher) {
		this.preacher = preacher;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getChruchname() {
		return chruchname;
	}
	public void setChruchname(String chruchname) {
		this.chruchname = chruchname;
	}
	public String getPastorname() {
		return pastorname;
	}
	public void setPastorname(String pastorname) {
		this.pastorname = pastorname;
	}
	public int getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	public int getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	

}
