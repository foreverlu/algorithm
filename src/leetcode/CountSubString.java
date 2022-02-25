package leetcode;

/**
 * @author caoweiwei
 * @date 2022/2/21  下午1:18
 * 给你一个字符串 s ，请你统计并返回这个字符串中 回文子串 的数目。
 *
 * 回文字符串 是正着读和倒过来读一样的字符串。
 *
 * 子字符串 是字符串中的由连续字符组成的一个序列。
 *
 * 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindromic-substrings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class CountSubString {

    public static void main(String[] args) {
        String s = "abba";
        System.out.println(countSubstrings(s));
    }

    public static int countSubstrings(String s) {
        int n = s.length();
        int count = 0;
        for(int i=0;i<n;i++){
          for(int j=i;j<n;j++){
              if(isPalind(s,i,j)){
                  count++;
              }
          }
        }
        return count;
    }

    private static boolean isPalind(String s,int l,int r){
        if(l>r) return false;
        while(l<=r){
            if(s.charAt(l++)!=s.charAt(r--)){
                return false;
            }
        }

        return true;
    }
}
