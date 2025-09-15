package binarysearch;

/**
 * @Author caoww
 * @Date 2025/9/15 08:59
 *
 * 二分查找
 **/
public class BinarySearch12 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr,5));
    }
    public static int binarySearch(int[] arr,int k){

        int m = arr.length / 2;

        int l = 0,r = arr.length - 1;

        int res = -1;
        while(l<=r){
            if(arr[m]>k){
                r = m-1;
            }else if (arr[m]<k){
                l = m+1;
            }else {
                res = m;
                break;
            }

            m = (l+r)/2;
        }
        return res;
    }

}
