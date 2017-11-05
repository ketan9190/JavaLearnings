package com.IncreamentOperator;
	
class A
{
    static int i = 1111;
 
    static
    {
        i = i-- - --i;
    }
 
    {
        i = i++ + ++i;
    }
}
 
class B extends A
{
    static
    {
        i = --i - i--;
    }
 
    {
        i = ++i + i++;
    }
    int methodOfA()
    {
        return (true ? null : 0);
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        B b = new B();
 
        System.out.println(b.methodOfA());
    }
}