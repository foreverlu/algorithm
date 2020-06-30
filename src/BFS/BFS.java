package BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 广度优先算法
 */
public class BFS {

    int v;
    LinkedList<Integer> graph[] ;

    //根据节点个数初始化
    public BFS(int n){
        v=n;
        graph = new LinkedList[n];
        for(int i=0;i<n;i++){
            graph[i] = new LinkedList<>();
        }
    }

    public void addNode(int n,int ... m){
        if(m==null || m.length<1)
            return;

        for (int value : m) {
            graph[n].add(value);
        }
    }

    //广度优先算法
    public void bfs(int source,int target){

        if(source > v) return;

        boolean[] visited = new boolean[v];
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(source);
        visited[source]=true;

        int[] pre = new int[v];
        Arrays.fill(pre, -1);

        while (queue.size()>0){
            int node = queue.pop();
            LinkedList<Integer> neighbour = graph[node];
            if(neighbour==null || neighbour.size()<1) continue;
            for(int n : neighbour){
                if(!visited[n]){
                    visited[n]=true;
                    pre[n]=node;
                    if(n==target){
                        printBfs(pre,target);
                        return;
                    }else {
                        queue.offer(n);
                    }
                }
            }
        }
    }

    private void printBfs(int[] pre,int target){
        if(pre[target] != -1){
            printBfs(pre,pre[target]);
        }
        System.out.print(target);
    }



}
