/*
                                  Checkbox

    Checkbox is preferred by the programmer when the user is left with two options - yes or no, else, true or false.

    Checkbox has two states.  If selected, it returns true and if deselected, it returns false.

    Checkbox generates ItemEvent and is handled by ItemListener.

    Using getState() method, we can know which checkbox user selected.

*/

// to change the font of the label as per the checkbox selected

import java.awt.*;   // for component classes
import java.awt.event.*; // for event handling

public class CheckDemo extends Frame implements ItemListener   
            // for checkbox, it is ItemListener
{
  Checkbox cb1, cb2, cb3, cb4;  // four checkboxes
  Label lab;                                  // one label

  public CheckDemo()
  {
                             // default layout BL is used
      // convert reference variables into objects

cb1 = new Checkbox("Monospaced");
cb2 = new Checkbox("Bold", true);
                   // true indicates default selected
cb3 = new Checkbox("Italic");
cb4 = new Checkbox("Exit");

lab = new Label("Hello World");
                              // adding to the frame
add(cb1,"North");
add(cb4,"South");
add(cb2,"West");
add(cb3,"East");
add(lab,"Center");

      // register checkboxes with ItemListener
cb1.addItemListener(this);
cb2.addItemListener(this);
cb3.addItemListener(this);
cb4.addItemListener(this);
                                      // create the frame
setTitle("Creating checkboxes");
setSize(300, 300);
setVisible(true);
    }

//override the only abstract method of ItemListener

public void itemStateChanged(ItemEvent e)
{
                            // take some local variables
	String str =""; 
	int b = 0, i = 0;

// getState( ) returns the state of the chekcbox -- if selected true, else false

	if(cb1.getState() == true)
		str = "Monospaced";
	else
		str = "Serif";

	if(cb2.getState() == true)
		b = Font.BOLD;
	else
		b = Font.PLAIN;
	
	if(cb3.getState() == true)
		i = Font.ITALIC;
	else
		i = Font.PLAIN;
	
	if(cb4.getState() == true)  
		System.exit(0); 	

// create a font object with local variables and apply it to the label
         
              Font f1 = new Font(str, b+i, 25);
             lab.setFont(f1);
                       // b + i is for bold and italic
   }
   public static void main(String args[])
   {
	new CheckDemo();
   }
}

/*
a)           cb2 = new Checkbox("Bold", true);

cb2 is by default selected.  But no action takes place. 
*/
