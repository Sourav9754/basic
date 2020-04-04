package com.demo.basic.bean;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String roadName;
	private int houseNo;
	private String city;
	private int pinCode;
	private int id;
	
	public Address() {
		
	}
	public Address(int id, int houseNo, String roadName, String city, int pinCode) {
		super();
		this.houseNo = houseNo;	//can we use Address.houseNo replacing this.houseNo?? And I dont understand the override part in Name class
		this.roadName = roadName;
		this.city = city;
		this.pinCode = pinCode;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoadName() {
		return roadName;
	}
	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
}
