import java.awt.*;
import java.awt.event.*;
public class Manipulations extends Frame implements ActionListener
{
   TextField tf1,tf2,tf3;
   Button pb,mb1,mb2,mb3,db,eb;
   public Manipulations()
   {
	setLayout(new FlowLayout());
	setBackground(Color.cyan);
	tf1 =new TextField(10);
	tf2 =new TextField(10);
	tf3 =new TextField(15);

	tf3.setEditable(false);
	tf3.setForeground(Color.red);

	// add the components
	add(new Label("Enter First Number"));
	add(tf1);
	add(new Label("Enter Second Number"));
	add(tf2);
	add(pb=new Button("+"));
	add(mb1=new Button("-"));
	add(mb2=new Button("*"));
	add(mb3=new Button("%"));
	add(db=new Button("/"));
	add(eb=new Button("Exit"));
	eb.setForeground(Color.red);
	add(new Label("Result"));
	add(tf3);	

	pb.addActionListener(this);
	mb1.addActionListener(this);
	mb2.addActionListener(this);
	mb3.addActionListener(this);
	db.addActionListener(this);
	eb.addActionListener(this);

	setSize(250,300);
	setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
	// first extract values entered by the user
	String str1 = tf1.getText();
	double fn = Double.parseDouble(str1);

	double sn = Double.parseDouble(tf2.getText());
	String str="";
	String s1 = e.getActionCommand();
	if(s1.equals("+"))
		str = "Sum = " + (fn+sn);
	else if(s1.equals("-"))
		str = "Diff = " + (fn-sn);
	else if(s1.equals("*"))
		str = "Product = " + (fn*sn);
	else if(s1.equals("%"))
		str = "Remainder = " + (fn%sn);
	else if(s1.equals("/"))
		str = "Quotient = " + (fn/sn);
	else if(s1.equals("Exit"))
		System.exit(0);
	tf3.setText(str);
   }
   public static void main(String args[])
   {
	new Manipulations();
   }
}




