import java.awt.*;

/**
 * Created by s_chernykh on 15.05.2017.
 */
public class Lines {

   static class Appwin extends Frame {



        @Override
        public void paint(Graphics g) {
            g.drawLine(0, 0, 100, 100);
            g.drawLine(0, 100, 100, 0);
            g.drawLine(40, 25, 250, 180);
            g.drawLine(75, 90, 400, 400);
            g.drawLine(20, 150, 400, 40);
            g.drawLine(5, 290, 80, 19);
        }

    }

    public static void main(String[] args) {
        Appwin a = new Appwin();
        a.setVisible(true);
    }
}