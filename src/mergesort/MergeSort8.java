package mergesort;

import utils.ArrUtils;

import java.util.Arrays;

public class MergeSort8 {
    public static void main(String[] args) {
        int[] arr = ArrUtils.generateArr(10,100);
        int[] temp = new int[arr.length];
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1,temp);
        System.out.println(Arrays.toString(arr));
    }
    private static void mergeSort(int[] arr,int left,int right,int[] temp){
        int m = (right+left)/2;
        int l = left,r = right;
        if(l<m){
            mergeSort(arr,left,m,temp);
        }
        if(m+1<r){
            mergeSort(arr,m+1,right,temp);
        }

        merger(arr,left,right,temp);
    }

    private static void merger(int[] arr, int left, int right, int[] temp) {
        int m = (right+left)/2;
        int l=left,r=m+1;
        int t=left;
        while (l<=m && r<=right){
            if(arr[l]<arr[r]){
                temp[left++] =arr[l++];
            }else {
                temp[left++] = arr[r++];
            }
        }
        while (l<=m)
            temp[left++] = arr[l++];
        while (r<=right)
            temp[left++] = arr[r++];

        while (t<=right){
            arr[t] = temp[t++];
        }

    }

}
