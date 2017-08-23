import java.awt.*;
import java.awt.event.*;
public class CheckDemo55 extends Frame implements ItemListener
 {
   Checkbox cb1,cb2,cb3,cb4;
Label l;
   String msg=" ";
  public CheckDemo55()
  {
    setLayout(new FlowLayout());
    cb1=new Checkbox("Windows 98/XP",true);
    cb2=new Checkbox("Windows NT/2000",false);
    cb3=new Checkbox("Solaris",false);
    cb4=new Checkbox("MacOS",false);
   l=new Label("Current Selection",Label.LEFT);
    cb1.addItemListener(this);
    cb2.addItemListener(this);
 cb3.addItemListener(this);
 cb4.addItemListener(this);
  add(cb1);
add(cb2);
add(cb3);
add(cb4); 
add(l);
setTitle("Creating CheckBoxes");
setSize(400,450);
setVisible(true);
}
public void itemStateChanged(ItemEvent e)
{
  msg="Current Selection";
 if(cb1.getState()==true)
   {
    msg="Windows 98/XP" +cb1.getState();
   }
 else if(cb2.getState()==true)
  {
   msg="Windows NT/2000" +cb2.getState();
  }
 else if(cb3.getState()==true)
  {
    msg="Solaris" +cb3.getState();
 }
 else
   {
    msg="MacOS" +cb4.getState();
  }
l.setText(msg);
}
public static void main(String arg[])
{
 new CheckDemo55();
}
}