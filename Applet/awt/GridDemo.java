 /*                    GridLayout Manager

   In GridLayout, we divide the container, say frame, into a number of rows and columns comprising cells. Each cell can accomodate one component. The default gap between the components is zero which we can change.
*/

import java.awt.*;
public class GridDemo extends Frame
{
  public GridDemo()
  {
 setLayout(new GridLayout(3, 4, 20, 40)); 

// 3 rows and 4 columns

         setBackground(Color.magenta);

// color is not seen due to 0 pixel default gap

	// add 12 buttons in 12 cells
        for(int i = 0; i < 12; i++)
       {
                add(new Button("Button " + i));
       }

       setSize(300,300);
       setVisible(true);
  }
  public static void main(String args[])
  {
      new GridDemo();
  }
}

/*
        setLayout(new GridLayout(3, 4,30,50));

    3  rows, 4 columns, 30 hgap, 50 vgap.

       The importance of layout managers is the position of the component is never disturbed irrespective of the size of the container.
*/ 