// to draw strings

import java.awt.*;
public class DrawingStrings extends Frame
{
       public void paint(Graphics g)
       {
          g.drawString("Hello World", 50, 60);
          g.drawString("How do you do", 50, 80);
          g.drawString("All are okay", 50, 100);
       }
      public static void main(String args[])
      {
        Frame  f = new DrawingStrings();
        f.setTitle("Strings  by S N Rao");
        f.setSize(300, 350);
        f.setVisible(true);
      }
}

  // syntax: drawString(String str, int x, int y); where str is the string to be drawn and x and y are the coordinates of the first letter of the string. The other letters follows one to another automatically.
 	
