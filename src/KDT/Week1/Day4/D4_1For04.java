package KDT.Week1.Day4;
import java.util.Scanner;
public class D4_1For04 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int max;
        do{
            System.out.print("0보다 큰 홀수를 입력 -> ");
            max = scan.nextInt();
        }while(max % 2 == 0 || max > 50);

        for(int i = 1; i <= max; i += 2){
            for(int space = 1; space <= (max-i)/2; space++){
                System.out.print(" ");
            }
            for(int word = 1; word <= i; word++){
                System.out.print("*");
            }
            System.out.println("");
        }
        scan.close();
    }
}
