package com.IIB_SIB_Constructor_InInheritence;

public class SubClass extends Parent {
public SubClass() {
	System.out.println("Subclass constructor");
}
	static{
		System.out.println("SubClass SIB");
	}
	{
		System.out.println("SubClass IIB");
	}
	public static void main(String[] args) {
		SubClass s = new SubClass();
	}
}


/*OUTPUT
 
Parent SIB
SubClass SIB
Parent IIB
Parent constructor
SubClass IIB
Subclass constructor

as SubClass uses Parent class, so java command will first see whether Parent class is loaded or not 
as it is not loaded yet , it will be loaded and SIB of parent class will be invoked
then subclass will get loaded and its SIB will be called
when we create instance of subclass ,its constructor will be invoked and fist statement of it i.e. super() by default will be invoked
which will call parent class constructor , there also it will invoke super() and after first statement of constructor is executes 
IIB will be called of parent class and after this parent class constructor will be executed 

until now we can say that first statement of subclass has been executed completely , so now IIB of subclass will get executed and then subclass
constructor.

*/