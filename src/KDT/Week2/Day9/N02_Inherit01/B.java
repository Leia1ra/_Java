package KDT.Week2.Day9.N02_Inherit01;

public class B extends A{
// B클래스는 A클래스를 상속받았다.

    //멤버 변수
    int inheritA;
    String str = "B 클래스 멤버";

    // 생성자
    public B(){
        // 상위 클래스의 생성자중 매개변수가 있는 생성자를 실행할 경우
        // super라는 키워드를 이용해서 상위클래스의 생성자를 호출해준다.
        // this() : 같은 클래스의 다른 생성자 호출
        // super() : 상위 클래스의 다른 생성자 호출

        super("hello"); // 첫번째 실행문으로 표기해야 함

        System.out.println("\n# Sequence 01 __________________________");
        // 부모클래스의 생성자가 더 먼저 호출된다.
        System.out.println("-> B 클래스의 생성자 메소드 실행됨.");
        // 상위클래스와 하위클래스에서 같은 필드명일때 현재 클래스의 변수를 접근한다.
        System.out.println("\n# Sequence 02 __________________________");
        System.out.println("-> 중복되지 않은 상위클래스 변수 isbm : " + isbm);
        System.out.println("-> 중복된 변수 str : " + str);

        System.out.println("\n# Sequence 03 __________________________");
        // super.멤버변수는 상위 클래스의 변수이다.
        System.out.println("this : "+ this.str + " -> super : " + super.str);
        // this를 통해 현재 클래스의 없는 변수의 표기시, 상위클래스의 변수에 접근한다.
        // super은 상위 클래스를 접근한다.
        System.out.println(this.isbm + " -> " + super.isbm);
        // 상위클래스 변수, 메소드는 private접근제한자일때 상속하지 않는다.
        // System.out.println("privated_str -> " + privated_str);

        System.out.println("\n# Sequence 04 __________________________");
        inheritTest(100);

        System.out.println("\n# Sequence 05 __________________________");
        // 상위클래스의 메소드 호출
        super.method1();
        method1();

        //private 메소드는 상속 안됨. A 클래스의 private void sum()
        System.out.println("\n# Sequence 06 __________________________");
        sum();
        sum(100);   // 오버라이딩 당해서 B 클래스의 메소드라고 뜰거임
        super.sum(10); // 오버라이딩 된 메소드 호출하는 법

    }

    // 메소드
    public void inheritTest(int max){
        int total = 0;
        for(int i = 1; i<=max; i++){
            total += i;
        }
        System.out.println("B 클래스의 메소드 -> inheritTest(100) = " + total);
    }
    // 메소드 오버라이딩(override) : 상위 클래스의 메소드를 하위클래스에서 재정의
    public void method1(){
        System.out.println("B 클래스의 메소드 -> method1() 오버라이딩 : " + str);
    }

    // 매개변수의 형태와 개수가 다르면 오버라이딩이라고 안함
    // (범위)public > protected > default > private
    // 오버라이딩 시, 접근제한자는 무조건 상위클래스보다 범위가 좁아지면 안된다.
    // ex1 > (상위 public void sum) > (하위 default void sum) 불가능
    // ex2 > (상위 default void sum) > (하위 public void sum) 가능
    @Override // 오버라이딩 어노테이션 -> 안붙여도 상관 없으나 붙이는게 코드독해에는 좋을듯함
    public void sum(int max){
        int total = 0;
        for(int i = 2; i<=max; i+=2){
            total += i;
        }
        System.out.println("B 클래스의 메소드 -> sum(max) = " + total);
    }
}
