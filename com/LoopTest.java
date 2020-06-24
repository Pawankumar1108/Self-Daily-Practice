package com;

public class LoopTest {
	
	public void testSwitch() {
		
		System.out.println("**Into the Switch Test Method*****");
		
		char ch ='z';
		switch(ch) {
		
		case 'a':System.out.println("Match not Found\n");
		break;
		case 'z':
			System.out.println("\nmatched\n");
			break;
	       //	default:System.out.println("continue");
		
		case 'Z': System.out.println("Matched FOund\n");
		break;
		
		  default: 
			  System.out.println("aall Good !!!!\n");
		 
		
		}
		
	}
	
	public void newtest() {
	
		//boolean age = true;
		
		for(int age=1;age<=21;age++) {
			outer:
				while(age>=(16&21)/*age==16 |age==21*/) {
					System.out.println("Collect your DL" +" " + age);
					break outer;
				}
		if(age<16)
		System.out.println("Please Try Next Year!!" + " "+ age);
		
		}
	}
	

	public static void main(String[] args) {
		
		LoopTest lt = new LoopTest();
		//lt.testSwitch();
		lt.newtest();
	}

}
