package KDT.Week1.Day3;

import java.util.Scanner;

public class D3_2SwitchTest {
    public static void main(String[] a){
        // switch : 범위가 없는 조건문, int보다 작거나 같은 데이터형이어야 한다.
        /* int, byte, short, char, String형
        *   switch(변수 or 수식 or 상수){
        *       case 상수 :
        *           실행문; ...
        *           break; <- 생략 가능
        *       case 상수 :
        *           ~
        *       ...
        *   }
        */
        Scanner scan = new Scanner(System.in);
        // 입력 받은 값이 1: 빨강, 2: 파랑, 3: 노랑, 4: 초록, 그외의 값은 잘못된 데이터.
        System.out.print("색상번호를 입력하세요 -> ");
        int colorNum = scan.nextInt();
        String color = new String("");
        switch (colorNum){
            case 1:
                color = "빨강";
                break;
            case 2:
                color = "파랑";
                break;
            case 3:
                color = "노랑";
                break;
            case 4:
                color = "초록";
                break;
            default :
                color = "잘못된 컬러 정보";
        }
        System.out.println(colorNum + "은(는) " + color + "입니다.");
    }
}
