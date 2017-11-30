import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by s_chernykh on 25.05.2017.
 */
public class ChoiceDemo extends Applet implements ItemListener {
    Choice os, brow;
    String msg;

    @Override
    public void init() {
        os = new Choice();
        brow = new Choice();
        os.add("XP");
        os.add("7");
        os.add("sol");
        os.add("mac");

        brow.add("IE");
        brow.add("chrome");
        brow.add("opera");

        add(os);
        add(brow);

        os.addItemListener(this);
        brow.addItemListener(this);
    }

        @Override
    public void itemStateChanged(ItemEvent e) {
     repaint();
    }

    @Override
    public void paint(Graphics g) {
        msg = "Cur OS: ";
        msg += os.getSelectedItem();
        g.drawString(msg, 6, 120);
        msg = "Cur brow: ";
        msg += brow.getSelectedItem();
        g.drawString(msg,6,140);
    }
}
