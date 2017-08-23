// to shift the set methods to a constructor to create an empty frame

import java.awt.*;
public class MyFrame extends Frame
{
     public MyFrame()
     {
              setTitle("Frame by S N Rao");
              setSize(300, 350);
              setVisible(true);
     }
     public static void main(String args[])
     {
              new MyFrame();
     }
}