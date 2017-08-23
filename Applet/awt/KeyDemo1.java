/*                         Key events

    Key events are handled using KeyListener which includes 3 abstract methods for different actions of a key on the keyboard.
*/

// to display a message as per the key typed using KeyListener

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class KeyDemo1 extends Applet implements KeyListener  
{                       // for keyboard, it is KL
    String str;
    public void init()
   {
                    // link the frame with KL
    addKeyListener(this);
     }                  

 // override the 3 abstract methods of KL

public void keyPressed(KeyEvent e) {  }
public void keyReleased(KeyEvent e) { }
     public void keyTyped(KeyEvent e)
    {
      char ch = e.getKeyChar();  

     if(ch == 'm' || ch == 'M')
     {
            str = "Good Morning";
           repaint();
     }
     else if(ch == 'e' || ch == 'E')
     {
            str = "Good Eveing";
           repaint();
     }
     else if(ch == 'a' || ch == 'A')
     {
            str = "Good Afternoon";
           repaint();
     }
    else
    {
            str = "You typed " + ch + " but type m, e or a only";
           repaint();
    }
}
    public void paint(Graphics g)
    {
            g.setFont(new Font("Monospaced", Font.BOLD, 25));
           g.drawString(str, 50, 60);
  }
}
                                   

/*
      getKeyChar( ) method of KeyEvent class returns the key typed by the user as a char value.
*/
