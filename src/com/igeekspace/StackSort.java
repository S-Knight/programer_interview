package com.igeekspace;

import java.util.Stack;

/**
 * 用一个栈实现另一个栈的排序
 */
public class StackSort {
    /**
     * 用来排序的Stack
     */
    private Stack<Integer> stack;

    /**
     * 用来辅助排序的Stack
     */
    private Stack<Integer> helpStack;

    public StackSort() {
        stack = new Stack<>();

        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(1);
        stack.push(2);

        helpStack = new Stack<>();
    }

    public void sort() {
        while (!stack.empty()) {
            moveTopToHelp();
        }

        while (!helpStack.empty()) {
            stack.push(helpStack.pop());
        }
    }

    /**
     * 将stack的栈顶元素移到helpStack去,但是要保证helpstack栈顶到栈底是从小到大排列好
     */
    private void moveTopToHelp() {
        int num = stack.pop();

        while (!helpStack.empty() && helpStack.peek() < num) {
            stack.push(helpStack.pop());
        }

        helpStack.push(num);
    }

    public Stack<Integer> getStack() {
        return stack;
    }
}
