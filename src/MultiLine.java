import java.applet.Applet;
import java.awt.*;

/**
 * Created by s_chernykh on 23.05.2017.
 */
public class MultiLine extends Applet {
    int curX=0, curY = 0;

    @Override
    public void init() {
        Font f = new Font("SansSerif", Font.PLAIN, 12);
        setFont(f);
    }


    @Override
    public void paint(Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        nextLine("This is on line one.", g);
        nextLine("This is on line two.", g);
        sameLine("This is on same line.", g);
        sameLine("This is, too.", g);
        nextLine("This is on line three.", g);
        curX = curY = 0;

    }


    void nextLine (String s,Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        curY += fm.getHeight();
        curX = 0;
        g.drawString(s, curX, curY);
        curX = fm.stringWidth(s);
    }

    void sameLine(String s, Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        g.drawString(s, curX, curY);
        curX += fm.stringWidth(s);
    }
}
