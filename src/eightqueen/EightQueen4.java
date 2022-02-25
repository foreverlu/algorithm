package eightqueen;

/**
 * @author caoweiwei
 * @date 2022/2/15  下午1:38
 */
public class EightQueen4 {

    private static int n = 8;

    public static void main(String[] args) {
        eightQueen(0);
    }

    static int[] res = new int[n];

    private static void eightQueen(int row) {

        if (row == n) {
            print(res);
            return;
        }

        for (int column = 0; column < n; column++) {
            if (isOk(row, column)) {
                res[row]=column;
                eightQueen(row + 1);
            }
        }

    }

    private static boolean isOk(int row, int column) {
        int leftUp = column - 1;
        int rightUp = column + 1;
        while (row > 0) {
            if (res[row-1] == column) {
                return false;
            }
            if (leftUp >= 0 && res[row - 1] == leftUp--) {
                return false;
            }
            if (rightUp < n && res[row - 1] == rightUp++) {
                return false;
            }
            row--;
        }
        return true;
    }

    private static void print(int[] res) {
        for (int i = 0; i < res.length; i++) {
            int n = res.length;
            for (int j = 0; j < n; j++) {
                if (res[i] == j) {
                    System.out.print("q ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
        System.out.println("");

    }
}
