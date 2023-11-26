package KDT.Week1.Day2;
import java.util.Scanner;
public class N6_OperatorEx1 {
    public static void main(String args[]){
        // 급여를 입력받아 급여($) 100불 미만이면 보너스를 급여의 20%로 처리하고
        //                    100불 이상이면 보너스를 급여의 10%로 처리하라.
        /*실행
        * 급여 -> 90
        * 보너스 -> 18
        *
        * 급여 -> 120
        * 보너스 -> 12*/
        Scanner scan = new Scanner(System.in);
        System.out.print("급여 -> ");
        int salary = scan.nextInt();
        int bonus = (int)((salary < 100) ? (salary * 0.2) : (salary * 0.1));
        System.out.println("보너스는 " + bonus + "로 총 급여는 " + (salary + bonus) + "입니다.");
    }
}
