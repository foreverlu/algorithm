import java.util.Arrays;

/**
 * @Author caoww
 * @Date 2025/8/28 08:33
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * Output: [1,2,2,3,5,6]
 **/
public class MergeSortedArray {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {2,5,6};
        System.out.println(Arrays.toString(merge(arr1,arr2)));
    }


    public static int[] merge(int[] arr1,int[] arr2){
        int i = 0;
        int j = 0;
        int[] res = new int[arr1.length + arr2.length];
        int k = 0;
        while(i<arr1.length && j<arr2.length){
            int r1 = arr1[i];
            int r2 = arr2[j];

            if(r1>=r2){
                res[k++]=r2;
                j++;
            }else{
                res[k++]=r1;
                i++;
            }
        }

        while(i<arr1.length){
            res[k++]=arr1[i++];
        }

        while(j<arr2.length){
            res[k++]=arr2[j++];
        }

        return res;
    }

}
