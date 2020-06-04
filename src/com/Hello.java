package com;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class Hello {

	private void disp() {
		
	}
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("bn");sb.append(" ");
		sb.append("de");sb.append(" ");
		sb.append("ab");
		System.out.println(sb.indexOf("ab"));
		
		Hello h = new Hello();
		//h.sum();
		
		/*
		 * Set<String> set = new LinkedHashSet<>(); set.add("3"); set.add("1");
		 * set.add("3"); set.add("2"); set.add("3"); set.add("1");
		 * set.forEach(s->System.out.print(s+ "-"));
		 */		

	}
}

