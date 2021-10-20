package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caoweiwei
 * @date 2021/10/18  下午6:46
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn96us/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class IsAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram"
            , "nagaram"));
    }

    public  static boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Map<Character,Integer> sMap = new HashMap<>();
        Map<Character,Integer> tMap = new HashMap<>();
        for(int i=0;i<sArr.length;i++){
            if(sMap.containsKey(sArr[i])){
                sMap.put(sArr[i],sMap.get(sArr[i])+1);
            }else {
                sMap.put(sArr[i],1);
            }
        }

        for(int i=0;i<tArr.length;i++){
            if(tMap.containsKey(tArr[i])){
                tMap.put(tArr[i],tMap.get(tArr[i])+1);
            }else {
                tMap.put(tArr[i],1);
            }
        }

        if(sMap.size() != tMap.size()){
            return false;
        }

        for (Character character : sMap.keySet()) {
            if(tMap.containsKey(character) && tMap.get(character).equals(sMap.get(character))){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }

}
