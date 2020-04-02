package mergesort;

import java.util.Arrays;
import java.util.Random;

//归并排序练习
public class MergeSort5 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for(int i=0;i<arr.length;i++){
            arr[i] = random.nextInt(1000);
        }
        int temp[] = new int[arr.length];
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1,temp);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr,int left,int right,int[] temp){
        int mid = (right+left) / 2;

        if(left<mid){
            mergeSort(arr,left,mid,temp);
        }
        if(mid+1<right){
            mergeSort(arr,mid+1,right,temp);
        }
        merge(arr,left,right,temp);

    }

    private static void merge(int[] arr, int left, int right, int[] temp) {

        int mid = (right+left)/2;
        int l=left,r=mid+1;
        int t = left;
        while (l <= mid && r <=right){
            if(arr[l]<arr[r]){
                temp[left++] = arr[l++];
            }else {
                temp[left++] = arr[r++];
            }
        }
        while (l<=mid)
            temp[left++] = arr[l++];

        while (r<=right)
            temp[left++] = arr[r++];

        for(int i= t; i<=right;i++){
            arr[i] = temp[i];
        }

    }


}
