package leetcode;

/**
 * @author caoweiwei
 * @date 2021/10/18  下午12:48 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 * <p>
 * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
 * <p>
 * 作者：力扣 (LeetCode) 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnhhkv/ 来源：力扣（LeetCode） 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * 1,2,3
 * 4,5,6
 * 7,8,9
 * <p>
 * 7,4,1
 * 8,5,2
 * 9,6,3
 */
public class Rotate {

    //线上下交换，再对角线交换
    public void rotate(int[][] matrix) {
        int size = matrix.length;
        for(int i=0;i<size/2;i++){
                int[] t = matrix[i];
                matrix[i]=matrix[size-i-1];
                matrix[size-i-1]=t;
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                int t = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }

    }

}
