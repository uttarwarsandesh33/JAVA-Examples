// Toggling between two labels on a button.

import java.awt.*;
import java.awt.event.*;
public class Toggling extends Frame implements ActionListener
{
      Button btn;
      public Toggling()
      {
           setLayout(new FlowLayout());

          btn = new Button("CANCEL");
          btn.setFont(new Font("Monospaced", Font.BOLD, 20));
          btn.addActionListener(this);

        add(btn);

      setSize(300, 300);
      setVisible(true);
   }
    public static void main(String args[])
    {
          new Toggling();
   }
  public void actionPerformed(ActionEvent e)
{
}

}


