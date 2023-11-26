package KDT.Week2.Day6;

import java.util.Scanner;
// import java.util.StringTokenizer;
public class N4_EmailCheckEx {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        /*do {
            System.out.print("이메일 입력 -> ");
            StringTokenizer email = new StringTokenizer(scan.next(), "@");
            if (email.countTokens() < 2 || email.countTokens() >= 3) {
                System.out.println("잘못된 이메일 주소입니다.");
                continue;
            }
            System.out.println("아이디 => " + email.nextToken());
            System.out.println("도메인 => " + email.nextToken());
        } while (true);*/
        do{
            System.out.print("이메일 입력 -> ");
            StringBuilder email = new StringBuilder(scan.next());
            int atmark = email.indexOf("@");
            int point = email.indexOf(".");
            System.out.println(atmark + ", " + point);
            if(atmark == -1 || point == -1 || atmark > point || (point - atmark)<3){
                System.out.println("잘못된 이메일주소입니다.");
            } else {
                StringBuilder id = new StringBuilder(email.substring(0, atmark));
                StringBuilder domain = new StringBuilder(email.substring(atmark + 1));
                System.out.println("아이디 => " + id);
                System.out.println("도메인 => " + domain);
            }
        }while(true);
    }
}
/*
요구조건 : split() 메소드 사용하지 말것.
실행
이매일 입력 -> abcd.nate.com
잘못된 이메일 주소입니다.

이메일 입략 -> abcd@naver.com
아이디 => abcd
도메인 => naver.com

이메일 입력...반복
*/
