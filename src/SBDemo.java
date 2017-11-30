import java.applet.Applet;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * Created by s_chernykh on 25.05.2017.
 */
public class SBDemo extends Applet implements AdjustmentListener, MouseMotionListener {
    String msg = "";
    Scrollbar vertSB, horzSB;

    @Override
    public void init() {
        int width = 300;
        int height = 200;

        vertSB = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, height);
        vertSB.setPreferredSize(new Dimension(20,100));

        horzSB = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, height);
        horzSB.setPreferredSize(new Dimension(100,20));

        add(vertSB);
        add(horzSB);

        vertSB.addAdjustmentListener(this);
        horzSB.addAdjustmentListener(this);


        addMouseMotionListener(this);



    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        repaint();
    }


    @Override
    public void mouseDragged(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        vertSB.setValue(y);
        horzSB.setValue(x);
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void paint(Graphics g) {
        msg="Vert: "+vertSB.getValue();
        msg+=", Horz: "+horzSB.getValue();
        g.drawString(msg,6,160);

        g.drawString("*",horzSB.getValue(),vertSB.getValue());
    }
}
