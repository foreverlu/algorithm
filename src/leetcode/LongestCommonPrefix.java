package leetcode;

/**
 * @author caoweiwei
 * @date 2021/10/19  下午7:08
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return "";
        }
        String c = "";
        for (int i = 0; i <= 200; i++) {
            char cc = strs[1].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs.length<j+1 || strs[j].charAt(i) != cc) {
                    return c;
                }
            }
            c = c + cc;
        }

        return c;
    }

}
