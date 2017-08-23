//  Vector program using "Generics".
// works from JDK 1.5 and onwards

import java.util.*;

public class VDemo
{
    public static void main(String args[])
    {
         Vector<Integer> vect = new Vector<Integer>();

        vect.addElement(10);
        vect.addElement(20);

       System.out.println(vect);

int marks[] = { 50, 60, 70 };

        for(int k : marks)
        {
              System.out.println(k);
       }

  }
}


 