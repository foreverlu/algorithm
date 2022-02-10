package binarysearch;

import java.util.Arrays;
import java.util.List;
import utils.ArrUtils;

/**
 * @author caoweiwei
 * @date 2021/10/21  下午1:55
 *
 */
public class BinarySearch10 {

    public static void main(String[] args) {
        int[] arr = ArrUtils.generateArr(10, 10);
//        int[] arr = {0, 2, 2, 3, 3, 4, 5, 5, 6, 9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr, 2));

    }

    public static int binarySearch(int[] arr,int k){

        int low = 0,high = arr.length-1;

        while (low<high){
            int mid = (high-low)/2 + low;
            if(arr[mid]>=k){
                high = mid;
            }else {
                low = mid+1;
            }
        }

        return low;
    }

    public static int binarySearch1(int[] arr,int k){

        int low = 0,high = arr.length-1;

        while (low<high){
            int mid = (high-low)/2 + low;
            if(arr[mid]<=k){
                low = mid;
            }else {
                high = mid-1;
            }
        }

        return low;
    }


    //1，3，5，6     2
    public static int binarySearch2(int[] arr,int k){

        int low = 0,high = arr.length-1;

        while (low<high){
            int mid = (high-low)/2 + low;
            if(arr[mid]==k){

                return mid;
            }else if(arr[mid]<k) {
                low = mid+1;
            }else {
                if((mid==0)||(arr[mid-1]<k)) return mid;
                high = mid-1;
            }
        }

        return low;
    }

}
