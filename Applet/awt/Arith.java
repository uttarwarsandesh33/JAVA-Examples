// a program that uses a combination of buttons and text fields.

// to do arithmetic operations using buttons and displaying the result in text field.

import java.awt.*;
import java.awt.event.*;

public class Arith extends Frame implements ActionListener
{
                                // reference variables
TextField tf1, tf2, tf3;          // 3 text fields
Button pb, mb1, mb2, mb3, db, eb;   // 6 buttons

public Arith( )
{
                                       // setting the layout
  setLayout(new GridLayout(6, 2, 5, 5));
  setBackground(Color.cyan);

              	                      // creating objects
  tf1 = new TextField(10);
  tf2 = new TextField(10);
  tf3 = new TextField(10);

  pb = new Button("+");
  mb1 = new Button("-");
  mb2 = new Button("*");
  mb3 = new Button("%");
  db = new Button("/");
  eb = new Button("EXIT");

                                         // event handling
  pb.addActionListener(this);
  mb1.addActionListener(this);
  mb2.addActionListener(this);
  mb3.addActionListener(this);
  db.addActionListener(this);
  eb.addActionListener(this);

                                             // beautification
eb.setForeground(Color.red);
tf3.setEditable(false);
tf3.setFont(new Font("Serif", Font.BOLD,20));

              // adding components, order is important
add(new Label("Enter 1st Number"));
add(tf1);

add(new Label("Enter 2nd Number"));
add(tf2);

add(pb);          // adding buttons one by one
add(mb1);
add(mb2);
add(mb3);
add(db);
add(eb);

add(new Label("Result"));   // adding last row
add(tf3);
                               // create the frame
setTitle("Arithmetic");
setSize(400,450);
setVisible(true);
}
          // override the abstract method of AL
public void actionPerformed(ActionEvent e)
{
String s1 = tf1.getText();
double d1 = Double.parseDouble(s1);
double d2 = Double.parseDouble(tf2.getText());

//  Object obj = e.getSource();
//  Button btn = (Button) obj;
Button btn = (Button) e.getSource();

// getSource( ) returns the object of the button (in Object form).

String s2 = " ";      // a temporary local variable

if(btn ==  pb)
     s2 = "sum = " + (d1+d2); 
                                 // assign a value to s2
else if(btn ==  mb1)
        s2 = "Difference = " + Math.abs(d1-d2);
else if(btn ==  mb2)
       s2 = "Product = " + (d1*d2);
else if(btn ==  mb3)
       s2 = "Remainder =  "+ (d1%d2);
else if(btn ==  db)
        s2 = "Quotient = " + Math.round((d1/d2));
else if(btn ==  eb)
{
    System.exit(0); // closes the current application
}

tf3.setText(s2);    // place the result s2 in tf3
}
public static void main(String[] args)
{
      new Arith();
}
}

/*
        A button can be identified by the programmer in two ways: 

a) by its label (like Exit)  using getActionCommand() of ActionEvent class

b) by its object ( like eb) using getSource() of ActionEvent class
      
        In the above program, the button clicked by the user is known by its object.

*/             
