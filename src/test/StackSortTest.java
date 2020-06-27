package test;

import com.igeekspace.StackSort;

import java.util.Stack;

public class StackSortTest {
    private StackSort stackSort;

    public StackSortTest() {
        stackSort = new StackSort();
        stackSort.sort();
        showStackElements();
    }

    private void showStackElements() {
        Stack<Integer> stack = stackSort.getStack();
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
