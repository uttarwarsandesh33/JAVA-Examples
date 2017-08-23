import java.awt.*;
import java.awt.event.*;
public class ChoiceDemo1 extends Frame implements ItemListener{
Choice shops;
TextField tf;
public ChoiceDemo1()
{
CloseMe cm=new CloseMe();
addWindowListener(cm);
setLayout(new BorderLayout());
shops=new Choice();
shops.addItem("Chandana Bros");
shops.addItem("JC Bros");
shops.addItem("RS Bros");
shops.addItem("Annupama Bros");
tf=new TextField(15);
tf.setBackground(Color.cyan);
tf.setForeground(Color.red);
tf.setFont(new Font("Monospaced",Font.BOLD,20));
add(shops,"North");
add(tf,"South");
shops.addItemListener(this);
setTitle("Choice");
setSize(400,450);
setVisible(true);
}
public void itemStateChanged(ItemEvent e)
{
String s1=shops.getSelectedItem();//getSelectedItem() return the user selected item in the form of string
int x=shops.getSelectedIndex();//getSelectedIndex() return the no. of the item selected by default the numbering start from zero
tf.setText("Your Favourite is"+s1+"yet serial no:"+(x+1));
}
public static void main(String[] args)
{
new ChoiceDemo1();
}
}
class CloseMe extends WindowAdapter
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
}