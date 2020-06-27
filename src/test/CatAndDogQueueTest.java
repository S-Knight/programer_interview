package test;

import com.igeekspace.catanddog.Cat;
import com.igeekspace.catanddog.CatAndDogQueue;
import com.igeekspace.catanddog.Dog;
import com.igeekspace.catanddog.Pet;

import java.util.Scanner;

public class CatAndDogQueueTest {
    private CatAndDogQueue catAndDogQueue;
    private Scanner scanner;

    public CatAndDogQueueTest() {
        catAndDogQueue = new CatAndDogQueue();

        scanner = new Scanner(System.in);

        String userChoice = "";
        do {
            showTips();
            userChoice = scanner.next();

            if (userChoice.equals("1")) {
                add();
            } else if (userChoice.equals("2")) {
                pollAll();
            } else if (userChoice.equals("3")) {
                pollDog();
            } else if (userChoice.equals("4")) {
                pollCat();
            } else if (!userChoice.equals("q")) {
                System.out.println("输入错误，请重新输入!");
            }
        } while (!userChoice.equals("q"));
    }

    private void showTips() {
        System.out.println("--------请选择要执行的操作--------");
        System.out.println("1：add 将 cat 类或 dog 类的实例放入队列中");
        System.out.println("2：pollAll");
        System.out.println("3：pollDog");
        System.out.println("4：pollCat");
        System.out.println("q：退出");
    }

    private void add() {
        System.out.println("请输入要add的pets,一次输入多个pets，pets间用英文空格隔开,添加一个Dog，则输入'dog'," +
                "添加一个Cat，则输入'cat'");
        Scanner tempScanner = new Scanner(System.in);
        String[] pets = tempScanner.nextLine().split(" ");

        for (String pet : pets) {
            if (!pet.equals("dog") && !pet.equals("cat")) {
                System.out.println("输入有误，请重新输入");
                return;
            }
        }

        for (String pet : pets) {
            if (pet.equals("dog")) {
                Dog dog = new Dog();
                catAndDogQueue.add(dog);
            } else {
                Cat cat = new Cat();
                catAndDogQueue.add(cat);
            }
        }

        System.out.println("add成功" + pets.length + "个Pets");
    }

    private void pollAll() {
        if (catAndDogQueue.isEmpty()) {
            System.out.println("队列为空");
            return;
        }

        Pet pet = catAndDogQueue.pollAll();
        System.out.println("pull出一个" + pet.getPetType());
    }

    private void pollDog() {
        if (catAndDogQueue.isDogEmpty()) {
            System.out.println("队列中没有Dog了");
            return;
        }

        Dog dog = catAndDogQueue.pollDog();

        System.out.println("pull出一个Dog");
    }

    private void pollCat() {
        if (catAndDogQueue.isCatEmpty()) {
            System.out.println("队列中没有Dog了");
            return;
        }

        Cat cat = catAndDogQueue.pollCat();

        System.out.println("pull出一个Cat");
    }
}
