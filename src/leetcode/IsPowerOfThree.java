package leetcode;

/**
 * @author caoweiwei
 * @date 2021/10/22  上午9:30
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。如果是，返回 true ；否则，返回 false 。
 *
 * 整数 n 是 3 的幂次方需满足：存在整数 x 使得 n == 3x
 *
 *
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnsdi2/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class IsPowerOfThree {
    public boolean isPowerOfThree(int n) {
        if(n==1){
            return true;
        }
        if(n/3==1 && n%3==0){
            return true;
        }
        if(n<3){
            return false;
        }

        return isPowerOfThree(n/3);

    }

}
