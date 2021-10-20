package leetcode;

import java.util.Stack;

/**
 * @author caoweiwei
 * @date 2021/9/28  下午4:09
 *
 * 使用两个栈实现一个队列
 */
public class TwoStackQueue {

    Stack<Integer> s1;
    Stack<Integer> s2;

    public TwoStackQueue(){
        s1 = new Stack<>();
        s2 = new Stack<>();

    }

    public void appendTail(int value) {
        s1.add(value);
    }

    public int deleteHead() {
        if(s2.size()<0){
            if(s1.size()<0) return -1;
            for (Integer i : s1){
                s2.push(i);
            }
        }
        return s2.pop();
    }
}
