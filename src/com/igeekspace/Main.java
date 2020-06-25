package com.igeekspace;

import test.MyStackTest;
import test.ReverseStackTest;
import test.StackQueueTest;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------请选择要执行的程序--------");
        System.out.println("1:设计一个有 getMin 功能的栈");
        System.out.println("2:由两个栈组成的队列");
        System.out.println("3:仅用递归函数和栈操作逆序一个栈");

        Scanner scanner = new Scanner(System.in);

        int userChoice = scanner.nextInt();

        if (userChoice == 1) {
            MyStackTest myStackTest = new MyStackTest();
        } else if (userChoice == 2) {
            StackQueueTest stackQueueTest = new StackQueueTest();
        } else if (userChoice == 3) {
            ReverseStackTest reverseStackTest = new ReverseStackTest();
        }
    }
}
