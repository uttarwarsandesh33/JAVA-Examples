import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class testapplet extends Applet implements ActionListener
{
	Label l1,l2,l3;
	TextField t1;
	Button b1;
	Checkbox c1,c2,c3;
	Choice ch1,ch2;
	CheckboxGroup chg;
	
	public void init()
	{
		l1=new Label("Enter Text:");
		l2=new Label("Font:");
		l3=new Label("Size:");
		chg=new CheckboxGroup();
		c1=new Checkbox("Bold",chg,true);
		c2=new Checkbox("Italic",chg,true);
		c3=new Checkbox("Normal",chg,true);
		ch1=new Choice();
		ch1.addItem("Times new Roman");
		ch1.addItem("Arial");
		
		ch2=new Choice();
		ch2.addItem("20");
		ch2.addItem("30");
		b1=new Button("OK");
		b1.addActionListener(this);
		add(l1);
		add(t1);
		add(l2);
		add(ch1);
		add(l3);
		add(ch2);
			setSize(500,500);
		setVisible(true);
	    
	}	
		public void actionPerformed(ActionEvent evt)
		{
			Object obj=evt.getSource();
			if(obj==b1)
			{
				
				String s1=ch1.getSelectedItem();
				int size =Integer.parseInt(ch2.getSelectedItem());
				Font f;
				if(c1.getState())
				
				
				f=new Font(s1,Font.BOLD,size);					
				
				if(c2.getState())
				f=new Font(s1,Font.ITALIC,size);
				
				else
				
					f=new Font(s1,Font.PLAIN,size);
					
			}
			
	//	t1.setFont(f);
				
		
		}
		public static void main(String args[])
		{
			testapplet t=new testapplet();
		
		}
	
	
}