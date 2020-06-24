package com;

public class RandomClass {

	public void disp() {
		String s = "bob";
		String[] sa = { "ss", "ee" };
		final String s2 = "he";
		int [] array;

		StringBuilder sb = new StringBuilder("hi");

		// switch(array.length) { 

		switch (sa[1]) {
		//switch ("b" + "hi") {
		/* switch(sb.toString()) { */

		case "ann":
			;
		//case s:
		case s2:

		}
	}
	
	static String s= "-";

	public static void main(String[] args) {
		System.out.println("*** Welcome Chapter-6 *********");
		
	 RandomClass nw = new RandomClass();
	 nw.s1();
		 new RandomClass().disp2();
		 System.out.println(s);
	}
	
	void disp2() {
		System.out.println("hello son !@@");
	}
	void s1() {
		try {
			s2();
			System.out.println("hello Father !!!");
		}catch(Exception e) {
			s +=" c";
		}
	}
		
		void s2() throws Exception{
			s3();
			s += "2";
			s3();
			s +="2b";
		}
		
		void s3() throws Exception{
			throw new Exception();
			
		}
		
		
		
		
		
		
		/*
		 * try { throw new Exception(); }catch(Exception e) { try { try { throw new
		 * Exception(); }catch(Exception ex) { s += "ic"; } throw new Exception();
		 * }catch(Exception x) { s += " mc"; } finally { s += " mf"; } }finally { s +=
		 * " of"; } System.out.println(s);
		 */
		
/*		String s= " ";
		
		for(int y=0;y<3;y++) {
			x++;
			
			switch(x) {
			case 8: 
				s +=" 8 ";
			case 9: 
				s+= " 9 ";
			case 10:{
				s += " 10 ";
				break;
			}
			default:
				s +=" d ";
			case 13:
				
				s +=" 13 ";
			}
		}
		System.out.println(s);
	}*/
	//static { x++; }
	

		/*
		 * int[] ia = { 1, 3, 5, 7, 9 };
		 * 
		 * for (int x : ia) {
		 * 
		 * for (int j = 0; j < 3; j++) {
		 * 
		 * if (x > 4 && x < 8) continue; System.out.print(" " + x);
		 * 
		 * if (j == 1) break; continue; } continue; }
		 * 
		 * foreach:
		 * 
		 * for (int j = 0; j < 5; j++) {
		 * 
		 * for (int k = 0; k < 3; k++) { System.out.println(" " + j);
		 * 
		 * if (j == 3 && k == 1) break foreach; if (j == 0 || j == 2) break; } }
		 */

	}
	
	
