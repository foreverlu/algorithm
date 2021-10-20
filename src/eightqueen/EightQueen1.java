package eightqueen;

/**
 * @author caoweiwei
 * @date 2021/10/20  上午9:27
 */
public class EightQueen1 {

    public static void main(String[] args) {
        eightQueen(0);
    }

    public static int[] result = new int[8];

    public static void eightQueen(int row) {
        if (row == 8) {
            //打印
            printResult(result);
            System.out.println("");
        }
        //往每一列放置
        for (int column = 0; column < 8; column++) {
            if (isOk(row, column)) {
                result[row] = column;
                eightQueen(row + 1);
            }
        }
    }

    private static void printResult(int[] result) {

        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(result[i]!=j){
                    System.out.print("*");
                }else {
                    System.out.print("Q");
                }
            }
            System.out.println("");
        }

    }

    private static boolean isOk(int row, int column) {
        int leftUp = column - 1;
        int rightUp = column + 1;
        for (int i = row - 1; i >= 0; i--) {
            if(result[i]==column){
                return false;
            }
            if(result[i]==leftUp){
                return false;
            }
            if(result[i]==rightUp){
                return false;
            }
            leftUp--;
            rightUp++;
        }
        return true;
    }
}
