package KDT.Week1.Day2;
import java.util.Scanner;
public class N8_IfEx1 {
    public static void main(String args[]){
        // 두 수를 입력받아 두 수 모두 양수일때는 합차곱몫을 구하라.
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 수 -> ");
        int _1st = scan.nextInt();
        System.out.print("두번째 수 -> ");
        int _2nd = scan.nextInt();

        if ((_1st > 0) && (_2nd > 0)){
            int sum = _1st + _2nd;
            int sub = _1st - _2nd;
            int mul = _1st * _2nd;
            int div = _1st / _2nd;
            System.out.printf("합 : %d, 차 : %d, 곲 : %d, 몫 : %d",sum,sub,mul,div);
        }
        scan.close();
    }
}
