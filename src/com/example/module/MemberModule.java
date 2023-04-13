package com.example.module;

import java.util.Scanner;

import com.example.scanner.input.StudentDetails;
import com.example.scanner.input.TeacherDetails;

enum Member {
	Student, Teacher
}

public class MemberModule {
	public void memberM() {

		Member branch = Member.Teacher;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Choose any One::  ");
		for (Member branchs : Member.values()) {
			System.out.println(branchs);
		}
		String userInput = scanner.nextLine();

		StudentDetails studDetails=new StudentDetails();
		TeacherDetails teachDetails=new TeacherDetails();
		switch (branch.valueOf(userInput)) {

		case Teacher:
			System.out.println("You have Select::" + branch.Teacher);
			teachDetails.fillTeacherDetails();
			break;
		case Student:
			System.out.println("You have Select::" + branch.Student);
			studDetails.fillDetails();
			break;

		}
	}
}
