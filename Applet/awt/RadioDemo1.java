import java.awt.*;
import java.awt.event.*;
public class RadioDemo1 extends Frame implements ItemListener{
Checkbox cb1,cb2,cb3,cb4,cb5,cb6;
Panel p1,p2;
TextArea ta;
CheckboxGroup cbg1,cbg2;
public RadioDemo1(){
//default layout manager BorderLayout is used
setLayout(new BorderLayout(5,10));
setBackground(Color.red);
p1=new Panel();
p2=new Panel();//Panel layout manager is FlowLayout
p1.setBackground(Color.yellow);
p2.setBackground(Color.pink);
ta=new TextArea("I Display your Selection",10,50);
ta.setBackground(Color.cyan);
ta.setForeground(Color.red);
ta.setFont(new Font("Monospaced",Font.BOLD,20));
cbg1=new CheckboxGroup();
cbg2=new CheckboxGroup();
cb1=new Checkbox("HeroHonda",cbg1,true);
cb1.setForeground(Color.blue);
cb2=new Checkbox("Suzuki",cbg1,false);
cb3=new Checkbox("Kawasaki",cbg1,false);
cb4=new Checkbox("Black",cbg2,true);
cb5=new Checkbox("Marron",cbg2,false);
cb6=new Checkbox("Silver",cbg2,false);
p1.add(cb1);
p1.add(cb2);
p1.add(cb3);
p2.add(cb4);
p2.add(cb5);
p2.add(cb6);
add(p1,"North");
add(p2,"South");
add(ta,"Center");
cb1.addItemListener(this);
cb2.addItemListener(this);
cb3.addItemListener(this);
cb4.addItemListener(this);
cb5.addItemListener(this);
cb6.addItemListener(this);
setTitle("Radio Buttons");
setSize(400,450);
setVisible(true);
}
public void itemStateChanged(ItemEvent e)
{
String s1="",s2="";
if(cb1.getState()==true)
s1="HeroHonda";
else
if(cb2.getState()==true)
s1="Suzuki";
else
s1="Kawasaki";
if(cb4.getState()==true)
s2="Black";
else
if(cb5.getState()==true)
s2="Marron";
else
s2="Silver";
ta.append("\nYou Wanted"+s1+"\nin Color\n"+s2+"\n-----------");
}
public static void main(String[] args)
{
new RadioDemo1();
}
}
