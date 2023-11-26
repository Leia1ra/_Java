package KDT.Week2.Day8;

public class N1_Member {
    int num;
    String name;

    public N1_Member(){
        System.out.println("-> Member() 생성자 메소드 실행됨... ___________");
    }
    public N1_Member(int n){
        // this를 붙이지 않았다면 지역변수로 사용함,
        // 허나 안에 num을 생성하지 않았다면 전역변수로 알아서 활용함
        this.num = n; // 현재 클래스의 맴버 변수 num을 가리킴
    }
    public N1_Member(String str){

    }
    public N1_Member(int n, String str){
        // 생성자메소드에서 다른 생성자메소드를 호출하는 방법 -> this.();
        // 반드시 첫번째 실행문으로 표기되어야 한다.
        this(n); // 매개변수가 있는 생성자를 호출하는 방법
        // this.num = n;
        this.name = str;
        System.out.println("-> this.Member() 생성자 메소드 실행됨... ______");
    }

    public void output(){
        System.out.println(num + ", " + name);
    }

}
