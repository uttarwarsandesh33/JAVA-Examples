import java.awt.*;
import java.awt.event.*;
public class Drawing3DRectangles extends Frame implements WindowListener{
public Drawing3DRectangles(){
addWindowListener(this);
setTitle("Drawing 3D Rectangles");
setSize(450,400);
setVisible(true);
}
public void paint(Graphics g){
g.draw3DRect(50,60,150,100,true);
g.fill3DRect(230,60,150,100,true);
}
public static void main(String args[]){
new Drawing3DRectangles();
}
public void windowClosing(WindowEvent e){
System.exit(0);
}
public void windowOpened(WindowEvent e){
}
public void windowClosed(WindowEvent e){
}
public void windowIconified(WindowEvent e){
}
public void windowDeiconified(WindowEvent e)
{
}
public void windowActivated(WindowEvent e){ 
}
public void windowDeactivated(WindowEvent e){
}
}
