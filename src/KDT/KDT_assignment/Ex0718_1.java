package KDT.KDT_assignment;

import java.util.Scanner;

public class Ex0718_1 {
    public static void main(String a[]){
        // 정수를 입력받아 백의 자리 이하를 버리는 프로그램을 작성하라.
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 = ");
        int num = scan.nextInt();
        int result = (num/100)*100;
        System.out.println("실행 = " + result);
    }
}
