import java.awt.*;
import java.awt.event.*;
public class OnlyCharacters extends Frame implements ActionListener
{
	TextField tf1;
	public OnlyCharacters()
	{
		setLayout(new FlowLayout());
		tf1 = new TextField(30);
		tf1.addActionListener(this);
		add(tf1);

		addWindowListener(new CloseMe());

		pack();
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		String s1="",s2="",s3="";
		String str = tf1.getText();
		int size = str.length();
		if(size == 0) 
		{
			tf1.setText("Enter some thing");
		}
		else if(size != 8)
		{
			tf1.setText("should be 8 characters");
		}
		else
		{
			for(int i=0;i<size;i++)
			{
				if(Character.isDigit(str.charAt(i)) == true)
					s1 = "Digits are not allowed ";
				else if(Character.isWhitespace(str.charAt(i)) == true)
					s2 = "Space is not allowed";
				else
					s3 = "Valid";
			}
			tf1.setText(s1+s2+s3);
		}

	}

	public static void main(String args[])
	{
		new OnlyCharacters();
	}
}
class CloseMe extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}