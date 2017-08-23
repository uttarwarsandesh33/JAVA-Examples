import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class RangoliApp extends Applet implements AdjustmentListener
{
   Scrollbar rs,gs,bs;
   Label rl,gl,bl;
   Canvas cvas;
public void init()
{
       setLayout(new BorderLayout());
  Panel pl=new Panel();
  pl.setLayout(new GridLayout(3,2,5,5));
  rs=new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,255);
  rs.setUnitIncrement(5);
  rs.setBlockIncrement(15);
  pl.add(rl=new Label("RED"));
  pl.add(rs);
  rl.setForeground(Color.red);
  rl.setFont(new Font("Monospaced",Font.BOLD,15));
  gs=new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,255);
  gs.setUnitIncrement(5);
  gs.setBlockIncrement(15);
  pl.add(gl=new Label("GREEN"));
  pl.add(gs);
  gl.setForeground(Color.green);
  gl.setFont(new Font("Monospaced",Font.BOLD,15));  
  bs=new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,255);
  bs.setUnitIncrement(5);
  bs.setBlockIncrement(15);
  pl.add(bl=new Label("BLUE"));
  pl.add(bs);
  bl.setForeground(Color.blue);
  bl.setFont(new Font("Monospaced",Font.BOLD,15));
  rs.addAdjustmentListener(this);
  gs.addAdjustmentListener(this);
  bs.addAdjustmentListener(this);
  add(pl,"South");
  cvas=new Canvas();
  add(cvas,"Center");
  setBackground(Color.magenta);


}
public Insets getInsets()
{
  return new Insets(5,5,5,5);
}
public void adjustmentValueChanged(AdjustmentEvent e)
{
  int rval=rs.getValue();
  int gval=gs.getValue();
  int bval=bs.getValue();
  rl.setText("Red  :"+rval);
  gl.setText("Green  :"+gval);
  bl.setText("Blue  :"+bval);
  Color clr=new Color(rval,gval,bval);
  cvas.setBackground(clr);
  cvas.repaint();
}
}
 