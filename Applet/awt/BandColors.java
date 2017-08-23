import java.awt.*;
import java.awt.event.*;

public class BandColors extends Frame implements ActionListener
{
       Choice band1, band2, band3, band4;
       Button resistance;
       TextField tf;
       public BandColors()
       {
                setLayout(new GridLayout(6,2,5,5));
                setBackground(Color.cyan);

                band1 = new Choice();
                band2 = new Choice();
                band3 = new Choice();
                band4 = new Choice();
                resistance = new Button("RESISTANCE");
                tf = new TextField(15);

                tf.setBackground(Color.pink);
                tf.setFont(new Font("Monspaced",Font.BOLD,20));

    String colors[] = { "Black","Brown","Red","Orange","Yellow","Green","Blue","Violet","Gray","White"};
              for(int i = 0; i < colors.length; i++)
              {
                    band1.addItem(colors[i]);
                    band2.addItem(colors[i]);
                    band3.addItem(colors[i]);
                    band4.addItem(colors[i]);
             }

            resistance.addActionListener(this);

            add(new Label("Select Band 1"));
            add(band1);
            add(new Label("Select Band 2"));
            add(band2);
            add(new Label("Select Band 3"));
            add(band3);
            add(new Label("Select Band 4"));
            add(band4);
            add(new Label("CLICK for Resistance"));
            add(resistance);      
            add(new Label("RESISTANCE"));
             add(tf);

            setSize(300,250);
            setVisible(true);
      }
      public void actionPerformed(ActionEvent e)
      {
           int band1value = band1.getSelectedIndex();
           int band2value = band2.getSelectedIndex();
           int band3value = band3.getSelectedIndex();
           int band4value = band4.getSelectedIndex();

          double resis = ((band1value*10) + band2value) * Math.pow(10,band3value);
          tf.setText(""+resis);

      }
      public static void main(String args[])
      {
                new BandColors();
      }
}               


   
 
          
       

       
