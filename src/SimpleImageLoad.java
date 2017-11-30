import java.applet.Applet;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by s_chernykh on 29.05.2017.
 */
public class SimpleImageLoad extends Applet {
    Image img;

    @Override
    public void init() {
        try {
            img = getImage((new URL("http://xiostorage.com/wp-content/uploads/2015/10/test.png")),"test.png");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, this);
    }
}
