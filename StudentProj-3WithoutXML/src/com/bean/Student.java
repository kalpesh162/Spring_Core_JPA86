package com.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student implements Serializable {
	@Value("11")
	private int id;
	@Value("Tushar")
	private String name;
	@Value("66.88")
	private double marks;
	
	//@Autowired  --> Property Injection
	private Address address;

	public Student() {
		System.out.println("Default Constructor");
	}

	public Student(int id, String name, double marks) {
		System.out.println("Parameterized  (int id, String name, double marks) Constructor");
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public Student(int id, String name, double marks, Address address) {
		System.out.println("Parameterized  (int id, String name, double marks,Address address) Constructor");
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.address = address;
	}

	//@Autowired  // CI
	public Student(Address address) {
		System.out.println("Parameterized  (Address address) Constructor");
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("SET ID");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("SET NAME");
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		System.out.println("SET MARKS");
		this.marks = marks;
	}

	public Address getAddress() {
		return address;
	}

	@Autowired   // SI
	public void setAddress(Address address) {
		System.out.println("SET ADDRESS");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", address=" + address + "]";
	}

	
}
