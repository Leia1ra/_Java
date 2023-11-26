package KDT.Week2.Day10;
// 인터페이스도 똑같이 .class로 만들어짐
public interface N03_InterfaceA {
// 인터페이스는 추상메서드와 존재하면 일반 메소드는 존재할 수 없음
    // 추상메소드
    public abstract int add(int a, int b); // abstract 제거해도 괜찮음
    public abstract int sub(int a, int b); // abstract 제거해도 괜찮음

    // static final 변수 -> 상수화된 변수
    public static final int MAX = 1000;
    public static final int MIN = 1;
}
