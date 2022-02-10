package leetcode;

/**
 * @author caoweiwei
 * @date 2021/10/21  下午2:36
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 */
public class ClimbStairs {
    public int climbStairs(int n) {
       int[] arr = new int[n+1];
       arr[1]=1;
       arr[2] = 2;
       for(int i=3;i<=n;i++){
           arr[i] = arr[i-1]+arr[i-2];
       }

       return arr[n];
    }
}
