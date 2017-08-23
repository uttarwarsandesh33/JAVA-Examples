import java.awt.*;
public class SystemFonts extends Frame
{
    public SystemFonts()
    {
           setVisible(true);
    }
    public void paint(Graphics g)
    {
        Toolkit tk = Toolkit.getDefaultToolkit();
        String names[] = tk.getFontList();
       
        int x = 50, y=60;
        for(int i=0; i<names.length; i++)
       {
       g.drawString(names[i], x, y+=25);
      }
     }
      public static void main(String args[])
      {
        new SystemFonts();
      }
}