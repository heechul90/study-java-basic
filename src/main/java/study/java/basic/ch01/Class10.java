package study.java.basic.ch01;

public class Class10 {

    public static void main(String[] args) {
        //10. 변하지 않는 상수와 리터럴, 변수의 형 변환
        final int MAX_NUM = 100;
        final int MIN_NUM;
        MIN_NUM = 10;
        System.out.println("MAX_NUM = " + MAX_NUM);
        System.out.println("MIN_NUM = " + MIN_NUM);

        byte bNum = 125;
        int iNum = bNum;
        System.out.println("bNum = " + bNum);
        System.out.println("iNum = " + iNum);

        int iNum2 = 255;
        byte bNum2 = (byte) iNum2;
        System.out.println("iNum2 = " + iNum2);
        System.out.println("bNum2 = " + bNum2);

        double dNum = 1.2;
        float fNum = 0.9F;
        int iNum3 = (int) dNum + (int) fNum;
        int iNum4 = (int) (dNum + fNum);
        System.out.println("iNum3 = " + iNum3);
        System.out.println("iNum4 = " + iNum4);
    }
}
