package binarysearch;

import java.util.Arrays;
import utils.ArrUtils;

/**
 * @author caoweiwei
 * @date 2022/2/8  上午9:37
 */
public class BinarySearch11 {
    public static void main(String[] args) {
        int[] arr = ArrUtils.generateArr(10, 10);
//        int[] arr = {0, 2, 2, 3, 3, 4, 5, 5, 6, 9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch13(arr, 4));

    }

    private static int binarySearch11(int[] arr,int target){
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid = (r-l)/2+l;
            if(arr[mid]==target){
                return mid;
            }else if (arr[mid]>target) {
                r=mid-1;
            }else {
                l=mid+1;
            }
        }
        return -1;
    }

    //有重复查找第一个
    private static int binarySearch12(int[] arr,int target){
        int l=0,r=arr.length-1;

        while (l<=r){
            int mid = (r-l)/2+l;
            if(arr[mid]>target){
                r=mid-1;
            }else if(arr[mid]<target){
                l=mid+1;
            }
            else{
                if(mid==0 || arr[mid-1]!=target){
                    return mid;
                }
                r--;
            }
        }
        return -1;
    }

    //查找第一个小于
    private static int binarySearch13(int[] arr,int target){
        int l=0,r=arr.length-1;

        while (l<=r){
            int mid = (r-l)/2+l;
            if(arr[mid]>=target) {
                r = mid - 1;
            } else{
                if(mid==arr.length-1 || arr[mid+1]>=target){
                    return mid;
                }
                l++;
            }
        }
        return -1;
    }

}
