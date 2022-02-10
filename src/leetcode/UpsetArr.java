package leetcode;

import java.util.Random;

/**
 * @author caoweiwei
 * @date 2021/10/21  下午7:17
 * 给你一个整数数组 nums ，设计算法来打乱一个没有重复元素的数组。
 *
 * 实现 Solution class:
 *
 * Solution(int[] nums) 使用整数数组 nums 初始化对象
 * int[] reset() 重设数组到它的初始状态并返回
 * int[] shuffle() 返回数组随机打乱后的结果
 *
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn6gq1/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 *  * Your Solution object will be instantiated and called as such:
 *  * Solution obj = new Solution(nums);
 *  * int[] param_1 = obj.reset();
 *  * int[] param_2 = obj.shuffle();
 */
public class UpsetArr {
    int[] nums;
    Random random;
    public UpsetArr(int[] nums) {
        nums = nums;
        random = new Random();
    }

    public int[] reset() {
        return nums;
    }

    public int[] shuffle() {
        int[] arr = nums;

        for(int i=0;i<arr.length;i++){
            int k = random.nextInt(i+1);
            int t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;
        }
        return null;
    }
}
