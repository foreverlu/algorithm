package leetcode;

/**
 * @author caoweiwei
 * @date 2021/11/8  下午1:46
 * 给你两个单词 word1 和 word2，请你计算出将 word1 转换成 word2 所使用的最少操作数 。
 *
 * 你可以对一个单词进行如下三种操作：
 *
 * 插入一个字符
 * 删除一个字符
 * 替换一个字符
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/edit-distance
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MinDistance {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        if(m*n==0){
            return n+m;
        }

        int[][] rec = new int[n+1][m+1];

        for(int i=0;i<n;i++){
            rec[i][0] = i;
        }
        for(int i=0;i<m;i++){
            rec[0][i] = i;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                int left = rec[i-1][j]+1;
                int r = rec[i][j-1];
                int c = rec[i-1][j-1];
                if(word1.charAt(i)!=word2.charAt(j)){
                    c+=1;
                }
                rec[i][j] = Math.min(left,Math.min(r,c));
            }
        }

        return rec[n][m];
    }
}
