//Aim: To draw the face

import java.awt.*;
public class Face extends Frame
{
    public void paint (Graphics g)
    {
       g.drawOval ( 40, 40, 120, 150 ) ; 	                                                                          // Head
     g.drawOval ( 57, 75, 30, 20 ) ;  	                                                                         // Left eye
        g.drawOval ( 110, 75, 30, 20 ) ;  	                                                                     // Right eye
       g.fillOval ( 68, 81, 10, 10 ) ;  	                                                                           // Pupil (left)
      g.fillOval (121, 81, 10, 10 ) ;  	                                                                        // Pupil (right)
       g.drawOval ( 85, 100, 30, 30 ) ;  	                                                                            // Nose
       g.setColor(Color.red);
       g.fillArc ( 60, 125, 80, 40, 180, 180 ) ; // Mouth
        g.setColor(Color.black);
         g.drawOval ( 25, 92, 15, 30 ) ;    //Left ear
      g.drawOval ( 160, 92, 15, 30 ) ;  	                                                                       //Right ear
   }
   public static void main(String args[ ] )
   {
        Frame f = new Face( ) ;
        f.setTitle( " Your Face " ) ;
        f.setSize( 200, 200 ) ;
        f.setVisible( true ) ;
   }
}
