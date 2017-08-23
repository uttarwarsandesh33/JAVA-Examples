import java.util.*;

public class XXX
{
    public static void main(String args[])
    {
        Stack<Integer> st = new Stack<Integer>();
  
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        for(int k : st)
        {
            System.out.println(k);
        }

// print again
        for(int k : st)
        {
            System.out.println(k);
        }


    }
}
