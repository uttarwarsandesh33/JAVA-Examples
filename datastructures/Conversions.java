// converting primitive data type into object using wrapper classes and again converting the object   into data type.

public class Conversions
{
   public static void main(String args[])
   {
        int x = 10;
        Integer i1 = new Integer("10");
        System.out.println(i1);         // prints 10 but in object
       // System.out.println(i1*i1); error

        int k = i1.intValue();
        System.out.println(k*k);   // 100

       double d1 = 10.5;
       Double d2 = new Double(d1);
       System.out.println(d2);    // prints 10.5
       // System.out.println(d2*d2); error

      double d3 = d2.doubleValue();
      System.out.println(d3*d3);
  }
}

/*
Modifications:
                 Two ways of parsing:

          String s1 = "10";
                                                      // 1st style
         int k = Integer.parseInt(s1);
         System.out.println(k*k);
                                                    // 2nd style


        int k1 = new Integer(s1).intValue();
         System.out.println(k1*k1);
*/ 