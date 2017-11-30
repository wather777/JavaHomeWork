import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by s_chernykh on 29.05.2017.
 */

class SampleDialog extends Dialog implements ActionListener {

    public SampleDialog(Frame parent, String title) {
        super(parent, title);
        setLayout(new FlowLayout());
        setSize(300, 200);

        add(new Label("Press this button: "));
        Button button;
        add(button = new Button("Cancel"));
        button.addActionListener(this);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("This is in the dialog box", 10, 70);
    }
}


class MenuFrame extends Frame {
    String msg = "";
    CheckboxMenuItem debug, test;

    public MenuFrame(String title) {
        super(title);

        MenuBar mbar = new MenuBar();
        setMenuBar(mbar);


        Menu file = new Menu("File");
        MenuItem item1, item2, item3, item4, item5;
        file.add(item1 = new MenuItem("New..."));
        file.add(item2 = new MenuItem("Open..."));
        file.add(item3 = new MenuItem("Close"));
        file.add(item4 = new MenuItem("-"));
        file.add(item5 = new MenuItem("Quit..."));
        mbar.add(file);


        Menu edit = new Menu("Edit");
        MenuItem item6, item7, item8, item9;
        edit.add(item6 = new MenuItem("Cut"));
        edit.add(item7 = new MenuItem("Copy"));
        edit.add(item8 = new MenuItem("Paste"));
        edit.add(item9 = new MenuItem("-"));

        Menu sub = new Menu("Special");
        MenuItem item10, item11, item12;
        sub.add(item10 = new MenuItem("First"));
        sub.add(item11 = new MenuItem("Second"));
        sub.add(item12 = new MenuItem("Third"));
        edit.add(sub);

        debug = new CheckboxMenuItem("Debug");
        edit.add(debug);

        test = new CheckboxMenuItem("Testing");
        edit.add(test);
        mbar.add(edit);

        MyMenuHandler handler = new MyMenuHandler(this);


        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        item4.addActionListener(handler);
        item5.addActionListener(handler);
        item6.addActionListener(handler);
        item7.addActionListener(handler);
        item8.addActionListener(handler);
        item9.addActionListener(handler);
        item10.addActionListener(handler);
        item11.addActionListener(handler);
        item12.addActionListener(handler);
        debug.addItemListener(handler);
        test.addItemListener(handler);

        My2WindowAdapter adapter = new My2WindowAdapter(this);

        addWindowListener(adapter);
    }


    @Override
    public void paint(Graphics g) {
        g.drawString(msg, 10, 200);
        if (debug.getState())
            g.drawString("Debug is on.", 10, 220);
        else
            g.drawString("Debug is off.", 10, 220);

        if (test.getState())
            g.drawString("Test is on.", 10, 240);
        else
            g.drawString("Tets is off.", 10, 240);
    }

}


class My2WindowAdapter extends WindowAdapter {
    MenuFrame menuFrame;

    public My2WindowAdapter(MenuFrame menuFrame) {
        this.menuFrame = menuFrame;
    }

    @Override
    public void windowClosing(WindowEvent e) {
        menuFrame.dispose();
    }
}




class MyMenuHandler implements ActionListener, ItemListener {
    MenuFrame menuFrame;

    public MyMenuHandler(MenuFrame menuFrame) {
        this.menuFrame = menuFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = "You selected "+e.getActionCommand();
        if(e.getActionCommand().equals("New...")){
            msg += "New.";
            SampleDialog d = new SampleDialog(menuFrame, "New  Dialog Box");
            d.setVisible(true);
        } else {
            menuFrame.msg = msg;
            menuFrame.repaint();
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        menuFrame.repaint();
    }
}

public class DialogDemo extends Applet {
    Frame f;

    @Override
    public void init() {

        f = new MenuFrame("Menu demo");
        int w = 250;
        int h = 250;

        setSize(new Dimension(w, h));

        f.setSize(w, h);
        f.setVisible(true);
    }

    @Override
    public void start() {
        f.setVisible(true);
    }

    @Override
    public void stop() {
        f.setVisible(false);
    }
}






