package leetcode;

//输入一个字符串，判断，是否是数字 +1.1e-10
public class IsNumberString {

    static int i=0;
    public static boolean scan(String s){
        if(null == s || i>=s.length()) return false;
        char c = s.charAt(0);
        if('+'==  c || '-'==c){
            s = s.substring(1);
        }

            return false;

    }


}
