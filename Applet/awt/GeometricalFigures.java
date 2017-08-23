//Write the applets to draw the following shapes
//a) Cylinder b) Cube c) Circle            

import java.awt.*;
import java.applet.*;
public class GeometricalFigures extends Applet
{
	
	public void paint(Graphics g)
	{								// to draw a cylinder
		g.drawOval(50,60,100,50); // upper ellipse
		g.drawLine(50,80,50,200);  // left vertical line
		g.drawLine(150,80,150,200); // right horizontal line
		g.drawOval(50,180,100,50); // lower ellipse
									// to draw cube
		g.drawRect(50,275,100,100);
		g.drawLine(50,275,130,230);
		g.drawLine(150,275,210,240);
		g.drawLine(130,230,210,240);
		g.drawLine(210,240,210,340);
		g.drawLine(150,375,210,340);
// drawing circle
		g.drawOval(50,380,100,100); 
	
	}
}
