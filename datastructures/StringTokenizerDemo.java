/*                     StringTokenizer

StringTokenizer is from java.util package and  its  job is to tokenize a string into independent words.  Each word is called a token.
*/

import java.util.*;
public class StringTokenizerDemo
{
     public static void main(String args[])
     {

           String str = "23 67.5 A rama"; 

        StringTokenizer st = new StringTokenizer(str);	

        System.out.println(st.countTokens());  // 4

	while(st.hasMoreTokens())
	{
	   String s  = st.nextToken();
	   System.out.println(s);
	}
    }
}

/*  
      This class is useful in the design of parsers, compilers etc. where the program is to be divided into a number of tokens.

Constructors:

        StringTokenizer constructor is overloaded as follows:

   a) StringTokenizer(String str)
   b) StringTokenizer(String str, String delimiters)

        Example:

             String str = "1234*67.5@Akrama";
     StringTokenizer st = new StringTokenizer(str);	

     StringTokenizer st = new StringTokenizer(str,  "*,@,k");	

         Here, the delimiters are *, @ and k.  If we do not mention the delimiter, the default is whitespace.

Methods:

   a) countTokens() : Returns the number of tokens (words) as an integer value.

  b)  nextToken() :  This method returns the token as a string.

  c) hasMoreTokens() : Returns a boolean value of true or false.  If the token pointer points to a token, this method returns true (and the loop iteration continues) else false (loop terminates).

  d) hasMoreElements() :  This is similar to hasMoreTokens().  We can use either one.
====================================
*/