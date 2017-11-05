package tryouts;

public class Child extends Parent {
	int i = 20;
	static int j = 200;

	/*static {
		System.out.println("hi");
	}*/
	void m1() {
		System.out.println(this.i);
	}

	int abcd() {
		super.abc();
		return 1;

	}

	public static void main(String[] args) {
		Child c = new Child();

		c.abcd();
	}
}
