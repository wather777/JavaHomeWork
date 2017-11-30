import java.util.concurrent.Semaphore;

/**
 * Created by s_chernykh on 05.06.2017.
 */
 class SemDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);

        new IncThread(sem, "A");
        new DecThread(sem, "B");
    }
}

class Shared{
    static int count = 0;
}

class IncThread implements Runnable {
    String name;
    Semaphore sem;

    public IncThread(Semaphore s, String n) {
        sem = s;
        name = n;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Запуск" + name);

        try {
            System.out.println(name + " ожидает разрешения");
            sem.acquire();
            System.out.println(name + " получает разрешения");

            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.println(name + ": " + Shared.count);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " освобождает разрешения");
        sem.release();
    }


}

class DecThread implements Runnable {
    String name;
    Semaphore sem;

    DecThread(Semaphore s, String n) {
        sem = s;
        name = n;
        new Thread(this).start();

    }

    @Override
    public void run() {
        System.out.println("Starting " + name);

        try {
            System.out.println(name + " ожидает разрешения");
            sem.acquire();
            System.out.println(name + " получает разрешения");

            for (int i = 0; i < 5; i++) {
                Shared.count--;
                System.out.println(name + ": " + Shared.count);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " освобождает разрешения");
        sem.release();
        }
    }


