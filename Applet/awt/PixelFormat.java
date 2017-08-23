import java.awt.*;
public class PixelFormat extends Frame
{
   public PixelFormat()
   {
         setLayout(null);
         Button rb = new Button("Red");
                                                                                                                                                                                                                          rb.setBounds(100,150,80,40);
        add(rb);

    setSize(300,300);
   setVisible(true);
}
public static void main(String args[])
 {
   new PixelFormat();
}
}