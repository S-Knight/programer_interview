package com.igeekspace;

import test.MyStackTest;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------请选择要执行的程序--------");
        System.out.println("1:设计一个有 getMin 功能的栈");

        Scanner scanner = new Scanner(System.in);

        int userChoice = scanner.nextInt();

        if (userChoice == 1) {
            MyStackTest myStackTest = new MyStackTest();
        }
    }
}
