package KDT.Week1.Day2;
import java.util.Scanner;
public class N9_IfElse1 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        // 정수를 입력받아 0보다 크면 100을 곱한값을 출력하고
        //             0보다 작으면 양수로 만들어 100을 곱하여 출력하라.
        /*  if(조건식){
         *       참일때 실행;
         *   } else{
         *       거짓일때 실행;
         *   }
        */

        System.out.print("정수입력 = ");
        int num = s.nextInt();
        int result;
        if (num > 0){ // 양수일때
            result = num * 100;
        } else {
            result = Math.abs(num) * 100;
        }
        System.out.println("result : " + result);
    }
}
