package com.example.scanner.input;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TeacherDetails {


	public void fillTeacherDetails() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter EMP ID:: ");
		String roll = scanner.nextLine();
		System.out.println("Enter Name:: ");
		String name = scanner.nextLine();
		System.out.println("Enter Departmet:: ");
		String dept = scanner.nextLine();
		System.out.println("Enter Email ID:: ");
		String email = scanner.nextLine();
		System.out.println("Enter Mobile NO:: ");
		String phone = scanner.nextLine();
		System.out.println("Enter Address:: ");
		String address = scanner.nextLine();

	}
	
}
