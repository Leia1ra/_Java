package KDT.Week1.Day2;

public class N5_Operator3 {
    public static void main(String args[]){
        // 논리연산자

        // 어떤수 100크면 100보다 크다, 100보다 작으면 100보다 작다
        // 1~100사이의 값이면 출력하고 아니면 잘못된 값이다.

        int data = 52;
        boolean result = (1 <= data) && (data <= 100);
        String msg = (result) ? "1에서 100 사이의 값입니다." : "1에서 100 사이의 값이 아닙니다.";
        System.out.println(msg);
    }
}
