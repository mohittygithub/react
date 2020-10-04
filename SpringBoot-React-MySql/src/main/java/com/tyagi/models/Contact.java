package com.tyagi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity(name = "contacts")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String address;
	private String city;
	private String phone;
	private String email;
	
	
	/* Default Constructor*/
	public Contact() {}

	/* Parameterized Constructor*/
	public Contact(int id, String name, String address, String city, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.email = email;
	}

	
	/* Getters and Setters*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	/* ToString Method*/
	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city + ", phone=" + phone
				+ ", email=" + email + "]";
	}
	
}
