import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by s_chernykh on 25.05.2017.
 */
public class ListDemo extends Applet implements ActionListener {
    List os, brow;
    String msg="";

    @Override
    public void init() {
        os = new List(4, true);
        brow = new List(4, false);

        os.add("XP");
        os.add("7");
        os.add("sol");
        os.add("mac");

        brow.add("IE");
        brow.add("chrome");
        brow.add("opera");
        brow.add("mozzila");

        add(os);
        add(brow);


        os.addActionListener(this);
        brow.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        int idx[];
        msg = "Cur OS: ";
        idx = os.getSelectedIndexes();
        for (int i = 0; i < idx.length; i++) {
            msg += os.getItem(idx[i]) + " ";
        }
        g.drawString(msg, 6, 120);
        msg = "Cur brow: ";
        msg += brow.getSelectedItem();
        g.drawString(msg, 6, 140);
    }
}
