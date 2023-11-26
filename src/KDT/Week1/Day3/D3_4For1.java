package KDT.Week1.Day3;

public class D3_4For1 {
    public static void main(String args[]){
        // 반복문 : for 문
        /*
        *   for(초기값; 조건식; 증감값){
        *       실행문..
        *   }
        */
        int sum = 0;
        int i = 0;
        for(i = 1; i <= 10 ; ++i){
            sum += i;
            // System.out.println(i + " " + sum);
        }
        System.out.println("1~" + (i - 1) + "까지의 합은 -> " + sum + "\n");

        for(int j = 5; j >= 1; --j){
           System.out.print(j + " ");
        } System.out.println();

        for(int j = 2; j <= 10; j += 2)
            System.out.print(j + " ");
    }
}
