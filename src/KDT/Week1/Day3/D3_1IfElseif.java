package KDT.Week1.Day3;

public class D3_1IfElseif {
    public static void main(String args[]){
        /*
        *   if(조건식1){
        *       조건식 1이 참일때 실행문;
        *   } else if(조건식 2){
        *       조건식 2가 참일때 실행문;
        *   } ... else{
        *       if 조건식이 모두 만족하지 않을떄
        *   }
        */
        // 국어, 영어, 수학, 총점, 평균
        int kor = 95;
        int eng = 80;
        int mat = 70;

        // 총점
        int total = kor + eng + mat;
        double ave = total/3.0;

        // 학점
        char grade;
        if (ave >= 90){         //A
            grade = 'A';
        } else if (ave >= 80) { // B
            grade = 'B';
        } else if (ave >= 70) { // C
            grade = 'C';
        } else if (ave >= 60) { // D
            grade = 'D';
        } else { // F
            grade = 'F';
        }
        System.out.println("Total \t: " + total);
        System.out.println("Everage : " + ave);
        System.out.println("Grade \t: " + grade);

        String grade2 = "";
        if(ave >= 90){ grade2 = "A"; }
        if(ave < 90 && ave >= 80){ grade2 = "B"; }
        if(ave < 80 && ave >= 70){ grade2 = "C"; }
        if(ave < 70 && ave >= 60){ grade2 = "D"; }
        if(ave < 60) { grade2 = "E";}
        System.out.println("Grade \t: " + grade2);
    }
}
