package dynamicprogramming;

import java.util.LinkedList;

//动态规划解决背包问题
/*
    有一个背包可以装15kg的物品,
    有6个物品重量分别是[2,4,6,6,7,9]
    价钱分别是[3,4,6,7,9,15]
    找出最有方案,价格最高
 */
public class BackageProblem {
    public static void main(String[] args) {
        int w = 15;
        int[] ws = new int[]{2,4,6,6,7,9};
        int[] prices = new int[]{3,4,6,7,9,15};
        //构建一个二维数组,横坐标是重量,纵坐标代表物品个数
        int[][] stats = new int[6][16];
        for(int i=0;i<6;i++){
            for(int j=0;j<16;j++){
                stats[i][j]=-1;
            }
        }
        //把第一个物品的情况放入数组中
        stats[0][0] = 0;
        if(ws[0]<w) stats[0][ws[0]] = prices[0];
        for(int i=1;i<6;i++){
            for(int j=0;j<15;j++){ //i不放入背包
                if(stats[i-1][j]!=-1) stats[i][j] = stats[i-1][j];
            }
            for(int j=0;j<=w-ws[i];j++){
                int v = stats[i-1][j] + prices[i];
                if(v>stats[i][j+ws[i]]){
                    stats[i][j+ws[i]] = v;
                }
            }
        }

        int maxVal = 0;
        for(int j=0;j<=15;j++){
            if(stats[5][j]>maxVal) maxVal = stats[5][j];
        }

        System.out.println(maxVal);

        char c = '.';
        LinkedList q = new LinkedList();

    }
}
