package mergesort;

import java.util.Arrays;
import utils.ArrUtils;

/**
 * @author Czero
 * @date 2020/4/11 16:52 来吧，时隔一年再来写归并排序，希望一次成功
 */
public class MergeSort11 {

    public static void main(String[] args) {
        int[] arr = ArrUtils.generateArr(10, 100);
        System.out.println(Arrays.toString(arr));
        int[] tmp = new int[arr.length];
        mergeSort(arr,tmp,0,arr.length-1);
        System.out.println(Arrays.toString(tmp));
    }

    public static void mergeSort(int[] arr,int[] temp,int left,int right){
        int l = left,r = right;
        int mid = (right-left)/2+left;

        if(l<mid){
            mergeSort(arr,temp,l,mid);
        }
        if(mid<right-1){
            mergeSort(arr,temp,mid+1,right);
        }

        merge(arr,temp,left,right,mid);

    }

    private static void merge(int[] arr, int[] temp, int left, int right, int mid) {

        int l = left,r = mid+1;
        int p = l;
        while(l<=mid && r<=right){
            if(arr[l]<=arr[r]){
                temp[p++] = arr[l++];
            }else {
                temp[p++]=arr[r++];
            }
        }

        while(l<=mid){
            temp[p++] = arr[l++];
        }
        while (r<=right){
            temp[p++] = arr[r++];
        }

        for(int i = left;i<=right;i++){
            arr[i] = temp[i];
        }
    }

}