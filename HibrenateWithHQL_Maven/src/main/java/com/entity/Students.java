package com.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Students {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int S_id;
	private String name;
	private String gender;
	private String address;
	

	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Students(int s_id, String name, String gender, String address) {
		super();
		S_id = s_id;
		this.name = name;
		this.gender = gender;
		address = address;
	}

	public int getS_id() {
		return S_id;
	}

	public void setS_id(int s_id) {
		S_id = s_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		address = address;
	}

	@Override
	public String toString() {
		return "Students [S_id=" + S_id + ", name=" + name + ", gender=" + gender + ", Address=" + address + "]";
	}
	
	
	
	
}
