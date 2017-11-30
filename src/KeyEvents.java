import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by s_chernykh on 11.05.2017.
 */
public class KeyEvents extends Applet implements KeyListener {
    String msg = "";
    int X = 10, Y = 20;

    @Override
    public void init() {
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        msg+=e.getKeyChar();
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        showStatus("Key Down");
        int key =e.getKeyCode();

        switch (key) {
            case KeyEvent.VK_F1:
                msg += "<F1>";
                break;
            case KeyEvent.VK_F2:
                msg += "<F2>";
                break;
            case KeyEvent.VK_F3:
                msg += "<F3>";
                break;
            case KeyEvent.VK_PAGE_DOWN:
                msg += "<PAGE_DOWN>";
                break;
            case KeyEvent.VK_PAGE_UP:
                msg += "<PAGE_UP>";
                break;
            case KeyEvent.VK_LEFT:
                msg += "<LEft>";
                break;
            case KeyEvent.VK_RIGHT:
                msg += "<RIGHT>";
                break;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    showStatus("Key UP");
    }


    @Override
    public void paint(Graphics g) {
        g.drawString(msg, X, Y);
    }
}
