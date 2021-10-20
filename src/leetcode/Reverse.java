package leetcode;

/**
 * @author caoweiwei
 * @date 2021/10/18  下午1:25
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 *
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *
 * 输入：x = 123
 * 输出：321
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnx13t/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Reverse {

    public int reverse(int x) {
        int res = 0;
        while (x!=0){

            int s = x %10;
            int newRes = res * 10 +s;
            if((newRes-s)/10 !=res){
                return 0;
            }
            res = newRes;
            x = x /10;
        }
        return res;
    }

    public void reverseString(char[] s) {
        int length = s.length;
        for(int i=0;i<length/2;i++){
            char t = s[i];
            s[i]=s[length-i-1];
            s[length-i-1]=t;
        }
    }

}
