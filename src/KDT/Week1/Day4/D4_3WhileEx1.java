package KDT.Week1.Day4;
import java.util.Scanner;
public class D4_3WhileEx1 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("정수 -> ");
            int num = scan.nextInt();
            int odd = 0; //홀수
            int even = 0;
            int i = 1;
            while(i <= num){
                if(i%2 == 0){
                    even += i;
                } else if(i%2 == 1){
                    odd += i;
                }
                ++i;
            }
            System.out.println("홀수합 -> " + odd);
            System.out.println("짝수합 -> " + even);
        }
    }

}
