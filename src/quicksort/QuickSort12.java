package quicksort;

import java.util.Arrays;
import utils.ArrUtils;

/**
 * @author caoweiwei
 * @date 2022/2/25  上午9:34
 */
public class QuickSort12 {

    public static void main(String[] args) {
        int[] arr = ArrUtils.generateArr(10, 10);
        System.out.println(Arrays.toString(arr));

        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr,int left,int right){
        int l=left,r=right;
        int k = arr[l];

        while(l<r){
            while(l<r && arr[r]>=k){
                r--;
            }
            if(l<r && arr[r]<k){
                int t= arr[r];
                arr[r]=k;
                arr[l++]=t;
            }
            while(l<r && arr[l]<k){
                l++;
            }
            if(l<r && arr[l]>=k){
                int t = arr[l];
                arr[l]=k;
                arr[r--]=t;
            }
        }
        if(left<l) {
            quickSort(arr, left, l);
        }
        if(l+1<right) {
            quickSort(arr, l + 1, right);
        }

    }

}
