 // to change the background of the frame (here, it is canvas) as per scrollbar positions(values).

import java.awt.*;
import java.awt.event.*;

public class Rangoli extends Frame implements AdjustmentListener
{                   // AdjustmentListener is for Scrollbar

Scrollbar rs, gs, bs;                            // 3 scrollbars

Label rl, gl, bl;  
          // 3 labels to display the value of Scrollbars

Canvas cvas;        // 1 canvas for painting the color

public Rangoli()
{
                    // default Layout manager BL is used
Panel p1 = new Panel();

p1.setLayout(new GridLayout(3, 2, 5, 5));  
                       // to place 3 labels and 3 scrollbars in 3 rows and 2 columns
                                   // settings for red scrollbar
rs = new Scrollbar(Scrollbar.HORIZONTAL, 0, 0,  0, 255);
rs.setUnitIncrement(5);           //default is 1
rs.setBlockIncrement(15);  //default is 10
p1.add( rl = new Label("RED"));  
                                // adding to panel
                       // the rl object is created and added
p1.add(rs);
rl.setForeground(Color.red);
rl.setFont(new Font("Monospaced",Font.BOLD,15));

	// settings for green scrollbar
gs = new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,255);
gs.setUnitIncrement(5);
gs.setBlockIncrement(15);
p1.add( gl = new Label("GREEN"));
p1.add(gs);
gl.setForeground(Color.green);
gl.setFont(new Font("Monospaced",Font.BOLD,15));

	// setting for blue scrollbar
bs=new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,255);
bs.setUnitIncrement(5);
bs.setBlockIncrement(15);
p1.add( bl = new Label("BLUE"));
p1.add(bs);
bl.setForeground(Color.blue);
bl.setFont(new Font("Monospaced",Font.BOLD,15));
                  		       // linking to AL
rs.addAdjustmentListener(this);
gs.addAdjustmentListener(this);
bs.addAdjustmentListener(this);

add(p1,"South");
cvas = new Canvas();
add(cvas,"Center");

setBackground(Color.yellow);  

	         // shortcut for window closing
addWindowListener(new WindowAdapter( )
{
      public void windowClosing(WindowEvent e)
      {
	     System.exit(0);
      }
}
);
              setTitle("Rangoli");
              setSize(400,350);
              setVisible(true);
}                                       // close the constructor

// to give a gap between the components and the border of the frame

public Insets getInsets()  
{
    // Insets is1 = new Insets(5, 5, 5, 25);
    // return is1;
     return new Insets( 5, 5, 5, 25);  
                 //parameters are top, left, bottom, right 
}
       //override the only abstract method of the AL

public void adjustmentValueChanged(AdjustmentEvent e)
{
                      // retrieving the values of scrollbars
int rvalue = rs.getValue();  
int gvalue = gs.getValue();
int bvalue = bs.getValue();

         // setting the values of scrollbars to labels
rl.setText("Red: "+ rvalue);
gl.setText("Green: "+ gvalue);
bl.setText("Blue: "+ bvalue);

   // creating a color object with scrollbar values
Color clr = new Color(rvalue, gvalue, bvalue);

// setting color object clr to canvas as Background
          cvas.setBackground(clr);
}
public static void main(String[] args)
{
	new Rangoli();
}
}

/*
getValue( ) returns the value of the scrollbar as integer

Scrollbar.HORIZONTAL, 0, 0, 0, 255

Scrollbar.HORIZONTAL: alignment
first 0 is for initial value
second 0 is for scrollbox size; 0 gives minimum size
third 0 is for minimum value
255 is for maximum value

getInsets() is the method of Frame which return an object of Insets class. Insets class gives the margin between the border of the frame and the components inside it.

+*/