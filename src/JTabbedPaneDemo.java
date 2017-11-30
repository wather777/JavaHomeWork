import javax.swing.*;

/**
 * Created by s_chernykh on 09.06.2017.
 */
public class JTabbedPaneDemo extends JApplet {
    @Override
    public void init() {
        try {
            SwingUtilities.invokeAndWait(
                    new Runnable() {
                        @Override
                        public void run() {
                            makeGUI();
                        }

                    });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void makeGUI() {
        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("Cities",new CitiesPanel());
        jtp.addTab("Colors",new ColorsPanel());
        jtp.addTab("Flavors",new FlavorsPanel());
        add(jtp);
    }
}


class CitiesPanel extends JPanel {
    public CitiesPanel() {
        JButton b1 = new JButton("NY");
        JButton b2 = new JButton("London");
        JButton b3 = new JButton("Hong Kong");
        JButton b4 = new JButton("Tokyo");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }
}

class ColorsPanel extends JPanel {
    public ColorsPanel() {
        JCheckBox cb1 = new JCheckBox("Red");
        JCheckBox cb2 = new JCheckBox("Green");
        JCheckBox cb3 = new JCheckBox("Blue");
        add(cb1);
        add(cb2);
        add(cb3);
    }
}


class FlavorsPanel extends JPanel {

    public FlavorsPanel() {
        JComboBox<String> jcb = new JComboBox<String>();
        jcb.addItem("Vanila");
        jcb.addItem("Chocolate");
        jcb.addItem("Strawberry");
        add(jcb);
    }
}