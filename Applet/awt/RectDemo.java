import java.awt.*;
import java.awt.event.*;  // 1st step of window closing
public class RectDemo extends Frame implements WindowListener  
{
    public RectDemo()
    {
       addWindowListener(this);   // 3rd step
       setTitle("By SNRao");
       setSize(450,350);
       setVisible(true);
   }
   public void paint(Graphics g)
   {
          Toolkit tk = Toolkit.getDefaultToolkit();
           String names[] = tk.getFontList();
          for(int i=0, x=50, y=60; i<names.length; i++, y+=20)
          {
              g.drawString(names[i], x, y);
          }

   }
   
   // 4th step of window closing

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

    public static void main(String args[])
   {
       new RectDemo();
   }
}