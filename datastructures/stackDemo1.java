import java.util.*;  // for Stack  and Date classes
public class stackDemo1
{
   public static void main(String args[])
   {
                               // creating a Stack object
  //     Stack st = new Stack();

     Stack<String> st = new Stack<String>();
 
     st.push("hello 1");
     st.push("hello 2");
     st.push("hello 3");
     // st.push(30.5);  //error as it is a double value

      for(String k : st)
      {
         System.out.println(k);
     }

  }
}

