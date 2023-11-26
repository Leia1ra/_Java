package KDT.Alorithm.Day2;

import java.util.IllegalFormatCodePointException;

public class N06_RecursiveFactorial {
    //for문을 이용한 팩토리얼 구하기
    static int factorialFor(int n){
        int fact = 1;
        for(int i = n; i>=1; i--){
            fact *=i;
        }
        return fact;

    }
    static int factorialWhile(int n){
        int fact = 1;
        while(n>=1){
            fact *= n;
            n--;
        }
        return fact;
    }
    // 반환형이 없는 재귀 호출
    static int fact = 1;
    static void factorialRecursive(int n){
        // if (n <= 0) return;
        fact *= n;
        // factorialRecursive(n-1);
        if(n != 1)
            factorialRecursive(n - 1);
        else
            System.out.println(fact);
    }
    static int factorialRecursive2(int n){
        if(n == 1){
            return 1;
        }
        return n * factorialRecursive2(n-1);
    }

    public static void main(String args[]){
        // 임의의 값까지 팩토리얼 구하기
        System.out.println(factorialFor(5));
        System.out.println(factorialWhile(5));

        factorialRecursive(5);
        System.out.println(factorialRecursive2(5));
    }
}
