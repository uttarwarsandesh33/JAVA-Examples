/*                   Radio Buttons

Radio buttons are a group of checkboxes made as one unit.  In the unit, the user can select only one checkbox.  It is more user-friendly when the user has to select only one item among many displayed.

The functionality of radio buttons is like a radio where when we tune to another station, the earlier station gets automatically deselected.

To group the checkboxes as one unit, the java.awt package includes a class called CheckboxGroup.

*/

// Aim: to display the user selection of radio buttons of vehicle and color in a text field

import java.awt.*;
import java.awt.event.*;

public class RadioDemo extends Frame implements ItemListener
{  
     Checkbox cb1, cb2, cb3, cb4, cb5, cb6;
     Panel p1, p2;                // for two groups

  TextField tf;    // to display the user selection

     CheckboxGroup cbg1, cbg2;    
              // to group checkboxes into two units

     public RadioDemo()
     {
                                  // default BL is used
	p1 = new Panel();   // for vehicles
	p2 = new Panel();    // for colors

 cbg1= new CheckboxGroup();  // for vehicles
 cbg2 = new CheckboxGroup();     // for colors

                                  // beautification	
    p1.setBackground(Color.pink);
    p2.setBackground(Color.yellow);

           // to set a layout to panel for practice
  p1.setLayout(new GridLayout(1, 3, 15, 0));

                                      // first group, cbg1

 cb1 = new Checkbox("Hero Honda", cbg1, true);   

           // true means, by default selected. cb1 is placed in the group called cbg1

       cb2 = new Checkbox("Bajaj", cbg1, false);
       cb3 = new Checkbox("Pulsar", cbg1, false);

        // cb1, cb2 and cb3 are placed in the group called cbg1 and like this, we can place as many radio buttons, as we like, in a single group

       // second group, cbg2 for color selection

       cb4 = new Checkbox("Black", cbg2, true);
       cb5 = new Checkbox("Maroon", cbg2, false);
       cb6 = new Checkbox("Silver", cbg2, false);

                         // add checkboxes to panels
  
   p1.add(cb1);     p1.add(cb2); p1.add(cb3);
   p2.add(cb4);      p2.add(cb5); p2.add(cb6);

// add the panels and text field to the frame

                add(p1,"North");
                add(p2,"South");
        add(tf = new TextField(15), "Center");   

/* observe, tf is created and added in a different way instead of
               tf = new TextField(15);
               add(tf, "Center");
*/
                    // beautification to the text field
              tf.setBackground(Color.cyan);
              tf.setFont(new Font("Monospaced",Font.BOLD,18));

          // register the checkboxes with the IL
               cb1.addItemListener(this);
               cb2.addItemListener(this);
               cb3.addItemListener(this);
               cb4.addItemListener(this);
               cb5.addItemListener(this);
               cb6.addItemListener(this);

      // window closing using WindowAdapter

       addWindowListener(new CloseMe());

                                         // create the frame
	setSize(550,300);
	setVisible(true);
   }
   // override the only abstract method of IL
   public void itemStateChanged(ItemEvent e)
   {
         // two local temporary string variables	

             String str1="", str2="";

   // depending on the selection, assign a value to the string

// if-else ladder to know vehicle selection

    if(cb1.getState() == true)
        str1 = "Famous Hero Honda";
    else if(cb2.getState() == true)
         str1 = "Hamara Bajaj";
    else if(cb3.getState() == true)
        str1 = "Speedy Pulsar";

// Another if-else ladder to know color selection
	if(cb4.getState() == true)
 	        str2 = "Black";
	else if(cb5.getState() == true)
	        str2 = "Maroon";
	else if(cb6.getState() == true)
	        str2 = "Silver";

// place the str1 & str2 values in the text field

 tf.setText("Good Taste, U want " + str1 + " in " + str2);
    }

    public static void main(String args[])
    {
	new RadioDemo();
    }
}
