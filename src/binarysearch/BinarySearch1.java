package binarysearch;

import quicksort.QuickSort8;
import utils.ArrUtils;

import java.util.Arrays;




//递归实现二分查找
public class BinarySearch1 {
    public static void main(String[] args) {
        int[] arr = ArrUtils.generateNoRepeatArr(10,100);
        System.out.println(Arrays.toString(arr));
        int value = arr[3];
        QuickSort8.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        int i = binarySearch(arr,value,0,arr.length-1);
        System.out.println(i);
    }

    public static int binarySearch(int[] arr,int value,int low,int high){

        if(low <= high){
            int mid = low + ((high-low)>>>1);
            if(arr[mid] == value){
                return mid;
            }else if(arr[mid]>value){
                return binarySearch(arr,value,low,mid-1);
            }else return binarySearch(arr,value,mid+1,high);
        }

        return -1;
    }
}
