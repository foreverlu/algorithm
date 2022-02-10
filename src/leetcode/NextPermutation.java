package leetcode;

import java.util.Arrays;

/**
 * @author caoweiwei
 * @date 2021/11/2  上午11:04 实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列（即，组合出下一个更大的整数）。
 * <p>
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 * <p>
 * 必须 原地 修改，只允许使用额外常数空间
 * <p>
 *
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/next-permutation 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * [1,3,2] 213
 * [1,2,3] 132
 */
public class NextPermutation {

    public static void main(String[] args) {
        nextPermutation(new int[]{1,3,2});
    }

    public static void nextPermutation(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        int n = nums.length;
        int m = n-2;
        while(m>=0){
            if(nums[m]<nums[m+1]){
                break;
            }
            --m;
        }

        int k = n-1;
        if(m>=0){
            while(k>m){
                if(nums[k]>nums[m]){
                    int t = nums[m];
                    nums[m] = nums[k];
                    nums[k] = t;
                    break;
                }
                k--;
            }
        }
        revert(nums,m+1);

        System.out.println(Arrays.toString(nums));
    }

    private static void revert(int[] nums, int i) {
        int left = i, right = nums.length - 1;
        while (left < right) {
            int t = nums[left];
            nums[left] = nums[right];
            nums[right] = t;
            left++;
            right--;
        }

    }


}
