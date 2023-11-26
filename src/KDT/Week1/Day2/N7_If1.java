package KDT.Week1.Day2;

import java.util.Scanner;

public class N7_If1 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = 1234;
        // if 문 :
        /*  조건문은 논리형 결과가 나오는 수식 또는 변수
            if(조건문){
                조건문이 참일때 실행할 실행문을 표기한다.
            }
        */
        // 임의 값을 입력받아 그 값이 양수이면 출력하고 양수가 아니면 아무런 작업을 하지 않는다.
        System.out.print("임의의 수 -> ");
        int data = scan.nextInt();
        if(data >= 1){
            System.out.println("data => " + data);
            int x = 5678;
            System.out.println("if -> " + n + " " + x);
        }
        System.out.println("End..");
    }
}
