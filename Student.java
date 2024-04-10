package com.epam.SpringDemo1;

import org.springframework.stereotype.Component;

@Component
public class Student {
	int rno;
	String name;
	public void display() {
		System.out.println("Student Roll No : "+rno);
		System.out.println("Student Name : "+name);
		// My contribution in this code
	}
	
}
