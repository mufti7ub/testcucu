package javaPractice;

public class ArraynLoop {

	public static void main(String[] args) {
		
		String [] strng1 = new String[5];
		strng1 [0]= "piku";
		strng1 [1]= "asif";
		strng1 [2]= "kris";
		strng1 [3]= "hars";
		strng1 [4]= "pras";
		
		System.out.println(strng1 [3] +" "+ strng1 [2]);
		

		int [] num1 = {90,91,92,93,94,99};
		System.out.println(num1[2]);
		
		
		for (int i = 0; i<=4; i++) {
			
			System.out.println(strng1 [i]);
			System.out.println(num1 [i]);
			
		}
	
		
		ArraynLoop obj3 = new ArraynLoop ();
		obj3.met1();
		
		}
 
	public void met1() {
		
		ObjectandMethod2 drag = new ObjectandMethod2 ();
		
		drag.method4 ();
	} 
	
}
