import sun.swing.plaf.synth.Paint9Painter;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by s_chernykh on 09.06.2017.
 */
class PaintPanel extends JPanel {
    Insets ins;

    Random rand;

    public PaintPanel() {
        setBorder(
                BorderFactory.createLineBorder(Color.red, 5)
        );
        rand = new Random();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x, y, x2, y2;

        int height = getHeight();
        int width = getWidth();

        ins = getInsets();

        for (int i = 0; i < 10; i++) {
            x = rand.nextInt(width - ins.left);
            y = rand.nextInt(height - ins.bottom);
            x2 = rand.nextInt(width - ins.left);
            y2 = rand.nextInt(width - ins.bottom);

            g.drawLine(x, y, x2, y2);
        }
    }
}


class PaintDemo {
    JLabel jlab;
    PaintPanel pp;

    public PaintDemo() {
        JFrame jfrm = new JFrame("Paint Demo");
        jfrm.setSize(200, 150);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        pp = new PaintPanel();

        jfrm.add(pp);


        jfrm.setVisible(true);

    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PaintDemo();
            }
        });
    }
}
