// Aim: To rewrite the previous string program with colors and fonts.

// no window closing code

import java.awt.*; 
             // for Frame, Color, Font, Graphics
                  // Graphics is an abstract class

public class ColorsAndFonts extends Frame
{
                    // declaring reference variables
    String s1, s2, s3;
    Color clr1, clr2, clr3;
    Font f1, f2, f3;

                          // convert the reference variables                            // into objects in the constructor
    public ColorsAndFonts()
    { 
      setBackground(Color.cyan);  // sets background

       s1 = "Hello World";    // color to frame
       s2 = "How do you do";
       s3 = "Thank you";

                               // creating Color objects
       clr1 = new Color(200, 150, 100);      // RGB 
                                                             // int values
       clr2 = new Color(180, 200, 190);
       clr3 = new Color(0.8f, 0.56f, 0.9f);   // HSB   
                                                         // float values
                                // creating Font objects
    f1 = new Font("Monospaced", Font.BOLD, 15);

   f2 = new Font("Serif", Font.ITALIC, 18);

       f3 = new Font("SansSerif", Font.BOLD + Font.ITALIC, 20);                // bold & italic effect

                            // frame creation methods
         setTitle("Frame by SNRao");      
                                               // title to frame
         setSize(300,350);     
                        // width and height of frame
         setVisible(true);  
                    // makes visible on the monitor
    }
    public void paint(Graphics g)
    {
       g.drawString(s1, 50, 60);    
                                              // s1 written in default

   g.setColor(clr1); // setting the color to text
   g.setFont(f1);       // setting the font to text

  g.drawString(s2, 50, 90);       // s2 in clr1 and f1

                    // again changing color and font
         g.setColor(clr2);
         g.setFont(f2);
         g.drawString(s3, 50, 120); 
                                      // s3 in clr2 and f2

                   // again changing color and font
        g.setColor(clr3);
        g.setFont(f3);
   g.drawString(s1, 50, 150);  // s1 in clr3 and f3

 // creating anonymous objects that saves memory
        g.setColor(new Color( 200, 200, 20 ));

   g.setFont(new Font("Dialog", Font.PLAIN, 20));
        g.drawString("Config Software", 50, 180);

  g.setColor(Color.magenta);  // predefined color

   g.drawString("Chaitanyauri x Roads", 50, 210);
    }                                    //paint( ) closes

    public static void main(String args[])
    {
         new ColorsAndFonts();
    }
}

/*
 setColor(Color obj) and setFont(Font obj) are the methods of Graphics class with which we can set a color and font to graphics on the frame.  The color and font do not change until changed again.
*/
