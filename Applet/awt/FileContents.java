import java.awt.*;
import java.io.*;
import java.awt.event.*;
public class FileContents extends Frame implements ActionListener, WindowListener
{
      TextField tf;
      TextArea ta;
      public FileContents( )
     {
         setLayout(new GridLayout(2,2,15,50));
         
        add(new Label("Enter File Name"));
        add( tf = new TextField(15));
      
        add(new Label("Contents"));
        add( ta= new TextArea(15,30));

        tf.setBackground(Color.yellow);
        ta.setBackground(Color.orange);

       tf.setFont(new Font("Monospaced",Font.BOLD,15));
       ta.setFont(new Font("Monospaced",Font.BOLD,15));

      tf.addActionListener(this);
      addWindowListener(this);

      setSize(300,300);
     setVisible(true);
  }
  public void actionPerformed(ActionEvent e)
  {
      String str = tf.getText();
      ta.setText(""); // to clear the earlier contents of text area
      try
      {
              FileInputStream fis = new FileInputStream(str);
              int k;
              while((k = fis.read( ) ) != -1)
              {
                ta.append(""+(char)k);
              }
              fis.close();
      }
     catch(IOException e1) {  }
}
 // override windowListener 7 abstract methods
public void windowClosing(WindowEvent e)
{
    System.exit(0);
}
public void windowOpened(WindowEvent e){}
public void windowClosed(WindowEvent e){}
public void windowActivated(WindowEvent e){}
public void windowDeactivated(WindowEvent e){ }
public void windowIconified(WindowEvent e){}
public void windowDeiconified(WindowEvent e){ }

public static void main(String args[])
{
  new FileContents();
}
}