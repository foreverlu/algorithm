package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caoweiwei
 * @date 2021/10/18  上午10:56 请你判断一个 9x9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。
 * <p>
 * 数字 1-9 在每一行只能出现一次。 数字 1-9 在每一列只能出现一次。 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。（请参考示例图） 数独部分空格内已填入了数字，空白格用 '.' 表示。
 * <p>
 * 注意：
 * <p>
 * 一个有效的数独（部分已被填充）不一定是可解的。 只需要根据以上规则，验证已经填入的数字是否有效即可。  
 * <p>
 * 作者：力扣 (LeetCode) 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2f9gg/ 来源：力扣（LeetCode） 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class IsValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        int size = board.length;

        int[][] line = new int[size][size];
        int[][] column = new int[size][size];
        int[][] cell = new int[size][size];

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                char value = board[i][j];
                if('.'==value){
                    continue;
                }
                int num = value -'0'-1;
                int k = i /3 * 3 + j/3;
                if(line[i][num] !=0 || column[j][num]!=0 || cell[k][num]!=0){
                    return false;
                }
                line[i][num]=column[j][num]=cell[k][num]=1;
            }
        }

        return true;
    }

}
