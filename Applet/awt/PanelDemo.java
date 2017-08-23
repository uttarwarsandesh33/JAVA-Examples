  /*                            Panels

  Panels are extensively used in the layout management along with layout managers.  A panel works both like a container and a component.  As a container, we can add compnonents like buttons to it.  As a component, we can add it to a frame(another container).

    The default layout manager for Panel is FlowLayout which we can change if needed. Panels do not generate any events. Panels do not have a border.

Q: Name two components that do not generate any events at all?
          a) Label   b) Panel
*/

import java.awt.*;
import java.awt.event.*;

public class PanelDemo extends Frame
{
    Button b1, b2, b3, b4, b5, b6; // 6 buttons
    Panel p1, p2;                           // 2 panels

    public PanelDemo()
    {
             setLayout(new BorderLayout()); 
                                      // also default  for frame

                                       // create buttons
             b1 = new Button("Button 1");
             b2 = new Button("Button 2");
             b3 = new Button("Button 3");
             b4 = new Button("Button 4");
             b5 = new Button("Button 5");
             b6 = new Button("Button 6");
                                               // create panels
            p1 = new Panel();
            p2 = new Panel();
                                                  // optional
            p1.setBackground(Color.cyan);
            p2.setBackground(Color.pink);

      // settting a layout to a panel, just for practice

  p2.setLayout(new GridLayout(1, 3, 10, 0));
// 1 row, 3 columns, 10 hgap, 0 vgap

// for p1, we are using the default, FL

                                   // add 3 buttons to p1
          p1.add(b1);
          p1.add(b2);
          p1.add(b3);

// if p1 is omitted, the buttons are added to frame directly
                                   // add 3 buttons to p2
          p2.add(b4);
          p2.add(b5);
          p2.add(b6);
                                // add panels to frame
                       // remember, frame is in BL
         add(p1, "North");
         add(p2, "South");

//window closing, another style, using adapter class

        // CloseMe cm = new CloseMe();
       //  addWindowListener(cm);

          addWindowListener(new CloseMe());
  
                 // set methods for frame creation
        setTitle("Panels by SNRao");
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String args[])
    {
             new PanelDemo();
    }
}

class CloseMe extends WindowAdapter
{
     public void windowClosing(WindowEvent e)
     {
              System.exit(0);
     }
}

/*
                             Adapter classes

    Adapter classes are abstract classes from java.awt.event package which make event handling simple.  Every listener that includes more than one abstract method, has a corresponding  adapter class.  The advantage of adapter is that we can override any method we like.  But incase of a listener, we must override all the abstract methods.  Following gives the list of important listeners and their corresponding adapter classes.

       Listener interface               Adapter class

a)  WindowListener(7)           WindowAdapter
b)  MouseListener(5)              MouseAdapter
c)MouseMotionListener(2)   MouseMotionAdapter
d)  KeyListener(3)                  KeyAdapter

    ActionListener and ItemListener etc. do not have a corresponding adapter class as they contain only one abstract method. 
*/
