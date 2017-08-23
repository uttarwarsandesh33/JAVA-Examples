// drawing rectangles with Window Closing code.

import java.awt.*;  
import java.awt.event.*;     // 1st step of WC

public class Demo extends Frame implements WindowListener       // 2nd step of WC
{
        public Demo()
        {
           addWindowListener(this);  // 3rd step WC
           setTitle("Strings by S N Rao");
           setSize(450, 350);   // width x height
           setVisible(true);
        }
        public void paint(Graphics g)
        {
             int x[] = { 50, 200, 275, 100, 125 };
             int y[] = { 60, 60, 150, 200, 100 };
            
             g.drawPolygon(x, y, 6);
            
        }
/*
Syntax:
    drawArc(int x, int y, int arcwidth, int archeight, int startangle, int endangle);

    fillArc(int x, int y, int arcwidth, int archeight, int startangle, int endangle);


*/

// 4th step of WC.  Sorry, it is a big step

public void windowClosing(WindowEvent e)
{
        System.exit(0);  
}
public void windowOpened(WindowEvent e) { }
public void windowClosed(WindowEvent e) { }
public void windowIconified(WindowEvent e) { }
public void windowDeiconified(WindowEvent e){ }

public void windowActivated(WindowEvent e){}
public void windowDeactivated(WindowEvent e){ }

        public static void main(String args[])
        {
              new Demo();
       }
}
