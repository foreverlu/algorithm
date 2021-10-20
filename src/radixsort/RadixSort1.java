package radixsort;

import java.util.Arrays;
import java.util.Random;

/**
 * @author caoweiwei
 * @date 2021/9/24  上午9:28
 */
public class RadixSort1 {

    public static void main(String[] args) {
        String[] phoneOri = generatePhoneArray(11, 10);
        System.out.println("ori: "+ Arrays.toString(phoneOri));
        radixSort(phoneOri,11);
        System.out.println("sorted: "+ Arrays.toString(phoneOri));
    }

    public static void radixSort(String[] arr,int length){
        for(int i =length-1;i>=0;i--){
            countSort(arr,i);
        }
    }

    public static void countSort(String[] arr,int n){
        int[] c = new int[10];
        for (String s : arr) {
            int cn = s.charAt(n) - '0';
            c[cn] = ++c[cn];
        }
        //累加
        for (int i=1;i<c.length;i++){
            c[i]=c[i-1]+c[i];
        }

        for(int i=c.length-1;i>0;i--){
            c[i] = c[i-1];
        }

        c[0]=0;

        String[] newArr = new String[arr.length];
        for(int i=0;i<arr.length;i++){
            String v = arr[i];
            int cn = v.charAt(n)-'0';
            newArr[c[cn]] = v;
            c[cn]=c[cn]+1;
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = newArr[i];
        }
    }


    private static String[] generatePhoneArray(int n, int length) {
        Random random = new Random();
        String[] phones = new String[length];
        for (int i = 0; i < length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(random.nextInt(10));
            }
            phones[i] = sb.toString();
        }
        return phones;
    }

}
