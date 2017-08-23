import java.awt.*;
import java.awt.event.*;   // 1st step of EH

public class ButtonDemo extends Frame implements ActionListener   // 2nd step of EH
{
     Button rb, gb, bb;
     int rcount, gcount, bcount;  // default 0
     public ButtonDemo()
     {
         setLayout(new FlowLayout());

        rb = new Button("Red");
        gb = new Button("Green");
        bb = new Button("Blue");

// 3rd step of EH.  Linking button with AL

        rb.addActionListener(this);
        gb.addActionListener(this);
        bb.addActionListener(this);

         add(rb);
         add(gb);
         add(bb);

add(new Button("ll").addActionListener(this));

        setTitle("Buttons by S N Rao");
        setSize(300, 300);
       setVisible(true);
    }
// 4th step of EH. Override the only abstract method of AL

public void actionPerformed(ActionEvent e)
{
    String str = e.getActionCommand();
    if(str.equals("Red"))
    {
          rcount++;
    }
    else if(str.equals("Green"))
    {
           gcount++;
    }
    else if(str.equals("Blue"))
    {
        bcount++;
    }
    System.out.println("\nRed clicks: " + rcount);
    System.out.println("Green clicks: " + gcount);
    System.out.println("Blue clicks: " + bcount);
    System.out.println("Total clicks: " + (rcount+gcount+bcount));
}
    public static void main(String args[])
    {
         new ButtonDemo(); 
    }
}




 

