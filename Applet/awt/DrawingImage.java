import java.awt.*;
public class DrawingImage extends Frame
{
Image i1;
public DrawingImage()
{
setTitle("Drawing images in java");
setSize(300,300);
setVisible(true);
}
public void paint(Graphics g)
{
//any image file before drawn in java must be converted into an object of Image class
Toolkit tk=Toolkit.getDefaultToolkit();
i1=tk.getImage("bird2.gif");
g.drawImage(i1,50,60,this);
}
public static void main(String args[])
{
new DrawingImage();
}
}
