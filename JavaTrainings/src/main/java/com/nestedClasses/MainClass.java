package com.nestedClasses;

class A {
	int i = 1;

	class B {
		int i = 2;

		class C extends A {

			class p {
				int i = 3;
			}

			class q {
				int i = 4;
			}

			void methodC() {
				System.out.println(i);
			}
		}
	}
}

public class MainClass {
	public static void main(String[] args) {
		new A().new B().new C().methodC();
	}
}