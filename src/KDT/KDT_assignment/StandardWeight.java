package KDT.KDT_assignment;

import java.util.Scanner;

public class StandardWeight {
    public static void main(String a[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("======================================================");
        System.out.print("나이 -> ");
        int age = scan.nextInt();
        System.out.print("성별(1:남성,2:여성) -> ");
        int s_ = scan.nextInt();
        System.out.print("키 -> ");
        double height = scan.nextDouble();
        System.out.print("현재체중 -> ");
        double weight = scan.nextDouble();

        System.out.println("============처리결과=========================");
        double standard_W = 0;

        if (age <= 35) {
            switch (s_) {
                case 1:
                    standard_W = (height - 100) * 0.9;
                    break;
                case 2:
                    standard_W = (height - 100) * 0.85;
                    break;
            }
        } else if (age >= 36) {
            switch (s_) {
                case 1 -> standard_W = (height - 100) * 0.95;
                case 2 -> standard_W = (height - 100) * 0.9;
            }
        }
        System.out.println("표준체중 -> " + (int)standard_W);

        double factor = (weight / standard_W) * 100;
        String body_Type = "";
        if (factor <= 85) {
            body_Type = "마른형";
        } else if (85 < factor && factor <= 95) {
            body_Type = "조금마른형";
        } else if (95 < factor && factor <= 115) {
            body_Type = "표준형";
        } else if (115 < factor && factor <= 125) {
            body_Type = "조금비만형";
        } else if (125 < factor) {
            body_Type = "비만형";
        }
        System.out.printf("당신의 표준체중 지수는 %.2f으로 %s입니다.", factor, body_Type);
    }
}