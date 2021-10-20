package leetcode;

/**
 * @author caoweiwei
 * @date 2021/10/18  下午6:37 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 */
public class FirstUniqChar {

    public int firstUniqChar(String s) {

        char[] arr = s.toCharArray();
        int n = -1;
        for (int i = 0; i < arr.length; i++) {
            n=i;
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    continue;
                }
                if(arr[i]==arr[j]){
                    n=-1;
                    break;
                }
            }
        }

        return n;
    }
}
