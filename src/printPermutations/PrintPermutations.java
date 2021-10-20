package printPermutations;

/**
 * @author caoweiwei
 * @date 2021/9/26  下午1:40
 */
public class PrintPermutations {

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        printPermutations(arr,3,3);

    }

    public static void printPermutations(int[] arr,int n,int k){

        if(k==1){
            for (int i=0;i<n;i++){
                System.out.print(arr[i]);
            }
            System.out.println();
        }

        for(int i=0;i<k;i++){
            int t = arr[i];
            arr[i]=arr[k-1];
            arr[k-1] = t;
            printPermutations(arr,n,k-1);

            t = arr[k-1];
            arr[k-1] = arr[i];
            arr[i] = t;
        }
    }



}
