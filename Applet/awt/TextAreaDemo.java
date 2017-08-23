/*                                 TextArea

	The limitation of TextField is that it takes a single line of text, but of any length.  This is overcome in TextArea.  TextArea can display a number of lines which can be scrolled with a scroll bars - horizontal scroll bar and vertical scroll bar.

 	TextArea generates TextEvent and handled by TextListener.

	The size of the TextArea is given by the number of lines and number of columns.

*/

// to display what user entered in one text area in another text area

import java.awt.*;
import java.awt.event.*;

public class TextAreaDemo extends Frame implements TextListener      
                 // for TextArea, it is TextListener
{
     TextArea ta1, ta2; 
         // ta1 for typing and ta2 for displaying

     public TextAreaDemo()
     {
      setLayout(new GridLayout(2, 2,10, 50));
          setBackground(Color.yellow);

          ta1 = new TextArea(10,30);  
                                  // 10 rows, 30 columns

     ta2 = new TextArea("I display", 10, 30); 
// 10 rows, 30 columns and by default "I display" is displayed"

    // now add the comoponents to the frame
          add(new Label("Enter Here"));
          add(ta1);
          add(new Label("Display Here"));
          add(ta2);
                     	     // link the listener
          ta1.addTextListener(this);

	                    // beautification
          ta1.setBackground(Color.pink);
          ta2.setBackground(Color.cyan);

          ta1.setFont(new Font("Monospaced",Font.BOLD,18));

         ta2.setFont(new Font("Monospaced",Font.BOLD,18));
         
          setSize(400,400);
          setVisible(true);
     }
  
           // override the abstract method of TextListener
     public void textValueChanged(TextEvent e)
     {
         // String str = ta1.getText();
         // ta2.setText(str);
        ta2.setText(ta1.getText()); 
     }
     public static void main(String args[])
     {
         new TextAreaDemo();
     }
}
