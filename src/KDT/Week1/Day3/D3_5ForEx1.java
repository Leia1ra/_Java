package KDT.Week1.Day3;
import java.util.Scanner;
public class D3_5ForEx1 {
    public static void main(String[] args){
        // 단을 입력받아 구구단을 출력하라
        Scanner scan = new Scanner(System.in);
        System.out.print("단 -> ");
        int num = scan.nextInt();
        for(int i = 0; i <= 9; ++i){
            int result = num * i;
            System.out.printf("%2d * %2d = %2d\n", num, i, result);
        }
    }
}
