package KDT.Week2.Day8;

public class N4_StaticTest2 {
    int bun = 12;
    static String name = "홍길동";

    // 매개변수가 없는 생성자는 컴파일러가 컴파일시 생성해준다. 단
    // 매개변수가 있는 생성자를 생성한 경우에는 컴파일러가 매개변수가 없는 생성자를 만들지 않음
    public N4_StaticTest2(int bun){
        this.bun = bun;
    }
    public N4_StaticTest2() {} // 매개변수 없이 객체를 생성하지 못하게 하지 않고서는, 쓸일이 없더라도 이렇게 만드는게 좋음

    public String gugudan(int dan){
        String result = "";
        for(int i = 2; i <= 9; i += 1){
            result += "static x -> " + dan + " * " + i + " = " + (dan * i) + "\n";
        }
        return result;
    }
    public static String dan(int dan) {
        String result = "";
        for(int i = 2; i <= 9; i += 1){
            result += "static o -> " + dan + " * " + i + " = " + (dan * i) + "\n";
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println("\n# Sequence 01 __________________________");
        N4_StaticTest2 st = new N4_StaticTest2();
        System.out.println("bun -> " + st.bun); // static 메소드인 main함수 내에서는 bun멤버 변수가 static변수가 아니므로 객체를 생성하여야 사용이 가능하다.
        System.out.println("name -> " + name);

        System.out.println("\n# Sequence 02 __________________________");
        System.out.println(st.gugudan(5)); // static이 없는 메소드는 현재 클래스를 객체로 만들고 객체명.메소드명으로 호출해야 한다.
        System.out.println(dan(6));
    }
}
