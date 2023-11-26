package KDT.Week1.Day4;

public class D4_6BreakTest2 {
    public static void main(String[] args) {
        point: //라벨 표시
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.println("i = " + i + ", j = " + j);
                if(j == 5){
                    break point;
                }
            }
        }

        // while문에 break사용하기
        int n = 1;
        int sum = 0;
        while(true){
            sum += n;
            System.out.println(sum);
            if(n>10)
                break;
            ++n;
        }
    }
}
