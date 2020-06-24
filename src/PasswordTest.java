import java.util.Base64;

public class PasswordTest {
	
	
	private char [] password =  new char[5];
	
	private byte[] pass= new byte[5];
	
	byte[] encoded = Base64.getEncoder().encode(pass);
	 byte[] decoded=Base64.getDecoder().decode(encoded);
	 String actualDecoded =new String(decoded);
	 {System.out.println( " decoded value =" + decoded);}
	 {System.out.println("String Decoded value= "+ actualDecoded);}
	 
	// char[] en=Base64.getEncoder().encode(password);
	
	public void disp() {
		pass[0]='q';
		password[0]='a';
		System.out.println("String Decoded value= "+ actualDecoded);
	String pswd = String.valueOf(password);
	
	//byte[] ps1=Base64.getEncoder().encode(pswd);
	//String pss= new String(ps1);
	//byte[] ps2=Base64.getEncoder().encode(pss);
	System.out.println("Welcome to value of String :" + " " + pswd + " :-" + pass);
	
	byte[] a= {'a','2','c','2','w','@'};
	System.out.println("The Normal a=" + " "+ a);
	byte []  passwordB = Base64.getEncoder().encode(a);
	
	String passwordC = new String(passwordB);
	System.out.println("The New Encrypted Password ="+ " "+ passwordC);
	
	
	}
	public static void main(String[] args) {
	System.out.println("hello");
	
	PasswordTest pt=	new PasswordTest();
	pt.disp();
	
	}

}
