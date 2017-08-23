/*                       Properties

Properties is like Hashtable, but with a small difference. Properties also takes key/value pairs, but they must be string objects only.  

(Remember , incase of Hashtable, the key and value can be objects of any class.)

*/

import java.util.*;
public class PropertiesDemo
{
     public static void main(String args[])
     {
            	Properties p = new Properties();

// key/value pair must be string objects only

	p.put("Bawarchi", "Biryani");
	p.put("Blue Sea", "Tea");
	p.put("Niagara", "Haleem");

System.out.println(p.getProperty("Bawarchi"));

System.out.println(p.getProperty("Shivani"));
// returns null because Shivani key does not exist

System.out.println("\n\nTo print the values using Enumeration interface:");

String str;               // a temporary string variable

Enumeration e = p.keys( );
while(e.hasMoreElements( ))
{
        str = (String) e.nextElement( );
        System.out.println(str + " : " + p.getProperty(str));
}
}
}

/*
   getProperty(String) takes the key as parameter and returns the value as a String.
*/