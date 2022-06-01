package study.java.basic.ch01;

import java.util.Scanner;

public class Class18 {

    public static void main(String[] args) {
        //18. 반복문 - do-while 문
        Scanner scanner = new Scanner(System.in);
        int input;
        int sum = 0;

        do {
            input = scanner.nextInt();
            sum += input;

        } while (input != 0);

        System.out.println(sum);
    }
}
