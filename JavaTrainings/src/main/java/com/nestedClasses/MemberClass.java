package com.nestedClasses;

public class MemberClass {

	private int nonstatic = 90;
	static int staticInt = 100;
	{
		InnerClass i = new InnerClass();
		i.i = 90;
		StaticInnerClass s = new StaticInnerClass();
		s.i = 10;
		s.k = 90;
	}
	static {
		// InnerClass i = new InnerClass();
		// i.i = 90;
		StaticInnerClass s = new StaticInnerClass();
		s.i = 10;
	}

	class InnerClass {
		public int i;
		// static int j;
		static final int k = 100;

		{
			System.out.println(nonstatic);
			System.out.println(staticInt);
		}

		/*		static {
		
				}
		*/
	}

	static class StaticInnerClass {
		private int i;
		private static int k;
		{
			// System.out.println(nonstatic);
			System.out.println(staticInt);
		}
		static {

		}
	}

	void abc() {
		System.out.println(nonstatic);
		System.out.println(staticInt);

		class LocalInnerClass {

			{
				System.out.println("in local inner class");
				System.out.println(nonstatic);
				System.out.println(staticInt);

			}
		}

		new LocalInnerClass();
	}

	public static void main(String[] args) {
		MemberClass m = new MemberClass();
		m.abc();
	}
}

class Main {

	public static void main(String[] args) {
		MemberClass m = new MemberClass();
		m.abc();
		// MemberClass.InnerClass obj = new MemberClass().new InnerClass();

		// MemberClass.StaticInnerClass obj2 = new
		// MemberClass.StaticInnerClass();
	}
}