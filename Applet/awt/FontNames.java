import java.awt.*;
public class FontNames extends Frame
{
     public FontNames( )
     {
	setSize(300,200);
	setVisible(true);
    }
    public void paint(Graphics g)
    {
          Toolkit tk = Toolkit.getDefaultToolkit( );
          String names[] =  tk.getFontList( );
          for(int i=0,x=50,y=60; i<names.length; i++,y+=25)
          {
                g.setFont(new Font("Monospaced",Font.BOLD,20));	
                g.drawString(names[i],x,y);
          }
   }
          public static void main(String args[])
          {
	new FontNames();
         }
}