package quicksort;

import java.util.Arrays;

/**
 * @Author caoww
 * @Date 2025/9/10 08:51
 **/
public class QuickSort13 {


    public static void main(String[] args) {

        int[] arr = {3,6,8,10,1,2,1};

        quickSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr,int left,int right){

        if(left>=right){
            return;
        }

        int p = patition(arr,left,right);
        quickSort(arr,left,p-1);
        quickSort(arr,p+1,right);
    }


    public static int patition(int[] arr,int l,int r){


        int p = arr[l];

        while(l<r){
            while(r>l && p<=arr[r]){
                r--;
            }
            arr[l]=arr[r];

            while(r>l && p>=arr[l]){
                l++;
            }

            arr[r] = arr[l];
        }
        arr[l] = p;
        return l;
    }


//// 用第一个元素将待排序序列划分分为左右两个部分
//int Partition(int array[], int low, int high)
//{
//    // 把第一个元素当作枢轴
//    int pivot = array[low];
//
//    // 用low、high搜索枢轴的最终位置，
//    // 当low 与 high 相碰的时候和或者 low 溢出 high 的时候结束
//    while (low < high)
//    {
//        // 比枢轴小的元素移动到左端
//        while (low < high && array[high] >= pivot)
//        {
//            high--;
//        }
//        array[low] = array[high];
//
//        // 比枢轴大的元素移动到右端
//        while (low < high && array[low] <= pivot)
//        {
//            low++;
//        }
//        array[high] = array[low];
//    }
//    array[low] = pivot;
//    return low;
//}
//
//// 快速排序
//void QuickSort(int array[], int low, int high)
//{
//    if (low < high)
//    {
//        int pivot = Partition(array, low, high);
//        QuickSort(array, low, pivot - 1);
//        QuickSort(array, pivot + 1, high);
//    }
//}
}
