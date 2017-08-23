import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class ListDemo1 extends Applet implements ActionListener{
List destinations;
public void init(){
destinations=new List(5,true);//5 is the visible items displayed in the list if the total items we add cross this limit automatically a scrollbar is added.true indicates the list is meant for multiple selection.
destinations.add("Guntur");
destinations.add("Vijayawada");
destinations.add("Hyderabad");
destinations.add("Tirupathi");
destinations.add("karimnagar");
destinations.addActionListener(this);
add(destinations);
}
public void actionPerformed(ActionEvent e)
{
repaint();
}
public void paint(Graphics g)
{
String str[]=destinations.getSelectedItems();
int x[]=destinations.getSelectedIndexes();
g.setFont(new Font("Monospaced",Font.BOLD,20));
for(int i=0,y=150;i<str.length;i++,y+=25)
{
g.drawString("sl.no: "+(x[i]+1)+"   "+str[i],50,y);
}
}
}