package leetcode;

/**
 * @author caoweiwei
 * @date 2021/10/19  上午10:29
 * 实现 strStr() 函数。
 *
 * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
 *
 *  
 *
 * 说明：
 *
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 *
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与 C 语言的 strstr() 以及 Java 的 indexOf() 定义相符。
 *
 *  
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnr003/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class StrStr {

    public static void main(String[] args) {
        strStr("mi",
            "mi");
    }
    public static int strStr(String haystack, String needle) {
        if("".equals(needle)){
            return 0;
        }
        if(haystack.length()<needle.length()) return -1;
        char[] hArr = haystack.toCharArray();
        char[] nArr = needle.toCharArray();
        for(int i=0;i<=hArr.length- nArr.length;i++){
            int k = i;
            for(int j=0;j<nArr.length;j++){

                if(hArr[k++]==nArr[j]){
                    if(j==nArr.length-1){
                        return i;
                    }else continue;
                }else break;
            }
        }
        return -1;
    }

}
