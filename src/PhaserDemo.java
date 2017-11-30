import java.util.concurrent.Phaser;

/**
 * Created by s_chernykh on 05.06.2017.
 */
 class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int curPhase;

        System.out.println("Starting");

        new MyThread(phaser, "A");
        new MyThread(phaser, "B");
        new MyThread(phaser, "C");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " Complete");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " Complete");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " Complete");

        phaser.arriveAndDeregister();

        if (phaser.isTerminated()) {
            System.out.println("The Phaser is terminated");
        }
    }

    static class MyThread implements Runnable {
        Phaser phaser;
        String name;

        public MyThread(Phaser phaser, String name) {
            this.phaser = phaser;
            this.name = name;
            phaser.register();
            new Thread(this).start();

        }

        @Override
        public void run() {
            System.out.println("Thread " + name + " Beginning Phase One");
            phaser.arriveAndAwaitAdvance();



            System.out.println("Thread " + name + " Beginning Phase Two");
            phaser.arriveAndAwaitAdvance();


            System.out.println("Thread " + name + " Beginning Phase Three");
            phaser.arriveAndDeregister();

        }
    }

}
