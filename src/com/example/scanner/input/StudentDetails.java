package com.example.scanner.input;

import java.util.Scanner;

public class StudentDetails {
	public void fillDetails() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter RollNo:: ");
		String roll = scanner.nextLine();
		System.out.println("Enter Name:: ");
		String name = scanner.nextLine();
		System.out.println("Enter Email ID:: ");
		String email = scanner.nextLine();
		System.out.println("Enter Mobile NO:: ");
		String phone = scanner.nextLine();
		System.out.println("Enter Address:: ");
		String address = scanner.nextLine();
	}
}
