/**
 * Created by s_chernykh on 13.04.2017.
 */
class X {
    int a;
    float b;
}

class  Y extends X {
    double c;

}

public class RTTI {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        System.out.println( x.getClass().getName());

        System.out.println( y.getClass().getName());

        System.out.println( y.getClass().getSuperclass().getName());



    }
}
