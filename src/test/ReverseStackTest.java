package test;

import com.igeekspace.ReverseStack;

import java.util.Stack;

public class ReverseStackTest {
    private ReverseStack reverseStack;

    public ReverseStackTest() {
        reverseStack = new ReverseStack();
        reverseStack.reverse();
        showStackElements();
    }

    private void showStackElements() {
        Stack<Integer> stack = reverseStack.getStack();
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
