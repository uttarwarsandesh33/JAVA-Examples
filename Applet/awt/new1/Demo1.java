// to draw rectangles 
// with window closing code.  It contains 4 steps.

import java.awt.*;    
import java.awt.event.*;     // 1step of WC
public class Demo1 extends Frame implements WindowListener  // 2 step of WC
{
     public Demo1()
     {
          addWindowListener(this);     // 3 step of WC
          setTitle("Graphics by S N Rao");
          setSize(500, 350);
          setVisible(true);
     }
     public void paint(Graphics g)
     {
          int x[] = { 50, 200, 300, 75, 100 };
          int y[] = { 60, 60, 200, 300, 100 };
          g.fillPolygon(x, y, 5);

     }
/*  Syntax:
     drawPolygon(int x[], int y[], int vertices);

     fillPolygon(int x[], int y[], int vertices);
*/

// 4 step of WC.  Sorry, it is a big step

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
         new Demo1();   // just to call the constructor
    }
}

