package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author caoweiwei
 * @date 2021/10/20  下午7:42
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 * 按层遍历就可以了
 */
public class IsSymmetric {

    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            TreeNode[] arr = new TreeNode[queue.size()];
            for(int i=0;i<size;i++){
                TreeNode n = queue.poll();
                arr[i]=n;
                if(n == null) continue;
                queue.offer(n.left);
                 queue.offer(n.right);
            }
            if(!check(arr)) return false;
        }
        return true;
    }

    //检查是否是回文
    private boolean check(TreeNode[] arr) {
        if(null == arr || arr.length<=1){
            return true;
        }
        int i=0,j=arr.length-1;

        while (i<j){
            Integer v1 = null;
            Integer v2 = null;
            if(arr[i]!=null) v1 = arr[i].val;
            if(arr[j]!=null) v2 = arr[j].val;
            if((v1!=null && !v1.equals(v2))|| (v1==null && v2!=null)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}
