public class ObjectCoversion
{
  public static void main(String args[])
  {
         int x = 10;  // simple data type of int
// converting into an object
         Integer i1 = new Integer(x);	 
         System.out.println(i1); // prints 10
// error because we cannot multiply objects
         // System.out.println(i1*i1); 
// to covert back into an int data type
         int k = i1.intValue( );
         System.out.println(k*k); // prints 100

// let us see a double value
         double d1 = 10.5;  // double data type
         Double d2 = new Double(d1); // to Double object
         System.out.println(d2); // prints 10.5         
         double d3 = d2.doubleValue( ); // converting back
         System.out.println(d3*d3); // prints 110.25
   }
}

