import java.awt.*;
import java.awt.event.*;  // 1st step of window closing
public class OvalDemo extends Frame implements  WindowListener  // 2nd step
{
  public OvalDemo()
  {
        addWindowListener(this); // 3rd step

       setTitle("By SNRao");
       setSize(400,300);
       setVisible(true);
  }

  public void paint(Graphics g)
  {
       // g.drawOval(int x, int y, int width, int height)
       g.setColor(Color.red);
       g.drawOval(50,60,150,150);
       g.setColor(Color.yellow);
       g.fillOval(220,60,150,150);
  }


  // 4th step, override the 7 abstract methods of WindowListener interface

   public void windowClosing(WindowEvent e)
   {
      System.exit(0); // closes the current application(frame)
   }
   public void windowOpened(WindowEvent e) { }
   public void windowClosed(WindowEvent e) { }
   public void windowIconified(WindowEvent e) { }
   public void windowDeiconified(WindowEvent e) { }
   public void windowActivated(WindowEvent e) { }
   public void windowDeactivated(WindowEvent e) { }
   
  public static void main(String args[])
  {
	new OvalDemo();
  }
}
