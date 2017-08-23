import java.awt.*;
import java.awt.event.*;

public class NewButton extends Frame implements WindowListener,ActionListener
{
	
	Button n;
	Button b1,b2,b3,b4,b5;
	int count;
	public NewButton()
	{
		addWindowListener(this);
		setLayout(new FlowLayout());
		
		 n = new Button("New");
		/*
		b1 = new Button("Button 1");
		b2 = new Button("Button 2");
		b3 = new Button("Button 3");
		b4 = new Button("Button 4");
		b5 = new Button("Button 5");
		*/
		n.addActionListener(this);
		
		add(n);
		
		setTitle("Frame For Rajeev Reddy");
		setSize(500,400);
		setVisible(true);
		setBackground(Color.lightGray);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		String str = e.getActionCommand();
		
		b1 = new Button("Button 1");
		b2 = new Button("Button 2");
		b3 = new Button("Button 3");
		b4 = new Button("Button 4");
		b5 = new Button("Button 5");
		if(str.equals("New"))
			{
				if(count==0)
					add(b1);
				else if(count==1)
					add(b2);
				else if(count==2)
					add(b3);
				else if(count==3)
					add(b4);
				else if(count==4)
					add(b5);
				count++;
			}
	}
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	public void windowOpened(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowActivated(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}

	public static void main(String args[])
	{	
		
		new NewButton();
	}
}

