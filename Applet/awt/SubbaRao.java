// to separate GUI creation and event handling into two classes

import java.awt.*;
import java.awt.event.*;

public class SubbaRao extends Frame
{
      Checkbox cb1, cb2, cb3;
      TextField tf1;
      public SubbaRao()
      {
          setLayout(new FlowLayout());

  CheckboxGroup cbg = new CheckboxGroup();
  cb1 = new Checkbox("Hero Honda", cbg, true);
  cb2 = new Checkbox("Sujuki", cbg, false);
  cb3 = new Checkbox("Pulsar", cbg, false);
   tf1 = new TextField(25);
tf1.setFont(new Font("Serif",Font.BOLD,30));

  VenkatRao vr = new VenkatRao(tf1);

  cb1.addItemListener(vr);
  cb2.addItemListener(vr);
  cb3.addItemListener(vr);

   add(cb1); add(cb2); add(cb3); add(tf1); 

   setSize(300, 300);
   setVisible(true);
 }
 public static void main(String args[])
 {
        new SubbaRao();
 }
}
class VenkatRao implements ItemListener
{
    TextField tf3;
    public VenkatRao(TextField tf2)
    {
         tf3 = tf2;
    }
    public void itemStateChanged(ItemEvent e)
    {
        Checkbox cb = (Checkbox) e.getSource();
        String str = cb.getLabel();
        tf3.setText("U want " + str);
   }
}



