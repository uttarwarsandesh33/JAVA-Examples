import java.awt.*;
import java.awt.event.*;          // 1st step of EH
public class ButtonDemo1 extends Frame implements ActionListener    // 2nd step of EH
{
     Button rb, gb, bb;   
     int rc, gc, bc;            // by default 0 assigned
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
                                    // as usual, set methods
         setTitle("Buttons by S N Rao");
         setSize(300, 300);
         setVisible(true);
    }
           // 4th step of EH 
          // (override the only abstract method of AL)

public void actionPerformed(ActionEvent e)
{
    String str = e.getActionCommand();
    if(str.equals("Red"))
    {
            rc++;
    }
    else if(str.equals("Green"))
    {
            gc++;
    }
    else if(str.equals("Blue"))
    {
            bc++;
    }
System.out.println("\nRed clicks: " + rc);
System.out.println("Green clicks: " + gc);
System.out.println("Blue clicks: " + bc);
System.out.println("Total clicks: " + (rc+gc+bc));
}
    public static void main(String args[])
    {
            new ButtonDemo1();
    }
}

         

         
         