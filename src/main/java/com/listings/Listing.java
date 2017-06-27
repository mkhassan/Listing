package com.listings;


import javax.persistence.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Listing {
	
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

	private int id;
    
    
    @NotNull
    @Size(min=2, max = 50)
	private String address;
    
	private String state;
	
	
    @NotNull
    @Min(1)
	private long price;
	private boolean isrented;
	private String description;
	private String rules;
	private boolean wifi;
	private String cable;
	private boolean pbathroom;
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public boolean isIsrented() {
		return isrented;
	}
	public void setIsrented(boolean isrented) {
		this.isrented = isrented;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRules() {
		return rules;
	}
	public void setRules(String rules) {
		this.rules = rules;
	}
	public boolean isWifi() {
		return wifi;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	public String getCable() {
		return cable;
	}
	public void setCable(String cable) {
		this.cable = cable;
	}
	public boolean isPbathroom() {
		return pbathroom;
	}
	public void setPbathroom(boolean pbathroom) {
		this.pbathroom = pbathroom;
	}

	

}
