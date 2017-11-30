/**
 * Created by s_chernykh on 03.04.2017.
 */

class A {
    int i, j;
}

class B {
    int i, j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;
}


public class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        if(a instanceof A)
            System.out.println("a its A");
        if(b instanceof B)
            System.out.println("b its B");
        if(c instanceof C)
            System.out.println("c its C");
        if(c instanceof A)
            System.out.println("c может быть приведен к A");
        if(a instanceof C)
            System.out.println("a может быть приведен к C");

        System.out.println();

        //compare child type

        A ob;
        ob =d;
        System.out.println("ob link to d");
        if(ob instanceof D)
            System.out.println("ob its D");
        System.out.println();

        ob = c;
        System.out.println("ob link to c");

        if(ob instanceof D)
            System.out.println("ob может быть приведен к D");
        else
            System.out.println("ob не может быть приведен к D");

        if (ob instanceof A)
            System.out.println("ob может быть приведен к A");
        System.out.println();

        if(a instanceof Object)
            System.out.println("a может быть приведен к Object");
        if(b instanceof Object)
            System.out.println("b может быть приведен к Object");
        if(c instanceof Object)
            System.out.println("c может быть приведен к Object");
        if(d instanceof Object)
            System.out.println("d может быть приведен к Object");
    }
}
