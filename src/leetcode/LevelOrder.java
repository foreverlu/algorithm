package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author caoweiwei
 * @date 2021/10/20  下午2:56
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 */
public class LevelOrder {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(null == root) {
            return Collections.emptyList();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();

        queue.offer(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> l = new ArrayList<>();
            res.add(l);
            while (size-->0){
                TreeNode n = queue.poll();
                l.add(n.val);
                if(n.left!=null){
                    queue.offer(n.left);
                }
                if(n.right!=null){
                    queue.offer(n.right);
                }
            }
        }
        return res;
    }

}
