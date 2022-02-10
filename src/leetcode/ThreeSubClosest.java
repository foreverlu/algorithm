package leetcode;

import java.util.Arrays;

/**
 * @author caoweiwei
 * @date 2021/10/27  上午10:02
 */
public class ThreeSubClosest {
//[-1,0,1,1,55]
//3
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,1,55};
        System.out.println(threeSumClosest(nums, 3));

    }

    public static int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;

        int res = 0;
        for(int i=0;i<n-2;i++){
            int first = nums[i];
            for(int j=i+1;j<n-1;j++){
                int second = nums[j];
                int sum = first + second;
                int m = target - sum;
                int right = n-1;
                int left = j+1;
                int lessThan = findLessThan(nums,left,right,m);
                int greatThan = findGreatThan(nums,left,right,m);
                int third = 0;
                int sub=0;

                if(sub(m,greatThan) > sub(m,lessThan)){
                    third = lessThan;
                    sub = sub(lessThan,m);
                }else{
                    third = greatThan;
                    sub = sub(greatThan,m);
                }
                if(sub<min){
                    min = sub;
                    res = first + third + second;
                }

            }
        }

        return res;
    }

    public static int sub(int m,int n){

        return n>m?n-m:m-n;
    }
    public static int findLessThan(int[] nums,int left,int right,int m){
        while(left<right){
            int mid = (right-left)/2+left;
            if(nums[mid]>m){
                right = mid-1;
            }else{
                if((mid == nums.length-1) || (nums[mid+1]>m)) return nums[mid];
                left +=1;
            }
        }

        return nums[left];
    }

    public static int findGreatThan(int[] nums,int left,int right,int m){
        while(left<right){
            int mid = (right-left)/2+left;
            if(nums[mid]<m){

                left = mid+1;
            }else{
              if(mid==0 || nums[mid-1]<m) return nums[mid];
              right -=1;
            }
        }
        return nums[left];
    }

}
