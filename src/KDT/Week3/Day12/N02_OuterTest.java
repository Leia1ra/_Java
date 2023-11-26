package KDT.Week3.Day12;

public class N02_OuterTest {
    int num = 1234;
    String name = "세종대왕";
    String tel = "010-1234-5678";
    public N02_OuterTest() {
        System.out.println("OuterTest()생성자 메소드");
    }
    public void gugudan(int dan){
        for(int i = 2; i<=9; i++){
            System.out.println(dan + " * " + i + " = " + (dan*i));
        }
    }
    public void testMethod(){
        // 내부 클래스의 메소드 호출
        // getinfor(); // 외부클래스에서 내부 클래스의 메소드를 호출하는 것은 불가능
        // 내부 클래스 객체 만들기
        InnerTest it = new InnerTest();
        it.getInfo();
    }


    // 내부 클래스 : 클래스에 상속되어 있는 클래스
    // 1. 클래스 영역에 정의된 클래스
    class InnerTest{ // 외부 클래스에 종속적으로 만들고 싶을때 사용
        // 멤버변수
        int num = 1234;
        String name = "홍길동";
        // 생성자 메소드
        InnerTest(){
            System.out.println("InnerTest()생성자 메소드");
        }
        // 메소드
        void getInfo(){
            // 내부클래스는 외부클래스의 멤버변수를 접근할 수 있다.
            System.out.println(num + ", " + name + ", " + tel);
            // 내부 클래스에서 외부클래서의 메소드 호출
            gugudan(9);

        }
    }//N02_OuterTest$InnerTest라는 클래스파일이 하나 생김
    // 2. 메소드 내의 내부 클래스
    // 3. 익명의 내부 클래스


    public static void main(String[] args){
        //내부 클래스의 객체 생성
        //1. 외부클래스 객체 만들기
        N02_OuterTest ot = new N02_OuterTest();
        System.out.println();

        //2. 내부 클래스 객체 만들기
        N02_OuterTest.InnerTest it = ot.new InnerTest(); // N02_OuterTest.는 굳이 안써줘도 되는듯
        // 메소드 호출
        it.getInfo();
        System.out.println();
        ot.testMethod();
    }
}
