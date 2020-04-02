package mergesort;

import java.util.Arrays;
import java.util.Random;

public class MergeSort4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for(int i=0;i<arr.length;i++){
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        sort(arr,0,arr.length-1,temp);
    }

    private static void sort(int[] arr, int left, int right, int[] temp) {
        int mid = (left+right)/2;
        int l = left,m=mid+1;
        sort(arr,left,mid,temp);
        sort(arr,m,right,temp);
        merge(left,right,arr,temp);


    }

    private static void merge(int left,int right,int[] arr,int[] temp) {
        int mid = (left+right)/2;

        int l = left ,m=mid+1;
        int t=0;
        while (l<=mid && m<=right){
            if(arr[l] >= arr[m]){
                temp[t++] = arr[m++];

            }else {
                temp[t++] = arr[l++];
            }
        }
        while (l<mid) temp[t++] = arr[l++];
        while (m<right) temp[t++] = arr[m++];
        t = 0;
        while (left<=right){
            arr[left++] = temp[t++];
        }
    }
}
