
/**
 * Created by s_chernykh on 20.04.2017.
 */
import java.util.*;

class Watcher1 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("update() вызван, count равен "+((Integer)arg).intValue());
    }
}

class Watcher2 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if(((Integer)arg).intValue()==0)
            System.out.println("Done"+'\7');
    }
}

class BeingWatched extends Observable {
    void counter (int period) {
        for(;period >=0;period--) {
            setChanged();
            notifyObservers(new Integer(period));
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println("Wait interapted");
            }
        }
    }
}



public class TwoObservers {
    public static void main(String[] args) {
        BeingWatched ob = new BeingWatched();
        Watcher1 watcher1 = new Watcher1();
        Watcher2 watcher2 = new Watcher2();

        ob.addObserver(watcher1);
        ob.addObserver(watcher2);
        ob.counter(10);

    }


}
