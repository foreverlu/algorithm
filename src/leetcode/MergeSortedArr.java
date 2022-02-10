package leetcode;

/**
 * @author caoweiwei
 * @date 2021/10/21  上午11:15 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 * <p>
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 * <p>
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 * <p>
 * 作者：力扣 (LeetCode) 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnumcr/ 来源：力扣（LeetCode） 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class MergeSortedArr {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                temp[k++] = nums1[i++];
            } else {
                temp[k++] = nums2[j++];
            }
        }
        while (i < m) {
            temp[k++] = nums1[i++];
        }
        while (j < n) {
            temp[k++] = nums2[j++];
        }

        System.arraycopy(temp, 0, nums1, 0, n + m);
    }


    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = n + m - 1;
        while (i >= 0 && j >= 0 && k >= 0) {
            if(nums1[i]<=nums2[j]){
                nums1[k--] = nums2[j--];
            }else{
                nums1[k--] = nums1[i--];
            }
        }

        while (i>=0){
            nums1[k--] = nums1[i--];
        }
        while (j>=0){
            nums1[k--] = nums2[j--];
        }
    }

}
