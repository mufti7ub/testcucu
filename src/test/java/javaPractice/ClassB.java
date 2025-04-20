package javaPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//Inheritance
public class ClassB extends ClassA {

	public static void main(String[] args) {

		System.out.println(num);
		System.out.println(num1);

		sum(12, 13, 3.7009, 4.2991);
	}

	// Polymorphism - method overloading

	public void team(String jos) {
		
		ArrayList<String> a= new ArrayList<String>();
		HashSet<String> b= new HashSet<String>();
		HashMap<String,String> c= new HashMap<String,String>();
		
		a.add("asif");
		System.out.println(a.get(0));
		b.add("piku");
		c.put("ipl", "t20");
	}
	
	public void team(String rs,String butt) {

	}

	public void team(int scr) {
		
	}

	
	// Polymorphism - method overriding
	
	//abstraction is without showing the implementation part to the user, hide it and shows only how the functionality itself works.
	
	//incapsulation to use 4 different access modifier (public, protected, default, private) techniques in code structure
}
