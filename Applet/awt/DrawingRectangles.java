// drawing rectangles.  Window closing code is also included.

import java.awt.*;
import java.awt.event.*;   // 1st step of WC

public class DrawingRectangles extends Frame implements WindowListener  // 2nd step of WC
{
       public DrawingRectangles()
       {
       addWindowListener(this);  // 3rd step of WC
            setTitle("Geometrical Figures");
            setSize(450, 300);
            setVisible(true);
      }
      public void paint(Graphics g)
      {
           int x[] = { 50, 150, 200, 75, 100 };
           int y[] = { 60, 60, 150, 200, 100 };
           g.drawPolygon(x, y, 5);
     }
                // 4th step of WC. It is big step
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
             new DrawingRectangles();
      }
}
/*
      Syntax:

     drawPolygon(int x[], int y[], int vertices) ;
    fillPolygon(int x[], int y[], int vertices) ;
*/
