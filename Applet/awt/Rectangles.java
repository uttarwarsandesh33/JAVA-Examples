// to draw ovals

import java.awt.*;
import java.awt.event.*;  // 1st step of WC

public class Rectangles extends Frame implements  WindowListener         // 2nd step of WC
{
    public Rectangles()
    {
          addWindowListener(this); // 3rd step of WC
            setTitle("Lines by S N Rao");
           setSize(450, 350);
           setVisible(true);
    }
    public void paint(Graphics g)
    {   
        g.drawOval(50, 60, 150, 150);
        g.fillOval(220, 60, 150, 150);
    }
/*syntax:  
         drawOval(int x, int y, int width, int height)
         fillOval(int x, int y, int width, int height)
*/
               // 4th step of WC
    public void windowClosing(WindowEvent e)
    {
          System.exit(0);
    }
public void windowOpened(WindowEvent e) { }
public void windowClosed(WindowEvent e) { }
public void windowActivated(WindowEvent e) { }
public void windowDeactivated(WindowEvent e) { }
public void windowIconified(WindowEvent e) { }
public void windowDeiconified(WindowEvent e)
{ }
    public static void main(String args[])
     {
           new Rectangles();
     }
}
