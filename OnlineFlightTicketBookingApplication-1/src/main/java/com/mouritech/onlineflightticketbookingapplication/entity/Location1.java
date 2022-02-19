package com.mouritech.onlineflightticketbookingapplication.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name = "location1")
public class Location1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "location_id")
	private Long location1Id;
	@Column(name = "location_from")
	private String locationFrom;
	@Column(name = "location_to")
	private String locationTo;
	@Column(name = "location_onwarddate")
	@LastModifiedDate
	private Date locationOnWardDate;
	
   public  Location1() {
	 
 }

public Long getLocationId() {
	return location1Id;
}

public void setLocationId(Long locationId) {
	this.location1Id = locationId;
}

public String getLocationFrom() {
	return locationFrom;
}

public void setLocationFrom(String locationFrom) {
	this.locationFrom = locationFrom;
}

public String getLocationTo() {
	return locationTo;
}

public void setLocationTo(String locationTo) {
	this.locationTo = locationTo;
}

public Date getLocationOnWardDate() {
	return locationOnWardDate;
}

public void setLocationOnWardDate(Date locationOnWardDate) {
	this.locationOnWardDate = locationOnWardDate;
}

public Location1(Long location1Id, String locationFrom, String locationTo, Date locationOnWardDate) {
	super();
	this.location1Id = location1Id;
	this.locationFrom = locationFrom;
	this.locationTo = locationTo;
	this.locationOnWardDate = locationOnWardDate;
}

public Location1(String locationFrom, String locationTo, Date locationOnWardDate) {
	super();
	this.locationFrom = locationFrom;
	this.locationTo = locationTo;
	this.locationOnWardDate = locationOnWardDate;
}

@Override
public String toString() {
	return "Location1 [location1Id=" + location1Id + ", locationFrom=" + locationFrom + ", locationTo=" + locationTo
			+ ", locationOnWardDate=" + locationOnWardDate + "]";
}
   
	
	
}
