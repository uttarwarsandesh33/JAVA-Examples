import java.awt.*;
public class DrawingRound extends Frame
{
         public DrawingRound()
         {
	setTitle("ByS N Rao");
	setSize(450, 450);
	setVisible(true);
         }
         public void paint(Graphics g)
         {
g.drawRoundRect(50,60,150,150,200,200);
g.fillRoundRect(230,60,150,150,200,200);
          }
          public static void main(String args[])
         {
	new DrawingRound();
       }
}
/*
*/	

