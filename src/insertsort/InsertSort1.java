package insertsort;

import utils.ArrUtils;

import java.util.Arrays;
import java.util.Random;

public class InsertSort1 {
    public static void main(String[] args) {
        int[] arr = ArrUtils.generateArr(10,100);
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int k = 0;
            int key = arr[i];
            for(int j=i;j>0;j--){

                if(arr[j]<arr[j-1]){
                    arr[j]=arr[j-1];
                    k=j-1;
                }else break;
                arr[k] = key;
            }

        }
    }
}
