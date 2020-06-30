package dynamicprogramming;

//动态规划解决背包问题
/*
    有一个背包可以装15kg的物品,
    有6个物品重量分别是[2,4,6,6,7,9]
    价钱分别是[3,4,6,7,9,15]
    找出最有方案,价格最高
 */
public class BackageProblem1 {

    public void solution(int[] items, int[] wights, int w) {

        int solution[][] = new int[items.length][w];

        solution[0][0] = -1;
//        if (wights[0] <= w) {
//            solution[0][wights[0]] = true;
//        }
//        for (int i = 0; i < items.length; i++) {
//            for(int j=0;j<w;j++){
//                if(solution[i][j]){
//                    solution[i+1][j] = solution[i][j];
//                }
//
//                if(){
//
//                }
//
//            }
//        }

    }
}
