/*                         Key events

    Key events are handled using KeyListener which includes 3 abstract methods for different actions of a key on the keyboard.
*/

// to change the background of the frame as per the key typed using KeyListener

import java.awt.*;
import java.awt.event.*;

public class KeyDemo extends Frame implements KeyListener  
{                       // for keyboard, it is KL
    public KeyDemo()
   {
                    // link the frame with KL
    addKeyListener(this);

                                      // window closing
    addWindowListener(new WindowAdapter()
    {
    public void windowClosing(WindowEvent e)
    {   System.exit(0);    
     }  
   } 
);

                      setSize(300,300);
                      setVisible(true);
     }                    // close constructor

 // override the 3 abstract methods of KL

public void keyPressed(KeyEvent e) {  }

public void keyReleased(KeyEvent e) { }

     public void keyTyped(KeyEvent e)
    {
      char ch = e.getKeyChar();  

if(ch == 'r' || ch == 'R')  // if r or R is typed
{
    setBackground(Color.red);
}
else if(ch == 'b'|| ch == 'B')  // if b or B is typed
    {
              setBackground(Color.blue);
    }
else if(ch == 'y'|| ch == 'Y') // if y or Y is typed
    {
          setBackground(Color.yellow);
    }
  else if(ch == 'a'|| ch == 'A') // if y or Y is typed
    {
          System.out.println("Good afternoon");
    }
  else if(ch == 'm'|| ch == 'M') // if y or Y is typed
    {
          System.out.println("Good Morning");
    }
    else 
    {
         System.out.println("You typed " + ch + " but type r, y and b only");
    }
  }
public static void main(String snrao[])
{
           new KeyDemo();
}                                    // close main()
}                                   // close class

/*
      getKeyChar( ) method of KeyEvent class returns the key typed by the user as a char value.
*/
