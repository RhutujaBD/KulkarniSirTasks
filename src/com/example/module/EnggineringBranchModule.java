package com.example.module;

import java.util.Scanner;

enum Engginering {
	IT, CIVIL, MECH, ENTC, COMP;

}

public class EnggineringBranchModule {
	

	public void enggRecord() {
		Engginering branch = Engginering.IT;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Your Branch:: ");
		for (Engginering branch2 : Engginering.values()) {
			System.out.println(branch2);
		}
		String userInput = scanner.nextLine();

		MemberModule memberModule=new MemberModule();
		switch (branch.valueOf(userInput)) {

		case IT:
			System.out.println("You have Select::" + branch.IT);
			memberModule.memberM();
			break;
		case CIVIL:
			System.out.println("You have Select::" + branch.CIVIL);
			memberModule.memberM();
			break;
		case MECH:
			System.out.println("You have Select::" + branch.MECH);
			memberModule.memberM();
			break;
		case ENTC:
			System.out.println("You have Select:: " + branch.ENTC);
			memberModule.memberM();
			break;
		case COMP:
			System.out.println("You have Select:: " + branch.COMP);
			memberModule.memberM();
			break;
		}
	}

}
