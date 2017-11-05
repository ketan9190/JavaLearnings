package com.enums;

public class UseEnums {
	public static void main(String[] args) {
		System.out.println(Directions.NORTH);
		System.out.println(MyEnums.X.s);

		System.out.println(MyEnums.X.calculate("X"));

		System.out.println(MyEnums.Y.s);

		System.out.println(MyEnums.Y.calculate("Y"));
		System.out.println(A.Enums.A);

		MyEnums1 myEnum1 = MyEnums1.AAA;

		MyEnums1.Enums myEnum2 = MyEnums1.Enums.AAA;

		// System.out.println(myEnum1 == myEnum2);

	}
}

enum MyEnums1 {
	AAA, BBB, CCC;

	enum Enums {
		AAA, BBB, CCC;
	}
}

class A {
	{
		System.out.println(1);
	}

	static {
		System.out.println(2);
	}

	static enum Enums {
		A;

		{
			System.out.println(3);
		}

		static {
			System.out.println(4);
		}

		class B {
			{
				System.out.println(5);
			}
		}
	}
}

enum EnumOne {
	ONE;

	{
		System.out.println("ONE");
	}

	enum EnumTwo {
		TWO;

		{
			System.out.println("TWO");
		}
	}
}

enum MyEnums {
	X {
		String s = "X";

		String calculate(String s) {
			return this.s + s;
		}
	},

	Y {
		String s = "Y";
	};

	String s = "MyEnums";

	String calculate(String s) {
		return this.s + s;
	}
}