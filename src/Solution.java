import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by s_chernykh on 10.11.2017.
 *
 * [2,3,1,1,4]
 */
public class Solution {




    public static void main(String[] args) {
 /*       Random r = new Random();
        int Low = 10;
        int High = 100;
        int[] arr =new int[100] ;
        for (int i = 0; i < 100  ; i++) {
            arr[i]=(r.nextInt(High-Low));
        }*/

        int[] arr ={9,8,2,2,0,2,2,0,4,1,5,7,9,6,6,0,6,5,0,5};

        System.out.println(Arrays.toString(arr));

        int pos=0;
        int jumps=0;

        System.out.println(arr.length+" length");

        while (pos!=arr.length-1) {
            jumps++;
            if (pos+arr[pos]>=arr.length)
                System.out.println("Jumps:"+jumps);

            System.out.println("pos:"+pos);
            //int maxJump =arr[pos];
            String str="";
            Integer nextPos = 0;
            Integer max=0;

            for (int i = 0; i <arr[pos] ; i++) {

                if(pos+arr[pos + i]>=arr.length-1)
                {
                    jumps++;
                    System.out.println("Jumps:"+jumps);
                break;
                }

                if (pos + 1 + i<arr.length) {
                    if (max <= arr[pos + 1 + i]) {
                        max=arr[pos + 1 + i];
                        nextPos = pos + 1 + i;


                        System.out.println("cur nextPos:" + nextPos + "\nMax:" + max);
                    }

                    str += Integer.toString(arr[pos + 1 + i]);
                }
                else
                    break;
            }
            System.out.println(str);



            pos=nextPos;

            //lif (jumps>5){break;}
        }
        System.out.println("Jumps:"+jumps);

    }

}


/*

System.out.printf("cur pos %d\n",pos);
        int nextBestPos=0;
        int maxJump=arr[pos];
        String str="";
        for (int i = pos+1; i < pos+maxJump; i++) {
        str += String.valueOf(arr[i]);
        if (arr[i] > maxJump) {
        maxJump = arr[i];
        nextBestPos = i;

        }
        }

        System.out.println("str:"+str+" maxJump:"+maxJump+" nextBestPos:"+nextBestPos);

        jumps++;
        pos=nextBestPos;
        System.out.println("pos:"+pos);
        if(jumps>10){break;}*/
