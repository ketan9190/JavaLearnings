package com.nestedClasses;

public class AnonymousInnerClass {

}

class Main1 {

	public static void main(String[] args) {
		AnonymousInnerClass a = new AnonymousInnerClass() {
			void show() {

				System.out.println("hi");
			}
		};
	}
}