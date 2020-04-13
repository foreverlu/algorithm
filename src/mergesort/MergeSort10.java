package mergesort;

import java.util.Arrays;
import utils.ArrUtils;

/**
 * @author Czero
 * @date 2020/4/11 16:52 来吧，时隔一年再来写归并排序，希望一次成功
 */
public class MergeSort10 {

    public static void main(String[] args) {
        int[] arr = ArrUtils.generateArr(10, 100);
        System.out.println(Arrays.toString(arr));
        int[] tmp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, tmp);
        System.out.println(Arrays.toString(tmp));
    }

    private static void mergeSort(int[] arr, int left, int right, int[] tmp) {
        int mid = (left+right)/2;
        if (left < mid) {
            mergeSort(arr, left, mid, tmp);
        }
        if (mid + 1 < right) {
            mergeSort(arr, mid + 1, right, tmp);
        }

        merge(arr, left, right, tmp);
    }

    private static void merge(int[] arr, int left, int right, int[] tmp) {
        int mid = (left+right)/2;
        int l = left, r = mid+1;
        int k = left;
        while (l <= mid && right >= r) {
            if ( arr[l] < arr[r]) {
                tmp[left++] = arr[l++];
            }
            else {
                tmp[left++] = arr[r++];
            }
        }
        while (l<=mid) tmp[left++] = arr[l++];
        while (r<=right) tmp[left++] = arr[r++];

        while (k<=right){
            arr[k]  = tmp[k++];
        }
    }


}
