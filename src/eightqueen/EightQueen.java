package eightqueen;

public class EightQueen {
    public static void main(String[] args) {
        cal8Queen(0);

    }

    //下标代表
    private static int[] result = new int[8];
    public static void cal8Queen(int row){
        if(row==8){
            print8Queen();
            return;
        }
       for(int column=0;column<8;column++){
           if(isOk(row,column)){
                result[row]=column;
                cal8Queen(row+1);
           }
       }

    }


    private static boolean isOk(int row,int column){
        int leftUp = column-1,rightUp = column+1;
        for(int i=row-1;i>=0;i--){
            if(result[i]==column){
                return false;
            }
            if(leftUp>=0 && result[i]==leftUp){
                return false;
            }
            if(rightUp<8 && result[i]==rightUp){
                return false;
            }
            leftUp--;
            rightUp++;
        }

        return true;
    }



    private static void print8Queen() {
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result.length;j++){
                if(result[i]==j) {
                    System.out.print("q ");
                }else System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println();
    }
}
