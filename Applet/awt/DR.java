// to draw strings on the frame

import java.awt.*;
public class DR extends Frame
{
      public DR()
      {
            setTitle("Frame by S N Rao");
            setSize(450, 350);
            setVisible(true);
     }
     public void paint(Graphics g)
     {
          g.setColor(Color.red);
          g.drawRect(50, 60, 150, 100);
          g.setColor(Color.blue);
          g.fillRect(220, 60, 150, 100);
      }
     public static void main(String args[])
     {
          new DR();  
    }            
}

/*
syntax: drawString(String str, int x, int y)
*/
