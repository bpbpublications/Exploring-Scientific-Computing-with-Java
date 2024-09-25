import java.awt.*;
import java.applet.*;

public class TstApplet1 extends Applet{

String msg;
// set the foreground and background colors.
public void init() {
setBackground(Color.cyan);
setForeground(Color.red);
msg = "Inside init( ) --";
}

// Initialize the string to be displayed.
public void start() {
msg += " Inside start( )-- ";
}

// Display msg in applet window.
public void paint(Graphics g) {
msg += " Inside paint( ).";
g.drawString(msg, 10, 30);
}
}