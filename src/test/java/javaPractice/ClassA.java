package javaPractice;

public class ClassA {

	static String num = "IPL match";
	static int num1 = 2025;
	
	public static void main(String[] args) {
		
		ClassA red = new ClassA ();
		red.methodX(10);
		red.sum(14, 73, 3.0098, 0.00900000000000012);

	}

	public void methodX(int number) {
		
		//int number = 2;
		
		if (number < 10) {
			System.out.println("If code run");
		}
		else {
			System.out.println("Else code run");
		}
		
	}
	
	public static void sum (int a, int b, double e, double d) {
		System.out.println(a+b+e-d);
		
	}
	
	// Polymorphism - method overriding : used same method in child class also with same parameter
	public void team(String jos) {

	}
	
	
}
