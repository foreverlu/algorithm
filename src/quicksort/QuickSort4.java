package quicksort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[100];
        for(int i=0;i<arr.length;i++){
            arr[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void quickSort(int[] arr, int left, int right) {
        int key = arr[left];
        int l = left,r = right;
        while (l < r){
            while (l<r && arr[r]>=key) r--;
            if(key > arr[r] && l<r){
                arr[l++] = arr[r];
                arr[r] = key;
            }
            while (l<r && arr[l] <= key) l++;
            if(key<arr[l] && l<r ){
                arr[r--] = arr[l];
                arr[l] = key;
            }
        }

        if(l>left) quickSort(arr,left,l-1);
        if(r<right) quickSort(arr,r+1,right);
    }
}
