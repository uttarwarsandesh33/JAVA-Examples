import java.awt.*;
public class ToolkitDemo extends Frame
{
       public void paint(Graphics g)
       {
   g.setFont(new Font("Monospaced",Font.BOLD,20)); 


//Toolkit tk = Toolkit.getDefaultToolkit();
//String names[] = tk.getFontList();

String names[] = Toolkit.getDefaultToolkit().getFontList();

for(int i=0,x=50,y=60; i<names.length;i++,y+=20)
{
    g.drawString(names[i],x,y);
}
}
public static void main(String args[])
{
     Frame f = new ToolkitDemo();
     f.setSize(300,300);
     f.setVisible(true);
}
}