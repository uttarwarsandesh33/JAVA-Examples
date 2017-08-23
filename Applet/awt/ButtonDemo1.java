// to rewrite the previous program with event handling so that the background of the frame changes as per the button clicked.

import java.awt.*;       
import java.awt.event.*;        // 1st step of EH
public class ButtonDemo1 extends Frame implements ActionListener  // 2nd step of EH
{
    Button rb, gb, bb;  
    int rcount, gcount, bcount;
    public ButtonDemo1()
    {
      setLayout(new FlowLayout());

     rb = new Button("Red");
     gb = new Button("Green");
     bb = new Button("Blue");

                                                 // 3rd step of EH
    rb.addActionListener(this);
    gb.addActionListener(this);
    bb.addActionListener(this);

    add(rb);
   add(gb);
   add(bb);

  setTitle("Buttons by 7.00 PM batch");
  setSize(300, 300);
  setVisible(true);
 }
             // 4th step of EH.  Override the only abstract  method of AL

 public void actionPerformed(ActionEvent e)
 {
      String str = e.getActionCommand();
      if(str.equals("Red"))
      {
            setBackground(Color.red);
      }
      else if(str.equals("Green"))
      {
            setBackground(Color.green);
      }
      else if(str.equals("Blue"))
      {
            setBackground(Color.blue);
      }
   }                // close actionPerformed() method

 public static void main(String args[])
 {
        new ButtonDemo1();
 }                // close the main()
}             // close the class          
     
/*
1.     The appropriate listenter that can handle the events of a button is ActionListener.

2.     rb.addActionListener(this);

       addActionListener() is a method of Button class that links the button with the ActionListener.  The parameter "this" corresponds to ActionListener.

3.   getActionCommand() method of ActionEvent class that returns the label of the button user clicked (as string).  This string is used to know which button user clicked.

*/
     
