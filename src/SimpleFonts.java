import sun.font.FontScaler;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

/**
 * Created by s_chernykh on 22.05.2017.
 */
public class SimpleFonts extends Applet {

    Font font;
    String msg;

    GraphicsEnvironment ge =
            GraphicsEnvironment.getLocalGraphicsEnvironment();

    String Fonts [] = ge.getAvailableFontFamilyNames();

    int fcount=Fonts.length;
    int f =0;



    @Override
    public void init() {
        font = new Font("Dialog", Font.PLAIN, 12);
        msg="Dialog";
        setFont(font);

        addMouseWheelListener(new MouseAdapter() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {

                System.out.println("whell");
                int fsize = font.getSize();

                if(e.getWheelRotation()>0 ){
                    font=new Font(Fonts[f],Font.PLAIN,fsize+1);
                } else
                    font=new Font(Fonts[f],Font.PLAIN,fsize-1);
                setFont(font);
                repaint();




            }
        });
        addMouseListener(new MouseAdapter() {




            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("click");

                if(f<fcount){
                    font=new Font(Fonts[f],Font.PLAIN,18);
                    msg=Fonts[f];
                    setFont(font);
                    repaint();
                    f++;
                }
            }
        });
    }



    @Override
    public void paint(Graphics g) {
        g.drawString(msg,100,100);
    }
}
