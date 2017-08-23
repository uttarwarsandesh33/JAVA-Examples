import java.awt.*;   import java.awt.event.*; 
public class HitechCityDarshini extends Frame implements ActionListener  
{   
	List tl, gl, ml, al;
	Button fb, lb, nb, pb ;
	CardLayout cl ;
	Panel sp, bp  ; 
	Panel ep ;                // extra panel to add new buttons created in this program
	Button tb, gb, mb, sb ;                                                          // extra buttons
	public HitechCityDarshini( )  
                  {
		super( "Welcome to Hyderabad -- now Cyberabad" ) ; 

		tl = new List( 4 ) ;    gl = new List( 4 ) ;
		ml = new List( 4 ) ;    al = new List( 4 ) ;
		
		tl.add( "Sudersan group" ) ;
		tl.add( "Sandhya group" ) ; tl.add( "Mahewari 70MM" ) ;
		tl.add( "Ramakrishana" ) ; tl.add( "Swapna 70MM" ) ;
		tl.add( "Surya 35MM" ) ;  tl.add( "Odeon 35 MM" ) ;

		gl.add( "Indira Park" ) ;   
		gl.add( "Lumbibi Park" ) ;  gl.add( "Sanjivayya Park" ) ;
		gl.add( "Zoo Park" ) ;   gl.add( "Public Gardens" ) ;

		ml.add( "Chiran Palace" ) ;  ml.add( "Falaknuma Palace" ) ;
		ml.add( "Charminar" ) ;        ml.add( "QQ Tombs" ) ;
		ml.add( "Golconda Fort" ) ;  ml.add( "Zuma Majid" ) ;

		al.add( "Birla Mandir" ) ;       al.add( "Planetorium" ) ;
		al.add( "Hi-Tech city" ) ;       al.add( "Buddha Purnima" ) ;
		al.add( "Ramoji Filmcity" ) ;  al.add( "Shilparamam" ) ;

		cl = new CardLayout( ) ;
		sp = new Panel( ) ; 
		sp.setLayout( cl ) ; 
		sp.add( tl,"t"  ) ;  sp.add( gl, "g" ) ; 	// add lists to panel
		sp.add( ml, "m" ) ;  sp.add( al, "a" ) ;

		fb = new Button( "First Button" ) ;    lb = new Button( "Last Button" ) ;
		nb = new Button( "Next Button" ) ;    
 		pb = new Button( "Previous Button" ) ;

		bp = new Panel( ) ;  
		bp.setLayout( new GridLayout(1, 4 ) ) ;
		bp.add( fb ) ;  bp.add( nb ) ;
		bp.add( pb ) ;  bp.add( lb ) ;

ep = new Panel( ) ;        // create extra panel
ep.setLayout( new GridLayout(1, 4, 5, 0 ));   
		// grid layout with gaps
tb = new Button ( "Theatres" ) ;       
gb = new Button ( "Gardens" ) ;
mb = new Button( "Monuments" ) ; 
sb = new Button( "Special" ) ;
	                           // add buttons to the panel
ep.add( tb ) ;  
ep.add( gb ) ;  
ep.add( mb ) ;  
ep.add( sb ) ;

fb.addActionListener( this ) ;  
nb.addActionListener( this ) ;
pb.addActionListener( this ) ;  
lb.addActionListener( this ) ;
tb.addActionListener( this ) ;  
gb.addActionListener( this ) ;
mb.addActionListener( this ) ;  
sb.addActionListener( this ) ;
	
		add( bp, "South" ) ;  
                                     add( sp, "Center" ) ;
                                     add( ep, "North" ) ;
						// no setTitle( )
		setSize( 300, 300 );   setVisible( true ) ;
		addWindowListener( new WindowAdapter()  {
				public void windowClosing(WindowEvent e )  {
					System.exit(0);
				}
				} ) ;
	}
	public void actionPerformed( ActionEvent e )  
                  {
	 String str = e.getActionCommand( ) ;
	 if( str.equals( "First Button" ) )
		cl.first( sp ) ;
	 else if( str.equals( "Next Button" ) )
		cl.next( sp ) ;
	 else if( str.equals( "Previous Button" ) )
		cl.previous( sp ) ;
	 else if( str.equals( "Last Button" ) )
		cl.last( sp ) ;

                    else if( str.equals( "Theatres" ) )
		cl.show( sp, "t" ) ;
	else if( str.equals( "Gardens" ) )
		cl.show( sp, "g" ) ;
	else if( str.equals( "Monuments" ) )
		cl.show( sp, "m" ) ;
	else if( str.equals( "Special" ) )
		cl.show( sp, "a" ) ;
	}
 	public static void main( String args[ ] )   
                 {   
		new HitechCityDarshini( ) ; 
 	}
}