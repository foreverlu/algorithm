package leetcode;

/**
 * @author caoweiwei
 * @date 2021/11/17  上午9:35 给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。
 * <p>
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 * <p>
 *  [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]] "SEE"
 * <p>
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/word-search 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Exist {
    //[["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]]
    //"ABCB"
    public static void main(String[] args) {
        char[][] board = new char[][]{{'a', 'b','c','e'}, {'s', 'f','c','s'},{'a','d','e','e'}};
//        char[][] board = new char[][]{{'a', 'b'}, {'c','d'}};
        System.out.println(exist(board, "abcb"));
    }

    static Boolean flag = false;

    public static boolean exist(char[][] board, String word) {

        int m = board.length;
        int n = board[0].length;
        int[][] rec = new int[m+1][n+1];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (flag) {
                    return flag;
                }
                move(board, i, j, 0, word, rec);
            }
        }

        return flag;
    }

    private static void move(char[][] board, int i, int j, int k, String word, int[][] rec) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return;
        }

        if (board[i][j] == word.charAt(k)) {
            if(k==word.length()-1){
                flag = true;
                return;
            }
            rec[i][j] = 1;
            if (i>0&&rec[i - 1][j] == 0) {
                move(board, i - 1, j, k + 1, word, rec);
            }
            if (j>0 && rec[i][j-1] == 0) {
                move(board, i, j - 1, k + 1, word, rec);

            }
            if (rec[i +1][j] == 0) {
                move(board, i + 1, j, k + 1, word, rec);

            }
            if (rec[i][j+1] == 0) {
                move(board, i, j + 1, k + 1, word, rec);
            }

            rec[i][j]=0;
        }


    }
}
