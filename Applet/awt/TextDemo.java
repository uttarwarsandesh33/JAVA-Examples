import java.awt.*;
import java.awt.event.*;
public class TextDemo extends Frame implements ActionListener,WindowListener
{
    TextField tf1, tf2,tf3;
    Label lab1;
    public TextDemo()
    {
	setLayout(new FlowLayout());
	setBackground(Color.pink);
	// create the components
	tf1 = new TextField(15);
	tf2 = new TextField(15);
	tf3 = new TextField("I Display",15);
	
	tf2.setEchoChar('@');  //
	tf3.setEditable(false);  // 	
	tf3.setBackground(Color.cyan);
	tf3.setForeground(Color.red);
	tf3.setFont(new Font("Monospaced",Font.BOLD,18));

	lab1 = new Label("Enter User Name");

	// add the components
	add(lab1);
	add(tf1);
	add(new Label("Enter Password"));
	add(tf2);
	add(new Label("Result"));
	add(tf3);
	
	addWindowListener(this);

	tf2.addActionListener(this);
	setTitle("Learning text fields");
	setSize(200,300);
	setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
	String str1 = tf1.getText();
	String str2 = tf2.getText();
	if(str1.equals("SNRao") && str2.equalsIgnoreCase("java"))
		tf3.setText("VALID");
	else
		tf3.setText("INVALID");
   }
   public static void main(String args[])
   {
	new TextDemo();
   }
   public void windowClosing(WindowEvent e){System.exit(0);}
public void windowOpened(WindowEvent e){}
public void windowClosed(WindowEvent e){}
public void windowActivated(WindowEvent e){}
public void windowDeactivated(WindowEvent e){}
public void windowIconified(WindowEvent e){}
public void windowDeiconified(WindowEvent e){}




}
