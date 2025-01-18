package com.Service;

import com.DAO.StudentsDAO;

public class StudentsService {
	public void insertData() {
	StudentsDAO sd= new StudentsDAO();
	sd.insertData();
	}
	
	
	public void updateData() {
		StudentsDAO sd = new StudentsDAO();
		sd.updateData();
	}
	public void DeleteData() {
		StudentsDAO sd = new StudentsDAO();
		sd.deleteData();
	}
	
	public void getSingleData() {
		StudentsDAO sd = new StudentsDAO();
		sd.getSingleData();
	}
	
	public void getAllData() {
		StudentsDAO sd = new StudentsDAO();
		sd.getAllData();
	}
}
