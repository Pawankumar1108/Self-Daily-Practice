package com;

public class CustomeException extends RuntimeException {
	
	public void disp() {
		try {
		//int x= 10/0;
		}catch(CustomeException ce) {
			System.out.println("Caught" + " "+ ce);
		}
	}
	
	public static void main(String [] args) {
		
		System.out.println("hello Exception");
		
		CustomeException cee= new CustomeException();
		cee.disp();
	}

	
}
