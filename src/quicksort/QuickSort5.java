package quicksort;

import java.util.Arrays;
import java.util.Random;

//快排练习
public class QuickSort5 {
    public static void main(String[] args) {
        long[] arr = new long[100000];
        Random random = new Random();
        for(int i=0;i<arr.length;i++){
            arr[i] = random.nextLong();
        }
        System.out.println("ori: "+ Arrays.toString(arr));
        long t1=System.currentTimeMillis();
        sort(arr,0,arr.length-1);
        System.out.println("sorted: "+ Arrays.toString(arr));
        System.out.println(System.currentTimeMillis()-t1);
    }

    public static void sort(long[] arr,int left,int right){
        int l = left,r=right;
        int k=l;
        long key = arr[k];
        while (r>l){
            while (r>l && arr[r]>key) r--;
            if(arr[r]<key){
                arr[l++] = arr[r];
                arr[r] = key;
                k=r;
            }

            while (r>l && arr[l]<key) l++;
            if(arr[l] > key){
                if(l<k){
                    arr[r--] = arr[l];
                    arr[l] = key;
                }

            }
        }
        if(right > left){
            if(left<l)
                sort(arr,left,l);
            if(right>r)
                sort(arr,r+1,right);
        }


    }
}
