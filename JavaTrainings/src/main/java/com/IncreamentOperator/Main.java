package com.IncreamentOperator;

class X
{
    int m = 1111;
 
    {
        m = m++;
 //here value of m will not get changed 
        System.out.println(m);
    }
}
 
class Y extends X
{
    {
        System.out.println(methodOfY());
    }
 
    int methodOfY()
    {
        return m-- + --m;
    }
}
 
public class Main{
    public static void main(String[] args)
    {
    	int i=10;
    	int j =i=i++;
    System.out.println(j);
    Y  y = new Y();
    
    }
}