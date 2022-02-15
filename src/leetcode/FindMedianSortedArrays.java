package leetcode;

/**
 * @author caoweiwei
 * @date 2021/10/22  下午6:02
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 */
public class FindMedianSortedArrays {

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays2(new int[]{1, 2}, new int[]{3, 4}));
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


    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        boolean flag = (n1+n2)%2==0 ?true:false;
        if(flag){
            return (findKElement(nums1,nums2,(n1+n2)/2+1)+ findKElement(nums1,nums2,(n1+n2)/2))/2.0;

        }else{
            return findKElement(nums1,nums2,(n1+n2)/2+1);
        }

    }

    private static int findKElement(int[] nums1,int[] nums2,int k){
        int index1 = 0,index2=0;

        while(true){
            int n1 = nums1.length;
            int n2 = nums2.length;
            if(index1==n1){
                return nums2[index2+k-1];
            }
            if(n2==index2){
                return nums1[index1+k-1];
            }

            if(k==1){
                return Math.min(nums1[index1],nums2[index2]);
            }
            int m = k/2;

            int half = k / 2;
            int newIndex1 = Math.min(index1 + half, n1) - 1;
            int newIndex2 = Math.min(index2 + half, n2) - 1;


            if(nums1[newIndex1]>=nums2[newIndex2]){
                k -= (newIndex2 - index2 + 1);
                index2 = newIndex2 + 1;
            }else{
                k -= (newIndex1 - index1 + 1);
                index1 = newIndex1 + 1;
            }

        }

    }

}
