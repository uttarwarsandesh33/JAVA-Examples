/*
                                    AWT
   (using java.awt  and java.awt.event packages)

        AWT stands for Abstract Window Toolkit. This gives Java, the capability of, drawing graphics(drawing different geometrical figures), creating GUI(Grahical User Interface) components and event handling.  As this is a big package, we can divide the package into 4 divisions that includes classes for:

                   1. Graphics
                   2. GUI components
                   3. Layout managers
                   4. Event handling
*/
                     
// to draw lines

import java.awt.*;
public class DrawingLines extends Frame
{
     public DrawingLines()          // constructor for
     {                                               // creating frame
	setTitle("Frame by SNRao");
	setSize(300, 350);  // width and height
	setVisible(true);  // to make appear
     }
     public void paint(Graphics g)
     {
          g.drawLine(50, 60, 150, 60);
          g.drawLine(23,56,36,89);
          g.drawLine(25,45,500,80);
          g.drawLine(35,67,89,45);
     }
     public static void main(String args[])
     {
       new DrawingLines(); // just call the constructor
     }
}

/*
Syntax:

      Syntax: drawLine(int x1, int y1, int x2, int y2)

     The above method belongs to Graphics class. Graphics object is passed as parameter to paint() method.  Graphics class includes many of method of drawing different geometrical figures.
  
      Observe in the above program, the paint() is not called.  When the frame is created, the paint() is called implicitly.

*/
