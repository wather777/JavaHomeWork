import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Created by s_chernykh on 11.05.2017.
 */

class SampleFrame extends Frame implements MouseListener, MouseMotionListener {

    String msg = "";
    int mouseX=10, mouseY = 40;
    int movX=0, movY = 0;

    SampleFrame (String title) {
        super(title);
        addMouseListener(this);
        addMouseMotionListener(this);
        MyWindowAdapter adapter = new MyWindowAdapter(this);
        addWindowListener(adapter);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
            }

    @Override
    public void mouseEntered(MouseEvent e) {
        mouseX = 10;
        mouseY = 54;
        msg = "Mouse just entered child.";
        repaint();

    }

    @Override
    public void mouseExited(MouseEvent e) {
        mouseX = 10;
        mouseY = 54;
        msg = "Mouse just left child.";
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Down.";
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Up.";
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        movX = e.getX();
        movY = e.getY();
        msg = "*";
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        movX = e.getX();
        movY = e.getY();
        repaint(0,0,100,60);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
        g.drawString("Mouse at "+movX+", "+movY,10,40);
    }
}



public class WindowEvents extends Applet implements MouseListener, MouseMotionListener{
    SampleFrame f;
    String msg = "";
    int mouseX=10, mouseY = 40;
    int movX=0, movY = 0;

    @Override
    public void init() {
        f = new SampleFrame("Handle mouse Events");
        f.setSize(300, 200);
        f.setVisible(true);
        addMouseListener(this);
        addMouseMotionListener(this);

    }

    @Override
    public void stop() {
        f.setVisible(false);
    }

    @Override
    public void start() {
        f.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Down.";
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Up.";
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        mouseX = 0;
        mouseY = 24;
        msg = "Mouse just entered applet win.";
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        mouseX = 0;
        mouseY = 24;
        msg = "Mouse just left applet win.";
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        movX = e.getX();
        movY = e.getY();
        msg = "*";
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        movX = e.getX();
        movY = e.getY();
        repaint(0,0,100,20);
    }


    @Override
    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
        g.drawString("Mouse at "+movX+", "+movY,0,10);
    }
}
