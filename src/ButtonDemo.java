import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by s_chernykh on 24.05.2017.
 */
public class ButtonDemo extends Applet implements ActionListener {
    String msg = "";
    Button yes, no, maybe;

    @Override
    public void init() {
        yes = new Button("Yes");
        no = new Button("no");
        maybe = new Button("maybe");

        add(yes);
        add(no);
        add(maybe);

        yes.addActionListener(this);
        no.addActionListener(this);
        maybe.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String srt = e.getActionCommand();
        msg = "You pressed "+srt;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(msg, 6, 100);

    }
}
