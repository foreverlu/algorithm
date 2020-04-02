package insertsort;

import utils.ArrUtils;

import java.util.Arrays;

public class InsertSort2 {
    public static void main(String[] args) {
        int[] arr = ArrUtils.generateArr(10,100);
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {
        int key = 0;
        int k = 0;
        for(int i=0;i<arr.length;i++){
            key = arr[i];
            k = i;
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    arr[j]=arr[j-1];
                    k = j-1;
                }
            }
            arr[k] = key;
        }
    }
}
