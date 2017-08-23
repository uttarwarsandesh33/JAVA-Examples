// Aim: to use CardLayout.

import java.awt.*;   
import java.awt.event.*; 

public class BhagyaNagarDarshini extends Frame implements ActionListener  
{   
          List tl, gl, ml, al ; // make four lists to be added to a container that is set to card layout
          
        Button fb, lb, nb, pb ;    // to activate the cards of the card layout

	CardLayout cl ;  
	Panel sp, bp ;   // panels to add lists and buttons

	public BhagyaNagarDarshini( )  
                   {

super( "Welcome to Hyderabad -- now Cyberabad" );      
			          // title to Frame

tl = new List( 4 ) ;    
gl = new List( 4 ) ;        // instantiate list objects 
ml = new List( 4 ) ;   
al = new List( 4 ) ;
		               // populate theaters list 
tl.add( "Sudersan group" ) ; 
tl.add( "Sandhya group" ) ;   
tl.add( "Mahewari 70MM" ) ;
tl.add( "Ramakrishana" ) ;    
tl.add( "Swapna 70MM" ) ;
tl.add( "Surya 35MM" ) ;  
tl.add( "Odeon 35 MM" ) ;
                                                        // populate gardens list 
gl.add( "Indira Park" ) ;     
gl.add( "Lumbini Park" ) ; 
gl.add( "Sanjivayya Park" ) ;
gl.add( "Zoo Park" ) ;        
gl.add( "Public Gardens" ) ;
		            // populate monuments list
ml.add( "Chiran Palace" ) ;  
ml.add( "Falaknuma Palace" ) ;
ml.add( "Charminar" ) ;    
ml.add( "QQ Tombs" ) ; 
ml.add( "Golconda Fort" ) ;  
ml.add( "Zuma Majid" ) ;
                                            // populate special attractions list
al.add( "Birla Mandir" ) ;  
al.add( "Planetorium" ) ;
al.add( "Hi-Tech city" ) ;    
al.add( "Buddha Purnima" ) ;
al.add( "Ramoji Filmcity" ) ;  
al.add( "Shilparamam" ) ;

// you are ready with 4 lists and are now to be added to a container under the influence of CardLayout
                                           // create a card layout object
cl = new CardLayout( ) ;     
sp = new Panel( ) ;                // a panel to add all the lists
sp.setLayout( cl ) ;               // set the layout to panel sp
	                      // add lists to panel
sp.add( tl,"t"  ) ;           // t is an alias name to tl
sp.add( gl, "g" ) ;
sp.add( ml, "m" ) ; 
sp.add( al, "a" ); // the string parameter is for show( ) later
					                                      // instantiate buttons
fb = new Button( "First Button" ) ;    
lb = new Button( "Last Button" ) ;
nb = new Button( "Next Button" ) ;   
pb = new Button( "Previous Button" ) ;

bp = new Panel( ) ;                         // a panel to add buttons
bp.setLayout( new GridLayout(1, 4 ) ); 
                                                          // set layout to bp panel
bp.add( fb ) ;   
bp.add( nb );                           // add each button to panel
bp.add( pb ) ;  
bp.add( lb ) ;
					                                          // register the buttons with listeners 
fb.addActionListener( this ) ; 
nb.addActionListener( this ) ;
pb.addActionListener( this ) ; 
lb.addActionListener( this );
                                                       // add panels to frame
add( bp, "South" ) ;  
add( sp, "Center" ) ; 

setSize( 300, 300 );   
setVisible( true ) ;
                                                  // window closing
addWindowListener( new WindowAdapter( )   
	{
	  public void windowClosing(WindowEvent e )  
                     {
                                System.exit(0);
	} } ) ;                              	
}
	
public void actionPerformed(ActionEvent e )  
{
	String str = e.getActionCommand( ) ;
	if( str.equals( "First Button" ) )
		cl.first( sp ) ;                        	
                  else if( str.equals( "Next Button" ) )
		cl.next( sp ) ;
                  else if(str.equals("Previous Button" ) )
		cl.previous( sp ) ;
                  else if( str.equals( "Last Button" ) )
		cl.last( sp ) ;
}
public static void main( String args[ ] )   
{   
     new BhagyaNagarDarshini( ) ;  
}
}