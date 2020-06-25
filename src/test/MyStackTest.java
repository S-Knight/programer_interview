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
        do{
            showTips();
            userChoice = scanner.next();

            if (userChoice.equals("1")) {
                push();
            }
        }while (!userChoice.equals("q"));
    }

    public void showTips() {
        System.out.println("--------请选择要执行的操作--------");
        System.out.println("1：push元素");
        System.out.println("2：pop元素");
        System.out.println("3：获取当前栈中最小的元素");
        System.out.println("q：退出");
    }

    public void push() {
        System.out.println("请输入要push的元素");

        double num = scanner.nextDouble();
        myStack.push(num);
    }
}
