import java.util.*;
public class HashSetDemo
{ 
  public static void main (String args[])
  { 
    HashSet hs = new HashSet();
 	hs.add("one");
	hs.add("two");
	hs.add("three");
	hs.add("four");
	hs.add("one");
	System.out.println(hs.size()); // prints 4
	System.out.println(hs); // prints [two, one, three, four]
	TreeSet ts = new TreeSet(hs); // arranges in ascending alphabetical order
	System.out.println(ts); // prints [four, one, three, two]
  }   
}     
