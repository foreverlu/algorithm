package leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @author caoweiwei
 * @date 2021/10/20  下午7:42
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 * 按层遍历就可以了
 */
public class IsSymmetric {


    public boolean isSymmetric1(TreeNode node){
        if(node == null || (node.right==null && node.left==null)){
            return true;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(node);

        while(queue.size()>0){
            int size = queue.size();
            if(!check1(queue)){
                return false;
            }
        }
        return true;
    }

    private boolean check1(Deque<TreeNode> queue) {
        int size = queue.size();
        TreeNode[] ts  = new TreeNode[size];
        int i=0;
        while(!queue.isEmpty()){
            ts[i]=queue.poll();
            queue.offer(ts[i].left);
            queue.offer(ts[i].right);
            i++;
        }
        int m=0,n=size-1;
        while(m<n){
            if(ts[m]==null && ts[n]!=null){
                return false;
            }
            if(ts[m]!=null && ts[n]==null){
                return false;
            }
            if(ts[m]!=null && ts[n]!=null){
                if (ts[m].val != ts[n].val) {
                    return false;
                }
            }
            m++;n--;
        }
        return true;
    }


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
