package com.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address implements Serializable {
	@Value("FC ROAD")
	private String landMark;
	@Value("PUNE")
	private String city;
	@Value("443433")
	private int pincode;

	public Address() {
		System.out.println("Address Default Constructor");

	}

	public Address(String landMark, String city, int pincode) {
		System.out.println("Address Parameterized Constructor");
		this.landMark = landMark;
		this.city = city;
		this.pincode = pincode;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		System.out.println("Set LandMark");
		this.landMark = landMark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("Set city");
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		System.out.println("SET PINCODE");
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [landMark=" + landMark + ", city=" + city + ", pincode=" + pincode + "]";
	}

}
