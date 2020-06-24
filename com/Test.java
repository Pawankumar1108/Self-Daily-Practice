package com;

/*public class Test {
	
	
	public void display() {
		
		int x= 10;
		int y=5;
	 
		//Applying the Condition 
		
		if((x<y)||(y<x))
			System.out.println("it'true");
		else
			System.out.println("Not happning");
	}

	public static void main(String[] args) {
		
		System.out.println("********WELCOME to NEW Practice Code's************");
		Test test = new Test();
		test.display();
		
		StringBuilder sb =new StringBuilder("Pawan").append("Kumar").reverse().replace(1,2,"Hello").reverse();
		System.out.println(sb);
	

	}

}*/

public interface Test{
	
	default void func() {
		System.out.println("hello");
		
	}
}

class Name2 implements Test{
	

	public static void main(String[] args) {
		Name2 na=new Name2();
		na.func();
		
	}

	
	
}

/*public class Test{
	static int name= 2;
	public void namefor() {
		int name=5;
		
		System.out.println(this.name);
	}
 public static void main(String [] args) {
	 Test h= new Test();
       h.namefor();		 
 }*/

 
