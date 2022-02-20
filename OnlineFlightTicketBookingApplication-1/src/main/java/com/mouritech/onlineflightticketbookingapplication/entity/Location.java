package com.mouritech.onlineflightticketbookingapplication.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "location_info")
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "location_id" ,length = 64)
    private Long locationId;
   
	@Column(name = "location_from")
	private String locationFrom;
	@Column(name = "location_to" ,nullable = false)
	private String locationTo;
	@Column(name = "location_onworddate")
	private Date onWordDate;
	
	public Location() {
		
	}

	public Location(String locationFrom, String locationTo, Date onWordDate) {
		super();
		this.locationFrom = locationFrom;
		this.locationTo = locationTo;
		this.onWordDate = onWordDate;
	}

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
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

	public Date getOnWordDate() {
		return onWordDate;
	}

	public void setOnWordDate(Date onWordDate) {
		this.onWordDate = onWordDate;
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", locationFrom=" + locationFrom + ", locationTo=" + locationTo
				+ ", onWordDate=" + onWordDate + "]";
	}

	

}
