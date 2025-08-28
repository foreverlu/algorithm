/**
 * @Author caoww
 * @Date 2025/8/28 08:48
 *题目描述：删除 s 中的一些字符，使得它构成字符串列表 d 中的一个字符串，找出能构成的最长字符串。如果有多个相同长度的结果，返回字典序的最小字符串。
 **/
public class LongestWordInDic {

    public static void main(String[] args) {

        String str = "abpcplea";
        String[] arr = {"ale","apple","monkey","plea"};
        System.out.println(longestWordInDic(str,arr));
    }


    public static String longestWordInDic(String str,String[] arr){


        int l = arr.length;

        String res = "";
        for(int i=0;i<l;i++){
            String ds = arr[i];
            if(ds.length() <= res.length()){
                continue;
            }
            int left =0,right =0;
            while(left < str.length()&&right < ds.length()){
                if(str.charAt(left) == ds.charAt(right)){
                    left++;
                    right++;
                }else{
                    left++;
                }
            }
            if(right == ds.length()){
                res = ds;
            }
        }

        return res;
    }
}
