/*                       ArrayList

ArrayList is like Vector.  In Vector, all methods are synchronized and for this reason, Vector is slow in execution.  ArrayList methods are not synchronized and by performance is faster.

*/

import java.util.*;
public class ArrayListDemo
{
    public static void main(String args[])
    {
	            // creating an ArrayList object
        ArrayList al = new ArrayList();

	                                 // adding elements
        al.add("Sumathi");
        al.add("Sridhar");

      // printing the number of elements
        System.out.println("size: " + al.size()); 

        al.set(0, "SNRao");  
          // replacing the existing element at 0 index

                                        // Printing the contents
        for(int i = 0; i < al.size(); ++i) 
        {
            String str1 = (String) al.get(i);
            System.out.println(str1);
        }
               // An equivalent loop with iterator(instead of Enumeration)

	Iterator it = al.iterator();
	while( it.hasNext() ) 
	{
	            System.out.println(it.next());
                  }
        }
}

/*
 1.  Iterator is the superclass of ListIterator
 2.  Iterator is an interface and ListIterator is a concrete class 
 3.  ListIterator replaces Enumeration in collections framework.

            Iterator it = al.iterator(3);
            returns from 3rd element to the last.
            If 3 is omitted, it prints from first to last.  This is the advantage over Enumeration.


Interview Question:

Difference between Vector and ArrayList:

            They are more like same, but they differ in their performance.

1. In ArrayList, we can use Iterator where we can print from any element we want.

2. Vector methods are synchronized and ArrayList methods are not synchronzied. For this reason, by performance-wise Vector is slow and ArrayList is faster in retrieval.

3.  If performance is the consideration, better use ArrayList.

Note: We will come to know about "synchronized" in multithreading chapter.
*/
