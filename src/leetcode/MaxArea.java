package leetcode;

/**
 * @author caoweiwei
 * @date 2021/10/26  下午1:55 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 说明：你不能倾斜容器。
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/container-with-most-water 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MaxArea {

    public static void main(String[] args) {
        maxArea1(new int[]{1,2,3,4});
    }

    public static int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        int i = 0, j = n - 1;
        while (i < j) {
            int v = (j-i) * Math.min(height[i],height[j]);
            max = Math.max(max,v);
            if(height[i]<height[j]){
                i++;
            }else {
                j--;
            }
        }

        return max;
    }



        public static int maxArea1(int[] height) {
            int n = height.length;
            int[][] res = new int[n][2];

            res[1][0] = 0;
            res[1][1] = height[0];
            for(int i=2;i<n;i++){
                if(Math.min(height[i],height[i-1])>=Math.min(height[res[i-1][0]],height[i])*(i-res[i-1][0])){
                    res[i][0] = i-1;
                    res[i][1] = Math.min(height[i],height[i-1]);
                }else{
                    res[i][0] = res[i-1][0];
                    res[i][1] = Math.min(height[res[i-1][0]],height[i])*(i-res[i-1][0]);
                }
            }
            int max = 0;
            for(int m = 0;m<n;m++){
                max = Math.max(max,res[m][1]);
            }
            return max;

    }
}
