package mergesort;

import utils.ArrUtils;

import java.util.Arrays;

public class MergeSort9 {
    public static void main(String[] args) {
        int[] arr = ArrUtils.generateArr(10,100);
        System.out.println(Arrays.toString(arr));
        int[] temp = new int[arr.length];
        mergeSort(arr,0,arr.length-1,temp);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr,int left,int right,int[] temp){
        int l=left,r=right;
        int m = (l+r)/2;
        if(l<m){
            mergeSort(arr,l,m,temp);
        }
        if(m+1<r){
            mergeSort(arr,m+1,r,temp);
        }

        merge(arr,left,right,temp);
    }

    private static void merge(int[] arr, int left, int right, int[] temp) {
        int m = (left+right)/2;
        int l=left,r=m+1;
        int k = left;
        while (l<=m && r<=right){
            if(arr[l]<arr[r]){
                temp[k++] = arr[l++];
            }else temp[k++] = arr[r++];
        }
        while (l<=m) temp[k++] = arr[l++];
        while (r<=right) temp[k++] = arr[r++];

        while (left<=right){
            arr[left] = temp[left++];
        }

    }
}
