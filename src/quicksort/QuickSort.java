package quicksort;

import java.util.Arrays;
import java.util.Random;

//快速排序算法演练
public class QuickSort {
    public static void main(String[] args){
        int[] ori = new int[10];
        Random random = new Random();
        for(int i=0;i<10;i++){
            ori[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(ori));
        int[] sorted = quickSort(ori,0,ori.length-1);
        System.out.println(Arrays.toString(sorted));
    }

    private static int[] quickSort(int[] ori,int low ,int high) {
        int l = low,h = high;
        int key = ori[l];
        int temp = 0;
        while (l < h){
            while (l<h && ori[h] >= key) h--;
            if(l<h){
                temp = ori[l];
                ori[l] = ori[h];
                ori[h] = temp;
                l++;
            }
            while(ori[l] <= key && l<h) l++;
            if(l<h){
                temp = ori[l];
                ori[l] = ori[h];
                ori[h] = temp;
                h--;
            }

        }


        if(low < l) quickSort(ori,low,l-1);
        if(high > h) quickSort(ori,l+1,high);
        return ori;

    }


}
