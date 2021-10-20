package heapsort;

import java.util.Arrays;
import utils.ArrUtils;

/**
 * @author caoweiwei
 * @date 2021/9/27  上午9:35
 *
 * 堆排序总结：
 * 1. 利用数组来存储，如果根结点在0的位置，那么第i个节点的子节点分别是 2*i+1 和 2*i+2
 *    如果根节点在1的位置，那么第i个节点的子节点分别是2*i和2*i+1
 * 2. 利用堆排序首先要构建一个堆（大顶堆：子节点的值小于父节点的完全二叉树）
 *    构建堆又可以自下而上和自上而下两种方式
 *    1）自下而上：从第一个非叶子节点开始，比较和子节点的大小，如果小于子节点，则交换位置。并且将继续向下比较直到到达叶子节点
 *    2）自上而下：思路差不多
 * 3. 构建好堆之后就可以对堆进行排序
 *    1）将堆顶元素和最后一个元素交换位置，这样最大的元素就处于数组的尾部
 *    2）交换完位置后，将最后一个元素排除，剩下的元素重新构建堆
 *    3) 重复1，2步，直至完成
 */
public class Heap {

    public static void main(String[] args) {
        int[] arr = ArrUtils.generateArr(10, 100);
        System.out.println(Arrays.toString(arr));
        heapSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));


    }

    public static void heapSort(int[] arr, int n) {
        if(arr==null || arr.length<1){
            return;
        }
        //构建堆
        for(int i = (n-2)/2;i>=0;i--)
        buildHeap(arr, n,i);
        System.out.println(Arrays.toString(arr));
        sort(arr,n);
    }

    private static void sort(int[] arr,int n){
        if(n<1) return;
        //堆顶的元素是最大的，替换到最后
        int t = arr[0];
        arr[0] = arr[n-1];
        arr[n-1] = t;

        buildHeap(arr, n-1, 0);

        sort(arr,n-1);
    }

    private static void buildHeap(int[] arr, int n,int i) {
        while (true){
            int max = i;
            if((2*i+1)<n && arr[i]<arr[2*i+1]){
                max = 2*i+1;
            }
            if((2*i+2)<n && arr[max] < arr[2*i+2]){
                max = 2*i+2;
            }
            if(max == i) break;

            int t = arr[i];
            arr[i] = arr[max];
            arr[max] = t;
            i = max;
        }
    }


}
