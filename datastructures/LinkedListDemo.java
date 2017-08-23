/*                        LinkedList

   It is same as C/C++, but without pointers.  We use methods to manipulate the LinkedList like adding, deleting, inserting and retrieving etc.
*/

import java.util.*;
public class LinkedListDemo
{
    public static void main(String args[])
    {
         LinkedList list = new LinkedList( );

// adding methods
         Integer i1 = new Integer(10);
         list.add(i1);                                  // index is 0
         list.add(new Double(3.5));          // index is 1
         list.add("Hello");                       // index is 2

         list.add(new Boolean(true));

// inserting at specified index(say 1); Remember that index starts at 0
         list.add(1, new Float(2.5f));  

// adding at first
         list.addFirst(new Character('A'));

                                                   // adding at last
         list.addLast(new Short("5"));

         list.add(i1); // adding again same element

         list.add(new Byte("3"));

// replacing at the specified index, original is lost
         list.set(2,"S N Rao");  

                                         // removing methods
// removing at the specified index
        list.remove(1);	

// removing the first element
        System.out.println(list.removeFirst());

// removing the last element
        list.removeLast();

// other remove methods are removeAll( ) and 
// removeRange(int start, int end)

                           // miscellaneous methods
         // retrieving the index number of an element
System.out.println(list.indexOf(i1));

      // if multiple elements exists of the same name
System.out.println(list.lastIndexOf(i1));

		// retrieving the elements
// retrieving the element at the specified index
System.out.println(list.get(1));

// to get the first element
System.out.println(list.getFirst());

// to get the last element
System.out.println(list.getLast());

		// miscellaneous methods
// to know the number of elements in the list
System.out.println(list.size());

// to check an element exists or not
System.out.println(list.contains(i1));

// to check any elements are there or not
System.out.println(list.isEmpty());

System.out.println("\n\nTo retrieve the elements using ListIterator instead of Enumeration:");

// instead of Enumeration, it is ListIterator
// 2 indicates to print from 2nd element onwards
// if any number is not specified, default is 0 and 
// prints all.  This is the advantage over 
// Enumeration. We can print from any index.

      ListIterator li = list.listIterator(4);
      while(li.hasNext())
      {
            System.out.println(li.next());
      }
   }
}

 