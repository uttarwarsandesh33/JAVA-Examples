/*
1.  Project using TextField and Button

1.  Create three text fields to enter username, password and filename duly labeled.
2.  Username and password are to be validated and informed the user about the results of validation(whether valid or invalid);
3.  Filename text field including its label must be displayed when both the username and password are valid.
4. When user enters the filename, the file must be opened in a text area.

*/


import java.awt.* ;    
import java.awt.event.* ;      import java.io.* ;

public class UserPassword extends Frame implements ActionListener   
{
    TextField   ufield ,  pfield ,  ffield ;
    TextArea  ta ;
    Button  btn ; 
    Label  lab ,  messageLabel ; 
    UserPassword( )   
    {
         ufield = new TextField( 15 ) ;
         pfield = new TextField( 15 ) ;
         ffield = new TextField( 15 ) ;
         btn = new Button( "Validate" ) ;
         ta = new TextArea( 20 , 60 ) ;

         btn.addActionListener( this ) ;
         ffield.addActionListener( this ) ;

         Panel p = new Panel( ) ;
         p.setLayout( new GridLayout( 4 , 2 ) ) ;
	
         p.add(new Label("Enter User Name " ,  Label.RIGHT ) ) ;    
          p.add( ufield ) ;
           p.add( new Label( "Enter Password" ,  Label.RIGHT ) ) ;    
           p.add( pfield ) ;
           lab = new Label( " Enter File Name     " ,  Label.RIGHT ) ; 
          p.add( lab ) ;    p.add( ffield ) ;     p.add( btn ) ;
          messageLabel = new Label( " Program by S N Rao " ,  Label.CENTER ) ;
          messageLabel.setForeground( Color.red ) ;
          p.add( messageLabel ) ;

          add( p , "North" ) ; add( ta , "Center" ) ;
		
         lab.setVisible( false ) ;      
         ffield.setVisible( false ) ;     
         ta.setVisible( false ) ;

          setSize( 550 , 350 ) ;        
          setVisible( true ) ;
      }
       public void actionPerformed( ActionEvent  e )  
        {
           String str1 = ufield.getText( ) ;
           String str2 = pfield.getText( ) ;
           if ( e.getSource( )  ==  btn )   
           {
	if( (str1.equalsIgnoreCase( "snrao" ) )  &&  ( str2.equalsIgnoreCase( "sure" ) ) )          
                   {
	   lab.setVisible( true ) ;
	   ffield.setVisible( true ) ;
	   ffield.setText( "Now Enter sir" ) ;
	   ta.setVisible( true ) ;
	   messageLabel.setText("Your Username and Password are V A L I D" ) ;
			
	ffield.setBackground( Color.cyan ) ;
	ta.setBackground( Color.pink ) ;
	invalidate( ) ;     
                   validate( ) ;
            }
            else
	messageLabel.setText("Your Username and Passord are I N V A L I D");
	}
            if ( e.getSource( )  ==  ffield )   
             {
                String str3 = ffield.getText( ) ;
                try  
                 {
	FileInputStream fis = new FileInputStream( str3 ) ;
	int k = 0 ;
	while( ( k = fis.read( )  )  !=   -1 )
	     ta.append(String.valueOf( (char ) k ) ) ;
	fis.close( ) ;
                   }
      catch( IOException e1 )   
      {  
           e1.printStackTrace( ) ;          
       }
        }
     }
     public static void main( String args[ ] )  {
	     new UserPassword( ) ;
     }
}
