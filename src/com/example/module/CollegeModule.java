package com.example.module;

import java.util.Scanner;

import com.example.eum.College;

public class CollegeModule {

	
	public void collageRecord() {

		College branch = College.TEACHER;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Choose Any Key:: ");
		for (College branchs : College.values()) {
			System.out.println(branchs);
		}
		String userInput = scanner.nextLine();
		
		SpecializationModule engg=new SpecializationModule();
		
		switch (branch.valueOf(userInput)) {

		case TEACHER:
			System.out.println("You have Select::"+branch.TEACHER);	
			engg.specailizationRecord();
			break;
		case STUDENT:
			System.out.println("You have Select::" + branch.STUDENT);
			engg.specailizationRecord();
			break;
		case PRINCIPLE:
			System.out.println("You have Select::" + branch.PRINCIPLE);
			engg.specailizationRecord();
			break;
		}
	}
	public static void main(String[] args) {
		CollegeModule collegeModule=new CollegeModule();
		collegeModule.collageRecord();	
	}	
}
