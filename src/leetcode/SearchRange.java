package leetcode;

import java.util.Arrays;
import utils.ArrUtils;

/**
 * @author caoweiwei
 * @date 2022/2/20  上午10:41
 */
public class SearchRange {

    public static void main(String[] args) {
        int[] arr = ArrUtils.generateArr(10,10);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(searchRange(arr,4)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int [] res = new int[2];
        res[0] = findFirst(nums,target);
        res[1] = findLast(nums,target);
        return res;
    }

    private static int findLast(int[] arr,int target){
        if(null == arr){
            return -1;
        }
        int n = arr.length;
        int l=0,r=n-1;
        while(l<=r){
            int m = (r-l)/2+l;
            if(arr[m]>target){
                r = m-1;
            }else if(arr[m]<target){
                l = m+1;
            }else{
                if(m==n-1 || arr[m+1]!=target){
                    return m;
                }
                l= m+1;
            }
        }
        return -1;
    }
    private static int findFirst(int[] arr,int target){
        if(null == arr){
            return -1;
        }
        int n = arr.length;
        int l=0,r=n-1;
        while(l<=r){
            int m = (r-l)/2+l;
            if(arr[m]>target){
                r = m-1;
            }else if(arr[m]<target){
                l = m+1;
            }else{
                if(m==0 || arr[m-1]!=target){
                    return m;
                }
                r= m-1;
            }
        }
        return -1;
    }

}
