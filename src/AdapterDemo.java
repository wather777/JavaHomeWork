import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 * Created by s_chernykh on 11.05.2017.
 */
public class AdapterDemo extends Applet {
    @Override
    public void init() {
        addMouseListener(new MyMouseAdapter2(this));
        addMouseMotionListener(new MyMouseMotionAdapter(this));
    }


}


class MyMouseAdapter2 extends MouseAdapter {
    AdapterDemo adapterDemo;
    public MyMouseAdapter2(AdapterDemo adapterDemo) {
        this.adapterDemo = adapterDemo;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        adapterDemo.showStatus("Mouse clicked");

    }
}


class MyMouseMotionAdapter extends MouseMotionAdapter {
    AdapterDemo adapterDemo;

    public MyMouseMotionAdapter(AdapterDemo adapterDemo) {
        this.adapterDemo=adapterDemo;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        adapterDemo.showStatus("Mouse dragged");
    }
}