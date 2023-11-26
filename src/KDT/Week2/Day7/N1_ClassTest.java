//package명
package KDT.Week2.Day7;
// OOP: Object Oriented Programming

// 사용할 클래스가 있는 위치
import java.lang.*; // -> * : 전부라는 의미; // java.lang 패키지는 클래스 import를 생락하면 컴파일러가 알아서 추가함
import java.util.Random;
import java.util.Scanner;

// 접근제한자: public, protected, default, private
class N1_ClassTest {
    //field, 멤버변수 = 전역변수, 실행문을 명시할 수는 없음
    int num = 1234;
    String name = "홍길동";
    int a; // 멤버 변수는 초기값이 기본적으로 들어감.
    // byte, short, int, long => 0
    // char => \u0000 (공백)
    // float => 0.0F
    // double => 0.0
    // boolean => false
    // array, class, interface => null
    Scanner scan = new Scanner(System.in);

    Random rand = new Random();
    final int BAN = 3;

    // 생성자 메소드 : new키워드로 클래스를 객체로 만들 때 필요하다.
    //              -> 클래스 명과 같아야 한다.
    // 매개변수 없는 생성자 메소드는 없으면 컴파일시 컴파일러가 생성자를 만들어준다.(상속

    // 생성자 메소드 오버로딩 : 생성자 메소드가 여러개일 때.
    // -> 반드시 매개변수(arguments)는 개수가 다르던지, 데이터 형이라도 달라야 함

    public N1_ClassTest(){
        // 생성자 메소드 영역
        System.out.println("#1 -> ClassTest()생성자 메소드 실행...");
        int kor = 60;
        System.out.println(name + " " + kor);
        System.out.println();
    }
    public N1_ClassTest(int a){
        System.out.println("#2 -> ClassTest(int a)생성자 메소드 실행...");
        int kor = 60;
        System.out.println(name + " " + a);
        System.out.println();
    }
    public N1_ClassTest(String color){
        System.out.println("#3 -> ClassTest(String color)생성자 메소드 실행...");
        System.out.println("ColorName => " + color);
        System.out.println();
    }
    public N1_ClassTest(int num, String color){
        System.out.println("#4 -> ClassTest(int num, String color)생성자 메소드 실행...");
        System.out.println(num + " -> " + color);
        System.out.println();
    }

    // 메소드 : 메소드 단위로 기능을 구현.
    // 반환형이 있다. 반환값o -> void || 반환값x -> 반환하는 데이터 타입을 명시
    public void setName(){
        System.out.println("#6 -> getName() 메소드 테스트 _________________");
        name = "이순신";
        System.out.println("name -> " + name);
        // return name;
    }
    // 반환형이 있을때는 return 명시해 외부로 데이터를 내보냄;
    public int getNum(){
        System.out.println("#5 -> getNum() 메소드 테스트 __________________");
        num += 5000;
        return num;
    }
    public int getNum(int a){
        // 메소드 오버로딩 : 같은 메소드명이 어러개 존재할 수 있다. 제한사항은 동일함
        // -> 반드시 매개변수(arguments)는 개수가 다르던지, 데이터 형이라도 달라야 함
        System.out.println("#7 -> getNum() 메소드 오버로딩 테스트 ___________");
        num += a;
        return num;
    }
    // 내부 클래스

    // static 영역
}
