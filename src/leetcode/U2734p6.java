package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class U2734p6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine().trim());
        System.out.println(minVal(br.readLine()));
    }

    private static int minVal(String str) {
        String[] subs = str.split("-");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < subs.length; i++) {
            if (subs[i].contains("+")) {
                String[] sp2 = subs[i].split("\\+");
                int s = Integer.parseInt(sp2[0]);
                for (int c = 1; c < sp2.length; c++) {
                    s += Integer.parseInt(sp2[c]);
                }
                list.add(s);
            } else {
                list.add(Integer.parseInt(subs[i]));
            }
        }

        int n =list.get(0);
        for(int i=1;i< list.size();i++){
            n -= list.get(i);
        }
        return n;
    }
}
