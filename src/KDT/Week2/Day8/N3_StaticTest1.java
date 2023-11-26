package KDT.Week2.Day8;

public class N3_StaticTest1 {
    // static : 멤버 변수 또는 메소드에 기술한다.
    // static은 인스턴스(객체)와는 다른 메모리에 저장됨.
    // static맴버 (변수, 메소드)는 모든 객체에 공유되는 성질이 있음.
    int num = 1234; // 반드시 객체를 생성 후 사용가능 ->
    static int static_num = 5678; // 객체를 생성하지 않아도 사용가능한 변이

    // class영역에 실행문을 static내에 기술할 수 있다.
    // + 생성자보다 우선적으로 실행된다.
    static{
        for(int i = 0; i<=5; i++){
            System.out.println("12345");
        }
    }

    N3_StaticTest1(){
        System.out.println("-> StaticTest()생성자 메소드");
    }// 다른 생성자가 없을때 컴파일러가 기술한다.

    int plus(int x, int y ){
        return x+y;
    }
    // static이 있는 메소드 // 접근제한자와 static의 위치는 변경할 수 있음
    static int minus (int x, int y){
        return x-y;
    }
}
