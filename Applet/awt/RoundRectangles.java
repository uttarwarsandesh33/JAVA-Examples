import java.awt.*;
import java.awt.event.*;  // 1st step of WC

public class RoundRectangles extends Frame implements WindowListener  // 2nd step of WC
{
    public RoundRectangles( )
    {
       // giving a background color to frame(optional)
         setBackground(Color.cyan);

     addWindowListener(this);   // 3rd step of WC

                            // as usual write the 3 set mthods
        setTitle("Frame by SNRao");
        setSize(450, 300);
        setVisible(true);
   }
   public void paint(Graphics g)
   {
         g.drawRoundRect(50, 60, 100, 100, 200, 200);
         g.fillRoundRect(220, 60, 100, 100, 200, 200);
   }

   // 4th step of window closing(it is a big one)

public void windowClosing(WindowEvent e)
{
      System.exit(0);
}
public void windowOpened(WindowEvent e) { }
public void windowClosed(WindowEvent e) { }
public void windowActivated(WindowEvent e) { }
public void windowDeactivated(WindowEvent e) { } 
public void windowIconified(WindowEvent e) { }
public void windowDeiconified(WindowEvent e) { }

                                               // write the main method
public static void main(String args[])
{
     new RoundRectangles();
}
}
