package com.mouritech.onlineflightticketbookingapplication.entity;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id" ,length = 64)
    private Long userId;
  
	@Column(name = "user_name" ,nullable = false)
	private String userName;
	
	@Column(name = "password" ,nullable = false)
    private String password;
	
	@Column(name = "mobile_no" ,nullable = false)
    private Long mobileNo;
	
	@Column(name = "pan_no" ,nullable = false)
    private String panNo;
	
	@Column(name = "email" ,nullable = false)
	@Email(message = "Not a valid email")
    private String email;
	
	@Column(name = "address" ,nullable = false)
    private String address;
	
	@Column(name = "city" ,nullable = false)
    private String city;
	
	@Column(name = "state" ,nullable = false)
    private String state;
	
	@Column(name = "country" ,nullable = false)
    private String  country;
	
	
	public User() {
		
	}
	
   public User(String userName, @Email(message = "Not a valid email") String email) {
		super();
		this.userName = userName;
		this.email = email;
	}

public Long getUserId() {
	return userId;
}

public void setUserId(Long userId) {
	this.userId = userId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Long getMobileNo() {
	return mobileNo;
}

public void setMobileNo(Long mobileNo) {
	this.mobileNo = mobileNo;
}

public String getPanNo() {
	return panNo;
}

public void setPanNo(String panNo) {
	this.panNo = panNo;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", mobileNo=" + mobileNo
			+ ", panNo=" + panNo + ", email=" + email + ", address=" + address + ", city=" + city + ", state=" + state
			+ ", country=" + country + "]";
}


	

	

}
