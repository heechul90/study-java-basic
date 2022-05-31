package study.java.basic.ch01;

import java.util.Scanner;

public class Class13 {

    public static void main(String[] args) {
        //13. 자바의 연산들 - 3 (조건 연산자, 비트 연산자)
        int max;
        System.out.println("입력 받은 두 수중 큰 수를 출력하세요\n ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력1:");
        int x = scanner.nextInt();
        System.out.println("입력2:");
        int y = scanner.nextInt();

        max = (x > y)? x : y;
        System.out.println(max);


        int num1 = 5;  	// 00000101
        int num2 = 10; 	// 00001010

        System.out.println(num1 | num2);
        System.out.println(num1 & num2);
        System.out.println(num1 ^ num2);
        System.out.println(~num1);

        System.out.println(num1 << 2);
        System.out.println(num1);
        System.out.println(num1 <<= 2);
        System.out.println(num1);
    }
}
