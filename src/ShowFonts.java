import java.applet.Applet;
import java.awt.*;

/**
 * Created by s_chernykh on 22.05.2017.
 */
public class ShowFonts extends Applet {
    @Override
    public void paint(Graphics g) {
        String msg="";
        String FontList[];
        GraphicsEnvironment ge =
                GraphicsEnvironment.getLocalGraphicsEnvironment();
        FontList = ge.getAvailableFontFamilyNames();
        for (String s:FontList
             ) {
            msg+=s+" ";
        }
        g.drawString(msg,4,16);
    }
}
