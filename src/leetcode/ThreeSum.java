package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author caoweiwei
 * @date 2021/10/26  下午6:47
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？
 * 请你找出所有和为 0 且不重复的三元组。
 *
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ThreeSum {

    //[-1,0,1,2,-1,-4]
    public static void main(String[] args) {
        System.out.println(threeSum1(new int[]{0,0,0,0,0}));
    }
    public static List<List<Integer>> threeSum1(int[] nums) {

        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1&& nums[j]==nums[j-1]){
                    continue;
                }
                for(int k=n-1;k>j;k--){
                    if( k-1>j && nums[k]==nums[k-1]){
                        continue;
                    }
                   int l = nums[k];
                   int m = nums[i];
                   int r = nums[j];
                   if(l+m+r==0){
                       List<Integer> list = new ArrayList<>();
                       list.add(l);
                           list.add(r);
                           list.add(m);
                           res.add(list);
                   }else if(l+m+r<0){
                        break;
                   }
                }
            }
        }

        return res;
    }






    public static List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length<3){
            return Collections.emptyList();
        }

        int n = nums.length;

        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            for(int j=i+1;j<n;j++){
                if(j!=i+1 &&nums[j]==nums[j-1]){
                    continue;
                }

                int k = n-1;
                while (k>j && nums[k]>-nums[i]-nums[j]){
                    k--;
                }

                if(k>j && nums[k]==-nums[i]-nums[j]){
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[k]);
                    l.add(nums[i]);
                    l.add(nums[j]);
                    res.add(l);
                }
            }
        }

        return res;
    }
}
