package Chapter;

import java.util.Scanner;

public class ch2 {
    public static int sum(int n, int m){
        return n + m;
    }
    public static void Datatype(){
        // 변수는 프로그램 실행중에 값을 임시로 저장하기 위한 공간
        // 데이터타입 변수이름 (= 리터럴); // 이런식으로 바로 초기화도 가능함
        // 리터럴 : 프로그램에서 직접 표현한 값, ex) 34, 42.195, '% ', true, "Hello"

        // 숫자형 리터럴의 아무위치에 언더스코어('_') 허용함, 단 맨 끝, 소수점 뒤, 리터롤 접두사(L,F등)뒤, (0x, 0b) 바로 뒤에 사용할 수 없음
        // 정수형 리터럴
        byte b_Integer = 20;    // 1byte, -128(-2^7) ~ 127(2^7-1)
        short s_Integer = 10;   // 2byte, -2^15 ~ 2^15-1
        int i = sum(b_Integer, s_Integer); // 4byte, -2^31 ~ 2^32-1
        int decimal = 15;
        int octal = 015;            // 8진수는 앞에 0을 붙임
        int hexademical = 0x15;     // 16진수는 앞에 0x를 붙임
        int binary = 0b1111_1111;    // 2진수는 앞에 0b를 붙임
        short S_integer = 1000;
        long l_integer = 1000L;     // 8byte, -2^63 ~ 2^63-1 //long type 리터럴(literal)은 숫자 뒤에 L 또는 l을 붙여 표시, 안해도 되는듯?
        // 실수형 리터럴
        float f = 4.4F;         // 4byte // float type 리터럴(literal)은 숫자 뒤에 'F'를 명시, 필수
        double d = 8.8D;         // 8byte // double type literal은 숫자 뒤에 'D'를 명시, 선택

        // 문자 리터럴
        char c1 = 'A'; // 단일 인용부호('')로 문자 표현
        // char c2 = \u0041; // 맥이라 당한듯?
        String _S = "문자열은 ";
        _S += "자바에서 기본으로 제공하는 타입이 아님" + "\n+ 연산자로 문자열을 연결할 수도 있음";

        // 논리 리터럴
        boolean b = true;   // 1bit, ture or false

        // null 리터럴
        // int n = null;    // 기본타입에서는 사용할 수 없음
        String str = null;

        // 변수 타입 생략, 단 타입에 대하여 컴파일러가 추론하기에 변수 선언문에 반드시 초기값 지정해야 함
        var price = 200;    // int 타입으로 지정
        var name = "Kitae"; // String 타입으로 지정

        // 상수 // 실행중 값 변경 불가능
        // final 데이터타입 상수이름(대문자) = 리터럴;
        final double PI = 3.141592; // 실행중 값 변경 불가능

        // 자동타입 변환
        long m = 25;            // 25는 int 타입, 25가 long 타입으로 자동 변환되는 사례
        double _d = 3.14 * 10;  // 10이 10.0으로 자동변환
        // 작은타입에서 큰타입으로 변환은 불가능함.
        int _n = 300;
        // byte _b = _n;
        byte _b = (byte) _n;    // 이렇게 수정해야 하는데 값 손실에 대한 우려가 있음
    }
    public static void sys_in(){
        // 키보드로부터 직접 읽는 자바의 표준 입력 스트림 + 키 값을 바이트로 리턴
        // 키 값을 바이트 데이터로 넘겨주므로 응용프로그램이 문자 정보로 변환해야함
        //Scanner s = new Scanner(System.in); // import java.util.Scanner; import문이 필요함
        // > System.in에게 키를 읽게 하고, 원하는 타입으로 반환하여 리턴
        // > 키 입력을 공백으로 구분된 토큰 단위로 끊어 읽음
        //String name = s.next();
        //String city = s.next();
        //int age = s.nextInt();
        //double weight = s.nextDouble();
        //boolean single = s.nextBoolean();
        //s.close();
    }
    public static void expression_And_operator(){
        // 증감 : ++, --
        // 산술 : +(덧셈), -(뺄셈), *(곱셈), /(나눗셈), %(나머지)
        // 시프트 : >>, <<, >>>
        // 비교 : >, <, >=, <=, !=
        // 비트 : &, |, ^, ~
        // 논리 : &&(And), ||(Or), !(Not), ^(Xor)
        // 조건 : ?, :
        // 대입 : =, (산술)=, (비트)=, (시프트)=
    }
    public static void main_ch2(){
        Datatype();

        // 2장 23pg 2-2: 변수, 리터럴, 상수 활용
        System.out.println("\n# 2장 23pg 2-2: 변수, 리터럴, 상수 활용______________");
        var _c = Circle.area(10.0);
        System.out.println(_c);

        // 2장 26pg 2-3: 타입 변환
        System.out.println("\n# 2장 26pg 2-3: 타입 변환_________________________");
        TypeConversion.expect();

        // 2장 31pg 2-4: Scanner를 이용한 키 입력 연습
        System.out.println("\n# 2장 31pg 2-4: Scanner를 이용한 키 입력 연습________");
        // ScannerEx.Scan();

        // 2장 35pg 2-5: /와 % 산술 연산
        System.out.println("\n# 2장 35pg 2-5: /와 % 산술 연산___________________");
        Operator.Arithmetic_Operator();

        // 2장 38pg 2-6 : 대입 연산자와 증감 연산자 사용
        System.out.println("\n# 2장 38pg 2-6 : 대입 연산자와 증감 연산자 사용________");
        Operator.assignment_IncDecOperator();

        // 2장 38pg 2-7 : 비교 연산자와 논리 연산자 사용하기
        System.out.println("\n# 2장 41pg 2-7 : 비교 연산자와 논리 연산자 사용하기_____");
        Operator.logical_Operator();

        // 2장 43pg 2-8 : 조건 연산
        System.out.println("\n# 2장 43pg 2-8 : 조건 연산_______________________");
        Operator.ternary_Operator(5,3);

        // 2장 48pg 2-9 : 비트 논리 연선과 비트 시프트 연산
        System.out.println("\n# 2장 48pg 2-9 : 비트 논리 연선과 비트 시프트 연산_____");
        Operator.bit_Operator();
        Operator.shift_Operator();
    }
}

