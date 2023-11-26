package KDT.Week2.Day8;

import java.util.Scanner;
// * 조건 1.클래스명 : Scample로 생성한다.
public class N2_Sample {

    // * 조건 2.멤버변수 : Scanner객체가 1개 있다.
    Scanner scan = new Scanner(System.in);

    // * 조건 3.생성자 메소드 :
    // *   1. 매개변수가 없는 생성자 메소드
    // *   2. 매개변수 String이 있는 생성자 메소드
    // *       -> 매개변수의 값을 콘솔에 출력하는 기능이 있다.
    N2_Sample(){

    }
    N2_Sample(String str){
        System.out.println("생성자 메소드의 매개변수 값 -> " + str);
    }

    // * 조건 4.메소드 :
    // *   1. 매개변수 없이 1~100까지 합을 리턴하는 메소드
    int sum(){
        int sum = 0;
        for(int i = 1; i <= 100; ++i){
            sum += i;
        }
        return sum;
    }
    // *   2. 매개변수로 정수형을 받아 그 수까지 합을 구하여 리턴하는 메소드
    int sum(int a){
        int sum = 0;
        for(int i = 1; i <= a; ++i){
            sum += i;
        }
        return sum;
    }
    // *   3. 매개변수로 정수형을 받아 그 수까지 '홀수'의 합을 구하여 리턴하는 메소드
    int odd_sum(int a){
        int sum = 0;
        for(int i = 1; i <= a; ++i){
            if(i%2 != 0)
                sum += i;
        }
        // System.out.println("1부터 " + a + " 까지 '홀수'의 합은 " + sum + " 입니다.");
        // return sum;
        return sum;
    }
    // *   4. 매개변수로 정수형을 받아 그 수까지 '짝수'의 합을 구하여 리턴하는 메소드
    int even_sum(int a){
        int sum = 0;
        for(int i = 1; i <= a; ++i){
            if(i%2 == 0)
                sum += i;
        }
        return sum;
    }

    void allsum(int max){
        // this.sum();
        // this.sum(max);
        // this.odd_sum(max);
        // this.even_sum(max);

        System.out.println("1부터 100 까지의 합은 " + sum() + " 입니다.");
        System.out.println("1부터 " + max +" 까지의 합은 " + sum(max) + " 입니다.");
        System.out.println("1부터 " + max + " 까지 '홀수'의 합은 " + odd_sum(max) + " 입니다.");
        System.out.println("1부터 " + max + " 까지 '짝수'의 합은 " + even_sum(max) + " 입니다.");
    }
    // 메소드 : 입력값까지 홀수합과 짝수합을 콘솔에 출력하는 메소드
    void oddEvenSum(int max){
        int odd = odd_sum(max);
        int even = even_sum(max);
        for(int i = 1; i <= max; ++i){
            if(i%2 == 0)
                odd += i;
            else if(i%2 != 0)
                even += i;
        }

        System.out.println("1부터 " + max + " 까지 '홀수'의 합은 " + odd + " 입니다.");
        System.out.println("1부터 " + max + " 까지 '짝수'의 합은 " + even + " 입니다.");
    }

}