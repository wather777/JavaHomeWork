/**
 * Created by s_chernykh on 10.05.2017.
 */

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MouseEvents extends Applet implements MouseListener, MouseMotionListener{

    String msg = "";
    int mouseX = 0, mouseY = 0;

    @Override
    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse clicked.";
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
    public void mouseEntered(MouseEvent e) {
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse Entered.";
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse Exited.";
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "*";
        showStatus("Dragging mouse at "+mouseX+", "+mouseY);
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

        showStatus("Moving mouse at "+e.getX()+", "+e.getY());
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(msg,mouseX,mouseY);
    }
}
