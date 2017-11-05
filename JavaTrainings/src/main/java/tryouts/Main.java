package tryouts;

import java.util.HashMap;

public class Main {
	/*
	
	Main() {
	
	this(10);
	System.out.println("default cons");
	}
	
	Main(int i) {
	System.out.println("int cons");
	abc();
	}
	
	final void abc() {
	System.out.println("abc method");
	}
	
	public static void main(String[] args) {
	
	Child c = new Child();
	System.out.println(c.i + " " + c.j);
	}
	
	void abc123() {
	
	Child c = new Child();
	System.out.println(c.i + " " + c.j);
	}
	*/

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();

		map.put(new String("hello"), 2);
		map.put("Hi", 3);

		map.remove(new String("Hello"));
		System.out.println(map);
		// chaning this file ----ssssssssssssssssssssss
	}
}
