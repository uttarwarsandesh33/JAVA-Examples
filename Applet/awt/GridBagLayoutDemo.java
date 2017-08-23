import java.awt.*;    
import java.awt.event.* ;

public class GridBagLayoutDemo extends Frame {
    public GridBagLayoutDemo( )   
    {
         GridBagLayout gbl = new GridBagLayout();

         GridBagConstraints gbc = new GridBagConstraints();
         setLayout(gbl);
         Button b ;         // a reference variable of  Button which can be instantiated many times
    // if reinstantiated, the earlier object is garbage collected
    // start setting the constraints
         gbc.gridx = 0 ;                                                             gbc.gridy = 0 ;
         gbc.gridwidth = 1 ;
         gbc.gridheight = 1 ;
         gbc.fill = GridBagConstraints.HORIZONTAL ;                             // grows horizontally

         b = new Button( "First" ) ;
         gbl.setConstraints( b, gbc ) ;
         add( b ) ;

         b = new Button( "Second" ) ;
         gbc.gridx = 1 ;              
// gbc.gridy = 0 is taken from the previous button.  If ones the the constraint is set, it will remain same in the        
         gbl.setConstraints( b, gbc) ;                   
// subsequent program, unless it is changed
         add( b ) ;

         b = new Button( "Third" ) ;
         gbc.gridx = 2 ;
        gbc.gridwidth = GridBagConstraints.REMAINDER;        
// REMAINDER indicates  to 
        gbl.setConstraints( b, gbc );  // the layout that this component is last one in the row
        add( b ) ;

         b = new Button( "Fourth" ) ;
         gbc.gridx = 0 ;
         gbc.gridy = 1 ;
         gbl.setConstraints( b, gbc ) ;                            // remember the sequence of parameters
         add( b );                                               // it is component and grid bag constraints object
                            // some times students reverse the parameters which is a compilation error

         b = new Button( "Fifth" ) ;
         gbc.gridwidth = 1;
         gbc.gridy = 2 ;
         gbl.setConstraints( b, gbc ) ;
         add( b ) ;

         b = new Button( "Six" ) ;
         gbc.gridx = 1 ;
         gbc.gridwidth = GridBagConstraints.REMAINDER ;
         gbl.setConstraints( b, gbc ) ;
         add( b ) ;

         b = new Button( "Seven" ) ;
         gbc.gridx=0 ;
         gbc.gridy=3 ;
         gbc.gridwidth = GridBagConstraints.REMAINDER ;
         gbl.setConstraints( b, gbc ) ;
         add( b ) ;

   addWindowListener( new WindowAdapter( )   
   {
    public void windowClosing(WindowEvent e )  
    {
               System.exit( 0 ) ;   
    } } ) ; 
    }          // close the constructor
    public static void main( String args[ ] )   
    {
         Frame f = new GridBagLayoutDemo( ) ;            f.setSize(300,300) ;  
         f.setVisible( true ) ;
     }
}