package KDT.KDT_assignment;

import java.util.Scanner;

public class Ex0718_4 {
    public static void main(String a[]){
        // [필수 : 삼항연산자 사용하기]
        // 과일의 수와 바구니크기를 입력받아 필요한 바구니갯수를 구하는 프로그램을 작성하라
        Scanner scan = new Scanner(System.in);
        System.out.print("과일수 = ");
        int fruit = scan.nextInt();
        System.out.print("바구니 크기 = ");
        int basket = scan.nextInt();
        int result =
                (fruit % basket == 0)?(fruit / basket) : ((fruit/basket)+1);
        System.out.println("결과 = " + result);
    }
}
