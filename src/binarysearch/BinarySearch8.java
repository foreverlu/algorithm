package binarysearch;

import java.util.Arrays;
import utils.ArrUtils;

/**
 * @author caoweiwei
 * @date 2021/9/24  下午1:07 二分查找，无重复
 */
public class BinarySearch8 {

    public static void main(String[] args) {
        int[] arr = ArrUtils.generateNoRepeatArr(50, 100);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr,30,0,arr.length-1));
        System.out.println(binarySearch1(arr,30));
    }

    public static int binarySearch(int[] arr, int k, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;

        if(arr[mid]==k){
            return mid;
        }else if(arr[mid]>k){
            return binarySearch(arr,k,left,mid-1);
        }else {
           return binarySearch(arr, k, mid+1, right);
        }
    }

    public static int binarySearch1(int[] arr,int k){
        int l = 0,r = arr.length-1;
        while (l<=r){
            int m = l+(r-l)/2;
            if(arr[m]==k){
                return m;
            }else if(arr[m]>k){
                r=m-1;
            }else {
                l=m+1;
            }

        }
        return -1;
    }

}
