/*                              BorderLayout

   BorderLayout manager, as the name implies, arranges the components at the borders and center of the frame.  When a component is added to a side, it occupies complete space of the side.  That is, we can add maximum 5 components to the container, like frame, 4 in the sides and 1 in the center.  When we resize the frame, the components grow automatically to fill the sides.   The default gap either horizontally or vertically is 0 pixels which we can change.

   This is the default layout manger for Frame and Dialog.
*/

// Aim:  To illustrate BorderLayout manager. WC is also used for just practice(not to forget) and is no way connected (related) with the BorderLayout.

import java.awt.*;
import java.awt.event.*;

public class BorderDemo extends Frame implements WindowListener
{
  public BorderDemo()
  {		// set the layout to BL

   setLayout(new BorderLayout(20, 40));

       setBackground(Color.red);

// the red color is not seen as Hgap and Vgap between the components is 0 pixels by default

// creating 5 buttons to add at 5 different places
      Button nb = new Button("Top");
      Button sb = new Button("Bottom");
      Button eb = new Button("Right");
      Button wb = new Button("Left");
      Button cb = new Button("Middle");

//  We must specify the position in BL, default is Center

     add(nb,"North");	 // top
     add(sb,"South");	// bottom
     add(eb,"East");            // right
      add(wb,"West");         // left
    //  add(cb,"Center");       // middle

          addWindowListener(this);   // for WC

	setSize(300,300);
	setVisible(true);
  }

 // override the 7 abstract methods of WL for WC

    public void windowClosing(WindowEvent e)
    {
          System.exit(0);
   }
    public void windowOpened(WindowEvent e)  {   }
    public void windowClosed(WindowEvent e)  {   }
    public void windowActivated(WindowEvent e)  {   }
   public void windowDeactivated(WindowEvent e)  {   }
    public void windowIconified(WindowEvent e)  {   }
    public void windowDeiconified(WindowEvent e)  {   }


  public static void main(String args[])
  {
	new BorderDemo();
  }
}

/*
       setLayout(new BorderLayout(30, 50));

      The above statement sets gaps beween the components. 30 pixels is the horizontal gap and 50 pixels is the vertical gap and now the background color is seen.

*/