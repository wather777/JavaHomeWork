import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by s_chernykh on 26.05.2017.
 */
public class FlowLayoutDemo extends Applet implements ItemListener {
    String msg = "";
    Checkbox winXp,win7,sol, mac;

    @Override
    public void init() {
        setLayout(new FlowLayout(FlowLayout.RIGHT));

        winXp = new Checkbox("Windows XP", null, true);
        win7 = new Checkbox("Windows 7");
        sol = new Checkbox("Solaris");
        mac = new Checkbox("Mac OS");

        add(winXp);
        add(win7);
        add(sol);
        add(mac);


        winXp.addItemListener(this);
        win7.addItemListener(this);
        sol.addItemListener(this);
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
        g.drawString(msg, 6, 100);
        msg = "Windows XP: " + winXp.getState();

        msg = "Windows 7: " + win7.getState();
        g.drawString(msg, 6, 120);
        msg = "Solar: " + sol.getState();
        g.drawString(msg, 6, 140);
        msg = "mac OS: " + mac.getState();
        g.drawString(msg, 6, 160);
    }
}
