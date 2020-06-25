package test;

import com.igeekspace.StackQueue;

import java.util.Scanner;

public class StackQueueTest {
    private StackQueue stackQueue;
    private Scanner scanner;

    public StackQueueTest() {
        stackQueue = new StackQueue();
        scanner = new Scanner(System.in);

        String userChoice = "";
        do {
            showTips();
            userChoice = scanner.next();

            if (userChoice.equals("1")) {
                add();
            } else if (userChoice.equals("2")) {
                pool();
            } else if (!userChoice.equals("q")) {
                System.out.println("输入错误，请重新输入!");
            }
        } while (!userChoice.equals("q"));
    }

    private void showTips() {
        System.out.println("--------请选择要执行的操作--------");
        System.out.println("1：add元素");
        System.out.println("2：pool元素");
        System.out.println("q：退出");
    }

    private void add() {
        System.out.println("请输入要push的元素,一次输入多个元素，元素间用英文空格隔开:");
        Scanner tempScanner = new Scanner(System.in);
        String[] elements = tempScanner.nextLine().split(" ");

        for (String element : elements) {
            stackQueue.add(Double.parseDouble(element));
        }
    }

    private void pool() {
        double num = stackQueue.pool();
        System.out.println("pool得到的元素为:" + num);
    }
}
