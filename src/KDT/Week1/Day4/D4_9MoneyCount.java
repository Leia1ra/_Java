package KDT.Week1.Day4;
import java.util.Scanner;
public class D4_9MoneyCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("금액을 입력하세요 -> ");
        int input = scan.nextInt();

        int quotient;
        int money = 50000;

        while(money > 0){
            int buf = money;
            if(input > money){
                quotient = input / money;
                input %= money;
                System.out.printf("%d원 -> %d장\n", money, quotient);
            }

            //단위계산
            while(buf >= 10)
                buf /= 10;
            if(buf == 5)
                money /= 5;
            else if(buf == 1)
                money /= 2;
        }
        scan.close();
    }
}