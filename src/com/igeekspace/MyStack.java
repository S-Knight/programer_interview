package com.igeekspace;

import java.util.Stack;

/**
 * 一个有 getMin 功能的栈
 */
public class MyStack {
    private Stack<Double> nums;
    private Stack<Double> mins;

    public MyStack() {
        nums = new Stack<Double>();
        mins = new Stack<Double>();
    }

    public double pop() {
        mins.pop();

        return nums.pop();
    }

    public double push(double num) {
        nums.push(num);

        if (mins.empty()) {
            mins.push(num);
        } else {
            double top = mins.peek();
            mins.push(Math.min(num, top));
        }

        return num;
    }

    public double getMin() {
        return mins.peek();
    }
}
