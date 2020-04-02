package quicksort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort6 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for(int i=0;i<arr.length;i++){
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int left, int right) {
        int m = left,l=left,r=right;
        int key = arr[m];
        while (left<right){
            while (m<right && arr[right]>key) right--;
            if(arr[right]<key){
                arr[left++] = arr[right];
                arr[right] = key;
                m = right;
            }
            while (m>left && arr[left]<key) left++;
            if(arr[left]>key){
                arr[right--] = arr[left];
                arr[left] = key;
                m = left;
            }
        }
        if(l<m){
            quickSort(arr,l,m);
        }
        if(m+1<r){
            quickSort(arr,m+1,r);
        }
    }

}
