import java.awt.*;
import java.awt.event.*;


class Myframe extends Frame 
{
	Button b1,b2;
	TextField tf;
	Myframe()
	{
		setLayout(new FlowLayout());
		tf=new TextField(20);
		b1=new Button("Click me");
		b2=new Button("Dont");
		
		MenuBar m=new MenuBar();
		setMenuBar(m);
		Menu f=new Menu("File");
		m.add(f);
		
		add(tf);
		add(b1);
		add(b2);
		ButtonHandler bh=new ButtonHandler(this);
		b1=addActionListener(bh);
		b2=addActionListener(bh);
		
		MenuItem mi=new MenuItem("Open");
		f.add(mi);
	//	mi.addActionListener(this);
		
	}
	
	
};

class ButtonHandler implements ActionListener
{
	Myframe mf;
	ButtonHandler(Myframe mf)
	{
		this.mf=mf;

	}
	public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommand();
		if(str.equals("hello"))
		{
			mf.tf.setText("Hello");			
		}
		else
		mf.tf.setText("Idea");
	//	MyDialog m=new MyDialog(this,"first dialog");
		//m.show();
	}
};

class Dialogbox 
{
	public static void main(String args[])
	{
		Myframe mf=new Myframe();
		
		mf.setSize(500,500);
		mf.show();
	}
}

class MyDialog extends Dialog
{
	MyDialog(Myframe mf,String str)
	{
		super(mf,str);
		setSize(100,100);
		setLayout(new FlowLayout());
		Label l=new Label("Hello");
		add(l);
		
	}
};
	
