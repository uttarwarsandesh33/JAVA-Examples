import java.awt.*;
import java.awt.event.*;  // 1st step of WC

public class RectangleDemo extends Frame implements  WindowListener  // 2nd step of WC
{
  public RectangleDemo()
  {
        addWindowListener(this); // 3rd step of WC

       setTitle("By SNRao");
       setSize(400,300);
       setVisible(true);
  }
  public void paint(Graphics g)
  {
       // g.drawRect(int x, int y, int width, int height)

      g.setColor(Color.blue);
      g.drawRect(50,60,150,100);
      g.setColor(Color.magenta);
      g.fillRect(220,60,150,100);
  }

  // 4th step of WC, override the 7 abstract methods of WindowListener interface

   public void windowClosing(WindowEvent e)
   {
      System.exit(0); // closes the current application(frame)
   }
   public void windowOpened(WindowEvent e) { }
   public void windowClosed(WindowEvent e) { }
   public void windowIconified(WindowEvent e) { }
 public void windowDeiconified(WindowEvent e){ }
   public void windowActivated(WindowEvent e) { }
public void windowDeactivated(WindowEvent e){ }
   
  public static void main(String args[])
  {
	new RectangleDemo();
  }
}