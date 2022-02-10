import java.util.Arrays;
import java.util.List;
import utils.ArrUtils;

/**
 * @author caoweiwei
 * @date 2021/11/4  下午3:59
 */
public class FindKBiggest {
    static int num = 7;
    public static void main(String[] args) {
        int[] arr = ArrUtils.generateArr(10, 100);
        System.out.println(Arrays.toString(arr));
        System.out.println(findK(arr, 0, arr.length - 1, num));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int findK(int[] arr,int left,int right,int k){
//        if(left+1==k){
//            return arr[left];
//        }

        int l = left,r = right;
        int v = arr[left];

        while (l<r){
            while(arr[r]>=v && l<r){
                r--;
            }
            if(l<r){
                int t = arr[r];
                arr[r]= arr[l];
                arr[l] = t;
                l++;
            }
            while(l<r && arr[l]<v){
                l++;
            }
            if(l<r){
                int t = arr[r];
                arr[r]= arr[l];
                arr[l] = t;
                l--;
            }
        }

        if(l+1==k){
            return arr[l];
        }
        if(l+1>k){
            return findK(arr,left,l-1,k);
        }else {
            return findK(arr,l+1,right,k);
        }

    }
}
