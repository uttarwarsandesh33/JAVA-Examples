// to change the background of the frame as per the button clicked.

import java.awt.*;
import java.awt.event.*;   // 1st step of EH

public class ButtonDemo extends Frame implements ActionListener   // 2nd step of EH
{
      Button rb, gb, bb;   
      int rc, gc, bc;
      public ButtonDemo()    
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

       setTitle("Buttons by S N Rao");
      setSize(300, 300);
      setVisible(true);
   }
                    // 4th step of EH
// override the only abstract method of AL

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
    repaint();
}
  public void paint(Graphics g)
  {
    g.drawString("Red Clicks: " + rc, 50, 120);
    g.drawString("Green Clicks: " + gc, 50, 140);
    g.drawString("Blue Clicks: " + bc, 50, 160);
    g.drawString("Total Clicks: " + (rc+gc+bc), 50, 180);
  }
   public static void main(String args[])
   {
        new ButtonDemo();
   }
}