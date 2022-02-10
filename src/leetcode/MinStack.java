package leetcode;

import java.util.Stack;

/**
 * @author caoweiwei
 * @date 2021/10/21  下午7:33
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) —— 将元素 x 推入栈中。
 * pop() —— 删除栈顶的元素。
 * top() —— 获取栈顶元素。
 * getMin() —— 检索栈中的最小元素。
 *
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnkq37/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class MinStack {
    int[] minVal;
    int[] arr;
    int capacity;
    int n;

    public MinStack(int size) {
        arr = new int[size];
        capacity = size;
        minVal = new int[size];
        n = 0;
    }

    public void push(int val) {
        if(n>= capacity){
            return;
        }

        arr[n] = val;
        if(n>0) {
            minVal[n] = Math.min(minVal[n-1], val);
        }else {
            minVal[n] = val;
        }
        n++;
    }

    public void pop() {
        if(n<=0){
            return;
        }
        n--;
    }

    public int top() {
        if(n<=0){
            return -1;
        }
        return arr[n-1];
    }

    public int getMin() {
        return minVal[n-1];
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack(235);

        stack.push(-2);
        stack.push(0);
        stack.push(-3);
        stack.getMin();
        stack.pop();
        stack.top();
        stack.getMin();
    }
}
