package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArrUtils {
    public static int[] generateArr(int length,int bound){
        int[] arr = new int[length];
        Random random = new Random();
        for(int i=0;i<arr.length;i++){
            arr[i] = random.nextInt(bound);
        }
        return arr;
    }

    public static int[] generateNoRepeatArr(int length,int bound){
        int[] arr = new int[length];
        Random random = new Random();
        int temp = 0;
        boolean[] flag = new boolean[bound];
        for(int i=0;i<arr.length;i++){
            while (flag[temp]==true){
                temp =  random.nextInt(bound);
            }
            arr[i] = temp;
            flag[temp] = true;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateNoRepeatArr(100,100);
        System.out.println(Arrays.toString(arr));
    }
}
