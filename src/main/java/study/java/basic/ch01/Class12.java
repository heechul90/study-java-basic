package study.java.basic.ch01;

public class Class12 {

    public static void main(String[] args) {
        //12. 자바의 연산들 - 2 (관계, 논리 연산자)
        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
        System.out.println("value = " + value);
        System.out.println("num1 = " + num1);
        System.out.println("i = " + i);

        value = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);
        System.out.println("value = " + value);
        System.out.println("num1 = " + num1);
        System.out.println("i = " + i);
    }
}
