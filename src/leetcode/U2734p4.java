package leetcode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//一个典型的电话拨号盘如下：
//
//1 2 3
//4 5 6
//7 8 9
//* 0 #
//
//手指在两个按键之间的移动距离被定义成这两个键的x、y坐标差的绝对值之和。
//比如，6到自身的距离是0，到3、5、9的距离是1，到2、4、8、#的距离是2，到1、7、0的距离是3，到*的距离是4。
//现在要你算一下，拨一个号手指所需要移动的最小距离是多少？假设手指初始位置在“5”。
//
//输入
//一行，一个字符串，表示需要拨的电话号码。
//
//输入约束
//电话号码的每一位仅包含数字“0”到“9”，且总长度范围是 [3,20]
//
//输出
//一个整数，表示拨完这个号码手指最少需要移动的距离
public class U2734p4 {
    public static void main(String []args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine().trim());
        System.out.println(cal(br.readLine()));
    }

    ////1 2 3
    ////4 5 6
    ////7 8 9
    ////* 0 #
    public static String cal(String s){

        Position[] positions = new Position[10];
        positions[0] = new Position(0,0);
        positions[1] = new Position(-1,3);
        positions[2] = new Position(0,3);
        positions[3] = new Position(1,3);
        positions[4] = new Position(-1,2);
        positions[5] = new Position(0,2);
        positions[6] = new Position(1,2);
        positions[7] = new Position(-1,1);
        positions[8] = new Position(0,1);
        positions[9] = new Position(1,1);

        Position p = positions[5];
        int sum=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            Position pn = positions[c-48];
            int x = pn.x-p.x <0 ?(-1)*(pn.x-p.x) : (pn.x-p.x);
            int y = pn.y-p.y <0 ?(-1)*(pn.y-p.y) : (pn.y-p.y);
            sum=sum+x+y;
            p=pn;
        }
        return sum+"";
    }
    static class Position{
        int x;
        int y;

        public Position(int x,int y){
            this.x = x;
            this.y=y ;
        }
    }
}
