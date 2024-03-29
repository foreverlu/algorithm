package leetcode;

/**
 * @author caoweiwei
 * @date 2021/10/18  下午6:57
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 *A man, a plan, a canal: Panama
 */
public class IsPalindrome {

    public static void main(String[] args) {
        System.out.println('A'-0);
        System.out.println('a'-0);
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        int i=0,j=arr.length-1;
        while (i<j){
            while (i<j && !Character.isLetterOrDigit(arr[i])){
                i++;
            }
            while (i<j && !Character.isLetterOrDigit(arr[j])){
                j--;
            }
            if(!String.valueOf(arr[i]).equalsIgnoreCase(String.valueOf(arr[j]))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
