package KDT.Week1.Day3;

import java.util.Scanner;

public class D3_6ForEx2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 -> ");
        int n = scan.nextInt();
        int odd = 0; // 홀수
        int even = 0; // 짝수
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
            if(i % 2 == 0)
                even += i;
            else
                odd += i;
        }
        System.out.printf("1~%d까지의 홀수의 합은? -> %d\n", n, odd);
        System.out.printf("1~%d까지의 짝수의 합은? -> %d\n", n, even);
        System.out.printf("1~%d까지의 합은?      -> %d\n", n, sum);
    }
}
/* 정수를 입력받아 입력받은 갑까지 짝수의 합, 홀수의 합, 전체 합을 구하라
* 실행
* 정수 = 10;
* 1~10까지의 홀수의 합은 ??
* 1~10까지의 짝수의 합은 ??
* 1~10까지의 합은 ??
*/