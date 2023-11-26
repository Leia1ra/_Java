package KDT.Week3.Day13;

import KDT.Week2.Day8.N1_Member;

class SingletonTest {
    // Singleton -> new를 이용한 객체 생성을 불가하도록 만든다
    // static 멤버변수를 이용하여 객체를 중복생성 못하도록 한다.
    private static SingletonTest single = null;
    private SingletonTest() {

    }

    // 객체를 생성하여 리턴해주는 메소드 : getInstance()
    public static SingletonTest getInstance(){
        // 객체 없을때 객체 생성하기
        if(single == null){
            single = new SingletonTest();
        }
        return single;
    }
}

public class N01_SingletonMain {
    public static void main(String[] args){
        // 생성자가 메소드 private이므로 객체 생성 불가
        // SingletonTest st = new SingletonTest();

        // 객체명.맴버변수 접근 불가능
        // SingletonTest.single;

        SingletonTest s1 = SingletonTest.getInstance();
        SingletonTest s2 = SingletonTest.getInstance();
        System.out.println("s1의 주소 -> " + s1);
        System.out.println("s2의 주소 -> " + s2); // 객체가 여러개 만들어지지 않음

        N1_Member m1 = new N1_Member();
        N1_Member m2 = new N1_Member();
        System.out.println("m1의 주소 -> " + m1);
        System.out.println("m2의 주소 -> " + m2); // 객체가 여러개 만들어짐
    }
}