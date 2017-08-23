import java.awt.*;
public class CanvasDemo extends Frame
{
    public CanvasDemo()
    {
        setLayout(new FlowLayout());
        Canvas cvas1 = new Canvas();
        Canvas cvas2 = new Canvas();
        Canvas cvas3 = new Canvas();

        cvas1.setSize(100,100);
        cvas2.setSize(100,100);
        cvas3.setSize(100,100);

        cvas1.setBackground(Color.red);
        cvas2.setBackground(Color.green);
        cvas3.setBackground(Color.blue);

        add(cvas1);        add(cvas2);        add(cvas3);

       setSize(300, 300);
       setVisible(true);
    }
    public static void main(String args[])
    {
            new CanvasDemo();
    }
}
