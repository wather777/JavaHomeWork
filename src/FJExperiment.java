import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 * Created by s_chernykh on 06.06.2017.
 */
class Transform extends RecursiveAction {
    int seqThreshold;
    double[] data;

    int start, end;

    Transform (double [] vals, int s, int e, int t) {
        data = vals;
        start = s;
        end = e;
        seqThreshold = t;
    }

    @Override
    protected void compute() {
        if ((end - start) < seqThreshold) {
            for (int i = start; i < end; i++) {
                if((data[i] %2)==0)
                    data[i]=Math.sqrt(data[i]);
                else
                    data[i] = Math.cbrt(data[i]);
            }
        }
        else {
            int mid = (start + end) / 2;

            invokeAll(new Transform(data, start, mid, seqThreshold), new Transform(data, mid, end, seqThreshold));
        }
    }
}

public class FJExperiment {

    public static void main(String[] args) {
        int pLevel=2;
        int threshold=1000;

        long beginT, endT;

        ForkJoinPool fjp = new ForkJoinPool(pLevel);

        double[] nums = new double[100000];

        for (int i = 0; i < nums.length; i++)
            nums[i] = (double) i;

        Transform task = new Transform(nums, 0, nums.length, threshold);

        beginT = System.nanoTime();

        fjp.execute(task);

        while (!task.isDone()) {
            System.out.println(fjp);
        }

        endT = System.nanoTime();


        System.out.println("Level of parallelism: "+pLevel);
        System.out.println("threshold: "+threshold);
        System.out.println("Elapsed time: "+(endT-beginT)+" ns");


        System.out.println();

    }
}
