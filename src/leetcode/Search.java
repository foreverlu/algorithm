package leetcode;

import java.util.Stack;

/**
 * @author caoweiwei
 * @date 2021/11/2  下午12:58 整数数组 nums 按升序排列，数组中的值 互不相同 。
 * <p>
 * 在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转，使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。 例如， [0,1,2,4,5,6,7] 在下标 3
 * 处经旋转后可能变为 [4,5,6,7,0,1,2] 。
 * <p>
 * 给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。
 * <p>
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/search-in-rotated-sorted-array 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Search {

    public int search(int[] nums, int target) {
        if (nums.length < 1) {
            return -1;
        }
        int left = 0, right = nums.length - 1;

        while (left<right){
            int mid = (right-left)/2+left;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[0]<nums[mid]){
                if(nums[0]<=target && nums[mid]>target){
                    right=mid-1;
                }else {
                    left = mid+1;
                }
            }//[4,5,6,7,0,1,2]
            else{
                if(nums[nums.length-1]>=target &&nums[mid]<target){
                    left = mid +1;
                }else {
                    right = mid-1;
                }
            }


        }
        if(nums[left]==target) return left;
        return -1;
    }


}
