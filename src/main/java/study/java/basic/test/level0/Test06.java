package study.java.basic.test.level0;

import java.util.stream.IntStream;

public class Test06 {

    public static void main(String[] args) {
        //양꼬치

        int n = 64;
        int k = 6;

        int i = (n * 12000) + (2000 * (k - (n / 10)));

        System.out.println("i = " + i);
    }
}
