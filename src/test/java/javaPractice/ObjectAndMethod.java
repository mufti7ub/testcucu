package javaPractice;

public class ObjectAndMethod {

	public static void main(String[] args) {
		
		ObjectAndMethod Dragon = new ObjectAndMethod();
		Dragon.Method1();
		System.out.println(Dragon.srting1);
		Dragon.Method2();
		Dragon.Method3();
	}

	String srting1 = "Cartoon show";
	int number = 12345;
	boolean abc = true;
	
	public void Method1() {

		System.out.println(srting1);

	}

	public void Method2() {

		System.out.println(number);

	}
	

	public void Method3() {

		System.out.println(abc);

	}
	
}
