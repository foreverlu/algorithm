package bucketsort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author caoww
 * @Date 2025/9/15 08:35
 *
 * 出现频率最多的 k 个元素
 *
 **/
public class TopKFrequent {

    public static void main(String[] args) {

        int[] arr = {1,1,1,2,2,3,5,4,5,5,5,55,6,6,7,7,88,9,9,3,5,3,67,8,9,9,8,7,6,5,4,3,2,1};
        int[] res = tokKFrequent(arr,2);
        for(int r : res){
            System.out.println(r);
        }

    }

    public static int[] tokKFrequent(int[] arr, int k){

        Map<Integer,Integer> frequentMap = new HashMap();

        for(int i=0;i<arr.length;i++){
            frequentMap.put(arr[i],frequentMap.getOrDefault(arr[i],0)+1);
        }

        List<Integer>[] buckets = new ArrayList[arr.length + 1];

        for(int key : frequentMap.keySet()){
            Integer frequency = frequentMap.get(key);
            if(buckets[frequency] == null){
                buckets[frequency] = new ArrayList<>();
            }

            buckets[frequency].add(key);

        }


        List<Integer> topK = new ArrayList<>();

        for(int i = buckets.length - 1;i>=0 && topK.size()<k;i--){
            if(buckets[i]==null){
                continue;
            }

            if(buckets[i].size() < k - topK.size()){
                topK.addAll(buckets[i]);
            }else{
                topK.addAll(buckets[i].subList(0,k-topK.size()));
            }

        }

        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = topK.get(i);

        }

        return res;

    }
}
