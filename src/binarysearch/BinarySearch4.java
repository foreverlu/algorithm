package binarysearch;

import quicksort.QuickSort8;
import utils.ArrUtils;

import java.util.Arrays;

//查找第一個大於等於value的位置
public class BinarySearch4 {
    public static void main(String[] args) {
        int[] arr = ArrUtils.generateArr(10,20);
        System.out.println(Arrays.toString(arr));
        int value = arr[3];
        QuickSort8.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        int i = binarySearch(arr,0,arr.length-1,value);
        System.out.println(i);
    }

    public static int binarySearch(int[] arr,int low,int high,int value){
        while (low <= high){
            int mid = low+((high - low)>>>1);
            if(arr[mid] < value){
                low = mid+1;
            }else {
                if(mid==0 || arr[mid-1]<value){
                    return mid;
                }
                high = mid-1;
            }
        }

        return -1;
    }
}
