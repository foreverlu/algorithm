package binarysearch;

import quicksort.QuickSort8;
import utils.ArrUtils;

import java.util.Arrays;

//二分查找,有重复元素,找出数组中第一个与value相同的值的位置
public class BinarySearch3 {
    public static void main(String[] args) {
        int[] arr = ArrUtils.generateArr(10,10);
        System.out.println(Arrays.toString(arr));
        int key = arr[3];
        System.out.println(key);
        QuickSort8.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        int i = binarySearch(arr,key,0,arr.length-1);
        System.out.println(i);
    }
    private static int binarySearch(int[] arr,int key,int low,int high){
        while (low<=high){
            int mid = (low+high)>>>1;
            if(arr[mid]>key){
                high = mid-1;
            }else if(arr[mid]<key){
                low = mid+1;
            }else {
                if(mid==0 || arr[mid-1]!=key) return mid;
                high = mid-1;
            }
        }
        return -1;
    }
}
