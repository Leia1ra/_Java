package KDT.Week2.Day8;

public class N5_FinalTest {
    // final 키워드
    //      멤버변수, class, mathod에 표기할 수 있다.
    // 멤버변수는 초기값이 설정되면 값을 변경할 수 없다. 상수화된 변수라고 이야기 함.
    // 메소드는 반환형 이전에 기술하고 상속시 오버라이딩이 불가능하다.
    // 클래스는 class키워드 이전에 기술하고 상속을 해주지 않는다.

    // final 변수는 모드 대문자로 만든다. 합성어일 시 각 단어를 _(Underscore)로 구분한다.
    final int num = 10;// final int age; -> 지금은 초기화 없이는 생성할 수 없음.
    final String USER_NAME = "세종대왕"; // -> 객체마다 생성됨
    static final String ADDRESS = "서울시 강남구"; // -> 메모리에 하나 생성
    // static과 final의 위치가 바뀌어도 상관 없음

    public static void main(String args[]){
        System.out.println("\n# Sequence 01 __________________________");
        N5_FinalTest ft = new N5_FinalTest();
        System.out.println(ft.num + ", " + ft.USER_NAME);
        //ft.num = 100; // -> final키워드가 붙은 변수는 수정할 수 없음.

        System.out.println(N5_FinalTest.ADDRESS);
        System.out.println(ADDRESS);
    }
}
