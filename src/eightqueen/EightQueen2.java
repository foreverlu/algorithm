package eightqueen;

/**
 * @author caoweiwei
 * @date 2021/10/20  上午9:49
 */
public class EightQueen2 {
    public static final int n = 4;
    public static int[] result = new int[n];

    public static void main(String[] args) {
        eightQueen(0);
    }
    public static void eightQueen(int row){
        if(row==n){
            //打印
            printResult(result);
        }
        for(int i=0;i<n;i++){
            if(isOk(row,i)){
                result[row]=i;
                eightQueen(row+1);
            }
        }
    }

    private static boolean isOk(int row, int i) {
        int leftUp = i-1;
        int rightUp = i+1;

        for(int n = row-1;n>=0;n--){
            if(result[n]==i) return false;

            if(result[n]==leftUp--) return false;

            if(result[n]==rightUp++) return false;
        }
        return true;
    }

    private static void printResult(int[] result) {

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(result[i]!=j){
                    System.out.print("*");
                }else {
                    System.out.print("Q");
                }
            }
            System.out.println("");
        }

        System.out.println("");
    }

}
