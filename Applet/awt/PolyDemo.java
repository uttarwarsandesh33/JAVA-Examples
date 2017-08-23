import java.awt.*;
import java.awt.event.*;  // 1st step of window closing
public class PolyDemo extends Frame implements  WindowListener  // 2nd step
{
  public PolyDemo()
  {
        addWindowListener(this); // 3rd step

       setTitle("By SNRao");
       setSize(400,300);
       setVisible(true);
  }

  public void paint(Graphics g)
  {
      int x[ ] = { 50,200,275,75,110};	  
      int y[ ] = { 60,60,200,260,160 };

      g.fillPolygon(x,y,4);
   
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
	new PolyDemo();
  }
}
