package leetcode;

import java.util.Arrays;

/**
 * @author caoweiwei
 * @date 2021/10/22  上午9:17
 * 统计所有小于非负整数 n 的质数的数量。
 */
public class CountPrimes {
    public int countPrimes(int n) {

        boolean[] prime = new boolean[n];
        Arrays.fill(prime,true);

        for(int i = 2;i*i<n;i++){
            int x = i;
            if(prime[i]){
                while (i*x<n){
                    prime[i*x] = false;
                    x++;
                }
            }
        }
        int count = 0;
        for(int i=2;i<n;i++){
            if(prime[i]){
                count ++;
            }
        }
        return count;
    }
}
