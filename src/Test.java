import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import sun.security.ssl.HandshakeOutStream;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=~/data
 */
public class Test {

//一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。
// 请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。

    //递归乘法。 写一个递归函数，不使用 * 运算符， 实现两个正整数的相乘。可以使用加号、
    public static void main(String[] args) throws InterruptedException {
        System.out.println(cal(new int[]{2, 3,2,3,4,5}));
    }

    public static int cal(int[] nums){
        int s = 0;
        for(int i=0;i<nums.length;i++){
            int n = nums[i];

        }
        return 1;
    }

}


