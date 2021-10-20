package leetcode;

/**
 * @author caoweiwei
 * @date 2021/10/19  下午2:15 使用BM算法计算两个字符串匹配 1. 坏字符串 1、将
 */
public class BMStrStr {

    public static int SIZE = 256;

    public static void main(String[] args) {
        System.out.println(bm("aaaaa",
            "bba"));
    }

    public static int bm(String haystack, String needle) {
        if ("".equals(needle)) {
            return 0;
        }

        if (needle.length() > haystack.length()) {
            return -1;
        }

        int[] bc = new int[SIZE];
        generateBC(needle, bc);
        int[] suffix = new int[needle.length()];
        boolean[] prefix = new boolean[needle.length()];
        generateSuffixAndPrefix(needle, suffix, prefix);
        int m = haystack.length();
        int n = needle.length();
        char[] hArr = haystack.toCharArray();
        char[] nArr = needle.toCharArray();
        //比较
        for (int i = 0; i <= m - n; ) {
            int j = i;
            int p = n - 1;
            for (; p >= 0; p--) {
                if (nArr[p] != hArr[j + p]) {
                    break;
                }

            }
            if(p<0){
                return i;
            }

            //计算移动位置x
            int x = p-bc[hArr[p+j]];
            int y=0;
            if(p<n-1){
                int a = suffix[n - p - 1];
                if(a!=-1){
                    y= p-a+1;
                }else {
                    for(int r=p+2;r<=n-1;r++){
                        if(prefix[n-r]){
                            y= r;
                            break;
                        }
                    }

                }
            }
            i=i+Math.max(x,y);
        }

        return -1;
    }

    private static void generateSuffixAndPrefix(String needle, int[] suffix, boolean[] prefix) {
        int n = needle.length();
        for (int i = 0; i < n; i++) {
            suffix[i] = -1;
            prefix[i] = false;
        }

        char[] arr = needle.toCharArray();
        for (int i = 0; i < n - 1; i++) {
            int j = i;
            int k = 0;
            while (j >= 0 && k < n - 1 && arr[j] == arr[n - 1 - k]) {
                k++;
                --j;
                suffix[k] = j+1;
            }
            if (j < 0) {
                prefix[k] = true;
            }
        }
    }

    //生成坏字符串数组
    public static void generateBC(String needle, int[] bc) {
        char[] arr = needle.toCharArray();
        int n = arr.length;
        for (int i = 0; i < bc.length; i++) {
            bc[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            bc[arr[i]] = i;
        }
    }
}
