// drawing round cornered rectangles with window closing

import java.awt.*;
import java.awt.event.*;
public class DrawingRoundRects extends Frame implements WindowListener
{
      public DrawingRoundRects()
      {
           setBackground(Color.yellow);
           addWindowListener(this);
           setTitle("Graphics by S N Rao");
           setSize(400, 300);
           setVisible(true);
     }
     public void paint(Graphics g)
     {
             int x[] = { 50, 150, 220, 80, 100 };
             int y[] = { 60, 60, 100, 200, 135 };
             g.fillPolygon(x, y, 5);
      }
                             // window closing code
      public void windowClosing(WindowEvent e)
      {
            System.exit(0);
      }

      public void windowOpened(WindowEvent e) { }
      public void windowClosed(WindowEvent e) { }
      public void windowIconified(WindowEvent e) { }
      public void windowDeiconified(WindowEvent e) { }
      public void windowActivated(WindowEvent e) { }
      public void windowDeactivated(WindowEvent e) { }

     public static void main(String args[])
     {
           new DrawingRoundRects();
     }
}
/*        Syntax:
         drawPolygon(int xarray, int yarray, int numberofverticestojoin)
      
         fillPolygon(int xarray, int yarray, int numberofverticestojoin)

*/           