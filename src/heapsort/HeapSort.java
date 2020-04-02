package heapsort;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {8,4,5,7,6,9,3,22,332,23,212,321,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    private static void sort(int[] arr){
        for(int i=arr.length-1;i>0;i--){
            heapSort(arr,0,i);
        }
    }

    //堆调整
    //i节点的子节点为2i+1和2i+2
    //最后一个父节点为arr.length/2-1
    private static void heapSort(int[] arr,int s,int e){
        //因为最后一个节点可能只有一个节点,比较特殊,单独拿出来考虑
        int length = e-s+1;
        int k = length/2-1;
        if(arr[k]>arr[2*k+1]){
            swap(arr,k,2*k+1);
        }
        if(length%2==1){
            if(arr[2*k+2]<arr[k]){
                swap(arr,k,2*k+2);
            }
        }
        //从倒数第二个父节点开始
        for(int i=length/2-2;i>=0;i--){
            if(arr[i]>arr[2*i+1]){
                swap(arr,i,2*i+1);
            }
            if(arr[i]>arr[2*i+2]){
                swap(arr,i,2*i+2);
            }
        }
        swap(arr,s,e);


    }

    private static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
