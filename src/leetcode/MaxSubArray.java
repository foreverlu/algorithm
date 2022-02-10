package leetcode;

/**
 * @author caoweiwei
 * @date 2021/10/21  下午4:15
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 0 包含   1  不包含
 */
public class MaxSubArray {

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
    public static int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int[] arr = new int[nums.length];
        arr[0] = nums[0];

        for (int i=1;i<nums.length;i++){
            int t = arr[i - 1];
            arr[i] = Math.max(arr[i-1],0) + nums[i];
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
           max = Math.max(arr[i],max);
        }
        return max;
    }
}
