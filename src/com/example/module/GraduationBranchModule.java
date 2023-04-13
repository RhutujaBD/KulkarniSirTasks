package com.example.module;

import java.util.Scanner;

enum BranchEnum {
	BCA,BCOM,BBA,BSC,BCS

}

public class GraduationBranchModule {

	public void gradRecord() {
		BranchEnum branch = BranchEnum.BBA;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Branch:: "); 
	    for (BranchEnum branch1 : BranchEnum.values()) {
	    	  System.out.println(branch1);
	    	} 
	    String userInput = scanner.nextLine(); 
	   
	    MemberModule memberModule=new MemberModule();
		switch(branch.valueOf(userInput)) {
		
		case BCA:
			System.out.println("You have Select::"+branch.BCA);
			memberModule.memberM();
			break;
		case BBA:
			System.out.println("You have Select::"+branch.BBA);
			memberModule.memberM();
			break;
		case BSC:
			System.out.println("You have Select::"+branch.BSC);
			memberModule.memberM();
			break;
		case BCOM:
			System.out.println("You have Select:: "+branch.BCOM);
			memberModule.memberM();
			break;
		case BCS:
			System.out.println("You have Select:: "+branch.BCS);
			memberModule.memberM();
			break;
		}
	}
}
