package leetcode;

/**
 * 字符串 32456 移除m位，使结果最大
 */
public class RevomeStrMaxNum {
    public static void main(String[] args) {
        String str = "8923462";
        int m = 5;
        int n = str.length()-m;
        System.out.println(remove(str,n,0,1));
    }

    public static String remove(String s,int n,int i,int j){
        if(s.length()==n){
            return s;
        }
        char ci = s.charAt(i);
        char cj = s.charAt(j);
        if(ci<cj){
            s = s.substring(0,i) + s.substring(i+1);
            return remove(s,n,i,j);
        }else
        return remove(s,n,++i,++j);

    }
}
