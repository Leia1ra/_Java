package KDT.Week1.Day4;

public class D4_5BreakTest1 {
    public static void main(String[] args) {
        //break문
        // 반복문 제어
        for(int i=1; ; i++){
            if(i>10){
                break;
            }
            System.out.println("i -> " + i);
        }
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.println("i = " + i + ", j = " + j);
                if(j == 5){
                    break;
                }
            }
        }

    }
}
