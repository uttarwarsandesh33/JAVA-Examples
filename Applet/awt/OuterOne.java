/*
                    Nested Classes (or Inner classes)

           A class declared in another class is called as inner class.  An inner class can access outer class members, but outer class cannot access inner class members. Following program illustrates.

*/

public class OuterOne                 // outer class
{
  int x=10;
  public class InnerOne            // inner class
  {
	int y = 20;
	public void innerMethod( ) 
                   {
            System.out.println("x from inner method:"+x);
            System.out.println("y from inner method:"+y);
	}       // inner method closing
    }                     // inner class closing

    public void outerMethod( ) 
    {
        System.out.println("x from outer method:"+x);
    }

   public static void main(String args[])  
   {
         OuterOne oo = new OuterOne();
         OuterOne.InnerOne io = new OuterOne().new InnerOne( );

         oo.outerMethod( );
         io.innerMethod( );
   }
}