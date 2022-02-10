package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author caoweiwei
 * @date 2021/10/22  上午9:09
 * 给你一个整数 n ，找出从 1 到 n 各个整数的 Fizz Buzz 表示，并用字符串数组 answer（下标从 1 开始）返回结果，其中：
 *
 * answer[i] == "FizzBuzz" 如果 i 同时是 3 和 5 的倍数。
 * answer[i] == "Fizz" 如果 i 是 3 的倍数。
 * answer[i] == "Buzz" 如果 i 是 5 的倍数。
 * answer[i] == i 如果上述条件全不满足。
 *
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xngt85/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 *
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        if(n<1){
            return Collections.emptyList();
        }

        List<String> answer = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5!=0){
                answer.add("Fizz");
            }else if(i%3!=0 && i%5==0){
                answer.add("Buzz");
            }else if(i%3==0 && i%5==0){
                answer.add("FizzBuzz");
            }else {
                answer.add(i+"");
            }
        }
        return answer;
    }
}
