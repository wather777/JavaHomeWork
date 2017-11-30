import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by s_chernykh on 10.05.2017.
 */
public class SimpleKey extends Applet implements KeyListener,Runnable {
    String msg = "";
    int X =10, Y = 20;

    @Override
    public void init() {
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar()==KeyEvent.VK_ENTER)
        {
            Y +=10;
            repaint();
        }
        msg+=e.getKeyChar();

        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        showStatus("Key Down"+e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        showStatus("Key Up");
    }



    @Override
    public void paint(Graphics g) {
        g.drawString(msg, X, Y);
    }

    @Override
    public void run() {

    }
}
