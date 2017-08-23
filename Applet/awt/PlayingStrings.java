/*
Write an AWT program to convert a string entered in a text field to be converted as   
         follows and displayed in another text field ?

         1.  a)  to uppercase  b)  to lowercase   c) to propercase(first letter to be in uppercase  
               and subsequent in lowercase)  d)  to inverse(uppercase to lowercase and 
               lowercase to uppercase)    e)  to print the string in reverse order.

*/
import java.awt.*;
import java.awt.event.*;
public class PlayingStrings extends Frame  
{
	Button  upper,  lower,  proper,  inverse,  reverse ;
TextField  tf1,  tf2;
	PlayingStrings( )   {
		setLayout(new FlowLayout( ) ) ;
	
		upper = new Button( " Upper Case " ) ;
		lower = new Button( " Lower Case " ) ;
		proper = new Button( " Proper Case " ) ;
		inverse = new Button( " Inverse Case " ) ;
		reverse = new Button( " Reverse Order " ) ;
	
		add( new Label( " Enter String " ) ) ;
		add( tf1 = new TextField( 15 ) ) ;	
		add( upper ) ;  add( lower ) ;  add( proper ) ;  add( inverse ) ;  add( reverse ) ;	
		add( new Label( " Result String " ) ) ;
		add( tf2 = new TextField( 15 ) ) ;	
		SeparateHandling sh = new SeparateHandling( tf1 , tf2 ) ;
		upper.addActionListener( sh ) ;    lower.addActionListener( sh ) ;
		proper.addActionListener( sh ) ;   inverse.addActionListener( sh ) ;
		reverse.addActionListener( sh ) ;

		setTitle("S N Rao playinga with Strings") ;  setSize( 250, 350) ;  setVisible( true ) ;
	}
	public static void main( String args[ ] )  {     new PlayingStrings( ) ;
	}
}
class SeparateHandling implements ActionListener  {
	TextField  t1, t2 ;
	SeparateHandling( TextField t1, TextField t2 )  {
		this.t1 = t1;    this.t2 = t2;
	}
	public void actionPerformed( ActionEvent  e )   {
		String blabel = e.getActionCommand( ) ;
		String str1 = t1.getText( ) ;   String str2 = " " ;
		
		if( blabel.equals( " Upper Case " ) )              str2 = str1.toUpperCase( ) ; 
		else if( blabel.equals( " Lower Case " ) )       str2 = str1.toLowerCase( ) ; 
		else if(blabel.equals( " Proper Case " ) )   {
			String s1 = str1.substring( 0, 1 ) ;
			String s2 = str1.substring( 1 ).toLowerCase( ) ;
			str2 = s1.toUpperCase( )  +  s2 ;
		}
		else if( blabel.equals( " Inverse Case " ) )  {
			StringBuffer sb = new StringBuffer( ) ;
		      for( int i = 0 ; i < str1.length( ) ; i++ )    {
				
if( Character.isLowerCase( str1.charAt( i ) ) )					            sb.append( String.valueOf( str1.charAt( i ) ).toUpperCase( ) ) ;
			else if( Character.isUpperCase( str1.charAt( i ) ) ) 
				sb.append( String.valueOf(str1.charAt( i ) ).toLowerCase( ) );
			else   
sb.append( str1.charAt( i ) ) ;
		      }
      str2 = sb.toString().trim( ) ;
		}
		else if( blabel.equals( " Reverse Order " ) )   {
			StringBuffer sb = new StringBuffer( str1 ) ;
			str2 = sb.reverse( ).toString( ) ;
		}
		t2.setText(str2);
}       }
