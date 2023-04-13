package com.example.module;

import java.util.Scanner;

enum Specialization {
	ENGGNERING, GRADUATION
}

public class SpecializationModule{
	
	public void specailizationRecord() {
		Specialization branch = Specialization.ENGGNERING;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Your Specialization:: ");
		for (Specialization branchs : Specialization.values()) {
			System.out.println(branchs);
		}
		String userInput = scanner.nextLine();

		EnggineringBranchModule ebranch=new EnggineringBranchModule();
		GraduationBranchModule gbranch =new GraduationBranchModule();
		switch (branch.valueOf(userInput)) {

		case ENGGNERING:
			System.out.println("You have Select::" + branch.ENGGNERING);
			ebranch.enggRecord();
			break;
		case GRADUATION:
			System.out.println("You have Select::" + branch.GRADUATION);
			gbranch.gradRecord();
			break;
		}
	}
}
