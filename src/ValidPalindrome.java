/**
 * @Author caoww
 * @Date 2025/8/28 08:29
 * Input: "abca"
 * Output: True
 * Explanation: You could delete the character 'c'.
 * 题目描述：可以删除一个字符，判断是否能构成回文字符串。
 *
 * 所谓的回文字符串，是指具有左右对称特点的字符串，例如 "abcba" 就是一个回文字符串。
 **/
public class ValidPalindrome {
    public static void main(String[] args) {

        System.out.println(check("abcba"));
    }


    public static boolean check(String str){

        char[] charArr = str.toCharArray();

        int left =0,right = str.length()-1;

        while(left < right){
            char lc = charArr[left];
            char rc = charArr[right];
            if (lc != rc) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
