package leetcode;

import java.util.Arrays;

/**
 * @author caoweiwei
 * @date 2021/9/28  下午4:31
 * 求两个数组的交集
 */
public class TwoArrIntersection {

    public static int[] intersection(int[] nums1, int[] nums2) {
        //先排序
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] result = new int[nums1.length>nums2.length ?nums1.length :nums2.length];
        int k=0;
        int i=0,j=0;
        while (i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                result[k++] = nums1[i];
                do{
                    i++;
                }while ( i<nums1.length &&nums1[i]==nums1[i-1]);
                do{
                    j++;
                }while (j<nums2.length && nums2[j]==nums2[j-1]);
            }else if(nums1[i]>nums2[j]){
                j++;
            }else {
                i++;
            }
        }
        return Arrays.copyOfRange(result, 0, k);
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = {2,3,4,5,5};
        System.out.println(Arrays.toString(intersection(a,b)));
    }
}
