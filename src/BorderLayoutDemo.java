import java.applet.Applet;
import java.awt.*;

/**
 * Created by s_chernykh on 26.05.2017.
 */
public class BorderLayoutDemo extends Applet {
    @Override
    public void init() {
        setLayout(new BorderLayout());

        add(new Button("Top button"), BorderLayout.NORTH);
    add(new Label("сюда можно поместить сообщение нижненго колонтитута"), BorderLayout.SOUTH);
    add(new Button("rigth button"), BorderLayout.EAST);
    add(new Button("Left button"), BorderLayout.WEST);


    String msg = "asdklasdkas;k" +
            "a d" +
            "asd" +
            " as" +
            "d" +
            " as" +
            "d\n" +
            " " +
            "as" +
            "d" +
            "" +
            "" +
            "d" +
            "" +
            "asdasdasdasdasdasdasdasdasdas";

    add(new TextArea(msg), BorderLayout.CENTER);
}
}
