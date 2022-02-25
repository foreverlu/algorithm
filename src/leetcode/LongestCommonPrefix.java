package leetcode;

/**
 * @author caoweiwei
 * @date 2021/10/19  下午7:08
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = new String[]{"flow","","flo"};
        System.out.println(longestCommonPrefix1(strs));
    }

    public static String longestCommonPrefix1(String[] strs){

        if(null == strs || strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }

        StringBuilder sb = new StringBuilder();
        int n = strs.length;
        int index=0;
        String s0 = strs[0];
        while(index<s0.length()) {
            char c = s0.charAt(index);
            for (int i = 1; i < n; i++) {
                String s = strs[i];
                if (s.length() <= index || s.charAt(index)!=c) {
                    return sb.toString();
                }

            }
            index++;
            sb.append(c);
        }
        return sb.toString();
    }



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
