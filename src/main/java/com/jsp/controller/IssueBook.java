package com.jsp.controller;

import com.jsp.service.LibrarianService;

public class IssueBook {
	
	public static void main(String[] args) {
		LibrarianService librarianService = new LibrarianService();
		boolean res = librarianService.issueBookById(8, 1, 4);
		System.out.println(res);
	}

}
