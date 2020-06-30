package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//假设n为正整数，斐波那契数列定义为：
//f(n) = 1, n < 3;
//f(n) = f(n-1) + f(n-2), n>=3
//
//现在请你来计算f(n)的值，但是不需要给出精确值，只要结果的后六位即可。
//
//输入：一行，包含一个正整数n，且0<n<1000
//输出：一行，f(n)的后6位（十进制，不足6位不补零）
public class U2734p3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        System.out.println(f(n));

    }

    private static int f(int n){
        if(n<3){
            return 1;
        }
        int f1 = 1;
        int f2 =1;
        int fn=0;
        for(int i=3;i<=n;i++){
            fn=(f1+f2)%1000000;
            f1=f2;
            f2=fn;
        }
        return fn;
    }
}
