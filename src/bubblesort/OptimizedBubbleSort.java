package bubblesort;

import java.util.Arrays;
import utils.ArrUtils;

/**
 * @author Czero
 * @date 2020/4/13 11:01 优化的冒泡排序，如果没有位置交换就停止比较
 */
public class OptimizedBubbleSort {

    public static void main(String[] args) {
        int[] arr = ArrUtils.generateArr(100, 1000);
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    private static void bubbleSort(int[] arr) {
        int size = arr.length;
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

}
