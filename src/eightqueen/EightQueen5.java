package eightqueen;

/**
 * @author caoweiwei
 * @date 2022/3/14  上午9:37
 */
public class EightQueen5 {

    public static void main(String[] args) {
        eightQueen(0);
    }

    private static int count = 8;

    private static int[] res = new int[count];

    private static void eightQueen(int n) {
        if (n < 0) {
            return;
        }
        if (n >= count) {
            print();
            return;
        }
        for (int j = 0; j < count; j++) {
            if (isOk(n, j)) {
                res[n] = j;
                eightQueen(n + 1);
            }
        }
    }

    private static boolean isOk(int i, int j) {
        int leftUp = j - 1;
        int rightUp = j + 1;
        for (i--; i >= 0; i--) {
            if (leftUp >= 0) {
                if (res[i] == leftUp) {
                    return false;
                }
                leftUp--;
            }
            if (rightUp < count) {
                if (res[i] == rightUp) {
                    return false;
                }
                rightUp--;
            }
            if (res[i] == j) {
                return false;
            }
        }
        return true;
    }

    private static void print() {
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
