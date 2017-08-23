import java.awt.*;
import java.awt.event.*;
public class LeftCenterRight extends Frame implements ActionListener
{
    Button lb, cb, rb;
    public LeftCenterRight()
    {
          setLayout(new FlowLayout());
          add(lb = new Button("Left"));
          add(cb = new Button("Center"));
          add(rb = new Button("Right"));

          lb.addActionListener(this);
          cb.addActionListener(this);
          rb.addActionListener(this);

          setSize(450,250);
          setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String str = e.getActionCommand();
       if(str.equals("Left"))
	setLayout(new FlowLayout(FlowLayout.LEFT));
       else if(str.equals("Center"))
	setLayout(new FlowLayout(FlowLayout.CENTER));
       else if(str.equals("Right"))
	setLayout(new FlowLayout(FlowLayout.RIGHT));

           invalidate();
             validate();
  }
  public static void main(String args[])
  {
   new LeftCenterRight();
  }
}