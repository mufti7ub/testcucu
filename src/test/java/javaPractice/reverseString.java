package javaPractice;

public class reverseString {

	public static void main(String[] args) {
reverseString("subhradeep");
	}
	
	public static void reverseString(String original) {
		String rev="";
		
		for(int i=0;i<original.length();i++) {
			rev=original.charAt(i)+rev;
		}
System.out.println("reversed string is: "+rev);
	}

}
