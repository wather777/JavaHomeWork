import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by s_chernykh on 26.05.2017.
 */
public class TextAreaDemo extends Applet implements MouseListener {

    TextArea text ;
    @Override
    public void init() {
        String val ="Результатов: примерно 20 800 000 (0,39 сек.) \n" +
                "Результаты поиска\n" +
                "Методы wait и notify | Java - METANIT.COM\n" +
                "https://metanit.com/java/tutorial/8.5.php\n" +
                "1 янв. 2016 г. - Методы wait и notify и синхронизация потоков в Java.\n" +
                "Взаимодействие между потоками в Java. Wait и notify. | Блог еще ...\n" +
                "initialize.ru/vzaimodeistvie-mejdu-potikami-java/\n" +
                "22 авг. 2012 г. - Представим ситуацию, что у нас многопотоковое приложение, написанное на Java. Есть некий класс, выполняющий какое-либо ...\n" +
                "javatalks.ru / Помогите с wait / notify / notifyall\n" +
                "javatalks.ru/topics/27244\n" +
                "11 нояб. 2011 г. - Помогите с wait / notify / notifyall. ... В Java с каждым объектом ассоциирован монитор. Состояние монитора - это 1) логический флажок ...\n" +
                "Многопоточность. Wait / notify и приоритеты при захвате монитора ...\n" +
                "www.javenue.info/post/91\n" +
                "8 мар. 2011 г. - Продолжаю разрушать мифы по поводу многопоточности в Java. ... Wait sets are used by the methods wait, notify, and notifyAll of class ...\n" +
                "skipy.ru: Записки трезвого практика -> Техника -> Синхронизация ...\n" +
                "www.skipy.ru/technics/synchronization.html\n" +
                "28 июл. 2011 г. - Введение; Потоки в Java; Управление выполнением потоков; Мониторы; Взаимные ..... Object (методы wait/notify ) и java.lang.Thread .\n" +
                "Пример использования wait(), notify() и notifyAll() в Java ...\n" +
                "javadevblog.com/primer-ispol-zovaniya-wait-notify-i-notifyall-v-java.html\n" +
                "1 нояб. 2015 г. - Класс Object в Java содержит три final метода для взаимодействия потоков. Это методы wait() , notify() и notifyAll() . В этой статье мы ...\n" +
                "Java notify() and wait() examples - Program Creek\n" +
                "www.programcreek.com/2009/02/notify-and-wait-example/\n" +
                "Перевести эту страницу\n" +
                "This article contains two code examples to demonstrate Java concurrency. They stand for very typical usage. By understanding them, you will have a better ...\n" +
                "А как же всё-таки работает многопоточность? Часть I - Хабрахабр\n" +
                "https://habrahabr.ru/post/143237/\n" +
                "28 мая 2012 г. - Как известно, каждый объект в java имеет свой монитор, и потому, ... wait set монитора и ожидание того, как произойдёт notify . Выход ...\n" +
                "Многопоточность в Java / Хабрахабр\n" +
                "https://habrahabr.ru/post/164487/\n" +
                "31 дек. 2012 г. - В языке Java, после создания процесса, выполнение главного ...... про синхронизацию потоков прекрасными методами wait и notify.\n" +
                "Вы посещали эту страницу несколько раз (2). Дата последнего посещения: 20.02.17\n" +
                "Ответы на вопросы на собеседование Multithreading (часть 1 ...\n" +
                "https://jsehelper.blogspot.com › Interview › Java Developer › Multithreading\n" +
                "12 янв. 2016 г. - Вопросы на собеседование Junior Java Developer. Вопросы и ответы ... Системная синхронизация с использованием wait/notify. Поток ...\n" +
                "Вместе с notify java часто ищут";

        text = new TextArea(val, 10, 100);
        add(text);
        text.addMouseListener(this);

    }








    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println(text.getSelectedText());
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
