package mergesort;


import java.util.Arrays;
import java.util.Random;

//归并排序
public class MergeSort {
    public static void main(String[] args) {
        long[] arr = new long[10];
        Random random = new Random();
        for(int i=0;i<arr.length;i++){
            arr[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(long[] arr) {
        long[] temp = new long[arr.length];
        sort(arr,0,arr.length-1,temp);
    }
    private static void sort(long[] arr,int left,int right,long[] temp){

        if(left < right){
            int mid = (left+right) / 2;
            sort(arr,left,mid,temp);
            sort(arr,mid+1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }

    private static void merge(long[] arr, int left, int mid, int right,long[] temp) {
        int l = left,r = right,m=mid+1,t=0;
        while (l <= mid && r >= m){
            if(arr[l] <= arr[m]){
                temp[t++] = arr[l++];
            }else {
                temp[t++] = arr[m++];
            }
        }

        while (mid-l >=0){
            temp[t++] = arr[l++];
        }



        while (r - m >= 0 ){
            temp[t++] = arr[m++];
        }

        t=0;
        while (left <= right){
            arr[left++] = temp[t++];
        }

    }

}
