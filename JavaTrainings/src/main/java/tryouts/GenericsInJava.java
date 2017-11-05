package tryouts;

import java.util.ArrayList;

public class GenericsInJava
{
    static <T> void processElements(ArrayList<T> a)
    {
        for (Object element : a)
        {
            System.out.println(element);
        }
    }
 
    public static void main(String[] args)
    {
        //ArrayList Containing Integers
 
        ArrayList<Integer> a1 = new ArrayList<>();
 
        a1.add(10);
 
        a1.add(20);
 
        a1.add(30);
 
        processElements(a1);
 
        //Arraylist containing strings
 
        ArrayList<String> a2 = new ArrayList<>();
 
        a2.add("One");
 
        a2.add("Two");
 
        a2.add("Three");
 
        processElements(a2);
    }
}