/**
 * @Author caoww
 * @Date 2025/8/27 12:55
 * Input: 5
 * Output: True
 * Explanation: 1 * 1 + 2 * 2 = 5
 *
 * 题目描述：判断一个非负整数是否为两个整数的平方和。
 *
 **/
public class JudgeSquareSum {

    public static void main(String[] args) {
        System.out.println(JudgeSquareSum(10));
    }

    public static boolean JudgeSquareSum(int target){

        int left = 0,right=target;

        while(left < right){
            int s = left * left + right * right;
            if(s == target){
                return true;
            }else if(s>target){
                right--;
            }else {
                left++;
            }
        }

        return false;
    }
}
