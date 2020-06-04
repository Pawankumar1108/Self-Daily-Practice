

public class Animal {
	
	int age=34;
	
	public  Animal(int a,int b,int c){
		this(a,b);
		int count= a+b;
		System.out.println("hello again "+ count);
	}
	
	public Animal(int a, int b){
		super();
		int sum =a+b;
		System.out.println("hello "+ sum);
		}
	
	public int animal(int a,int b) {
		
		int c=a+b;
		System.out.println("into the new animal method :" + c);
		return c;
	}
	
	public static void main(String [] args) {
		Animal an=new Animal(1,2,3);
		an.name(an);
		//Animal an1=new Animal(1,8);
		//an.add(1,2,6);
	}
	
	public void name(Animal age) {
		age.disp();
		((Animal) age).animal(5,0);
		if(!(age instanceof Animal) ) {
			System.out.println("It is Instance of Animal :"+" "+  age.toString());
		}else {
			System.out.println("Not Instance of Animal:"+" "+  age.toString());
		}
		
		System.out.println("Code is Excuting as expected");
	}
	
	public void disp() {
		System.out.println("This is the Test Method");
	}
	

}
