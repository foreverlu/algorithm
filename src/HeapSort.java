import java.util.Random;



public class HeapSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = random.nextInt(100);
        }

        heapSort(arr);
    }

    private static void heapSort(int[] arr) {
        int k = arr.length/2-1;
        sort(arr,k);
    }

    private static void sort(int[] arr,int k){
        int key = arr[k];
        for(int i=k;k>=0;k--){
            int s1 = 2*k+1;
            int s2 = 2*k+2;
            if(s2 > arr.length-1);
        }
    }
}
