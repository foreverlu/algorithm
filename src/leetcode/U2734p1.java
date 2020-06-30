package leetcode;

import java.io.*;

public class U2734p1 {
    public static void main(String []args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        if(n<1) {
            System.out.println(0);
        }

        if(checkNum(n)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }

    private static boolean checkNum(int n) {
        if(n==1) return true;
        if((n&1)==0){
          return   checkNum(n >> 1);
        }else {
            return false;
        }

    }
}
