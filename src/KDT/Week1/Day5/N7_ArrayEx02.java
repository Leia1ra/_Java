package KDT.Week1.Day5;
import java.util.Random;
public class N7_ArrayEx02 {
    public static void main(String a[]){
        // 1~1000개 사이의 난수 200개 생성하여 배열에 저장하고
        // 난수의 총 합, 평균, 최대값, 최소값을 구하라.
        Random r = new Random();
        int[] r_num = new int[200];

        for(int i = 0; i < r_num.length;i++){
            r_num[i] = r.nextInt(1000) + 1;
            System.out.printf("%-5d", r_num[i]);
            if((i+1)%20 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");

        int sum = 0;
        int min = 1001;
        int max = 1;
        for(int k : r_num){
            sum += k;
            if(k < min) min = k;
            if(k > max) max = k;
        }

        double average = (double)(sum)/r_num.length;
        System.out.println("총 합 -> " + sum);
        System.out.println("평균 -> " + average);
        System.out.println("최대값 -> " + max);
        System.out.println("최소값 -> " + min);
    }
}
