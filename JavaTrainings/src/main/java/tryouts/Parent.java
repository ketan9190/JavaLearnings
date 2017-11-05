package tryouts;

public class Parent {
	int i = 10;
	static int j = 100;

	static void abc() {
		System.out.println("Parent");
	}

	void m1() {
		System.out.println(this.i);
	}
}
