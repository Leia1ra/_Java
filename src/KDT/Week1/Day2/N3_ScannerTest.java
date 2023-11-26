package KDT.Week1.Day2;
// java.lang 패키지의 클래스들은 자주 사용하는 클래스들이고
// 컴파일시 컴파일러가 자동으로 import를 해줌
import java.lang.System;
import java.lang.String;

import java.util.Scanner;

public class N3_ScannerTest {
    public static void main(String[] args){
        // Scanner클래스 : 콘슬에서 문자, 숫자, 논리데이터 등을 입력받을 수 있다.
        //      레퍼런스(인스턴스) = new 객체()
        // 1. Scanner클래스로 new 키워드를 이용하여 객체를 생성한다.
        Scanner scan = new Scanner(System.in);
        // 콘솔에서 입력되는 데이터는 문자형으로 입력되고 원하는 데이터형으로 변환시켜 사용한다.

        // 2. 객체 사용하기
        //  콘솔에서 정수 입력 받기
        System.out.print("정수 : ");
        // int dataInt = scan.nextInt();
        int dataInt = Integer.parseInt(scan.nextLine());
        System.out.printf(" -> 값 : %d\n", dataInt);

        System.out.print("실수 : ");
        // double dataDouble = scan.nextDouble();
        double dataDouble = Double.parseDouble(scan.nextLine());
        System.out.printf(" -> 값 : %f\n", dataDouble + 100);

        System.out.print("문자 : ");
        // String name = scan.next(); // 공백 문자를 한 단어로 인식하여 1개 단어를 입력한다.
        String name = scan.nextLine();
        System.out.printf(" -> %s\n",name);

        scan.close();
    }
}
