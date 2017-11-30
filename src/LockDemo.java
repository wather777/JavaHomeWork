import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by s_chernykh on 06.06.2017.
 */
class LockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        new LockThread(lock, "A");
        new LockThread(lock, "B");
    }
}

class Shared2 {
    static int count = 0;
}

class LockThread implements Runnable {
    String name;
    ReentrantLock lock;

    public LockThread( ReentrantLock lock,String name) {
        this.name = name;
        this.lock = lock;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println(name + " ожидает блокирования счетчика");
        lock.lock();
        System.out.println(name + " блокирует счетчик");
        Shared2.count++;
        System.out.println(name + ": " + Shared2.count);
        System.out.println(name + " go to sleep");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(name + " unlock count");
            lock.unlock();
        }

    }
}
