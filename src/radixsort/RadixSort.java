package radixsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author Czero
 * @date 2020/4/19 15:44 基数排序，对11位手机号排序
 */
public class RadixSort {

    private static int n = 11;

    public static void main(String[] args) {
        String[] phones = generatePhoneArray(n, 100000);
        System.out.println("origin array: " + Arrays.toString(phones));

//        long t1 = System.currentTimeMillis();
//        radixSort(phones);

        long t2 = System.currentTimeMillis();

        Arrays.sort(phones);
        long t3 = System.currentTimeMillis();
        System.out.println("sorted array: " + Arrays.toString(phones));

//        System.out.println("radix time cost: " + (t2 - t1) + "ms");
        System.out.println("java sort cost: " + (t3 - t2) + "ms");
    }

    private static void radixSort(String[] arr) {
        for (int index = n - 1; index >= 0; index--) { //index代表指向手机号的每一位
            //桶
            ArrayList[] bucket = getBucket(10);
            //将arr分桶
            for (int i = 0; i < arr.length; i++) {
                int bucketNumber = arr[i].charAt(index) - 48;
                bucket[bucketNumber].add(arr[i]);
            }

            int count = 0;
            for (int j = 0; j < bucket.length; j++) {
                List<String> oneBucket = bucket[j];
                for (String num : oneBucket) {
                    arr[count++] = num;
                }
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

    private static String[] generatePhoneArray(int n, int length) {
        Random random = new Random();
        String[] phones = new String[length];
        for (int i = 0; i < length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(random.nextInt(10));
            }
            phones[i] = sb.toString();
        }
        return phones;
    }
}
