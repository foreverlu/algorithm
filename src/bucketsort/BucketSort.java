package bucketsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import utils.ArrUtils;

/**
 * @author Czero
 * @date 2020/4/19 16:34 桶排序
 */
public class BucketSort {

    private static int bound = 10;

    public static void main(String[] args) {
        int[] arr = ArrUtils.generateArr(10,10);
        System.out.println(Arrays.toString(arr));
        bucketSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bucketSort(int[] arr) {
        ArrayList[] bucket = getBucket(bound);

        for (int i = 0; i < arr.length; i++) {
            bucket[arr[i]].add(arr[i]);
        }

        int count = 0;
        for(int j=0;j<bucket.length;j++){
            List<Integer> oneBucket = bucket[j];
            for(Integer num : oneBucket){
                arr[count++] = num;
            }
        }
    }

    private static ArrayList[] getBucket(int n) {
        ArrayList[] bucket = new ArrayList[n];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList();
        }
        return bucket;
    }
}
