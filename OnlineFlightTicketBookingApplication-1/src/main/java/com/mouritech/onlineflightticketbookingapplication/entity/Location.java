package com.mouritech.onlineflightticketbookingapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "location_info")
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "location_id")
    private Long locationId;
   
	@Column(name = "location_name")
	private String locationName;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "airport")
    private String airport;
	
	@Column(name = "code")
    private String code;
	
	
	public Location() {
		
	}

	public Location(Long locationId, String locationName, String country, String airport, String code) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
		this.country = country;
		this.airport = airport;
		this.code = code;
	}

	public Location(String locationName, String country, String airport, String code) {
		super();
		this.locationName = locationName;
		this.country = country;
		this.airport = airport;
		this.code = code;
	}

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAirport() {
		return airport;
	}

	public void setAirport(String airport) {
		this.airport = airport;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", locationName=" + locationName + ", country=" + country
				+ ", airport=" + airport + ", code=" + code + "]";
	}
	
}
