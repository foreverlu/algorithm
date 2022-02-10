package eightqueen;

/**
 * @author caoweiwei
 * @date 2021/11/1  上午10:15
 */
public class EightQueen3 {

    static int n = 4;

    public static void main(String[] args) {
        eightQueen(0);
    }
    static int[] res = new int[n];

    public static void eightQueen(int row){
        if(row == n){
            print(res);
        }


        for(int column=0;column<n;column++){
            if(isOk(row,column)){
                res[row] = column;
                eightQueen(row+1);
            }
        }
    }

    public static boolean isOk(int row ,int column){
        int leftUp = column-1;
        int rightUp = column+1;
            for(int i = row-1;i>=0;i--){
               if(res[i]==column){
                   return false;
               }
               if(res[i] == leftUp--){
                   return false;
               }
               if(res[i]==rightUp++){
                   return false;
               }

           }

        return true;
    }

    public  static void print(int[] res){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(res[i]==j){
                    System.out.print("Q ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
        }

        System.out.println(" ");
    }



}
