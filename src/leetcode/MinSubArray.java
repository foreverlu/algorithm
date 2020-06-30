package leetcode;
//给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组，
// 并返回其长度。如果不存在符合条件的连续子数组，返回 0。
//

import java.util.Arrays;

public class MinSubArray {

    public static void main(String[] args) {
        int[] arr = new int[]{2,4,5,2,3,1,3,4,2,1};
        System.out.println(minSubArrayLen(9, arr));
        System.out.println(minSubArrayLen1(9, arr));
    }

    //两个指针移动
    public static int minSubArrayLen1(int s,int[] nums){
        if(nums.length==0) return 0;
        int minL = Integer.MAX_VALUE;
        int m=0,n=0;
        int sum = 0;
        while (n<nums.length){
            sum += nums[n++];
            while (sum>=s){
                minL = Math.min(minL,n-m);
                sum-=nums[m++];
            }
        }
        return minL==Integer.MAX_VALUE ? 0 : minL;
    }

    //二分法
    public static int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        int[] sums = new int[n + 1];
        // 为了方便计算，令 size = n + 1
        // sums[0] = 0 意味着前 0 个元素的前缀和为 0
        // sums[1] = A[0] 前 1 个元素的前缀和为 A[0]
        // 以此类推
        for (int i = 1; i <= n; i++) {
            sums[i] = sums[i - 1] + nums[i - 1];
        }
        for (int i = 1; i <= n; i++) {
            int target = s + sums[i - 1];
            int bound = Arrays.binarySearch(sums, target);
            if (bound < 0) {
                bound = -bound - 1;
            }
            if (bound <= n) {
                ans = Math.min(ans, bound - (i - 1));
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
