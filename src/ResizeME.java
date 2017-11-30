import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by s_chernykh on 22.05.2017.
 */
public class ResizeME extends Applet {
    final int inc = 25;
    int max = 500;
    int min = 200;
    Dimension d;


    public ResizeME()  {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int h = (d.height + inc) > max ? min : (d.height + inc);
                int w = (d.width + inc) > max ? min : (d.width + inc);


                setSize(new Dimension(w, h));
            }


        });
    }

    @Override
    public void paint(Graphics g) {
        d = getSize();
        g.drawLine(0, 0, d.width - 1, d.height - 1);
        g.drawLine(0, d.width - 1, d.height - 1,0);
        g.drawRect(0,0, d.width - 1, d.height - 1);
    }
}
