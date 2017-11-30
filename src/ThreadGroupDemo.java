/**
 * Created by s_chernykh on 14.04.2017.
 */
class NewThread extends Thread {
    boolean suspendFlag;

    NewThread(String threadname, ThreadGroup tgOb){
        super(tgOb, threadname);
        System.out.println("New thread: "+ this );
        suspendFlag=false;
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0;i--) {
                System.out.println(getName()+": "+i);
                Thread.sleep(1000);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        }catch (Exception e) {
            System.out.println("except in "+ getName());
        }
        System.out.println(getName() + " завершается.");
    }
    synchronized void  mysuspend(){
        suspendFlag=true;
    }
    synchronized void myresume(){
        suspendFlag=false;
        notify();
    }
}


public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup groupA = new ThreadGroup("Group A");
        ThreadGroup groupB = new ThreadGroup("Group B");

        NewThread ob1 = new NewThread("Один",groupA);
        NewThread ob2 = new NewThread("Два",groupA);
        NewThread ob3 = new NewThread("три",groupB);
        NewThread ob4 = new NewThread("четыре",groupB);

        System.out.println("\nВывод из list():");
        groupA.list();
        groupB.list();
        System.out.println();

        System.out.println("Прерывается группа А");
        Thread tga[] = new Thread[groupA.activeCount()];
        groupA.enumerate(tga);

        for (int i = 0; i < tga.length; i++) {
            ((NewThread)tga[i]).mysuspend();

        }

        try {
            Thread.sleep(4000);
        }catch (InterruptedException e) {
            System.out.println("Main thread interapted");
        }
        System.out.println("resume Group A");
        for (int i = 0; i <tga.length ; i++) {
            ((NewThread)tga[i]).myresume();

        }
        try {
            System.out.println("Wait thread stoping");
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        }catch (Exception e){
            System.out.println("main thread exception");
        }
        System.out.println("main thread close");
    }
}
