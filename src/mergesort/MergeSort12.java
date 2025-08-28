package mergesort;

import java.util.Arrays;
import utils.ArrUtils;

/**
 * @author caoweiwei
 * @date 2022/2/25  上午9:47
 */
public class MergeSort12 {

    public static void main(String[] args) {

        int[] arr = ArrUtils.generateArr(10, 100);
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1,new int[arr.length]);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr,int left,int right,int[] temp){
        int l=left,r=right;
        int m = (r-l)/2+l;
        if(l<m){
            mergeSort(arr,l,m,temp);
        }
        if(m+1<r){
            mergeSort(arr,m+1,r,temp);
        }

        merge(arr,left,right,temp);
    }

    private static void merge(int[] arr, int left, int right, int[] temp) {
        int m = (right-left)/2+left;
        int l1 = left,l2=m+1;
        int r1= m,r2=right;
        int p = left;
        while(l1<=r1 && l2<=r2){
            if(arr[l1]<=arr[l2]){
                temp[p++]=arr[l1++];
            }else{
                temp[p++]=arr[l2++];
            }
        }
        while (l1<=r1){
            temp[p++]=arr[l1++];
        }
        while(l2<=r2){
            temp[p++]=arr[l2++];
        }

        for(int i=left;i<=right;i++){
            arr[i]=temp[i];
        }
    }

}
