package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="StudentsRecord")
public class Students {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Stud_id;
	private String name;
	private int age;
	@Column (name="City")
	private String address;

	
	
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public Students(int stud_id, String name, int age, String address) {
		super();
		Stud_id = stud_id;
		this.name = name;
		this.age = age;
		this.address = address;
	}





	public int getStud_id() {
		return Stud_id;
	}
	public void setStud_id(int stud_id) {
		Stud_id = stud_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}





	@Override
	public String toString() {
		return "Students [Stud_id=" + Stud_id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
	

}
