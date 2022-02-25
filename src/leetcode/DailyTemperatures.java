package leetcode;

/**
 * @author caoweiwei
 * @date 2022/2/21  下午1:31
 * 给定一个整数数组 temperatures ，表示每天的温度，返回一个数组 answer ，
 * 其中 answer[i] 是指在第 i 天之后，才会有更高的温度。如果气温在这之后都不会升高，请在该位置用 0 来代替。
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/daily-temperatures
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(temperatures[j]>temperatures[i]){
                    res[i] = j-i;
                    break;
                }
            }

        }
        return res;
    }

}
