/*                            List

List component is used for single selection and also for multiple selection.  That is, it can be used like radio buttons or checkboxes.  

List generates two events:

a) ItemEvent for single click and handled by ItemListener

b) ActionEvent for double click and handled by ActionListener

Comparison with Choice:

a) Choice generates single event called ItemEvent where as List generates two events - ItemEvent and ActionEvent.

b) Choice gives a drop-down list where as List gives a scrollable list (with scrollbar).

c) Choice is used for single selection only where as List can be used for single selection as well as multiple selection.
*/

 // Aim: user selection of list items is displayed using drawString( ) method.  Use with ListDemo.html file.

import java.awt.*;
import java.awt.event.*;

public class ListDemo extends java.applet.Applet implements ActionListener
{	                // AL for double click
    List shops;
    public void init()
    {                                  // default FL is used
                                // create List component
         shops = new List(5, true);
                      // true is for multiple selection
// 5 indicates number of visible items in the list

         shops.add("Chandana Bros");
         shops.add("Kalaniketan");
         shops.add("Kalamandir");
         shops.add("J C Brothers");
         shops.add("CMR Mall");
         shops.add("RS Bros");
         shops.add("Bommana Bros"); 
         shops.add("Chennai Silks"); 

         shops.addActionListener(this);
         add(shops);             // add to applet
    }               // no set methods as it is applet

                                     // event handling
public void actionPerformed(ActionEvent e)
 {
           repaint();
  }
  public void paint(Graphics g)
    {
     String names[] = shops.getSelectedItems();
     int x1[] = shops.getSelectedIndexes();

   for( int i = 0, x = 50, y =150; i < names.length; i++, y+=25)
        {
           g.drawString("Sl.No." + (x1[i]+1) + "  " + names[i], x, y);
       }
    }
}
                                              // no main()
/*
 1. getSelectedItems( ) returns the item names selected by the user as a string array

2. getSelectedIndexes() returns an array of integers of the index numbers of the items selected by the user. Remember, the index number starts with zero.

3. paint() is called implicitly by the frame when the frame(or applet) is created or when the frame is resized(dragged). 

4.  If the programmer wants to call paint( ) method in his program explicitly, he is permitted to call repaint( ) method but not paint() method. If paint( ) method is called directly, it is a compilation error.

5.  About repaint() method:

          repaint() --> update() --> paint()

       repaint( ) calls update( ) method and update( ) method job is to clear the earlier drawings existing on the frame. update( ) calls implicitly, paint( ) method. paint( ) method draws afresh on the cleared frame window.
*/
 