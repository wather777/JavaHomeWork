import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by s_chernykh on 26.05.2017.
 */
public class CardLayoutDemo extends Applet implements ActionListener, MouseListener {
    Checkbox winXp, win7, solaris, mac;
    Panel osCards;
    CardLayout cardLayout;
    Button Win,Other;

    @Override
    public void init() {
        Win = new Button("Winodws");
        Other = new Button("Other");
        add(Win);
        add(Other);

        cardLayout = new CardLayout();
        osCards = new Panel();
        osCards.setLayout(cardLayout);

        winXp = new Checkbox("Windows XP", null, true);
        win7 = new Checkbox("Windows 7");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("Mac OS");

        Panel winPan = new Panel();
        winPan.add(win7);
        winPan.add(winXp);

        Panel otherPan = new Panel();
        otherPan.add(solaris);
        otherPan.add(mac);

        osCards.add(winPan, "Windows");
        osCards.add(otherPan, "Other");

        add(osCards);
        Win.addActionListener(this);
        Other.addActionListener(this);

        addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Win) {
            cardLayout.show(osCards, "Windows");
        } else {
            cardLayout.show(osCards, "Other");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        cardLayout.next(osCards);
            }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
