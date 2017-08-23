// to draw rectangles

import java.awt.*;    // for Frame and Graphics classes
public class Demo extends Frame
{
     public Demo()
     {
          setTitle("Graphics by S N Rao");
          setSize(300, 350);
          setVisible(true);
     }
     public void paint(Graphics g)
     {
          g.drawRect(50, 60, 150, 100);
     }
/*  Syntax:
     drawRect(int x, int y, int width, int height);
*/
     public static void main(String args[])
     {
         new Demo();   // just to call the constructor
    }
}

