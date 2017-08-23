/*                                  Choice

      When the radio buttons are many to display, the whole frame is flocked by radio buttons.  In this situation, we prefer Choice component.  Choice gives a drop-down list in which user can select only one at a time. Choice saves space.

      Choice generates ItemEvent and handled by ItemListener.

 (this component in VB is known as "Combo box")
*/

// Displaying the user selection as a label. Here, we write an applet. Run with ChoiceDemo.html program.

import java.awt.*;
import java.awt.event.*;
import java.applet.*;      // for Applet class

public class ChoiceDemo extends Applet implements ItemListener 
{
    Choice destination;
    Label lab;      // to display user's selection

    int fare[] = { 120, 89, 98, 123 };

 public void init() // instead of a constructor
{                            
        setLayout(new BorderLayout());
    // default layout manager for applet is FL

                          // creating a Choice object
         destination = new Choice();

   	           // adding some elements
         destination.addItem("Guntur");
         destination.addItem("Vijayawada");
         destination.addItem("Nizamabad");
         destination.addItem("Bhanswada");

// items added, by default, given index numbers, the first element being 0 and the second as 1 etc.
	                        // beautification
         destination.setFont(new Font("Monospaced",Font.BOLD,15));                 	

       lab = new Label("I display, U select");
          lab.setFont(new Font("DialogInput",Font.BOLD,20));
          lab.setForeground(Color.blue);
          lab.setBackground(Color.pink);

                   // add the components to frame
        add(destination, BorderLayout.NORTH);

                                         // instead of "North"

          add(lab, BorderLayout.SOUTH);
                                     // instead of "South"

                                      // linking to the IL
          destination.addItemListener(this);
    }                                           // close init( )

// no set methods and window closing is also
// by default

         // override the abstract method of IL

public void itemStateChanged(ItemEvent e)
{
          String str = destination.getSelectedItem();
         int x = destination.getSelectedIndex();
//      lab.setText("U want to go " + str + " of Sl.No." + (x+1));

lab.setText("U want to go " + str + " of fare Rs." + fare[x]);
    }
}                                          // close the class
        // no main() method as it is an applet


/*
a) addItem( ) is used to add elements to Choice.

b) getSelectedItem( ) returns the item selected by the user as a string.

c) getSelectedIndex( ) returns the index number of the item selected by the user. By default, items in a choice are given numbers, the first one as 0 and the second one as 1 and so on.

=====================================
               Frame to Applet changes:

1. extend Applet instead of Frame
2. write init( ) instead of constructor
3. No set methods to create the frame because they are included in html file as width and height
4. window closing is not required as it is by default
5. no main( ) method
6. write html file and open in a browser

Note:
	All the earlier frame programs can be converted to applets or this applet can be converted into a frame. Do it as a practice.
 */

