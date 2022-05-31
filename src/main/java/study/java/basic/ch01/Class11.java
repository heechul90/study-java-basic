package study.java.basic.ch01;

public class Class11 {

    public static void main(String[] args) {
        //11. 자바의 연산들 - 1 (대입, 부호, 복합대입, 증감연산자)
        int gameScore = 150;
        int lastScore = gameScore++;
        System.out.println("gameScore = " + gameScore);
        System.out.println("lastScore = " + lastScore);
    }
}
