package KDT.Week1.Day4;

public class D4_7ContinueTest1 {
    public static void main(String[] args) {
        // continue: 반복문을 한번 건너뛴다.
        for(int i = 1; i <= 10; i++){
            if((i%2) == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
