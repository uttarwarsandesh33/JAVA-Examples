import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Morning extends Applet implements KeyListener  
{
    String str="";
    public void init()
   {
    addKeyListener(this);
     }              

 // override the 3 abstract methods of KL

public void keyPressed(KeyEvent e) {  }
public void keyReleased(KeyEvent e) { }
     public void keyTyped(KeyEvent e)
    {
      char ch = e.getKeyChar();  

if(ch == 'a')  
{
   str = "Good Afternoon";
    repaint();
}
else if(ch == 'm')  
    {
   str = "Good Morning";
    repaint();
    }
}
   public void paint(Graphics g)
   {
        g.setFont(new Font("Serif", Font.BOLD, 25));
          g.drawString(str, 50,100);
  }

}