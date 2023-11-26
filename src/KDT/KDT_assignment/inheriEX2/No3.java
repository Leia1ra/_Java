package KDT.KDT_assignment.inheriEX2;

class No3_Aclass {}
class No3_Bclass extends No3_Aclass{}
class No3_Cclass extends No3_Aclass{}

public class No3{
    public static void main(String agrs[]){
        No3_Aclass p0 = new No3_Aclass();
        No3_Bclass p1 = new No3_Bclass();
        No3_Cclass p2 = new No3_Cclass();


        No3_Aclass P3 = new No3_Bclass();
        No3_Aclass P4 = new No3_Cclass();
        // 상위클래스 레퍼런스 변수에 하위클래스의 객체를 대입하는것은 가능
        // 유추하건데 (더 많은 기능을 담는 하위클래스의 주소)를 (더 적은 기능을 담은 상위클레스의 타입의 변수에) 대입하는것은
        // 각 기능에 대입되는 주소의 쪽이 남기 때문이다.

        // No3_Cclass p5 = new No3_Aclass(); //
        // 유추하건데 (더 적은 기능을 담는 상위클래스의 주소)를 (더 많은 기능을 담는 하위클래스 타입의 변수에) 대입하는것은 불가능
        // -> 사용하지 않는 빈 변수
    }
}