class Circle {
    static final double PI = 3.14;
    static double area(double radius) {
        return radius*radius*PI;
    }
}
// 타입 변환
class TypeConversion{
    static byte b = 127;
    static int i = 100;
    static void expect(){
        System.out.print(b+1+" | ");
        System.out.print(10/4+" | ");
        System.out.print(10.0/4+" | ");
        System.out.print((char)0x12340041+" | ");
        System.out.print((byte)(b+i)+" | ");
        System.out.print((int)2.9 + 1.8+" | ");
        System.out.print((int)(2.9 + 1.8)+" | ");
        System.out.println((int)2.9 + (int)1.8);
    }
}
class ScannerEx{
    static Scanner scan;
    public static void scan() {
        System.out.println("[이름] [도시] [나이] [체중] [독신 여부]를 빈칸으로 분리하여 입력하세요");
        scan = new Scanner(System.in);
        s_return();
        scan.close(); // Scanner 닫기
    }
    public static void s_return(){
        String name = scan.next();
        System.out.println("이름    : " + name);
        String city = scan.next();
        System.out.println("도시    : " + city);
        int age = scan.nextInt();
        System.out.println("나이    : " + age);
        double weight = scan.nextDouble();
        System.out.println("체중    : " + weight);
        boolean single = scan.nextBoolean();
        System.out.println("독신 여부 : " + single);

    }
}

class Operator {
    protected static int test = 5000;
    protected static void Arithmetic_Operator(){
        int second = test %60;
        int minute = (test /60)%60;
        int hour = (test /60)/60;
        System.out.println(test + "초는 " + hour + "시간 " + minute + "분 " + second + "초");
    }
    protected static void assignment_IncDecOperator(){
        int a = 3, b = 3, c = 3, d = 3;
        // 대입연산자 사례
        a += 3; b -= 3; c *= 3; d %= 2;
        System.out.println("a:" + a + " | b:" + b + " | c:" + c + " | d:" + d);

        int e = 3;
        // 증감연산자 사례
        a = e++;
        System.out.println("a:" + a + " | e:" + e);
        a = ++e;
        System.out.println("a:" + a + " | e:" + e);
        a = e--;
        System.out.println("a:" + a + " | e:" + e);
        a = --e;
        System.out.println("a:" + a + " | e:" + e);
    }
    protected static void logical_Operator(){
        // 비교연산
        System.out.println("'a' > 'b' : " + ('a' > 'b'));
        System.out.println("'b' > 'a' : " + ('b' > 'a'));
        System.out.println("3 >= 2    : " + (3 >= 2));
        System.out.println("-1 < 0    : " + (-1 < 0));
        System.out.println("3.45 <= 2 : " + (3.45 <= 2));
        System.out.println("3 == 2    : " + (3 == 2));
        System.out.println("3 != 2    : " + (3 != 2));
        System.out.println("!(3 != 2) : " + (!(3 != 2)));
        // 비교연산
        System.out.println("(3 > 2) && (3 > 4)   : " + ((3 > 2) && (3 > 4)));
        System.out.println("(3 != 2) || (-1 > 0) : " + ((3 != 2) || (-1 > 0)));
        System.out.println("(3 != 2) ^ (-1 > 0)  : " + ((3 != 2) ^ (-1 > 0))); //
    }
    protected static void ternary_Operator(int opr1, int opr2){
        if(opr1 > opr2){
            System.out.println("조건 연산 : opr1:" + opr1 + " | opr2:" + opr2 + " | condition : " + (opr1 - opr2));
        } else if (opr1 < opr2) {
            System.out.println("조건 연산 : opr1:" + opr1 + " | opr2:" + opr2 + " | condition : " + (opr2 - opr1));
        }
        int condition = (opr1>opr2) ? (opr1-opr2) : (opr2-opr1);
        System.out.println("condition ? opr1 : opr2");
        System.out.println("삼항 연산 : opr1:" + opr1 + " | opr2:" + opr2 + " | condition : " + condition);
    }
    protected static void bit_Operator(){
        // And 01101010  Or 01101010  Xor 01101010  Not
        //   & 11001101   | 11001101    ^ 11001101    ~ 01101010
        //   = 01001000   = 11101111    = 10100111    = 10010101
        short a = 0b0101010111111111;
        short b = 0b0000000011111111;
        // 비트 논리 연산
        System.out.println("비트 논리 연산");
        System.out.println(Integer.toBinaryString(a&b));
        System.out.println(Integer.toBinaryString(a|b));
        System.out.println(Integer.toBinaryString(a^b));
        System.out.println(Integer.toBinaryString(~a));
    }
    protected static void shift_Operator(){
        byte c = 0b0001_0100;
        byte d = -0b0000_1000;
        System.out.println("시프트 연산");
        System.out.println((c<<2) + "\t| " +Integer.toBinaryString(c<<2));
        System.out.println((c>>2) + "" + "\t| " +Integer.toBinaryString(c>>2));
        System.out.println((d>>2) + "\t| " + Integer.toBinaryString(d>>2));
        System.out.println((d>>>2) + "\t| " +Integer.toBinaryString(d>>>2));
    }
}