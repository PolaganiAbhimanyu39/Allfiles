import java.awt.*;
import java.awt.event.*;
class MyClass extends WindowAdapter{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}
public class Rough3 extends Frame
{
    String s = "Do something inside window with mouse";
    Rough3()
    {
        setName("Mouse");
        setSize(600,400);
        setVisible(true);
        setTitle("MOUSE EVENTS");
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e)
            {
                s="Mouse Clicked";
                repaint();
            }
            public void mouseEntered(MouseEvent e)
            {
                s="Mouse Entered";
                repaint();
            }
            public void mouseExited(MouseEvent e)
            {
                s="Mouse Exited";
                repaint();
            }
            public void mousePressed(MouseEvent e)
            {
                s="Mouse Pressed";
                repaint();
            }
            public void mouseReleased(MouseEvent e)
            {
                s="Mouse Released";
                repaint();
            }
        });
        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e)
            {
                s="Mouse dragged";
                repaint();
            }
            public void mouseMoved(MouseEvent e)
            {
                s="Mouse moved";
                repaint();
            }
        });
        addWindowListener(new MyClass());
    }
    public void paint(Graphics g)
    {
        g.drawString(s,300, 200);
    }
        public static void main(String[] ar)
        {
            new Rough3();
        }
    }
