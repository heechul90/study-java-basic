package study.java.basic.ch01;

public class Class16 {

    public static void main(String[] args) {
        //16. 조건이 여러개 일 때 간단히 표현되는 swich-case 문
        int month = 10;
        int day;

        switch(month){

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;

            case 4: case 6: case 9: case 11:
                day = 30;
                break;
            case 2:
                day = 28;
                break;
            default:
                day = 0;
                System.out.println("존재하지 않는 달 입니다.");

        }

        System.out.println(month + "월은 " + day + "일입니다.");


        String medal = "Gold";

        switch(medal) {

            case "Gold":
                System.out.println("금메달 입니다.");
                break;
            case "Silver":
                System.out.println("은메달 입니다.");
                break;
            case "Bronze":
                System.out.println("동메달 입니다.");
                break;
            default:
                System.out.println("메달이 없습니다.");
                break;
        }

        //java 14 부터 적용
        /*int month14 = 10;

        int day14 = switch (month14) {
            case 1, 3, 5, 7, 8, 10,12 -> {
                System.out.println("한 달은 31일입니다.");
                yield 31;
            }
            case 4,6,9,11 -> {
                System.out.println("한 달은 30일입니다.");
                yield 30;
            }
            case 2 ->{
                System.out.println("한 달은 28일입니다.");
                yield 28;
            }
            default->{
                System.out.println("존재하지 않는 달 입니다.");
                yield 0;
            }
        };

        System.out.println(month14 + "월은 " + day14 + "일입니다.");*/
    }
}
