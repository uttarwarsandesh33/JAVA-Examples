/*                              Hashtable

Hashtable stores key/value pairs.  Key and value must be objects(of any Java class).  When we supply the key, it returns the value.
*/

import java.util.*;
public class HashDemo
{  
    public static void main(String args[])
    {
                              // creating a Hashtable object
       Hashtable ht = new Hashtable();

                                      // adding key/value pairs
      ht.put("Apple","red");
      ht.put("Strawberry","red");
      ht.put("Lime","green");

// key and value must be objects only(of any class)
      HashDemo hd = new HashDemo();
      ht.put(hd,"hello world");

      String str = "thanks";
      ht.put(str, "Sita");

      ht.put(str, "rama");
 
      ht.put("totalmarks", new Double(455.6));
      ht.put("subjects", new Integer(6));
	
// to retrieve a value by supplying a key
      System.out.println(ht.get("Lime"));

                  	      // to print all the elements 
  System.out.println("Printing all the elements");

      Enumeration e = ht.keys( );

// now, e contains all the key objects (not value objects)
// nextElement( ) returns the key object

      while(e.hasMoreElements())
     {
         Object  k = e.nextElement();    // k is the key
         Object v = ht.get(k);
                         // v is the value associated with k
         System.out.println(k + " : " + v);
    }	
	                    // same casting procedure
Object o1 = ht.get("totalmarks");
Double d1 = (Double) o1;
double d2 = d1.doubleValue();

Object o2 = ht.get("subjects");
Integer ii = (Integer) o2;
int m = ii.intValue();
System.out.println("Average marks: " + Math.round(d2/m));
  }
}

/*
put(object, object) method takes two objects as parameters; first one as a key and the second one as a value.

get(object) method returns an object of Object class and we must supply the key object as parameter.
*/
