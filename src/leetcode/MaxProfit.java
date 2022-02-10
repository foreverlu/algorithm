package leetcode;

/**
 * @author caoweiwei
 * @date 2021/10/21  下午2:52
 * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 *
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 *
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn8fsh/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * [7,1,5,3,6,4]
 * 我们来定义一个二维数组dp[length][2]，其中dp[i][0]表示第i+1天（i是从0开始的）结束的时候没持有股票的最大利润，dp[i][1]表示第i+1天结束的时候持有股票的最大利润。
 *
 */
public class MaxProfit {
    int max = 0;
    public int maxProfit(int[] prices) {
       int[][] h = new int[prices.length][2];
       h[0][0] = 0;
       h[0][1] = -prices[0];
       for(int i=1;i<prices.length-1;i++){
           h[i][0] = Math.max(prices[i]+h[i-1][1],h[i-1][0]);
           h[i][1] = Math.max(-prices[i],h[i-1][1]);
       }
       return h[prices.length-1][0];
    }
}
