package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {
	@Id
	private int s_id;
	private String name;
	private int age;
	private String adress;
	
	
	
	
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Students(int s_id, String name, int age, String adress) {
		super();
		this.s_id = s_id;
		this.name = name;
		this.age = age;
		this.adress = adress;
	}





	public int getS_id() {
		return s_id;
	}





	public void setS_id(int s_id) {
		this.s_id = s_id;
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





	public String getAdress() {
		return adress;
	}





	public void setAdress(String adress) {
		this.adress = adress;
	}





	@Override
	public String toString() {
		return "Students [s_id=" + s_id + ", name=" + name + ", age=" + age + ", adress=" + adress + "]";
	}
	
	

}
