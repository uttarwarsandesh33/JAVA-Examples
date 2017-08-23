/*                    FlowLayout Manager

    FlowLayout manager places the components in the center on the north(top) side of the frame.  The default alignment is center which can be changed to left or right.  The default gap either horizontally or vertically is 5 pixels which can be changed.   The FlowLayout manager arranges the components (say, buttons) as per the width of the frame. When the row is full, the extra components come to the next row, again centered.  The component takes minimum-most size in this layout. The minimum size of the component is called "preferred-size".

   It is the default layout manager for panels and applets.
*/

// to illustrate the properties of FlowLayout manager.

import java.awt.*;                  // no event handling
public class FlowDemo extends Frame 
{
  public FlowDemo()
  {                    // setting the layout to FL
  
   setLayout(new FlowLayout(FlowLayout.CENTER, 20, 40));

                 // adding 12 anonymous buttons
          for(int i = 0 ; i < 12; i++)
          {
                  add(new Button("Button: " + i));
           }

          setSize(300,300);
          setVisible(true);
    }
    public static void main(String args[])
    {
           new FlowDemo();
    }
}      

/* 
The possible values for alignment are:

	FlowLayout.LEFT
	FlowLayout.CENTER  (default)
	FlowLayout.RIGHT

Settting the gaps between the components:

   setLayout(new FlowLayout(FlowLayout.CENTER, 30, 50));

     30 is horizontal gap and 50 is vertical gap.

*/






