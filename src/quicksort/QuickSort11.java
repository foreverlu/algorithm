package quicksort;

import java.util.Arrays;
import utils.ArrUtils;

/**
 * @author caoweiwei
 * @date 2021/11/4  下午3:23
 */
public class QuickSort11 {

    public static void main(String[] args) {
        int[] arr = ArrUtils.generateArr(10, 100);
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr,int left,int right){
        if(left>=right){
            return;
        }

        int l=left,r=right;
        int v = arr[left];

        while (l<r){
            while(l<r && arr[r]>=v){
                r--;
            }
            if(l<r){
                int t = arr[r];
                arr[r] = arr[l];
                arr[l] = t;
                l++;
            }
            while(l<r&& arr[l]<v){
                l++;
            }
            if(l<r){
                int t = arr[r];
                arr[r] = arr[l];
                arr[l] = t;
                r--;
            }


        }

        quickSort(arr,left,l-1);
        quickSort(arr,l+1,right);

    }

}
