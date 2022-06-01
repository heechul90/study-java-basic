package study.java.basic.ch01;

public class Class20 {

    public static void main(String[] args) {
        //20. 반복문이 여러 번 포개진 중첩 반복문
        int dan = 2;
        int count = 1;

        for (dan = 2; dan <= 9; dan++) {

            for (count = 1; count <= 9; count++) {

                System.out.println(dan + "X" + count + "=" + dan * count);
            }
            System.out.println();
        }

        dan = 2;
        while (dan <= 9) {
            count = 1;
            while (count <= 9) {

                System.out.println(dan + "X" + count + "=" + dan * count);
                count++;

            }
            dan++;
            System.out.println();
        }
    }
}
