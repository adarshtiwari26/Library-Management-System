package com.jsp.controller;

import com.jsp.service.StudentService;

public class RequestBook {
	
	public static void main(String[] args) {
		
		StudentService studentService = new StudentService();
		boolean res = studentService.requestBook(8, 1);
		
		System.out.println(res);
		
	}

}
