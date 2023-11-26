package KDT.Alorithm.Day3;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int j = scan.nextInt();

        // 반복문을 이용한 피보나치 수열
        forFibonacci(j);
        System.out.println("");
        // 재귀호출을 이용한 피보나치 수열 구하기
        for(int i = 1; i<=j; i++){
            System.out.print(fibo(i) + " ");
        }

    }

    private static void forFibonacci(int n) {
        int n1 = 0;
        int n2 = 1;

        int sum = 1;
        for(int i = 0; i<n; i++){
            System.out.print(sum + " ");

            // 다음값
            sum = n1 + n2;

            n1 = n2;
            n2 = sum;
        }
    }
    private static int fibo(int n){
        if(n<=1){
            return n;
        }else{
            return
                    fibo(n-1) // 전값
                    +
                    fibo(n-2) // 전전값
                    ;
        }
    }
}