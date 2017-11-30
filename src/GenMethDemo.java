/**
 * Created by s_chernykh on 10.04.2017.
 */
public class GenMethDemo {

    static <T, V extends T> boolean isIn(T x, V[] y) {
        for (int i=0; i < y.length; i++)
            if(x.equals(y[i])) return true;

        return false;
    }


    public static void main(String[] args) {
        Integer nums[]={1,2,3,4,5};

        if(isIn(2,nums))
            System.out.println("2 contains in nums");

        if(!isIn(7,nums))
            System.out.println("7 not contains in nums");

        System.out.println();

        String strs[] = {"один","два","три","четыре","пять"};

        if(isIn("два",strs))
            System.out.println("два содержится в strs");

        if(!isIn("sadsad",strs))
            System.out.println("asdasda не содержится в strs");
    }

}
