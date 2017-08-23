import java.awt.*;
import java.awt.event.*; // 1st step of window closing

public class RoundDemo extends Frame
{
      public RoundDemo( )
      {

              setTitle("Round Cornered Rectangles");
              setSize(450,350);
              setVisible(true);
      }
      public void paint(Graphics g)
      {
         //  g.drawRoundRect(int x, int y, int w, int h, int  xangle, int yangle)

g.drawRoundRect(50,60,100,100,200,200);     	g.fillRoundRect(220,60,100,100,200,200);          

    }


    public static void main(String args[])
    {
              new RoundDemo();
    }
}


