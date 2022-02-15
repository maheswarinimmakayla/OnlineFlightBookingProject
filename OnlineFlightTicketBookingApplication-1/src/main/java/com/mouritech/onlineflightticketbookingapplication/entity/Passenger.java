package com.mouritech.onlineflightticketbookingapplication.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "passenger_info")
@EntityListeners(AuditingEntityListener.class)
public class Passenger {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "passenger_id",length = 64)
	private Long passengerId;
	
	@Column(name = "passport_no")
	private Long passportNo;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "age")
	private Long age;
	
	@Column(name = "meal_pref")
	private String mealPref;
	
    public Passenger() {
		
	}
    
    public Passenger(Long passportNo, String firstName, String lastName) {
		super();
		this.passportNo = passportNo;
		this.firstName = firstName;
		this.lastName = lastName;
	}

   public Passenger(Long passportNo, String firstName, String lastName, String gender, Long age, String mealPref) {
		super();
		this.passportNo = passportNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.mealPref = mealPref;
	}

    
public Long getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(Long passengerId) {
		this.passengerId = passengerId;
	}

	public Long getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(Long passportNo) {
		this.passportNo = passportNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getMealPref() {
		return mealPref;
	}

	public void setMealPref(String mealPref) {
		this.mealPref = mealPref;
	}
	

}
