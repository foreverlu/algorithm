package mergesort;

import java.util.Arrays;
import java.util.Random;

public class MergeSort3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
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
    private static void sort(int[] arr,int left,int right,int[] temp){
        int mid = (right+left)/2;
        int l = left, r = right,m = mid+1;
        if(l < right){
            sort(arr,l,mid,temp);
            sort(arr,m,r,temp);
            merge(arr,left,mid,right,temp);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int l = left,r = right,m=mid+1;
        int t = 0;
        while (l<=mid && m<=right){
            if(arr[l] <= arr[m]){
                temp[t++] = arr[l++];
            }else{
                temp[t++] = arr[m++];
            }
        }
        while (l <= mid){
            temp[t++] = arr[l++];
        }

        while (m <= right)
            temp[t++] = arr[m++];
        t=0;
        while (left <= right){
            arr[left++] =temp[t++];
        }
    }

}
