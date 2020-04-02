package quicksort;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class QuickSort2 {
    public static void main(String[] args) {
        Random random = new Random();
        long[] arr = new long[1000000];
        for(int i =0 ;i< arr.length;i++){
            arr[i] = random.nextInt(10000000);
        }

        long[] arr2 = arr;
        long[] arr3 = arr;

        System.out.println(Arrays.toString(arr));
        long t1 = System.currentTimeMillis();
        quickSort(arr,0,arr.length-1);
        long t2 = System.currentTimeMillis();
        //System.out.println(Arrays.toString(arr));
        System.out.println((t2-t1));
        long t3 = System.currentTimeMillis();
        //bublleSort(arr2);
//        MergeSort.mergeSort(arr2);
        long t4 = System.currentTimeMillis();
        System.out.println((t4-t3));
        //System.out.println(Arrays.toString(arr2));

        long t5 = System.currentTimeMillis();
        Arrays.sort(arr3);
        long t6 = System.currentTimeMillis();
        System.out.println(t6-t5);


    }

    private static void bublleSort(long[] arr2) {
        long temp = 0;
        for(int i=0;i<arr2.length-1;i++){
            for(int j=0;j<arr2.length-1-i;j++){
                if(arr2[j] > arr2[j+1]){
                    temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = temp;
                }
            }

        }

    }


    private static void quickSort(long[] arr, int l, int h) {
        long key = arr[(int)l];
        int low = l, high = h;
        long temp = 0;
        while (low < high){
            while (low < high && arr[(int)high] >= key) high--;
            if(low < high){
                temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
            }

            while (low < high && arr[low]<= key) low++;
            if(low < high){
                temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        if(low > l) quickSort(arr,l,low-1);
        if(high < h) quickSort(arr,high+1,h);

    }



}
