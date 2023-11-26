package KDT.Week1.Day5;
import java.util.Scanner;
public class N3_ArrayEx01 {
    public static void main(String[] a){
        //국여, 영어, 수학, 과학, 물리 시험에 대한 점수를 처리하라
        // 총점, 평균
        Scanner scan = new Scanner(System.in);

        String lbl[] = {"국어", "영어", "수학", "과학", "물리"};
        int[] score = new int[lbl.length];
        for(int i = 0; i< lbl.length; i++){
            System.out.printf("%s -> ", lbl[i]);
            score[i] = scan.nextInt();
        }

        int total = 0;
        for(int k : score){
            total += k;
        }
        int average = total/score.length;
        System.out.println("총점 -> " + total);
        System.out.println("평균 -> " + average);
    }

}
