package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caoweiwei
 * @date 2021/11/10  下午5:18 给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。 如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
 * <p>
 * 注意：
 * <p>
 * 对于 t 中重复字符，我们寻找的子字符串中该字符数量必须不少于 t 中该字符数量。 如果 s 中存在这样的子串，我们保证它是唯一的答案。
 * <p>
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/minimum-window-substring 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MinWindow {

    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 || t.length() > s.length()) {
            return "";
        }
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int n = t.length();
        int left = 0, right = 0;

        while (right < s.length()) {
            char sc = s.charAt(right);
            if (map.containsKey(sc)) {
                if (map.get(sc) > 0) {
                    n--;
                }
                map.put(sc, map.get(sc) - 1);

                while (left<=right){
                    char c = s.charAt(left);
                    if(!map.containsKey(c)){
                        left++;
                    }else {
                        Integer i = map.get(c);
                        if(i<0){
                            map.put(c,map.get(c)+1);
                            left++;
                        }else {
                            break;
                        }
                    }
                }
            }
            right++;
        }

        if (n > 0) {
            return "";
        }

        return s.substring(left, right);
    }


}
