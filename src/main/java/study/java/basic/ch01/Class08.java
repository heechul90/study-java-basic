package study.java.basic.ch01;

public class Class08 {

    public static void main(String[] args) {
        //08. 자료형(data type) - 문자는 프로그램에서 어떻게 표현하여 사용하나.
        char ch1 = 'A';
        System.out.println("ch1 = " + ch1);
        System.out.println("ch1 = " + (int) ch1);

        char ch2 = 66;
        System.out.println("ch2 = " + ch2);
        System.out.println("ch2 = " + (char) ch2);

        int ch3 = 67;
        System.out.println("ch3 = " + ch3);
        System.out.println("ch3 = " + (char) ch3);

        char han = '한';
        char uni = '\uD55C';
        System.out.println("han = " + han);
        System.out.println("uni = " + uni);
    }
}
