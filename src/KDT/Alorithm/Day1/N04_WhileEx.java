package KDT.Alorithm.Day1;

import java.util.Scanner;

public class N04_WhileEx {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("단을 입력하세요 : ");
        int num = scan.nextInt();
        int i = 1;
        while(i != 10){
            System.out.println(num + " * " + i + " = " + (num * i));
            ++i;
        }

    }
}
