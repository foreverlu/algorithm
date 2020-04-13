package quicksort;

import java.util.Arrays;
import utils.ArrUtils;

/**
 * @author Czero
 * @date 2020/4/11 16:03
 */
public class QuickSort10 {

    public static void main(String[] args) {
        int[] arr = ArrUtils.generateArr(10, 100);
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int left, int right) {
        int l = left, r = right;
        int k = arr[l];
        while (l<r) {
            while (l<r && arr[r]>=k) r--;
            if(l<r && arr[r]<k){
                arr[l++] = arr[r];
                arr[r] = k;
            }
            while (l<r && arr[l]<=k) l++;
            if(l<r && arr[l]>k){
                arr[r--] = arr[l];
                arr[l] = k;
            }
        }
        if (left < l ) {
            quickSort(arr, left, l - 1);
        }
        if (right > r ) {
            quickSort(arr, r + 1, right);
        }
    }

}
