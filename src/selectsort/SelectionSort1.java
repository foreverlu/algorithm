package selectsort;

import java.util.Arrays;
import utils.ArrUtils;

/**
 * @author caoweiwei
 * @date 2021/9/23  上午11:55
 */
public class SelectionSort1 {

    public static void main(String[] args) {
        int[] arr = ArrUtils.generateArr(10, 100);
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i=0;i<n;i++){
            int max = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[max]){
                    max = j;
                }
            }
            int t = arr[i];
            arr[i] = arr[max];
            arr[max] = t;
        }
    }
}
