			// 2005, Set 2
import java.awt.*;
public class PanelDemo1 extends Frame
{
    public PanelDemo1()
    {
            Panel p1 = new Panel();
            Panel p2 = new Panel();

  p1.setLayout(new GridLayout(2, 2, 10, 10));

            p1.add(new Label("User ID"));
            p1.add(new TextField(15));
            p1.add(new Label("Password"));
            p1.add(new TextField(15));

           p2.add(new Button("OK"));

         add(p1, "North");
         add(p2, "Center");

        setTitle("Panels by SNRao");
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String args[])
    {
             new PanelDemo1();
    }
}
