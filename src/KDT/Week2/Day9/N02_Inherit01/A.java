package KDT.Week2.Day9.N02_Inherit01;

public class A extends Object{
// 다른것을 상속받지 않겠다. // 작성하지 않으면 컴파일러가 자동으로 extends Object를 삽입

    // 멤버 변수
    int isbm = 123456;
    String str = "A 클래스 멤버";
    private String privated_str = "숨겨진 A 클래스 멤버";
    // ->

    // 생성자
    public A(){
        System.out.println("-> A 클래스의 생성자 메소드 실행됨.");
    }
    public A(String a){
        System.out.println("-> A 클래스의 생성자 메소드 실행됨.");
        System.out.println("# a -> " + a);
    }

    // 메소드
    public void method1(){
        System.out.println("A 클래스의 메소드 -> " + isbm + str);
    }

    public void sum(){
        int total = 0;
        for(int i = 1; i<=100; i+=2){
            total += i;
        }
        System.out.println("A 클래스의 메소드 -> sum() = " + total);
    }

    public void sum(int max){
        int total = 0;
        for(int i = 1; i<=max; i+=2){
            total += i;
        }
        System.out.println("A 클래스의 메소드 -> super.sum(max) = " + total);
    }
}
