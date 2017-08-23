// to display the content of all text fields in text area

import java.awt.*;
import java.awt.event.*;
public class TextAreaDemo1 extends Frame implements ActionListener
{
     TextField name, hno, lmark, area, city, pin;
     TextArea ta;
     public TextAreaDemo1()
     {
                                 // default BL is used
          Panel p1 = new Panel();
          p1.setLayout(new GridLayout(6, 2,5, 5));
          setBackground(Color.pink);

          p1.add(new Label("NAME"));
          p1.add( name = new TextField(15));

          p1.add(new Label("H.No"));
          p1.add( hno = new TextField(15));

          p1.add(new Label("LAND MARK"));
          p1.add( lmark = new TextField(15));

          p1.add(new Label("AREA"));
          p1.add( area = new TextField(15));

          p1.add(new Label("CITY"));
          p1.add( city = new TextField(15));

          p1.add(new Label("PIN CODE"));
          p1.add( pin = new TextField(15));

          add( ta = new TextArea(), "Center");
          add(p1,"North");

          pin.addActionListener(this);
             
 	                                     // beautification
          ta.setBackground(Color.pink);
          ta.setBackground(Color.cyan);
          ta.setFont(new Font("Monospaced",Font.BOLD,18));
         
          setSize(300,400);
          setVisible(true);
     }
     public void actionPerformed(ActionEvent e)
     {
         String str1 = name.getText();
         String str2 = hno.getText();
         String str3 = lmark.getText();
         String str4 = area.getText();
         String str5 = city.getText();
         String str6 = pin.getText();
 ta.append(str1+"\n"+str2+"\n"+str3+"\n"+str4+"\n"+str5+"\n"+str6+"\n\n");
       
     }
     public static void main(String args[])
     {
         new TextAreaDemo1();
     }
}