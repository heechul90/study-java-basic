package study.java.basic.ch01;

public class Class21 {

    public static void main(String[] args) {
        //21. 중간에 멈추는 break문, 무시하고 계속 진행하는 continue문
        int sum = 0;
        int num;
        for (num = 1; ; num++) {

            sum += num;
            if (sum >= 100) {
                break;
            }
        }

        System.out.println(sum);
        System.out.println(num);


        int numCoutinew;
        for( numCoutinew = 1; numCoutinew <= 100; numCoutinew++) {

            if( (numCoutinew % 3) != 0) continue;

            System.out.println(numCoutinew);

        }
    }
}
