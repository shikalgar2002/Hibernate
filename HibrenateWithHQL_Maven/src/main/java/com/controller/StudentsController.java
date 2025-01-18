package com.controller;

import com.Service.StudentsService;

public class StudentsController {
	
	public static void main(String[] args) {
		
		StudentsService ss = new StudentsService();
//		ss.insertData();
//		ss.updateData();
//		ss.DeleteData();
//		ss.getSingleData();
		ss.getAllData();
	}

}
