package study.java.basic.ch01;

public class Class09 {

    public static void main(String[] args) {
        //09. 자료형(data type) - 논리형과 자료형 없이 변수 사용하기
        var i = 10;
        var j = 10.0;
        var str = "test";
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("str = " + str);

        var str2 = str;
        System.out.println("str2 = " + str2);
    }
}
