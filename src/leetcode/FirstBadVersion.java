package leetcode;

/**
 * @author caoweiwei
 * @date 2021/10/21  下午12:56 你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。
 * <p>
 * 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。
 * <p>
 * 你可以通过调用 bool isBadVersion(version) 接口来判断版本号 version 是否在单元测试中出错。实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。
 * <p>
 * 作者：力扣 (LeetCode) 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnto1s/ 来源：力扣（LeetCode） 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class FirstBadVersion {

    public static int firstBadVersion(int n) {

       int low = 1,high = n;
       while (low<high){
           int mid = (high-low)>>1 + low;
           if(isBadVersion(mid)){
               high = mid;
           }else {
               low = mid+1;
           }
       }
       return low;
    }



    private static boolean isBadVersion(int mid) {
        if(mid==1){
            return true;
        }
        return false;
    }
}
