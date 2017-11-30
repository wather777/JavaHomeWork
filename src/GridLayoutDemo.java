import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by s_chernykh on 26.05.2017.
 */
public class GridLayoutDemo extends Applet implements MouseMotionListener,ActionListener {
    static final int n = 4;
    Button[] allbutt= new Button[15];


    @Override
    public void init() {
        setLayout(new GridLayout(n, n));

        setFont(new Font("SansSerif", Font.BOLD, 24));


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = i * n + j;
                if(k>0) {
                     allbutt[i]=(Button) add(new Button("" + k));
                    allbutt[i].addActionListener(this);
                }
            }
        }




        this.addMouseMotionListener(this);
    }

    @Override
    public void mouseDragged(MouseEvent e) {


        showStatus("Point X Y: "+e.getX()+" "+e.getY());

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
    }
}
