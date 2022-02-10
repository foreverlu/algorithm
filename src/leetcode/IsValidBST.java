package leetcode;

import java.util.Stack;

/**
 * @author caoweiwei
 * @date 2021/10/20  下午3:30
 * 给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。
 *
 * 有效 二叉搜索树定义如下：
 *
 * 节点的左子树只包含 小于 当前节点的数。
 * 节点的右子树只包含 大于 当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn08xg/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class IsValidBST {

    TreeNode pre;

    public boolean isValidBST(TreeNode root) {
        if(root.left!=null){
           return isValidBST(root.left);
        }
        if(pre !=null && pre.val>=root.val){
            return false;
        }
        pre = root;
        if(root.right!=null){
            return isValidBST(root.right);
        }
        return true;
    }



   public void middleScan(TreeNode root){

       Stack<TreeNode> stack = new Stack<>();
        while (root != null && !stack.isEmpty()){

            while(root!=null){
                stack.push(root);
                root = root.left;
            }

            TreeNode pop = stack.pop();
            if(pop.right!=null){
                System.out.println(pop.right.val);
                root = pop.right;
            }

        }

   }
}
