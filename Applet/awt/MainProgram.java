/*                           Dialog box

a)    A dialog box is used by the programmer to take input from the user or display some message to the user at runtime.

b) A dialog box cannot exist by itself.  It is always a part of a main program.  That is, without a main program we cannot create a dialox box.

c)  A dialog box has three properties:

    i) Modal or modeless.  Modal dialog box is that one which will allow the user to do any activity on the system if it is not closed. Example is, "Confirmation dialog box" produced when we delete a file.  Modeless dialog permits the user to do any activity on the system even if it is not closed. Example is, "Find and Replace dialog box" of MS-Word.

   ii) It will have a title displayed in title bar.
  iii) A link to the main program.

*/

import java.awt.*;
import java.awt.event.*;

public class MainProgram extends Frame implements ActionListener
{
    Button btn1;
    DialogDemo dd;                 // lilnking just starts
    public MainProgram( )
    {
                                             // default BL is used
	btn1 = new Button("Password");
	add(btn1, BorderLayout.NORTH);
	btn1.addActionListener(this);
	
	dd = new DialogDemo(this);
	addWindowListener(new CloseMe());
	setSize(300, 300);
	setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
	dd.showMe();
    }
    public static void main(String args[])
    {
	new MainProgram();
    }
}
class DialogDemo extends Dialog implements ActionListener
{
	Button btn2;
	public DialogDemo(Frame f)
  	{
                      super(f, "Dialog by SNRao", true);
                              // default layout manager is BL
	setLayout(new FlowLayout());
	btn2 = new Button("Validate");
	add(new Label("Enter Password"));
	add(new TextField(15));
	add(btn2);
	btn2.addActionListener(this);

	setSize(200,200);
           }
      public void actionPerformed(ActionEvent e)
      {
                         setVisible(false);
       }
       public void showMe()
       {		
	   setVisible(true);
       }
}
