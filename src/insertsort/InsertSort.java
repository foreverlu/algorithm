package insertsort;

import java.util.Arrays;
import java.util.Random;

//插入排序
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for(int i=0;i<arr.length;i++){
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length-1;i++){
            insertSort(arr,i);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void insertSort(int[] arr,int num) {
        int temp=Integer.MAX_VALUE;
        int key = arr[num+1];
        for(int i=0;i<=num;i++){
            if(arr[i]>key){
                temp=i;
                break;
            }
        }

        for(int i = num+1;i>temp;i--){
            arr[i] = arr[i-1];
        }
        if(temp!=Integer.MAX_VALUE){
            arr[temp] = key;
        }

    }
}
