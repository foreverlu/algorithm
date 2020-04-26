package insertsort;

import java.util.Arrays;
import utils.ArrUtils;

/**
 * @author Czero
 * @date 2020/4/13 15:53 插入排序
 */
public class InsertSort3 {

    public static void main(String[] args) {
        int[] arr = ArrUtils.generateArr(10, 100);
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            int v = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > v) {
                    arr[j + 1] = arr[j];
                    arr[j] = v;
                } else {
                    break;
                }
            }
        }
    }

}
