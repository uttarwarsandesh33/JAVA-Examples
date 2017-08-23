//                          Vector
// Vector is used very often by the programmers.  It includes many methods with which Vector object can be manipulated. As usual, it also stores only objects.

import java.util.*;                       // for Vector class
public class VectorDemo
{
   public static void main(String args[])
   {
                                 // creating a Vector object
Vector vect = new Vector( );
                                                 // adding elements
vect.addElement(new Integer(10));
vect.addElement(new Float(15.5f));
vect.addElement(new String("Hello"));
vect.addElement("Rao");
	
Double d = new Double(15.76);
vect.add(d);                     // add() can also be used

   	        // inserting at the specified index	
String str = "World";
vect.insertElementAt(str,1); 

	             // retrieving the first element
System.out.println(vect.firstElement()); 

	            // retrieving the last element
System.out.println(vect.lastElement()); 

      // retrieving the element at the specified index
System.out.println(vect.elementAt(3)); 

            // to find the index number of an element
System.out.println(vect.indexOf("Rao")); 

 // to check an element exist or not;  true or false
System.out.println(vect.contains("World")); 

                         // to find the number of elements
System.out.println(vect.size( )); 

    	  // to find the capacity of the vector
System.out.println(vect.capacity( ));   

// default capacity of vector is 10 and incremented by 10 when get filled up like 16 for a StringBuffer

vect.addElement(100);
                       // to print all the elements in a row
System.out.println(vect); 

// Enumeration is an interface from java.util package

System.out.println("\n\nPrinting all elements using Enumeration interface:");

Enumeration e = vect.elements( );

while(e.hasMoreElements( ))
{
         System.out.println(e.nextElement( )); 
}

System.out.println("\n\nAnother way of printing all elements using Vector methods");
for(int i = 0; i < vect.size(); i++)
{
        System.out.println(vect.elementAt(i)); 
}

// to read an element and convert it into data type
             Object obj = vect.firstElement( );	
             Integer xx = (Integer) obj;
             int m = xx.intValue();
             System.out.println("Value is " + m*m);
  }
}

/* 
     other methods:
	a) remove(int index)
	b) remove(Object obj)
	c) removeAll( )	
     eg:
	remove(3);
	remove("Rao");f

	Enumeration is an interface from java.util package.  By itself, it is not a data structure, but it helps data structures to print their values.

               Enmeration e = vect.elements();

         Now, e contains all the elements of Vector.

          To print the values(elements), the Enumeration contains two methods:
   
            1. hasMoreElements( ) : used in while loop. This method returns true as long as elements exist with it to return.  If all elements are returned, this method returns false and loop terminates. This type of designing a method helps to print all the values when the number of elements are not known(this design is used in StringTokenizer and ResultSet(JDBC) also).

      2.  nextElement( ) :  returns each elememet (as an object of Object class)

        Eventhough, Enumeration was developed for DS, it is used in many other places.  We use this in Advanced Java in Servlets and JSP.
*/