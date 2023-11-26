package KDT.Week1.Day2;
import java.util.Scanner;
public class N4_ScannerEx1 {
    public static void main(String[] args){
        // 콘솔에서 숫자를 입력받아 짝수와 홀수를 구별하여 출력하라.
        /*
        실행
        숫자 = 16
        16은 짝수입니다.

        숫자 = 15
        15는 홀수입니다.
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자 -> ");
        int integer = scan.nextInt();
        String result = ((integer%2) == 0) ? "짝수" : "홀수";
        System.out.printf("%d는 %s입니다.\n", integer, result);
        System.out.println(integer + "는 " + result + "입니다.");

    }
}
