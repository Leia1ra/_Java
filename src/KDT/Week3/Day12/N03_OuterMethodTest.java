package KDT.Week3.Day12;

public class N03_OuterMethodTest {
    String e_mail = "abcd@naver.com";
    public N03_OuterMethodTest() {
    }
    // 내부 클래스 : 클래스에 상속되어 있는 클래스
    // 1. 클래스 영역에 정의된 클래스
    // -> N02 확인
    // 2. 메소드 내의 내부 클래스
    public void InnerTestMethod(){
        String addr = "서울시 강남구";
        //메소드 내에 정의하는 내부클래스
        class MethodInner{
            int num = 2222;
            String username = "길동홍";
            MethodInner(){}
            void Print(){
                System.out.println("번호 -> " + num);
                System.out.println("이름 -> " + username);
                System.out.println("주소 -> " + addr);
                System.out.println("메일 -> " + e_mail);
            }
        }// N03_OuterMethodTest$1(번호)InnerTestMethod라는 이름의 새로운 클래스 파일이 생김

        // 메소드내의 내부클래스 반드시 객체 생성
        MethodInner mi = new MethodInner();
        mi.Print();
    }

    // 3. 익명의 내부 클래스

    public static void main(String[] args){
        N03_OuterMethodTest omt = new N03_OuterMethodTest();
        omt.InnerTestMethod();
    }
}
