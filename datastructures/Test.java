import java.util.*;  // for Stack  and Date classes
public class Test
{
   public static void main(String args[])
   {
                               // creating a Stack object
       Stack<Integer> st = new Stack<Integer>(); // generics
st.push(10);      // adding only int values
st.push(20);
st.push(30);

/*
for(int i = st.size()-1;  i >= 0; i--)
{
        System.out.println(st.pop());
}
*/

for(int k : st)        // enhanced for loop
{
      System.out.println(k);
}

}}

