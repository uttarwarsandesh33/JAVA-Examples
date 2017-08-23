





import java.awt.*;
import java.awt.event.*;
public class ButtonDemo2 extends Frame implements ActionListener
{
Button rb,gb,bb;
public ButtonDemo2(){
setLayout(new FlowLayout());
rb=new Button("Red");
gb=new Button("Green");
bb=new Button("Blue");

rb.addActionListener(this);
gb.addActionListener(this);
bb.addActionListener(this);


add(rb);add(gb);add(bb);


setTitle("Button Demo2");
setSize(400,450);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
String str=e.getActionCommand();
if(str.equals("Red"))
{
setBackground(Color.red);


}
else if(str.equals("Green"))
{
	setBackground(Color.green);
}
else if (str.equals("Blue"))
{
	setBackground(Color.blue);
}
}
public static void main(String[] args)
{
new ButtonDemo2();
}
}

