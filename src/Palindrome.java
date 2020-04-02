
import java.util.*;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("输入字符串:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuilder builder = new StringBuilder();
        builder.append("#");
        for(int i=0; i<str.length(); i++){
            builder.append(str.charAt(i));
            builder.append("#");
        }
        str = builder.toString();
        System.out.println(str);
        int len = str.length();
        //右边界
        int rightSide = 0;
        //右边界中心
        int rightSideCenter = 0;

        int[] halfLenArr = new int[len];
        //记录最长回文长度
        int longestLen = 0;
        //记录回文中心
        int center = 0;

        for(int i=0; i<len; i++){
            boolean needCal = true;
            //i位置不应该超出右边界
            if(i < rightSide){
                int left = 2 * rightSideCenter -i;
                halfLenArr[i] = halfLenArr[left];

                //如果超出右边界,则调整halfLenArr[i]
                if(i+halfLenArr[i] > rightSide){
                    halfLenArr[i] = rightSide - i;
                }
                //如果没有超出右边界,则不需要扩展,
                if(i+halfLenArr[i] < rightSide){
                    needCal = false;
                }
            }

            //进行扩展
            if(needCal){
                while(i-halfLenArr[i] > 0 && i+halfLenArr[i]+1 < len){
                    if(str.charAt(i+1+halfLenArr[i]) == str.charAt(i-1-halfLenArr[i])){
                        halfLenArr[i]++;
                    }else{
                        break;
                    }
                }
                    //更新右边界等信息
                    rightSide = i+halfLenArr[i];
                    rightSideCenter = i;
                    if(halfLenArr[i] > longestLen){
                        longestLen = halfLenArr[i];
                        center = i;
                }
                System.out.println("i"+i);
                System.out.println(center);
            }
        }

        //去掉#号
        StringBuilder sb = new StringBuilder();
        for(int k=center-longestLen+1;k<center+longestLen;k+=2){
            sb.append(str.charAt(k));
        }
        System.out.println(sb.toString());
    }
}
