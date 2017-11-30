import java.applet.Applet;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by s_chernykh on 11.05.2017.
 */
class MyWindowAdapter extends WindowAdapter {
    SampleFrame sampleFrame;

    public MyWindowAdapter(SampleFrame sampleFrame) {
        this.sampleFrame = sampleFrame;
    }

    @Override
    public void windowClosing(WindowEvent e) {
        sampleFrame.setVisible(false);
    }
}


//class SampleFrame extends Frame {
//    public SampleFrame(String title) {
//        super(title);
//
//        MyWindowAdapter adapter = new MyWindowAdapter(this);
//        addWindowListener(adapter);
//    }
//
//    @Override
//    public void paint(Graphics g) {
//        g.drawString("This is in frame window",10, 40);
//    }
//}


public class AppletFrame extends Applet {

    Frame f;

    @Override
    public void init() {
        f = new SampleFrame("A frame Window");
        f.setSize(250, 250);
        f.setVisible(true);
    }

    @Override
    public void start() {
        f.setVisible(true);
    }

    @Override
    public void stop() {
        f.setVisible(false);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("это окно аплета", 10, 20);
    }
}
