import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by s_chernykh on 24.05.2017.
 */
public class LabelDemo extends Applet implements ActionListener {
    @Override
    public void init() {
        Label one = new Label("One",Label.LEFT);
        Label two = new Label("two");
        Label three = new Label("three",Label.RIGHT);

        add(one);
        add(two);
        add(three);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
