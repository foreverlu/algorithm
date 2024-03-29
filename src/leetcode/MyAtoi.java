package leetcode;

import java.util.Arrays;

/**
 * @author caoweiwei
 * @date 2021/10/19  上午9:31 请你来实现一个 myAtoi(string s) 函数，使其能将字符串转换成一个 32 位有符号整数（类似 C/C++ 中的 atoi 函数）。
 * <p>
 * 函数 myAtoi(string s) 的算法如下：
 * <p>
 * 读入字符串并丢弃无用的前导空格 检查下一个字符（假设还未到字符末尾）为正还是负号，读取该字符（如果有）。
 * 确定最终结果是负数还是正数。 如果两者都不存在，则假定结果为正。 读入下一个字符，直到到达下一个非数字字符或到达输入的结尾
 * 。字符串的其余部分将被忽略。 将前面步骤读入的这些数字转换为整数（即，"123" -> 123， "0032" -> 32）。如果没有读入数字，则整数为 0
 *
 * 。必要时更改符号（从步骤 2 开始）。 如果整数数超过 32 位有符号整数范围 [−231,  231 − 1] ，需要截断这个整数，
 * 使其保持在这个范围内。具体来说，小于 −231 的整数应该被固定为 −231 ，大于 231 − 1 的整数应该被固定为 231 − 1 。
 * 返回整数作为最终结果。 注意：
 * <p>
 * 本题中的空白字符只包括空格字符 ' ' 。 除前导空格或数字后的其余字符串外，请勿忽略 任何其他字符。
 * <p>
 * <p>
 * 作者：力扣 (LeetCode) 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnoilh/ 来源：力扣（LeetCode） 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class MyAtoi {

    public static void main(String[] args) {
        System.out.println(myAtoi("10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000522545459"));

    }
    public static int myAtoi(String s) {
        if(s.length()<1) return 0;
        char[] arr = s.toCharArray();

        int i = 0;
        int k = 1;
        while(i< s.length() && arr[i]==' '){
            i++;
        }
        if (i < arr.length && arr[i] == '-') {
            k = -1;
            i++;
        }else if(i < arr.length &&arr[i]=='+'){
            i++;
        }
        while(i < arr.length && arr[i]=='0'){
            i++;
        }
        int res = 0;
        int t = res;
        while (i < arr.length && Character.isDigit(arr[i])) {
            if (arr[i] == ' ') {
                continue;
            } else {
                t = res;
                res = res *10+(arr[i++]-'0');
            }
            if(res / 10 != t){
                if(k==1){
                    return Integer.MAX_VALUE;
                }else {
                    return Integer.MIN_VALUE;
                }
            }
        }
        return res*k;
    }


    public static int myAtoi1(String s) {
        //去除 ' ' 0
        char[] arr = s.toCharArray();
        int i = 0;
        while (i<arr.length){
            if(' ' == arr[i] || '0'== arr[i]){
                i++;
            }else {
                break;
            }
        }
        int k = 1;
        if(arr[i] == '-'){
            k=-1;
            i++;
        }else {
            i++;
        }

        int res = 0;

        while (i<arr.length){
            if(!Character.isLetterOrDigit(arr[i])){
                break;
            }
            if(Character.isDigit(arr[i])){
                int t = res*10 +(arr[i]-'0');
                if(t/10!=res){
                    if(k==1){
                        return Integer.MAX_VALUE;
                    }else return Integer.MIN_VALUE;
                }
                res = t;
                i++;
            }
        }
        return k * res;
    }
}
