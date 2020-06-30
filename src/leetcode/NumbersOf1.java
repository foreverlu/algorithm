package leetcode;

/**
 * 一个数字转换成二进制，有几个1
 */
public class NumbersOf1 {
    public static void main(String[] args) {
        int i = count1(16);
        System.out.println(i);
    }
    public static int count1(int num){
        int count=0;
        while (num!=0){
            num = (num-1)&num;
            count++;
        }
        return count;
    }
}
