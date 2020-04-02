package bubblesort;

import utils.ArrUtils;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = ArrUtils.generateArr(10,100);
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        int t = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                  t = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = t;
                }
            }
        }
    }
}
