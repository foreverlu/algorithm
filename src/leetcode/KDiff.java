package leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class KDiff {
    public static void main(String[] args) {
        System.out.println(findPairs(new int[]{1,1,1,1,1,1},0));
    }
    public static int findPairs(int[] nums, int k) {
        int total = 0;
        if(null == nums || nums.length==0){
            return total;
        }
        Arrays.sort(nums);
        int visited = 0;
        for(int i=0;i<nums.length;i++){
            int p1 = nums[i];
            if(p1==visited){
                continue;
            }else{
                visited=p1;
            }
            for(int j=i+1;j<nums.length;j++){
                int p2 = nums[j];
                if(p2-p1==k) {total++; break;}
                else if(p2-p1<k) continue;
                else break;
            }

        }
        return total;
    }
}
