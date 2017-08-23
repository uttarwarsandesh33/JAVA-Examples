import java.awt.*;
import java.awt.event.*; 

public class AppearDisappear extends Frame implements ActionListener
{
     Button ap, pb;
     public AppearDisappear()
     {
          setLayout(new FlowLayout());
          ap = new Button("Appear");
          pb = new Button("Play Button");

         ap.setFont(new Font("Monospaced",Font.BOLD,15));

         pb.setFont(new Font("Monospaced",Font.BOLD,1d5));

          ap.addActionListener(this);	
          
           add(ap); add(pb);

           setTitle("Buttons in Action");
           setSize(300,350);
          setVisible(true);
     }
     public void actionPerformed(ActionEvent e)
     {
       String str = e.getActionCommand();
       if(str.equals("Appear"))
       {
              pb.setVisible(false);
              ap.setLabel("Disappear");
       }		
       else if(str.equals("Disappear"))
       {
              pb.setVisible(true);
              ap.setLabel("Appear");
       }
   }

   public static void main(String args[])
   {
           new AppearDisappear();
   }
}
