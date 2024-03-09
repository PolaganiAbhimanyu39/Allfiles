// First applet program
// An applet to print Hello World 

import java.applet.Applet;
import java.awt.Graphics;
public class HelloWorld extends Applet{ //HelloWorld is  a subclass of Applet, allowing it to inherit the properties and behaviors of the Applet class.
    public void paint(Graphics g){
        g.drawString("Hello World!",150,150);
    }
}