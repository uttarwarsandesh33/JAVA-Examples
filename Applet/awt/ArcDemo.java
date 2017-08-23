import java.awt.*;
import java.awt.event.*;  // 1st step of window closing
public class ArcDemo extends Frame implements  WindowListener  // 2nd step
{
  public ArcDemo()
  {
        addWindowListener(this); // 3rd step

       setTitle("By SNRao");
       setSize(400,300);
       setVisible(true);
  }

  public void paint(Graphics g)
  {
/*
       // g.drawArc(int x, int y, int arcwidth, int archeight, int startangle, int endangle)

g.setColor(Color.magenta);
           g.fillArc ( 60, 125, 80, 40, 180, 180 ) ;                        
*/

     int x [] = { 50,150,220,100,125};
     int y [] = { 60,60,150,200,120};
    g.fillPolygon(x, y, 4);



    
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
	new ArcDemo();
  }
}
