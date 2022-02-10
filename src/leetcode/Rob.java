package leetcode;

/**
 * @author caoweiwei
 * @date 2021/10/21  下午7:05
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，
 * 影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 *
 *[1,2,3,1]
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnq4km/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 * 0 偷  1 不偷
 */
public class Rob {
    public int rob(int[] nums) {
        int[][] arr = new int[nums.length][2];

        arr[0][0] = nums[0];
        arr[0][1] = 0;
        int max = arr[0][0];
        for(int i=1;i<nums.length;i++){
            arr[i][0] =arr[i-1][1] + nums[i];
            arr[i][1] = Math.max(arr[i-1][0],arr[i-1][1]);
            max = Math.max(Math.max(arr[i][0],arr[0][1]),max);
        }
        return max;
    }
}
