package KDT.KDT_assignment;
import java.util.Scanner;
public class Ex0718_3 {
    public static void main(String[] a){
        // 문자형 값 대문자를 입력받아 소문자로 바꾸는 프로그램을 작성하라
        Scanner scan = new Scanner(System.in);
        System.out.print("문자 = ");

        // String c = scan.next();
        // char result = (char)(c.charAt(0) - 'A' + 'a');

        // char c = scan.next().charAt(0);
        // char result = (char)(c - 'A' + 'a');

        char c = scan.nextLine().charAt(0);
        char result = (char)(c + 32);
        System.out.println("결과 = " + result);
    }
}
