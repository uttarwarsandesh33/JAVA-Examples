import java.awt.*;
public class RandomCharacters extends Frame
{
       public RandomCharacters()
       {
               setTitle("Random Characters by S N Rao, Faculty");
               setSize(300, 300);
               setVisible(true);
       }
        public String randomChar()
        {  	                             // generating random character within the range of 65 (A) to 90 (Z)
              int n = 65 + (int) (Math.random() * 26);
              char ch = (char) n;
              String str = String.valueOf(ch);
              return str;
        }
        public Color randomColor()                                                    // generating random color
        {
               int n1 = 0 + (int) (Math.random() * 256);            // for red component
               int n2 = 0 + (int) (Math.random() * 256);            // for green component
               int n3 = 0 + (int) (Math.random() * 256);            // for blue component
               Color clr = new Color(n1, n2, n3);
                return clr;
         }
         public Font randomFont()                                                        // generating random font
         {
              String fontname[] = { "Monospaced", "Dialog", "DialogInput", "Serif", "SansSerif" };
              int fontstyle[] = { Font.PLAIN, Font.BOLD, Font.ITALIC, Font.BOLD+Font.ITALIC };
              int fontsize[] = { 12, 17, 22, 27 };
                
                 int n4 = 0 + (int) (Math.random() * 5);            // rfor font name
                 int n5 = 0 + (int) (Math.random() * 4);            // for font sytle
                 int n6 = 0 + (int) (Math.random() * 4);            // for font size
                 Font f1 = new Font(fontname[n4], fontstyle[n5], fontsize[n6]);
                 return f1;
        }
        public void paint(Graphics g)
        {
             for(int i = 0, y = 60; i < 10; i++, y+= 25)
             {
                  g.setColor(randomColor());
                  g.setFont(randomFont());
                  g.drawString(randomChar(), 50, y);
            }
       }
        public static void main(String args[])
        {
              new RandomCharacters();
        }
}                                 
