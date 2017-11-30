import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by s_chernykh on 25.05.2017.
 */
public class CheckboxDemo extends Applet implements ItemListener {
    String msg ;
    Checkbox winXp, win7, solaris, mac;

    @Override
    public void init() {
        winXp = new Checkbox("Windows XP", null, true);
        win7 = new Checkbox("Windows 7");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("Mac OS");

        add(win7);
        add(winXp);
        add(solaris);
        add(mac);

        winXp.addItemListener(this);
        win7.addItemListener(this);
        solaris.addItemListener(this);
        mac.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        repaint();
    }


    @Override
    public void paint(Graphics g) {
        msg = "Cur state: ";
        g.drawString(msg, 6, 80);

        msg = "Windows XP: " + winXp.getState();
        g.drawString(msg, 6, 100);

        msg = "Windows 7: " + win7.getState();
        g.drawString(msg, 6, 120);
        msg = "Solar: " + solaris.getState();
        g.drawString(msg, 6, 140);
        msg = "mac OS: " + mac.getState();
        g.drawString(msg, 6, 160);
    }
}
