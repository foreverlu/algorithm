package leetcode;

/**
 * @author caoweiwei
 * @date 2021/10/21  上午9:34 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
 * <p>
 * 高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。
 * <p>
 * 作者：力扣 (LeetCode) 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xninbt/ 来源：力扣（LeetCode） 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return null;
        }
        return sortedArrayToBST(nums,0,nums.length-1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode r = new TreeNode(nums[mid]);
        r.left = sortedArrayToBST(nums,start,mid-1);
        r.right = sortedArrayToBST(nums,mid+1,end);
        return r;
    }
}
