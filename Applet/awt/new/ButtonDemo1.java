import java.awt.*;        
import java.awt.event.*;   // 1st step of EH
     
public class ButtonDemo1 extends Frame implements ActionListener   // 2nd step of EH
{
     Button rb, gb, bb;
     int rc, gc, bc;
     public ButtonDemo1()
     {
        setLayout(new FlowLayout());
      
        rb = new Button("Red");
        gb = new Button("Green");
        bb = new Button("Blue");
                                                      // 3rd step
        rb.addActionListener(this);
        gb.addActionListener(this);
        bb.addActionListener(this);

       add(rb);
       add(gb);
       add(bb);

      setTitle("Buttons by S N Rao");
     setSize(300,350);
     setVisible(true);
   }
                         // 4th step of EH
// override the only one abstract method of AL
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
               repaint();
        }
        else if(str.equals("Blue"))
        {
               bc++;
        }
       repaint();
  }
  public void paint(Graphics g)
  {
        g.setFont(new Font("Monospaced",Font.BOLD,20));
        g.drawString("Red Clicks: " +  rc, 50,150);
        g.drawString("Green Clicks: " +  gc, 50,180);
        g.drawString("Red Clicks: " +  bc, 50,210);
        g.drawString("Total Clicks: " +  (rc+gc+bc), 50,240);
   }
  public static void main(String args[])
  {
          new ButtonDemo1();
   }
}                                                      // No WC