package leetcode;

/**
 * @author caoweiwei
 * @date 2021/10/25  上午11:25
 *
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 */
public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbca"));
    }

    public static String longestPalindrome(String s) {

        if (s == null || s.length() < 2) {
            return s;
        }

        char[] arr = s.toCharArray();
        int l = 0, r = 0;
        for (int i = 0; i < arr.length; i++) {
          for(int j=i;j<arr.length;j++){
              if (ifPalindrome(arr,i,j)) {
                  if(r-l<j-i){
                      r = j;
                      l=i;
                  }
              }
          }
        }
        return s.substring(l, r + 1);
    }

    private static Boolean ifPalindrome(char[] arr, int i, int j) {
        if(i>j) return false;
        while (i<=j){
            if(arr[i++]!=arr[j--]){
                return false;
            }
        }

        return true;
    }
}
