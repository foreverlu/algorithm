package bucketsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import utils.ArrUtils;

/**
 * @author Czero
 * @date 2020/4/19 16:34 桶排序
 */
public class BucketSort {

    private static int bound = 10;

    public static void main(String[] args) {
        int[] arr = ArrUtils.generateArr(10, bound);
        System.out.println("origin array: "+Arrays.toString(arr));
        bucketSort(arr);
        System.out.println("sorted array: "+Arrays.toString(arr));
    }

    private static void bucketSort(int[] arr) {
        //生成边界为bound的桶
        ArrayList[] bucket = getBucket(bound);

        //将array中的元素放入桶中
        for (int i = 0; i < arr.length; i++) {
            bucket[arr[i]].add(arr[i]);
        }

        int count = 0;
        for (int j = 0; j < bucket.length; j++) {
            List<Integer> oneBucket = bucket[j];
            for (Integer num : oneBucket) {
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
