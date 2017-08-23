// Aim: to separate GUI from EH by writting two separate classes

import java.awt.*;
import java.awt.event.*;
public class Harsha extends Frame
{
    TextField tf1;
    Button btn1;
    public Harsha()
    {
        setLayout(new FlowLayout());
        add(new Label("Enter a string"));
        add(tf1 = new TextField(15));
        add(btn1 = new Button("REVERSE"));

        Prasad p1 = new Prasad(tf1);
        btn1.addActionListener(p1);

        setSize(300,200);
        setVisible(true);
    }
    public static void main(String args[])
    {
           new Harsha();
    }
}
class Prasad implements ActionListener
{
     TextField tf3;
     public Prasad(TextField tf2)
     {
            tf3 = tf2;
     }
     public void actionPerformed(ActionEvent e)
     {
          String s1 = tf3.getText();
          StringBuffer sb1 = new StringBuffer(s1);
          sb1.reverse();
          tf3.setText(sb1.toString());
     }
}                                                                                                                                              