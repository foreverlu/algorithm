import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author caoww
 * @Date 2025/8/28 08:17
 * Given s = "leetcode", return "leotcede".
 **/
public class ReversVowelsOfAString {
    public static void main(String[] args) {

        String str = "leetcode";
        System.out.println(revert(str));
    }


    public static String revert(String str){

        Set<Character> set = new HashSet(Arrays.asList('a','i','u','e','o','A','I','U','E','O'));

        int left = 0,right = str.length() -1;
        char[] charArr = str.toCharArray();
        while(left < right){

            Character lc = charArr[left];
            Character rc = charArr[right];
            if(set.contains(lc) && set.contains(rc)){
                charArr[left] = rc;
                charArr[right] = lc;
                left++;
                right--;
            }else{
                if (!set.contains(lc)) {
                    left ++;
                }
                if(!set.contains(rc)){
                    right--;
                }
            }

        }
        return new String(charArr);
    }
}
