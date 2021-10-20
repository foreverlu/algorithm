package leetcode;

/**
 * @author caoweiwei
 * @date 2021/10/19  下午5:47
 * 给定一个正整数 n ，输出外观数列的第 n 项。
 *
 * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。
 *
 * 你可以将其视作是由递归公式定义的数字字符串序列：
 *
 * countAndSay(1) = "1"
 * countAndSay(n) 是对 countAndSay(n-1) 的描述，然后转换成另一个数字字符串。
 * 前五项如下：
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnpvdm/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class CountAndSay {

    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String s = countAndSay(n - 1);
        char[] arr = s.toCharArray();
        if(arr.length==1){
            return "1"+s;
        }
        StringBuilder sb = new StringBuilder();
        int i=0,j=1,k=1;
        while (i<arr.length && j<arr.length){
            if(arr[i]==arr[j]){
                k=j-i+1;
                j++;
            }else {
                sb.append(k);
                k=1;
                sb.append(arr[i]);
                i=j;
                j++;
            }
        }
        sb.append(k);
        sb.append(arr[i]);
        return sb.toString();
    }


}
