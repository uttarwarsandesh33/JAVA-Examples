import java.awt.*;
import java.applet.*;
import java.util.Date;



public class clockapplet extends Applet implements Runnable
{
	Thread th;
	String str;
	public void init()
	{
		th=new Thread(this);
		th.start();
		
	}
	
	public void run()
	{
		while(true)
		{
			repaint();
			try
			{
				th.sleep(100);
				
			}
			catch(Exception e)
			{
				
			}
		}
	}
	public void paint(Graphics g)
	{
		Date d1=new Date();
		str=d1.getHours()+":"+d1.getMinutes()+":"+d1.getSeconds();
		g.drawString(str,100,100);
		
	}
	
	public static void main(String args[])
	{
		clockapplet c=new clockapplet();
		c.setSize(500,500);
		c.show();
		
	}
}