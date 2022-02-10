package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author caoweiwei
 * @date 2021/10/22  下午2:30
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 * "abcabcbb"
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()<=0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        Map<Character,Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        int i=0,j=1;
        map.put(arr[i],i);
        int max = 0;
        while (j<s.length()){
           if(map.containsKey(arr[j])){
               int p  = map.get(arr[j]);
               while (i<=p){
                   map.remove(arr[i++]);
               }
           }
           max = Math.max(max,j-i+1);

           map.put(arr[j],j++);
        }

        return max;
    }
}
