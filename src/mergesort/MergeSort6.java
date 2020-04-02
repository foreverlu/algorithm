package mergesort;

import java.util.Arrays;
import java.util.Random;

public class MergeSort6 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for(int i=0;i<arr.length;i++){
            arr[i] = random.nextInt(100);
        }
        int[] temp = new int[arr.length];
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1,temp);
        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSort(int[] arr, int left, int right,int[] temp) {
        int m = (right+left)/2;
        if(left<m){
            mergeSort(arr,left,m,temp);
        }
        if(right>m+1){
            mergeSort(arr,m+1,right,temp);
        }

        merge(arr,left,right,temp);
    }

    private static void merge(int[] arr, int left, int right, int[] temp) {
        int m = (right+left)/2;
        int r = m+1,l=left;
        int t=l;
        while(l<=m && r<=right){
            if(arr[l]>arr[r]){
                temp[t++] = arr[l++];
            }else {
                temp[t++] = arr[r++];
            }
        }

        while (l<=m) temp[t++] = arr[l++];
        while (r<=right) temp[t++] = arr[r++];
        t=left;
        for(int i=left;i<=right;i++){
            arr[left++] = temp[t++];
        }

    }
}
