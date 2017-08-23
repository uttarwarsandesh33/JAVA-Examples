import java.util.*;

public class TreeDemo
{
   public static void main(String args[])
   {
       TreeSet st = new TreeSet();
       st.add("hello");
       st.add("hello");
       st.add("hello3");

     Iterator it = st.iterator();
     while(it.hasNext())
     {
          System.out.println(it.next());
    }


      

  }
}
