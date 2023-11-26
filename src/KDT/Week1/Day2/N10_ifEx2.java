package KDT.Week1.Day2;
import java.util.Scanner;
import java.lang.Math;

public class N10_ifEx2 {
    public static void main(String args[]){
        // if else문 사용하기
        /*실행결과
        * 원하는 메뉴를 선택(1. 사각형의 넓이, 2. 원의 넓이)?1
        * 가로(밑변) = ___
        * 세로(높이) = ___
        * 사각형의 넓이 = ___
        *
        * 원하는 메뉴를 선택(1. 사각형의 넓이, 2. 원의 넓이)?2
        * 반지름 = ___
        * 원의 넓이 = ___*/
        Scanner scan = new Scanner(System.in);
        System.out.print("원하는 메뉴를 선택(1. 사각형의 넓이, 2. 원의 넓이) -> ");
        int menu = scan.nextInt();
        if (menu == 1){
            System.out.print("가로(밑변) -> ");
            int width = scan.nextInt();
            System.out.print("세로(높이) -> ");
            int height = scan.nextInt();

            System.out.println("사각형의 넓이 = " + (width * height));
        } else if (menu == 2){
            System.out.print("반지름 -> ");
            int radius = scan.nextInt();

            System.out.println("원의 넓이 = " + (Math.pow(radius, 2) * Math.PI));
        } else {
            System.out.println("잘못 입력하였습니다.");
        }
        scan.close();
    }
}
