package com.igeekspace;

import java.util.Stack;

/**
 * 仅用递归函数和栈操作逆序一个栈
 */
public class ReverseStack {
    private Stack<Integer> stack;

    public ReverseStack() {
        stack = new Stack<Integer>();

        //初始数据就写死了
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
    }

    public Integer getAndRemoveLast() {
        int num = stack.pop();

        if (stack.isEmpty()) {
            return num;
        } else {
            int last = getAndRemoveLast();
            stack.push(num);

            return last;
        }
    }

    public void reverse() {
        if (stack.empty()) {
            return;
        }

        int last = getAndRemoveLast();
        reverse();
        stack.push(last);
    }

    public Stack<Integer> getStack() {
        return stack;
    }
}
