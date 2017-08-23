import java.awt.*;
import java.awt.event.*;

public class MouseCoordinates extends Frame implements MouseListener, MouseMotionListener
{
   // some variables to store mouse data
	String str = " ";
	int x = 0, y = 0;

	public MouseCoordinates()
	{
	addMouseListener(this);
	addMouseMotionListener(this);			
	setSize(300,300);
	setVisible(true);
	}

            //override 5 abstract methods of  ML
public void mousePressed(MouseEvent e)
{
	x = e.getX( );
	y = e.getY( );
	str = "pressed";
	repaint( );
}
public void mouseReleased(MouseEvent e)
{
	x = e.getX( );
	y = e.getY( );
	str = "released";
	repaint( );
}
public void mouseClicked(MouseEvent e)
{
	x = e.getX( );
	y = e.getY( );
	str = "clicked";
	repaint( );
}
public void mouseExited(MouseEvent e)
{
	x = e.getX( );
	y = e.getY( );
	str = "exited";
	repaint( );
}
public void mouseEntered(MouseEvent e)
{
	x = e.getX( );
	y = e.getY( );
	str = "entered";
	repaint( );
}

// override the 2 abstract methods of MML
public void mouseMoved(MouseEvent e)
{
	x = e.getX( );
	y = e.getY( );
	str = "moved";
	repaint( );
}
public void mouseDragged(MouseEvent e)
{
	x = e.getX( );
	y = e.getY( );
	str = "dragged";
	repaint( );
}
	
public void paint(Graphics g)
{
g.setFont(new Font("Dialog",Font.BOLD,18));
	
	// to draw the disc
g.fillOval(x, y, 12, 12);

	// to draw the action
g.drawString(str, x+20, y+20);	

	// to draw the x and y coordinates
g.drawString(x + "," + y, x+10, y-10);	
}

public static void main(String a[])
{
	new MouseCoordinates();
}
}
/*
getX( ) and getY( ) methods of MouseEvent class returns the x and y coordinates where the action takes place.
*/
