package leetcode;

/**
 * @author caoweiwei
 * @date 2021/10/25  下午7:18
 */
public class NumberRevert {

    public int revert(int x){
        if(x/10==0){
            return x;
        }
       int k =  x%10;
        x = x/10;
        while (x/10!=0){
            int n = x%10;
            int nk = k*10 + n;
            if(nk/10 !=k){
                return 0;
            }
            k = nk;
            x = x/10;
        }

        int nk = k*10 + x;
        if(nk/10 !=k){
            return 0;
        }
        return nk;
    }

}
