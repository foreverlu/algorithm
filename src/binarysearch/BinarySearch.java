package binarysearch;

import quicksort.QuickSort4;
import quicksort.QuickSort8;
import utils.ArrUtils;

import java.util.Arrays;




//最简单的二分查找,不考虑数据重复
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = ArrUtils.generateNoRepeatArr(10,100);
        int key = arr[9];
        QuickSort8.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

        int i = binarySearch(arr,key);
        System.out.println(i);
    }

    private static int binarySearch(int[] arr, int key) {
        return binarySearch(arr,key,0,arr.length-1);
    }

    private static int binarySearch(int[] arr, int key, int low, int high) {
        while (low<=high){
            int mid = low + ((high-low)>>>1);
            if(arr[mid]==key) return mid;
            else if(arr[mid]>key){
                high = mid -1;
            }else {
                low = mid +1;
            }
        }
        return -1;
    }
}
