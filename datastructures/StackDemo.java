 /*                                Stack 
All DS are placed in the package java.util. The other classes in java.util are Date, Calander, GregorianCalander, Random etc.

Stack follows LIFO(Last In First Out).  That is, last added element is popped(given) out first and first added returned last.

Note: For other classes(not covered today) of java.util package, separate printed notes will be given.

*/

import java.util.*;  // for Stack  and Date classes
public class StackDemo
{
   public static void main(String args[])
   {
                               // creating a Stack object
       Stack st = new Stack();
         
       System.out.println(st.empty( )); // true
// when elements not there true and if elements are there false

        int x = 10;
                                       // st.push(x); error
        Integer i1 = new Integer(x);
        st.push(i1);     // to add an object to stack
        System.out.println(st.empty( ));       // false

       double d = 10.5;
       Double d1 = new Double(d);
       st.push(d1);

           // pushing an anonymous Integer object
       st.push(new Integer(20));

                                // pushing a string object
       String s1 = new String("Okay");
       st.push(s1);

                // pushing anonymous string objects 
      st.push("hello");      
      st.push("hello1");
      st.push("hello2");

           // pushing an anonymous Date object	
      st.push(new Date( ));

                           // you can push any object
   StringBuffer sb1 = new StringBuffer("rama");
    st.push(sb1);

     System.out.println("Size before first pop: " + 
st.size());

      // to retrieve the last object added(LIFO)
     System.out.println(st.pop( ));               // rama

      System.out.println("Size after first pop: " + 
st.size());    // it will one less than previous

 System.out.println("\n\nTo retrieve in a loop:");

     while( ! st.empty( ) )
     {
           System.out.println(st.pop());		
     }
  } 
}

/*
      Once poped out, the object comes out of the stack permanently. That is why, rama is not printed in the loop(because it is popped out earlier).

      empty( ) method returns true if the stack is empty. If elements exist, it returns false.

     push(Object) is a method with which we can add an element to the stack.

     pop( ) is method with which we can retrieve the element from the stack.	
*/



