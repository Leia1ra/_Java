package KDT.KDT_assignment;

import java.util.Scanner;

public class Ex0718_2 {
    public static void main(String a[]){
        // 정수를 입력받아 일의 자리의 값을 1로 바꾸는 프로그램을 작성하라.
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 = ");
        int num = scan.nextInt();
        int result = ((num / 10) * 10) + 1;
        System.out.println("실행 = " + result);
    }
}
