package quicksort;

import utils.ArrUtils;

import java.util.Arrays;

public class QuickSort7 {
    public static void main(String[] args) {
        int[] arr = ArrUtils.generateArr(10,100);
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int left, int right) {
        int key = arr[left];
        int l=left,r=right;
        int k = left;
        while (left<right){
            while (arr[right]>key && left<right) right--;
            if(arr[right]<key){
                arr[left++] = arr[right];
                arr[right] = key;
                k = right;
            }
            while (arr[left]<key && left<right) left++;
            if(arr[left]>key){
                arr[right--] = arr[left];
                arr[left] = key;
                k=left;
            }
        }


        if(l<k){
            quickSort(arr,l,k);
        }
        if(k+1<r){
            quickSort(arr,k+1,r);
        }

    }
}
