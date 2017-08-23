/*                           Menus

   Menus are very common in windows environment.  Menu gives an abridged(concise) form for many selections and takes very less space.

Steps of creating menus:

1.  Create menu bar
2.  Add menu bar to the frame
3.  Create menus
4.  Add menus to menu bar
5.  Create menu items
6.  Add menu items to menus
7.  Event handilng

8.  Note:  
a)              Menu is not a component because it is not a subclass of Component class.  It is a subclass of MenuComponent.  Refer the component hierarchy.

b)             As it is not a component, we cannot add it to frame directly using add() method.  It requires extra code.

c)            MenuBar cannot be added to applets.  It can be added to frames only. When added to frame, it goes by  default to north.  Menus cannot be added to south.

*/

// to display the contents, of the file selected, in a text area.

import java.awt.*;
import java.io.*;              // for file reading
import java.awt.event.*;

public class MenuDemo extends Frame implements ActionListener
{
    Menu fm, dm, em, sm;             // 4 menus
    TextArea ta;                           // to display
    public MenuDemo( )
    {                          // creating the menu bar
	MenuBar mb = new MenuBar(); 
	setMenuBar(mb);  

// adding menu bar to frame and by default added to North.  We can't add menus to applets.
                  // MenuBar is not a component 
            // add(mb,"North") does not work

                                        // creating menus
	fm = new Menu("Files");
	dm = new Menu("Date");
	em = new Menu("Exit");
	sm = new Menu("Class Files");

                           // add menus to menu bar
	mb.add(fm);
	mb.add(dm);
	mb.add(em);
// observe, sm is not added because it is to be added to fm later as submenu

                                // create menu items
   MenuItem mi1 = new MenuItem("FlowDemo.java");

fm.add(mi1);       // add menu item to menu

  // anonymous MenuItems also can be added
fm.add(new MenuItem("CheckDemo.java")); 
fm.add(new MenuItem("ListDemo.java"));

                                  // populate Date menu
dm.add(new MenuItem("Hrs,Mts,Secs"));
dm.add(new MenuItem("Complete Info"));

                                    // populate Exit menu
em.add(new MenuItem("Close"));

                              // populate sub menu
sm.add(new MenuItem("CheckDemo.class"));
sm.add(new MenuItem("BorderDemo.class"));
sm.add(new MenuItem("ListDemo.class"));

	// adding a separator line
fm.addSeparator( ); // gives a dull color line
                 
                 // adding submenu to main menu
fm.add(sm);  

ta = new TextArea(15, 50);// 15 rows, 50 columns

add(ta,"Center");
ta.setBackground(Color.cyan); 
                                      // beautification
ta.setFont(new Font("SansSerif",Font.BOLD,15));

                                           // event handling
	fm.addActionListener(this);
	dm.addActionListener(this);
	em.addActionListener(this);
	sm.addActionListener(this);

                                                 // set methods
                   setSize(300,300);
	setVisible(true);
    }
// event handling. Override the abstract method of AL. This method is called when the menu item is clicked.

    public void actionPerformed(ActionEvent e)
    {
           String str = e.getActionCommand();  
// returns menu item selected, as a string

       java.util.Date d = new java.util.Date();
// Date methods are deprecated in favor of Calendar

if(str.equals("Hrs,Mts,Secs"))
{
       ta.setText(d.getHours() + " : " + d.getMinutes() + " : " + d.getSeconds());
} 
else if(str.equals("Complete Info"))
{
    ta.setText(d.toString());
}
else if(str.equals("Close"))
{
   System.exit(0);
}
else
{
      ta.setText("Following is the file contents of " + str + "\n\n");
    try  
   {    // to open the file and read the contents

        FileInputStream fis = new FileInputStream(str);

   	 int k;
	 while(( k = fis.read()) != -1)
	 {
                           ta.append(String.valueOf((char)k));
	 }
	 fis.close();
           }                       // close the try block
           catch(IOException e1)
           {
	       e1.printStackTrace();
           }
      }                              // close the else
  }                     // close the actionPerfomed( )
  public static void main(String args[])
  {
	new MenuDemo();
  }
}

/*
     TextArea includes two methods:

a) setText(String str): this method replaces the earlier text with the present str.  That is, earlier is lost.

b) append(String str): this method appends the present str to the existing text.

c) setMenuBar(mb): this method adds menu bar implicitly on the north side of the frame.  A menu bar cannot be added to south and also menu bar cannot be added to applets.
*/
