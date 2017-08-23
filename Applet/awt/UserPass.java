/*                           TextField

    After Button, the most used component is TextField.  TextField is used by the programmer to display some text(message) to the user or to take some input from the user dynamically(at runtime).

   The limitation of TextField is that we can enter or display only one line of text(of any length) and this limitation is overcome in TextArea, another GUI component.
*/

// to validate the user name and password.
// no window closing, you can write extra
// observe the same 8 steps, but different objects

// Aim:  To validate user name and password using text fields.

import java.awt.*;
import java.awt.event.*;

public class UserPass extends Frame implements ActionListener
{   
         // creating reference variables
 Label lab1;
 TextField tf1, tf2, tf3;
		// constructor
 public UserPass( )
 {
        setLayout(new GridLayout(3, 2, 10, 20));
        // 3 rows, 2 columns, 10 Hgap, 20 Vgap

               // filling the gaps with pink color
             setBackground(Color.cyan);

                    // Label is a component like a Button
      lab1= new Label("Enter User Name");
                                     
                                     // creating text fields
       tf1 = new TextField(15);
       tf2 = new TextField(15);
       tf3 = new TextField("I Display", 15);  

                     // registering text field with AL
        tf2.addActionListener(this);

                                            // beautification
tf2.setEchoChar('*');          // displayed as *
tf3.setEditable(false);  //user cannot enter 
tf3.setBackground(Color.cyan);
tf3.setForeground(Color.blue);
tf3.setFont(new Font("Monospaced", Font.BOLD, 25));
		
   // adding components, order is important
       add(lab1);
       add(tf1);
                           // adding anonymous label
       add(new Label("Enter Password"));
       add(tf2);

       add(new Label("Result"));
       add(tf3);

setTitle("Validating User name and Password ");
setSize(300,200);
setVisible(true);
}

   // override the only abstract method of AL
public void actionPerformed(ActionEvent e)
{
                  // to read what the user entered
String s1 = tf1.getText();  
String s2 = tf2.getText();
 	                          // validation
if(s1.equalsIgnoreCase("snrao") && s2.equals("java"))
{
                             // displaying in text field
      tf3.setText("VALID");  
      tf3.setBackground(Color.green);
}
else
{
      tf3.setText("INVALID");
      tf3.setBackground(Color.red);
}
}                          // close of actionPerformed( )

public static void main(String[] args)
{
      new UserPass();
}
}

/*
       getText() will return what user entered in the text field as a string.  That is, the return type of getText() method is string.

   setText(String) places the string in the text field.  

Note: The setText() takes always a string as parameter and getText() returns always a string.

        When the user presses enter key in tf2, actionPerformed() method is called.

           tf1 = new TextField(15);

    15 gives the width of the text field.  That is, 15 characters we can see at a time in the text field.  But, user can enter any number of characters and other characters can be seen using arrow keys.

           tf3 = new TextField("I Display", 15);

     By default, the string "I Display" is displayed in the text field, tf3.

         tf2.setEchoChar('*');
  
  In tf2, what ever typed is echoed as * character.

        tf3.setEditable(false);

    User cannot enter anything in tf3.  It is meant for the programmer to display something (result of validation).

Note: We get ActionListener in four places in AWT. They are a) Button b) TextField c) List    d) Menu.  That is, ActionListener handles the events of all these four components because all these components generate the same event called "ActionEvent".
*/
