package bubblesort;

import java.util.Arrays;
import utils.ArrUtils;

/**
 * @author caoweiwei
 * @date 2021/9/23  上午9:29
 */
public class BubbleSort2 {

    public static void main(String[] args) {
        int[] arr = ArrUtils.generateArr(10, 100);
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr){
        int size = arr.length;
        for(int i=0;i<size;i++){
            boolean flag = false;
            for(int j=0;j<size-1;j++){
                if(arr[j]<arr[j+1]){
                    int t = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = t;
                    flag = true;
                }
            }
            if(!flag){break;}

        }
    }

}
