package leetcode;

/**
 * @author caoweiwei
 * @date 2021/11/8  上午11:03
 * 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 *
 * 说明：每次只能向下或者向右移动一步。
 */
public class MinPathSum {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] record = new int[n][m];
        record[0][0] = grid[0][0];
        for(int i=1;i<m;i++){
            record[0][i] = record[0][i-1] + grid[0][i];
        }

        for(int i=1;i<n;i++){
            record[i][0] = record[i-1][0] + grid[i][0];
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                record[j][i] = Math.min(record[j-1][i],record[j][i-1]) + grid[j][i];
            }
        }

        return record[m-1][n-1];
    }
}
