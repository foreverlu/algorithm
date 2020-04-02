package quicksort;

import utils.ArrUtils;

import java.util.Arrays;

public class QuickSort8 {
    public static void main(String[] args) {
        int[] arr = ArrUtils.generateNoRepeatArr(100,100);
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right) {
        int l = left,r = right;
        int key = arr[left];
        while (l<r){
             while (l<r&&arr[r]>=key) r--;
            if(arr[r]<key){
                arr[l++] = arr[r];
                arr[r] = key;
            }
            while (l<r&&arr[l]<=key) l++;
            if(arr[l]>key){
                arr[r--] = arr[l];
                arr[l] = key;
            }
        }

        if(left<l)
            quickSort(arr,left,l-1);
        if(r<right)
            quickSort(arr,r+1,right);
//        int key = arr[left];
//        int l = left,r = right;
//        while (l < r){
//            while (l<r && arr[r]>=key) r--;
//            if(key > arr[r] && l<r){
//                arr[l++] = arr[r];
//                arr[r] = key;
//            }
//            while (l<r && arr[l] <= key) l++;
//            if(key<arr[l] && l<r ){
//                arr[r--] = arr[l];
//                arr[l] = key;
//            }
//        }
//
//        if(l>left) quickSort(arr,left,l-1);
//        if(r<right) quickSort(arr,r+1,right);


    }
}
