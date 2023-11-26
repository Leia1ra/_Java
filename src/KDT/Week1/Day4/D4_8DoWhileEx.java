package KDT.Week1.Day4;
import java.util.Scanner;
public class D4_8DoWhileEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("임의의 정수 -> ");
        int num = scan.nextInt();
        int sum = 0;
        int buff = 0;
        do{
            ++buff;
            sum += buff;
            if(sum > num){
                System.out.printf("1~%d까지의 합은 %d",buff,sum);
                break;
            }
        }while(true);

        scan.close();
    }
}
/*
    임의의 정수를 입력받아 1부터 합을 구하여, 얼마까지 합을 구하면 최초로 입력받은 갑을 초과하는지

    실행
    임의의 정수 = 25326
    1~__까지의 합은 25400
*/
