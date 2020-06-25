package com.igeekspace;

import java.util.Stack;

/**
 * 由两个栈组成的队列
 */
public class StackQueue {
    /**
     * 用于放输入状态的数据，可以看作一个辅助用的Stack，add操作时，先将数据放到这里
     */
    private Stack<Double> inStack;

    /**
     * 用于放元素数据，poll、 peek直接取这里的数据
     */
    private Stack<Double> outStack;

    public StackQueue() {
        inStack = new Stack<Double>();
        outStack = new Stack<Double>();
    }

    /**
     * 往队列后面新增元素
     *
     * @param e 元素值
     * @return 新增成功返回true
     */
    public boolean add(double e) {
        while (!outStack.isEmpty()) {
            inStack.push(outStack.pop());
        }

        outStack.push(e);

        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }

        return true;
    }

    /**
     * Retrieves and removes the head of this queue, or returns null if this queue is empty.
     *
     * @return 返回队列头的元素，如果队列为空，则返回null
     */
    public Double pool() {
        if (outStack.isEmpty()) {
            return null;
        }

        return outStack.pop();
    }

    /**
     * Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
     *
     * @return 返回队列头的元素，如果队列为空，则返回null
     */
    public Double peek() {
        if (outStack.isEmpty()) {
            return null;
        }

        return outStack.peek();
    }
}
