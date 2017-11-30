import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by s_chernykh on 06.06.2017.
 */
 class SimpExec {
    public static void main(String[] args) {
        CountDownLatch cd1 = new CountDownLatch(5);
        CountDownLatch cd2 = new CountDownLatch(5);
        CountDownLatch cd3 = new CountDownLatch(5);
        CountDownLatch cd4 = new CountDownLatch(5);
        ExecutorService es = Executors.newFixedThreadPool(2);


        System.out.println("Start....");


        es.execute(new MyThread(cd1, "A"));
        es.execute(new MyThread(cd1, "B"));
        es.execute(new MyThread(cd1, "C"));
        es.execute(new MyThread(cd1, "D"));

        try {
            cd1.await();
            cd2.await();
            cd3.await();
            cd4.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        es.shutdown();
        System.out.println("zavershenie...");
    }
}


class MyThread implements Runnable {
    String name;
    CountDownLatch latch;

    public MyThread(CountDownLatch latch,String name) {
        this.name = name;
        this.latch = latch;
        new Thread(this);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            latch.countDown();
        }
    }
}