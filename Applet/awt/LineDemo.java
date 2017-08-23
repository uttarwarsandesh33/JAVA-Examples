import java.awt.*;
public class LineDemo extends Frame
{
    public LineDemo()
    {
          setTitle("Lines by SNRao");
          setSize(300, 350); 
          setVisible(true);
    }
    public void paint(Graphics g)
    {                                             // 3 horizontal lines
         g.drawLine(50,60,150,60);
         g.drawLine(50,61,150,61);
         g.drawLine(50,62,150,62);
    }
    public static void main(String args[])
    {
	new LineDemo();	
     }
}
/*
Syntax: drawLine(int x1, int y1, int x2, int y2 )

paint() method is called implicitly when the frame is created.

*/