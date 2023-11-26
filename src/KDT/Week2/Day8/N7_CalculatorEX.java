package KDT.Week2.Day8;

import java.util.Scanner;

public class N7_CalculatorEX {
    Scanner scan = new Scanner(System.in);
    N7_CalculatorEX(){}
    // 메소드
    // 값 입력받기
    int input(String msg){ // msg값은 외부 메소드 내로 전달
        System.out.print(msg + " -> ");
        return scan.nextInt();
    }

    // 더하기
    int plus(int a, int b){
        return a + b;
    }
    // 빼기
    int minus(int a, int b){
        return a-b;
    }
    // 곱하기
    int multiple(int a, int b){
        return a*b;
    }
    // 나누기
    double divide(int a, int b){
        return (double)a/(double)b;
    }

    // 모든 사칙연산 결과 구해지는
    void allCal(int a, int b){
        System.out.println("-> " + a + " + " + b + " = " + plus(a,b));
        System.out.println("-> " + a + " - " + b + " = " + minus(a,b));
        System.out.println("-> " + a + " * " + b + " = " + multiple(a,b));
        System.out.println("-> " + a + " / " + b + " = " + divide(a,b));
    }

    public static void main(String args[]){
        N7_CalculatorEX cal = new N7_CalculatorEX();
        int x = cal.input("첫번째 수");
        int y = cal.input("두번째 수");

        int result1 = cal.plus(x,y);
        int result2 = cal.minus(x,y);
        int result3 = cal.multiple(x,y);
        double result4 = cal.divide(x,y);

        cal.allCal(x, y);

    }
}
