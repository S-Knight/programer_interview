package test;

import com.igeekspace.MyStack;

import java.util.Scanner;

public class MyStackTest {
    private MyStack myStack;
    private Scanner scanner;

    public MyStackTest() {
        myStack = new MyStack();

        scanner = new Scanner(System.in);

        String userChoice = "";
        do {
            showTips();
            userChoice = scanner.next();

            if (userChoice.equals("1")) {
                push();
            } else if (userChoice.equals("2")) {
                pop();
            } else if (userChoice.equals("3")) {
                getMin();
            }else if(!userChoice.equals("q")) {
                System.out.println("输入错误，请重新输入!");
            }
        } while (!userChoice.equals("q"));
    }

    public void showTips() {
        System.out.println("--------请选择要执行的操作--------");
        System.out.println("1：push元素");
        System.out.println("2：pop元素");
        System.out.println("3：获取当前栈中最小的元素");
        System.out.println("q：退出");
    }

    public void push() {
        System.out.println("请输入要push的元素:");

        double num = scanner.nextDouble();
        myStack.push(num);
    }

    public void pop() {
        double num = myStack.pop();

        System.out.println("pop得到的元素为:" + num);
    }

    public void getMin() {
        double num = myStack.getMin();

        System.out.println("getMin得到的元素为:" + num);
    }
}
