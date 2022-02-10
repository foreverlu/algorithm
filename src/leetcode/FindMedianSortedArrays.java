package leetcode;

/**
 * @author caoweiwei
 * @date 2021/10/22  下午6:02
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 */
public class FindMedianSortedArrays {

    public static void main(String[] args) {
        findMedianSortedArrays(new int[]{1,3},new int[]{2});
    }


    public static double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] t = new int[m+n];
        int i=0,j=0,k=0;
        while (i<m && j<n){
            if(nums1[i]>nums2[j]){
                t[k++] = nums2[j++];
            }else {
                t[k++] = nums1[i++];
            }
        }

        while (i<m){
            t[k++] = nums1[i++];
        }

        while (j<n){
            t[k++] = nums2[j++];
        }
        int s = (m+n);
        if(s%2==0){
            return (t[s/2-1]+t[s/2])/2.0;
        }else {
            return t[s/2];
        }
    }














    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] t = new int[m+n];
        int i=0,j=0,k=0;
        while (i<m && j<n){
            if(nums1[i]>nums2[j]){
                t[k++] = nums2[j++];
            }else {
                t[k++] = nums1[i++];
            }
        }

        while (i<m){
            t[k++] = nums1[i++];
        }

        while (j<n){
            t[k++] = nums2[j++];
        }
        int s = (m+n);
        if(s%2==0){
            return (t[s/2-1]+t[s/2])/2.0;
        }else {
            return t[s/2];
        }
    }

}
