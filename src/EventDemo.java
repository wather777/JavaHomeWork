import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by s_chernykh on 08.06.2017.
 */
public class EventDemo {
    JLabel jLabel;


    public EventDemo() {
        JFrame jFrame = new JFrame("An Event Example");
        jFrame.setLayout(new FlowLayout());


        jFrame.setSize(420, 190);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jButtonAlpha = new JButton("Alpha");
        JButton jButtonBeta = new JButton("Beta");

        jButtonAlpha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("Alpha was pressed");
            }
        });

        jButtonBeta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("Beta was pressed");
            }
        });

        jFrame.add(jButtonAlpha);
        jFrame.add(jButtonBeta);

        jLabel = new JLabel("Press a button");
        jFrame.add(jLabel);
        jFrame.setVisible(true);

    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EventDemo();
            }
        });
    }
}
