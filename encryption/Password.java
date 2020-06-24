package com.encryption;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Base64;
import java.util.Scanner;

public class Password {

	private String password;
	private String salt;
	private String pin;

	char[] pswd = password.toCharArray();
	char[] saltConverting = salt.toCharArray();
	char[] pinchar = pin.toCharArray();

	public void disp() {
		/* this.name=name; */
		String name = "pawan";
		char[] chr = name.toCharArray();
		System.out.println(chr);
	}

	/*
	 * protected Password(String password, String salt, String pin) { super();
	 * this.password = password; this.salt = salt; this.pin = pin;
	 * 
	 * System.out.println("Hello!"); }
	 */

	/*
	 * protected Password(char[] pswd, char[] saltConverting, char[] pinchar) {
	 * super(); this.pswd = pswd; this.saltConverting = saltConverting; this.pinchar
	 * = pinchar; }
	 */

	public static void main(String[] args) {

		System.out.println("\nWelcome to the Encoding Test Class");

		/*
		 * Password pass =new Password("xcv","125","125pa"); Password pass1 =new
		 * Password("xcv","125","125pa")
		 * 
		 * 
		 * try { Password pass =new Password(); pass.disp(); System.out.println(pass);
		 * }catch (NullPointerException ne) { System.out.println("Exception Handeled");
		 * }
		 * 
		 * }
		 * 
		 * 
		 * char [] n= new char[2]; 
		 * n[0]='d'; 
		 * n[1]='f';
		 *  System.out.println(n); 
		 *  try {
		 * Password pass =new Password();
		 *  pass.disp(); 
		 *  }catch(NullPointerException ne) {
		 * System.out.println("hello!"); }
		 * 
		 * 
		 * //Scanner stringEncodingtest = new Scanner(System.in); //System.out.
		 * print("Pleasa Enter the Sentence or any String you want to Encode :- "+ " "
		 * ); //String encode=stringEncodingtest.nextLine();
		 * 
		 * 
		 * byte[] encodingChar = new byte[5];
		 * //encodingChar=stringEncodingtest.nextByte();
		 *  encodingChar[0]=10;
		 * encodingChar[1]='q'; 
		 * encodingChar[2]='e'; 
		 * encodingChar[3]=3;
		 * encodingChar[4]='S';
		 * 
		 * String[] name = {"a","1","2","a"}; 
		 * System.out.println(" the name is :"+
		 * name);
		 * 
		 * String na = "Heloooooo"; System.out.println(na);
		 * 
		 * System.out.println("\n The Simple Byte [] Printing :" + encodingChar);
		 * 
		 * 
		 * byte[] encodingMessage1 = Base64.getEncoder().encode(encodingChar);
		 * System.out.println("\nENcoded byte[] : "+ " "+ encodingMessage1);
		 * 
		 * byte[] actualByte1= Base64.getDecoder().decode(encodingMessage1); String
		 * actualString1= new String(actualByte1);
		 * System.out.println("The Byte[]  Decode : "+ actualString1); for(byte
		 * by:actualByte1) { System.out.print("["+by + "]"); }
		 * 
		 * 
		 * String naam = "hello dear"; System.out.println("\n\nBefore the Encoding: "+
		 * naam); //Encoding the String String encMsg=
		 * Base64.getEncoder().encodeToString(naam.getBytes());
		 * System.out.println("The new String contenet Encoding: "+ encMsg);
		 * 
		 * //Decoding the String byte[] actualByte= Base64.getDecoder().decode(encMsg);
		 * String actualString= new String(actualByte);
		 * System.out.println("The Decode : "+ actualString);
		 * 
		 * 
		 * //String Encoding Method Using Base64 Format
		 * 
		 * //String encodingMessage =
		 * Base64.getEncoder().encodeToString(encode.getBytes());
		 * 
		 * //System.out.println("Encoded Message : " + encodingMessage );
		 * 
		 * 
		 * //Now Encoding and Decoding through Char[]
		 * 
		 * byte[] encodeChar = new byte[4]; encodeChar[0]=12; encodeChar[1]='A';
		 * encodeChar[2]='b'; encodeChar[3]=18;
		 * 
		 * System.out.println("\nThe Normal Printing the byte[] :"+ encodeChar);
		 * 
		 * //Encoding Method String encChar
		 * =Base64.getEncoder().encodeToString(encodeChar);
		 * System.out.println("The Encoder Message :" + " " +encChar);
		 * 
		 * //Decoding Method
		 * 
		 * byte[] decodeByte = Base64.getDecoder().decode(encChar); String getDecoded=
		 * new String(decodeByte); System.out.println("\n The Decode Message : "+ " "+
		 * getDecoded);
		 * 
		 * for(byte bny:decodeByte) System.out.print(" "+ bny);
		 * 
		 * //Accepting Byte [] from the User for Encoding
		 * 
		 * Scanner byteTest = new Scanner(System.in);
		 * System.out.print("\n\nThe Byte [] String you want to Encode: "); byte[]
		 * userInput= new byte[3]; String acceptByte= new String(userInput);
		 * acceptByte=byteTest.next();
		 * 
		 * //Encoding the UserInput String encodingBy=
		 * Base64.getEncoder().encodeToString(userInput);
		 * System.out.println("The Endoced Msg : "+ encodingBy);
		 * 
		 * //Decoding the Message
		 * 
		 * byte[] decMsg = Base64.getDecoder().decode(encodingBy); String decMessage =
		 * new String(decMsg); System.out.println(decMsg);
		 * 
		 * 
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println("Enter the Character String"); char[] chr= new char[3];
		 * char ch=scan.next().charAt(0); System.out.println("The Enter Character"+
		 * " "+ch);
		 * 
		 * Scanner scanner= new Scanner(System.in);
		 * System.out.println("Enter the Char [] : "); char[] chars =
		 * scanner.next().toCharArray();
		 * System.out.println("The Input From the User is:- "+ " "+ chars);
		 */

		/*
		 * char[] npaswd = new char[4]; npaswd[0]='q'; npaswd[1]='9'; npaswd[2]='R';
		 * npaswd[3]='7';
		 * 
		 * byte[] bytes =
		 * Charset.forName("UTF-8").encode(CharBuffer.wrap(npaswd)).array(); String str
		 * = Base64.getEncoder().encodeToString(bytes);
		 * System.out.println("\nThe Encoded Msg :" +"\n"+ bytes + "\n" + str);
		 * 
		 * byte[] byy= Base64.getDecoder().decode(bytes);
		 * System.out.println("\nthe Byte Decoder is : " + byy); for(byte h :byy)
		 * System.out.print(" " +h);
		 * 
		 * byte [] by= Base64.getDecoder().decode(str); String name = new String(by);
		 * for(byte k : by) System.out.print("\n"+" "+ k);
		 * System.out.println("\n\n The  String Decode :" + by);
		 */
		 

		/*
		 * String name = "12"; byte[] byt=
		 * Charset.forName("Windows-1254").encode(CharBuffer.wrap(name)).array();
		 * System.out.println("\nthe  Encoded Msg :" + byt);
		 * 
		 * byte[] bytes1= Base64.getDecoder().decode(byt); String newDecoder = new
		 * String(bytes1); System.out.println("\nThe Decode :" + newDecoder)
		 */;
		 
		String password ="Hello Sir How Are YOu";
		String encodePassword= Base64.getEncoder().encodeToString(password.getBytes());
		System.out.println("The Encoded Msg :" + encodePassword);
		
		byte[] decodePassword = Base64.getDecoder().decode(encodePassword);
		String getDecode= new String(decodePassword);
		System.out.println("\nThe Decode Msg : " + getDecode );
		
		 

		// byte[] nn= Base64.getEncoder().encode(chars);

	}
}
