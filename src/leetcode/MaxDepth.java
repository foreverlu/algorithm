package leetcode;

import com.sun.javafx.scene.control.skin.VirtualFlow.ArrayLinkedList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author caoweiwei
 * @date 2021/10/20  下午2:31
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 */
public class MaxDepth {

    //层遍历
    public int maxDepth3(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        int depth = 0;
        if(null == root){
            return 0;
        }
        queue.offer(root);
        while(queue.size()>0){
            depth++;
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }

        }


        return depth;
    }

    public int maxDepth(TreeNode root) {
        if(null == root){
            return 0;
        }
        int l = 0,r=0;
       if(root.left!=null){
           l = maxDepth(root.left);
       }
       if(root.right !=null){
           r = maxDepth(root.right);
       }
       l++;
       r++;
       return Math.max(l,r);
    }

    public int maxDepth1(TreeNode root) {
        if(null == root) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        int count=0;
        while (!queue.isEmpty()){
            int size = queue.size();
            count++;
            while (size-->0){
                TreeNode n = queue.poll();

                if(n.left!=null){
                    queue.offer(n.left);
                }
                if(n.right!=null){
                    queue.offer(n.right);
                }
            }
        }
        return count;
    }


    public int maxDepth2(TreeNode root) {
        if(null == root) {
            return 0;
        }
        int l = 0,r=0;
        if(root.left!=null){
            l+= maxDepth2(root.left);
        }
        if(root.right!=null){
            r += maxDepth2(root.right);
        }
        l++;
        r++;
        return Math.max(l,r);
    }





}
