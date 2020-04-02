package countSort;

import java.util.Arrays;
import java.util.Random;

//计数排序练习
//基本思路没问题,这里有一个优化的方案,
//就是计数的数组的长度可以用max-min+1来计算得出
/**
 * 基本思路:
 * 1. 得出待排序数组arr 的最大值 max 和最小值 min
 * 2. 计算 计数数组count的长度 = max -min +1
 * 3. 遍历arr,统计出各个值得数量,添加到计数数组count中 注:坐标为arr[i]-min
 * 4. 将count数组中的值累加,每个位置的值为,这个坐标值在arr数组中的最大位置,及小于等于这个坐标值的数在arr有多少个
 * 5. 将arr遍历,按照在count中的位置信息,将arr复制到temp数组中,temp数组就是排序后的结果,temp[arr[--count[arr[i]]] = arr[i]     ;
 */


public class CountSort {
    public static final int ARRLENGTH = 10;
    public static void main(String[] args) {

        int[] arr = new int[ARRLENGTH];
        Random random = new Random();
        for(int i=0;i<arr.length;i++){
            arr[i] = random.nextInt(50) + 40;
        }
        System.out.println(Arrays.toString(arr));
        int temp[] = new int[arr.length];
        countSort(arr,temp);
        System.out.println(Arrays.toString(temp));
    }

    private static void countSort(int[] arr,int[] temp) {
        //获取arr的最大值和最小值,计算偏差值
        int max = arr[0],min = arr[0];
        for(int i : arr){
            if(i > max) max = i;
            if(i < min) min = i;
        }
        int p = max - min + 1;//优化计数数组的长度
        int[] count = new int[p];

        for(int i : arr){
            count[i-min]++;
        }

        for(int i=1 ;i<count.length;i++){
            count[i]=count[i]+count[i-1];
        }


        for(int i=0;i<arr.length;i++){

            temp[--count[arr[i]-min]]=arr[i];
        }




    }
}
