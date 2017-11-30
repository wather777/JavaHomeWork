import javax.swing.*;

/**
 * Created by s_chernykh on 08.06.2017.
 */
class SwingDemo {
    SwingDemo() {
        JFrame jFrame = new JFrame("A Simple Swing Application");
        jFrame.setSize(275, 100);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jLabel = new JLabel("Swing means powerfull GUIs");

        jFrame.add(jLabel);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
