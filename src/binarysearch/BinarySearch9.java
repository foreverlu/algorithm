package binarysearch;

import java.util.Arrays;
import utils.ArrUtils;

/**
 * @author caoweiwei
 * @date 2021/9/24  下午1:31
 * 1. 查找第一个等于给定值
 * 2. 查找第一个小于给定值
 */
public class BinarySearch9 {

    public static void main(String[] args) {
        int[] arr = ArrUtils.generateArr(10, 10);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(binarySearch1(arr, 4, 0, arr.length - 1));
        System.out.println(binarySearch2(arr, 4, 0, arr.length - 1));

    }

    /**
     * 查找第一个等于给定值
     * @return
     */
    public static int binarySearch1(int[] arr,int k,int left,int right){
        if(left>right){
            return -1;
        }
        int m = left + ((right-left)>>1);
        if(arr[m]==k){
            do{
                m--;
            }
            while (m>0&&arr[m]==k);
            return m+1;
        }else if(arr[m]>k){
            return binarySearch1(arr,k,left,m-1);
        }else {
            return binarySearch1(arr, k, m+1, right);
        }
    }

    public static int binarySearch2(int[] arr,int k,int left,int right){
        if(left>right){
            return right;
        }
        int m = left + ((right-left)>>1);
        if(arr[m]==k){
            do{
                m--;
            }
            while (m>0&&arr[m]==k);
            return m;
        }else if(arr[m]>k){
            return binarySearch2(arr,k,left,m-1);
        }else {
            return binarySearch2(arr, k, m+1, right);
        }
    }


}
