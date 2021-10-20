package insertsort;

import java.util.Arrays;
import utils.ArrUtils;

/**
 * @author caoweiwei
 * @date 2021/9/23  上午9:35
 */
public class InsertSort4 {

    public static void main(String[] args) {
        int[] arr = ArrUtils.generateArr(10, 100);
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int value = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if(arr[j]>value){
                    arr[j+1] = arr[j];
                    arr[j] = value;
                }else {
                    break;
                }
            }
        }
    }

}
