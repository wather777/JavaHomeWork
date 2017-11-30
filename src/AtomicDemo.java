import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by s_chernykh on 06.06.2017.
 */
public class AtomicDemo {
    public static void main(String[] args) {
        new AtomThread("A");
        new AtomThread("B");
        new AtomThread("C");
    }
}


class Shared3 {
    static AtomicInteger ai = new AtomicInteger(0);
}


class AtomThread  implements Runnable{
    String name;

    public AtomThread() {
    }

    AtomThread(String a) {
        name = a;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Start " + name);
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " полученно: " + Shared3.ai.getAndSet(i));
        }
    }
}