import java.util.Arrays;

/**
 * Created by s_chernykh on 11.04.2017.
 */
public class SortString {

    static String arr[] = {"Now","is","the","time","for","all","good","men","to","come","to","the","aid","of","their","country"};

    public static void main(String[] args) {
        for(int j = 0;j<arr.length;j++) {
            for( int i = j+1;i<arr.length;i++) {
                System.out.println("arr[i]: "+arr[i]+"         arr[j]: "+arr[j]);
                if(arr[i].compareTo(arr[j]) <0) {
                    System.out.println(arr[i]+" меньше "+arr[j]);
                    String t =arr[j];
                    arr[j] = arr[i];
                    arr[i]=t;
                    System.out.println(Arrays.toString(arr));
                }
            }

            System.out.println(arr[j]);

        }

    }
}
