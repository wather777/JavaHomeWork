import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by s_chernykh on 26.05.2017.
 */
public class TextFieldDemo extends Applet implements ActionListener,KeyListener {

    TextField name, pass;



    @Override
    public void init() {
        Label namep = new Label("Name: ", Label.RIGHT);
        Label passp = new Label("Password: ", Label.RIGHT);
        name = new TextField(12);
        pass = new TextField(8);
        pass.setEchoChar('*');
        add(namep);
        add(name);
        add(passp);
        add(pass);

        name.addActionListener(this);
        pass.addActionListener(this);
        name.addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }


    @Override
    public void paint(Graphics g) {
        g.drawString("Name: "+name.getText(),6,60);
        g.drawString("Selected text in name: "+name.getSelectedText(),6,80);
        g.drawString("Password: "+pass.getText(),6,100);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
