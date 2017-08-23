import java.awt.*;
public class StringDemo extends Frame
{
     public StringDemo()
     {
           setTitle("Frame By SNRao");
           setSize(300,350);
           setVisible(true);
    }
    public void paint(Graphics g)
    {
         g.drawString("Hello world",50,60);
         g.drawString("How do you do",50,80);
         g.drawString("Thank YOU",50,100);
      }
      public static void main(String args[])
      {
          new StringDemo();
      }
}
/*  Syntax:
         drawString(String tobedrawn, int x, int y);
x and y gives the coordinates of the first character of the string.  Remaining characters follow one to another.
*/