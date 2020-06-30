package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 找出一个数组中只有2个出现一次的数
 */
public class Found2NotDunplicateNums {

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,2,3,3,4,4,5,6};
        System.out.println(Arrays.toString(find(arr)));
    }

    public static int[] find(int[] arr){
        int res = arr[0];
        for(int i=1;i<arr.length;i++){
            res = arr[i] ^ res;
        }
        int index = findFirst1(res);
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(isBit(index,arr[i])){
                l1.add(arr[i]);
            }else l2.add(arr[i]);
        }
        int r1 = l1.get(0);
        int r2 = l2.get(0);
        for(int i=1;i<l1.size();i++){
            r1 = l1.get(i) ^ r1;
        }
        for(int i=1;i<l2.size();i++){
            r2 = l2.get(i) ^ r2;
        }

        return new int[]{r1,r2};
    }

    private static int findFirst1(int res) {
        int indexBit = 0;
        while ((res&1)==0){
            indexBit++;
            res = res>>1;
        }
        return indexBit;
    }

    private static boolean isBit(int index,int num){
        num = num >> index;
        return (num&1)==0;
    }
}
