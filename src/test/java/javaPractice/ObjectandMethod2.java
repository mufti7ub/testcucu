package javaPractice;

public class ObjectandMethod2 {

	public static void main(String[] args) {

		ObjectandMethod2 Dragon = new ObjectandMethod2();
		Dragon.Method1();
		method4 ();
	}

	String srting1 = "Cartoon show";
	int number = 12345;
	boolean abc = true;

	public void Method1() {

		System.out.println(srting1);
		ObjectandMethod2 obj1 = new ObjectandMethod2();
		obj1.Method2();
		obj1.Method3();

	}

	public void Method2() {

		System.out.println(number);

	}

	public void Method3() {

		System.out.println(abc);

	}
	
	public static void method4 ( ) {
		
		System.out.println("method test 4");
	}

}
