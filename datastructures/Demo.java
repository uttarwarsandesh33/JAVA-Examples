// using autoboxing, generics and enhanced for loop in DS.  This works with JDK1.5 and above versions only.

import java.util.*;

public class Demo
{
    public static void main(String args[])
    {
       // Stack st = new Stack();

         Stack<Integer> st = new Stack<Integer>();

        st.push(10); 
        st.push(20); 
        st.push(30); 

        for( int k : st)
        {
             System.out.println(k);
        }

             System.out.println("Elements from array");   
         int marks[] = { 40, 50, 60, 70, 80 };

        for( int k : marks)
        {
             System.out.println(k);
        }

   }
}
