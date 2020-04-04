package binarysearch;

import java.util.Arrays;
import quicksort.QuickSort8;
import utils.ArrUtils;

public class BinarySearch6 {


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

    public static int binarySearch(int[] arr, int key, int left, int right) {
        while(left <=right){
            int mid = left+((right - left) >>>1);
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid] > key){
                right = mid-1;
            }
            if(arr[mid]<key){
                left = mid+1;
            }
        }
        return -1;
    }

}
