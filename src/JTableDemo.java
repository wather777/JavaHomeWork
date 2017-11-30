import javax.swing.*;

/**
 * Created by s_chernykh on 20.06.2017.
 */
public class JTableDemo extends JApplet {

    @Override
    public void init() {
        try {
            SwingUtilities.invokeAndWait(
                    new Runnable() {
                        @Override
                        public void run() {
                            makeGUI();
                        }
                    }
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void makeGUI() {
        String[] colHeads = {"Name", "Extension", "ID#"};

        Object[][] data = {
                {"Gail","23465","24324"},
                {"Gail2","22343465","24321234"},
                {"Gail3","23465432","24321234"},
                {"Gail4","23465","2438786724"},
                {"Gail5","223143465","24123324"},
                {"Gail6","23462345","24324"},
                {"Gail7","23465234","2114678324"},
                {"Gail8","23466455","24387924"},
                {"Gail9","234654","24356824"},
        };

        JTable table = new JTable(data, colHeads);

        JScrollPane jsp = new JScrollPane(table);

        add(jsp);
    }
}
