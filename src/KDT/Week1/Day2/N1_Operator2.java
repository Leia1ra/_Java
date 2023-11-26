package KDT.Week1.Day2;

public class N1_Operator2 {
    public static void main(String[] args){
        // 관계(비교연산자) : >, <, >=, <=, ==, !=
        System.out.println("\n# 관계(비교연산자) : >, <, >=, <=, ==, !=");
        int a = 10;
        int b = 15;
        // 비교연산자를 이용한 연산은 결곽 논리형이다. 조건식
        boolean r1 = a > b;
        System.out.println("r1 : " + r1);

        boolean r2 = a < b + 3;
        System.out.println("r2 : " + r2);

        // 삼항연산자 : (조건식) ? 참 : 거짓;
        System.out.println("\n# 삼항연산자 : (조건식) ? 참 : 거짓;");
        int score = 65;
        String grade = (score>=80)?"A":"B";
        System.out.println("grade : " + grade);

        // 80점 이상 A // 70점 이상 B // 70점 미만 C
        char grade2 = (score>=80)?'A':((score>=70)?'B':'C');
        System.out.println("grade : " + grade2);

        int x = 1;
        // x의 값이 0보다 크면 "양수", 0보다 작으면 "음수", 0은 "0"이 출력되는 삼항연산 수식을 세운다
        String result = (x == 0)?"0":((x > 0)?"양수":"음수");
        // String _2x = (x > 0)?"양수":((x < 0)?"음수":"0");
        System.out.println("result : " + result);
    }
}
