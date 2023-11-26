package KDT.Week2.Day10;

public class N01_TypeCastingMain {
    public static void main(String args[]){
        System.out.println("\n# Sequence 01 __________________________________");
        Child c = new Child();
        System.out.println("c.num = " + c.num + ", c.username = " + c.username);
        // 상속관계에서 하위클래스의 객체를 상위 클래스 객체로 대입하면 자동형변환이 된다.
        Parent p = new Child(); // Parent, Child, Object
        System.out.println(p.getClass());
        // 상위 클래스에 있는 하위클래스의 변수는 숨김처리
        System.out.println("p.num = " + p.num + ", p.username = " + p.username);

        // System.out.println("p.num = " + p.num + ", p.username = " + p.username + ", p.age = " + p.age);
        // 하위클래스를 상위클래스로의 대입은 얼마든지 가능함

        // 상위클래스 타입의 인스턴스를 하위클래스 타입으로 대입하기 위해서는 강제 형변환이 필요하다.
        Child c2 = (Child)p;

        System.out.println("c2.num = " + c2.num + ", c2.username = " + c2.username + ", c2.age = " + c2.age);

        // Parent pp = new Parent(); // Parent, Object
        // Child cc = (Child)pp;
        // System.out.println(cc.age); // 상위클래스로 객체를 만들고 난 후 하위클래스로 객체를 형변환은 할 수 없다.

        String str = new String("형변환 연습중");
        Object obj = new String("상속과 관계가 있다.");

        // 다른파일에 만든거
        // N01_Child other_c = new N01_Child();
        // System.out.println("c1.num = " + other_c.num + ", c1.username = " + other_c.username);
        // N01_Parent other_p = new N01_Child();
        // System.out.println("p1.num = " + other_p.num + ", p1.username = " + other_p.username);
        System.out.println("\n# Sequence 02 __________________________________");
        Child mc = new Child();
        mc.numOutput(); // Parent(상위) 메소드 -> Child에 num 변수가 없으므로 Parent의 num = 100을 반환
        mc.nameOutput(); // Child(하위) 메소드 -> Child에 name 변수가 있으므로 그것을 반환
                        // @Override를 시켜도 똑같은 반응을 함
        mc.output();
        System.out.println("==========형  변환==========");
        Parent mp = (Parent) mc; // 자동 형변환
        mp.numOutput();
        mp.nameOutput(); // -> 오버라이딩 메소드는 하위 -> 상위로 형변환 하더라도 오버라이딩한 기능이 유지됨
        System.out.println(mp.username); // 얘는 가려진 채로 있네 아마 레퍼런스에 주소를 대입하고 그 위치를 따라가는 입장이라 그런가봄

        System.out.println("==========다시 변환==========");
        Child mc2 = (Child) mp; // 강제 형변환 해야함
        mc2.numOutput();
        mc2.nameOutput();
        mc2.output();
    }
}
class Child extends Parent{
    String username = "sunsin";
    int age = 25;
    public Child(){

    }
    @Override
    public void nameOutput(){
        System.out.println("하위name -> " + username);
    }
    public void output(){
        System.out.println(num + ", " + username);
    }
}
class Parent{
    int num = 100;
    String username = "hong";
    public Parent(){

    }
    public void numOutput(){
        System.out.println("num -> " + num);
    }
    public void nameOutput(){
        System.out.println("name -> " + username);
    }
}