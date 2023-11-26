package KDT.Week1.Day3;

import java.util.Scanner;

public class D3_3SwitchEx1 {
    public static void main(String a[]){
        /* 콘솔에서 국어, 영어, 수학점수를 입력받아 총점, 평군, 학점을 구하라.
        * 단 if을 사용하지 않아야 한다.
        * 점수범위 : 각 과목은 0~100사이의 값이다
        * 실행
        * 국어점수 -> ~
        * 영어점수 -> ~
        * 수학점수 -> ~
        *
        * 총점 -> ~
        * 평균 -> ~
        * 학점 ~
        */
        Scanner scan = new Scanner(System.in);

        System.out.print("국어점수 -> ");
        int kor = scan.nextInt();
        if (kor > 100){
            while(kor > 100){
                System.out.println("잘못입력하셨습니다. 허용범위 : 0 ~ 100");
                System.out.print("국어점수 -> ");
                kor = scan.nextInt();
            }
        }

        System.out.print("영어점수 -> ");
        int eng = scan.nextInt();
        if (eng > 100){
            while(eng > 100){
                System.out.println("잘못입력하셨습니다. 허용범위 : 0 ~ 100");
                System.out.print("영어점수 -> ");
                eng = scan.nextInt();
            }
        }

        System.out.print("수학점수 -> ");
        int mat = scan.nextInt();
        if (mat > 100){
            while(mat > 100){
                System.out.println("잘못입력하셨습니다. 허용범위 : 0 ~ 100");
                System.out.print("수학점수 -> ");
                mat = scan.nextInt();
            }
        }
        System.out.println("");

        int total = kor + eng + mat;
        double average = total/3.;
        char grade;
        switch((int)average/10){
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.printf("총점 -> %d\n",total);
        System.out.printf("평균 -> %.2f\n", average);
        System.out.printf("학점 -> %s\n", grade);
    }
}
