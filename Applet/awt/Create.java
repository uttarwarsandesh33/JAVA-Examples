import java.awt.*;
public class Create extends Frame
{
    public Create()
    {
            setTitle("Lines by S N Rao");
           setSize(300, 350);
           setVisible(true);
    }
    public void paint(Graphics g)
    {
         g.drawString("Hello World", 50, 60);
         g.drawString("How do you do", 50, 80);
         g.drawString("Thank You", 50, 100);
    }
    public static void main(String args[])
     {
           new Create();
     }
}
/*syntax:  
         drawString(String str, int x, int y)
where
       str is the string to be drawn
      x and y are the coordinates where the string to be drawn.  At x and y, the first letter of the string is drawn and remaining letters follows one to another.
*/