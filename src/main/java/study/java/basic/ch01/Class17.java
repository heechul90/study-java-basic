package study.java.basic.ch01;

public class Class17 {

    public static void main(String[] args) {
        //17. 반복문 - while문
        int num = 1;
        int sum  = 0;

        while( num <= 10) {
            sum += num;
            num++;
        }

        System.out.println(sum);
        System.out.println(num);
    }
}
