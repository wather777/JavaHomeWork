/**
 * Created by s_chernykh on 19.04.2017.
 */
import java.util.*;

public class ArraysDemo {
    public static void main(String[] args) {
        int array[] =new int[10];
        for (int i = 0; i < 10 ; i++) {
            array[i]= - 3 * i;
        }

        System.out.print("Source: ");
        display(array);

        Arrays.sort(array);
        System.out.print("Sorted arr: ");
        display(array);

        Arrays.fill(array,2,6,-1);
        System.out.print("После fill(): ");
        display(array);

        Arrays.sort(array);
        System.out.print("repit sort");
        display(array);

        System.out.print(" -9 index in position ");
        int index = Arrays.binarySearch(array, -1);
        System.out.println(index);

    }

    static void display(int[] array) {
        for (int i:array
             ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
