package KDT.Alorithm.Day1;

import java.util.Scanner;

public class N01_IfEx {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("국어점수입력 : ");
            int kor = Integer.parseInt(scan.nextLine());
            System.out.print("영어점수입력 : ");
            int eng = Integer.parseInt(scan.nextLine());
            System.out.print("수학점수입력 : ");
            int mat = Integer.parseInt(scan.nextLine());
            double average = (kor + eng + mat) / 3;

            // if(kor >= 40 && eng >= 40 && mat >= 40){
            //     if(average >=60){
            //         System.out.println("결과 = 합격");
            //     }else {
            //         System.out.println("결과 = 불합격");
            //     }
            // }else {
            //     System.out.println("결과 = 과락으로 불합격");
            // }
            // System.out.println();

            if((kor >= 40 && eng >= 40 && mat >= 40) && average >=60){
                System.out.println("결과 = 합격");
            } else if((kor >= 40 && eng >= 40 && mat >= 40) && average <60){
                System.out.println("결과 = 불합격");
            } else if(kor < 40 || eng < 40 || mat < 40){
                System.out.println("결과 = 과락으로 불합격");
            }
            System.out.println();
        }
    }
}
