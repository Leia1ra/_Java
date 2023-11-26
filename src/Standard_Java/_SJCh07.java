package Standard_Java;

class Tv2{
    boolean power;
    int channel;
    void power(){this.power = !power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}
}
class CaptionTv2 extends Tv2{
    boolean caption;
    void displayCaption(String txt){
        if(caption){
            System.out.println(txt);
        }
    }
    static void Tv_main(){
        System.out.println("\n# 예제 7-1 315pg ______________________");
        CaptionTv2 ctv2 = new CaptionTv2();
        ctv2.channel = 10;
        ctv2.channelUp();
        System.out.println("조상클래스로부터 상속받은 멤버 -> " + ctv2.channel);
        ctv2.displayCaption("Hello world");
        ctv2.caption = true;
        ctv2.displayCaption("Hello world");
    }
}
/*1. 상속(inheritance)*/
// -> 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것이다.
// 조상클래스 -> 부모(Parent), 상위(Super), 기반(Base)클래스
// 자손클래스 -> 자식(Child), 하위(Sub), 파생된(Derived) 클래스
// 특징 1. 생성자와 초기화 블럭은 상속되지 않는다. 멤버만 상속된다.
// 특징 2. 자손 클래스의 멤버 개수는 조상클래스보다 항상 같거나 많다.(자손 > 조상)
// -> 자손 클래스의 인스턴스를 생성하면, (조상과 자손) 클래스의 멤버가 합쳐진 하나의 인스턴스로 생성된다.

class Shape{
    String color = "Black";
    void draw(){
        System.out.printf("[ color -> %s ]%n", color);
    }
}
class Point{
    int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    Point(){
        this(0,0);
    }
    String getXY(){
        return "("+x+","+y+")";
    }
}
class Circle extends Shape{
    Point Center;
    int r;
    Circle(Point center, int r){
        this.Center = center;
        this.r = r;
    }
    Circle(){
        this(new Point(0,0),100);
    }
    @Override
    void draw(){
        System.out.printf("[ center -> (%d, %d), r -> %d, color -> %s ]\n", Center.x,Center.y,r,color);
    }
    static void Circle_main(){
        Point p = new Point(150, 150);
        Circle c = new Circle(p, 50);
        c.draw();
    }
}
class Triangle extends Shape{
    Point[] p;
    Triangle(int i, Point[] p){
        this.p = p;
    }
    Triangle(Point...p){
        this.p = p;
        /*for(Point k : p){
        }*/
    }
    @Override
    void draw(){
        System.out.printf("[ p1 -> %s, p2 -> %s, p3 -> %s, color -> %s]\n",p[0].getXY(),p[1].getXY(),p[2].getXY(),color);
    }
    void draw(int a){
        System.out.print("[ ");
        for(Point k : p){
            System.out.print("p" + a + " -> " + k.getXY() + ", ");
            ++a;
        }
        System.out.println("color -> " + color + " ]");
    }
    static void Triangle_main(){
        System.out.println("\n# 예제 7-2 319pg ______________________");
        Point[] p = {
                new Point(100, 100),
                new Point(140, 50),
                new Point(200, 100)
        };
        Triangle t = new Triangle(p);
        t.draw(1);
    }
}
// '~는 ~이다(is - a)' 라는 문장이 성립한다면 상속관계,           -> Ex) Circle은(는) Shape이다
// '~는 ~을 가지고 있다(has - a)' 라는 문장이 성립한다면 포함관계   -> Ex) Circle은(는) Point를 가지고 있다.

class Parent{
    int x = 10;
    int y;
    Parent(){    }
    Parent(int x, int y){
        this.x = x;
        this.y = y;
    }
    String PrintParent(){
        return "x -> " + this.x + ", y -> " + this.y;
    }
}
class Child extends Parent{
    int x = 20, z;
    final String STR;
    Child(String str){
        // 생성자 첫중에서 다른 생성자를 호출하지 않았기에 컴파일러는 super()을 삽입함;
        STR = str;
    }
    Child(int x, int y, int z, String str){
        super(x, y);
        this.z = z;
        STR = str;
    }
    void method(){
        System.out.println("\n# 예제 7-08 319pg ______________________");
        System.out.println("x -> " + x);            // 자신의 멤버변수
        System.out.println("this.x -> " + this.x);  // 자신의 멤버변수
        System.out.println("super.x -> " + super.x);// 부모의 멤버변수
    }
    @Override
    String PrintParent(){
        System.out.println("\n# 예제 7-09 332pg ______________________");
        String p = super.PrintParent();
        return p + ", z -> " + this.z;
    }
    String GetString(){
        System.out.println("\n# 예제 7-12 346pg ______________________");
        return this.STR;
    }
    static void InheritTestMain(){
        new Child(3,2,1, "hello").method();
        Child p = new Child(10,20,30,"hello");
        System.out.println(p.PrintParent());
        System.out.println(p.GetString());
    }
}
/*4. 제어자(modifier)*/
// 접근 제어자 : public > protected > default > private
// 같은 클래스 : ###### > ######### > ####### > #######
// 같은 패키지 : ###### > ######### > ####### >    x
// 자식 클래스 : ###### > ######### >    x    >    x
// 그외의 영역 : ###### >     x     >    x    >    X
// -> 사용 목적
// => 외부로부터 데이터를 보호하기 위해서
// => 외부에는 불필요한, 내부적으로만 사용되는 부분을 감추기 위해서

// 그 외의 제어자
// static - 클래스의, 공통적인
// -> 멤버변수 : 모든 은스턴스에 공통적으로 사용되는 클래스변수, 클래스가 메모리에 로드될 때 생성된다.
// -> 메서드 : 인스턴스를 생성하지 않고도 호출이 가능한 static메서드, 인스턴스 멤버들을 직접 사용 불가

// final - 마지막의 , 변경될 수 없는
// -> 클래스 : 변경, 상속, 확장 불가능한 클래스됨
// -> 메소드 : 변경, 오버라이딩을 통해 재정의 불가능함
// -> 지역, 맴버 : 변경할 수 없는 상수가 된다.

// abstract - 추상의, 미완성의
// -> '미완성 설계도'이기 때문에 인스턴스를 생성할 수 없음
// -> 클래스를 상속받아 일부의 원하는 메서드만 오버라이딩 해도 된다는 장점
class P{
    int x = 100;
    void Method(){
        System.out.println("ParentMethod");
    }
    void Parent_Method(){
        System.out.println("Parent's Not Overrided Method");
    }
    void Type_Casting(){
        System.out.println("Parent's Type Casting");
    }
}
class C extends P{
    int x = 10;
    @Override
    void Method(){
        System.out.println("ChildMethod");
    }
    void Child_Method(){
        System.out.println("Child's not Overrided Method");
    }
    @Override
    void Type_Casting(){
        System.out.println("Child's Type Casting");
    }
}

class polymorphism{
    void pmain(){
        System.out.println("\n# 예제 7-15 354pg ______________________");
        // Child c2 = new Parent(); // 에러 // 하위타입의 참조변수로 상위 타입의 인스턴스를 참조할 수 없음
        // 참조변수가 사용할 수 있는 멤버의 개수는 인스턴스 멤버 개수보다 같거나 적어야 한다.


        C c1 = new C();
        System.out.println("^-> Child Reference And Child Object");
        c1.Method(); // -> 당연한거긴 함
        c1.Parent_Method();
        c1.Child_Method();

        P p1 = new C();
        System.out.println("^-> Parent Reference And Child Object");
        p1.Method(); // -> Child에 오버라이딩 된 메서드를 호출함
        p1.Parent_Method();
        // p1.Child_Method();
        // -> 둘다 같은 타입의 인스턴스(객체)이지만 참조변수의 타입에 따라 사용할 수 있는 맴버의 수가 달라짐

        System.out.println("^-> Type Casting");
        C _C = new C();
        P _P = (P) _C; // 자손타입 -> 조상타입(Up Casting) : 형변환 생략 가능
        _P.Type_Casting();

        // P p2 = new P();
        // C c3 = (C)p2; // 조상타입 -> 자손타입(Down Casting) : 형변환 생략 불가능
        // c3.Child_Method();
        // c3.Type_Casting();

        System.out.println("\n# 예제 7-17 363pg ______________________");
        P p2 = new P();
        C c2 = new C();
        if(c2 instanceof C){
            System.out.println("this is Child instance");
        }
        if(p2 instanceof P){
            System.out.println("this is Parent instance");
        }
        if((P)c2 instanceof P){
            System.out.println("upcasting _ this is Parent instance");
        }

        System.out.println("\n# 예제 7-18 364pg ______________________");
        System.out.println(p2.x);
        System.out.println(c2.x);
        P p3 = new C();
        System.out.println(p3.x);
        p3.Method();
    }
}
/*5. 다형성(Polymorpism)*/
// -> 여러가지 형태를 가질수 있는 능력을 의미
// 조상클래스의 타입의 참조변수로 자손클래스의 인스턴스를 참조할 수 있도록 하였다는 것

// 자손(자식, 하위)타입의 참조변수로 조상(부모, 상위)타입의 인스턴스를 참조할 수 없다.
// => 참조변수가 사용할 수 있는 멤버의 개수는 인스턴스 멤버 개수보다 같거나 적어야 한다.
//
// 형변환(Casting)
// 자손타입 -> 조상타입(Up Casting) : 형변환 생략 가능
// 조상타입 -> 자손타입(Down Casting) : 형변환 생략 불가능
//
// 형변환은 참조변수의 타입을 변환하는 것이지 인스턴스를 변환하는 것은 아니기 때문에
// 참조변수의 형변환은 인스턴스에 아무런 영향을 미치지 않는다.
// 단지 참조변수의 형변환을 통해서, 참조하고 있는 인스턴스에서 사용할 수 있는 멤버의 범위(개수)를 조절하는것

interface Stats {
    Stats Weight(String size);
}
interface control {
    void move(int x, int y);
    void attack(UnitObject selectedUnit);
}
interface unit extends Stats, control {
    void reduceHP(UnitObject u);
}
abstract class UnitObject implements unit{
    int HP;
    int STR;
    int DEF;
    int SPD;
    int x = 0 , y = 0;
    UnitObject(){

    }
    UnitObject(int HP, int STR, int DEF, int SPD){
        this.HP = HP;
        this.STR = STR;
        this.DEF = DEF;
        this.SPD = SPD;
    }
    @Override
    public void attack(UnitObject selectedUnit){
        reduceHP(selectedUnit);
    }
    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("("+ this.x + "," + this.y +")으로 이동");
    }
    @Override
    public abstract void reduceHP(UnitObject u);

    @Override
    public Stats Weight(String size) {
        switch (size){
            case "Flying" :
                return new UnitObject(50, 200, 10, 100) {
                    @Override
                    public void reduceHP(UnitObject u) {
                        System.out.print(HP + " -> ");
                        this.HP = HP - (u.STR/DEF);
                        System.out.println(HP + " 남음");
                    }
                };
            case "Light" :
                return new UnitObject(100, 150, 20, 75) {
                    @Override
                    public void reduceHP(UnitObject u) {
                        System.out.print(HP + " -> ");
                        this.HP = HP -(u.STR/DEF);
                        System.out.println(HP + " 남음");
                    }
                };
            case "Heavy" :
                return new UnitObject(200,100, 30, 50){
                    @Override
                    public void reduceHP(UnitObject u) {
                        System.out.print(HP + " -> ");
                        this.HP = HP -(u.STR/DEF);
                        this.HP += (HP/100);
                        System.out.println(HP + " 남음");
                    }
                };
        }
        return new UnitObject(0, 0, 0, 0) {
            @Override
            public void reduceHP(UnitObject u) {
                System.out.println("없는 유닛");
            }
        };
    }
}
class MyUnit extends UnitObject{
    UnitObject u = new UnitObject() {
        @Override
        public void reduceHP(UnitObject u) {
            System.out.println("tlqkf");
        }
    };
    UnitObject myUnit = (UnitObject) u.Weight("Flying");
    UnitObject enemy = (UnitObject) u.Weight("Light");
    void ATKOperation(){
        System.out.println("\n# 예제 7-24 383pg ______________________");
        myUnit.attack(enemy);
        myUnit.move(10,10);
    }

    @Override
    public void reduceHP(UnitObject u) {
        System.out.println("연습하겠다고 이러는게 진심 레전드");
    }
}

/*6. 추상클래스(Abstract Class)*/
// -> 클래스를 '설계도'에 비유한다면 추상클래스는 '미완성 설계도'를 의미
// !추상화 => 클래스간 공통점을 찾아내서 공통의 조상을 만드는 작업
// !구체화 => 상속을 통해 클래스를 구현, 확장하는 작업

/*7. 인터페이스(InterFace)*/
// -> 일종의 추상클래스, 구현된 것이 없는 '기본 설계도'를 의미
// !모든 멤버변수는 public static final이어야 하며 이를 생략할 수 있다.
// !모든 메서드는 public abstract이어야 하며, 이를 생략할 수 있다.
//  !>단 static메서드와 default메서드는 예외
// 인터페이스는 인터페이스로부터만 상속받을 수 있음, 다중상속이 가능하다
// 리턴타입이 인터페이스 => 메서드가 해당 인터페이스를 구현한 클래스의 인스턴스를 반환한다는 것을 의미한다.

// 인터페이스의 장점
// >> 개발시간을 단축시킬 수 있다
//  -> 메서드를 호출하는 쪽에서는 메서드의 내용에 관계없이 선언부만 알면 됨
//  -> 업무 분담, 1 인터페이스를 구현하는 클래스를 작성, 2 그 클래스가 작성되기 전 다른 기능 작성 가능
// >> 표준화가 가능하다.
//  -> 기본틀으로 인터페이스를 작성한 후 개발자들이 인터페이스를 구현하여 프로그램을 작성하도록 함으로써 보다 일관되고 정형화된 프로그램의 개발이 가능
// >> 서로 관계없는 클래스들에게 관계를 맺어줄 수 있다.
// >> 독립적인 프로그래밍이 가능하다
//  -> 클래스의 선언과 구현을 분리할 수 있음
//  -> 인터페이스를 통해 간접적인 관계의 클래스들은, 관련된 다른 클래스에 영향을 미치지 않은 독립적인 프로그래밍이 가능함
class A_I {
    void autoPlay(I i){
        i.play();
    }
    void A_Main(){
        System.out.println("\n# 예제 7-28 398pg ______________________");
        A_I a = new A_I();
        a.autoPlay(new B_I());
        a.autoPlay(new C_I());
        C_I b = new C_I();
        a.autoPlay(b.getInstance());

        b.play();
    }
}
interface I{
    public abstract void play();
}
class B_I implements I{
    public void play(){
        System.out.println("B class");
    }
}
class C_I implements I{
    public void play(){
        System.out.println("C class");
    }
    public I getInstance(){// 리턴타입이 인터페이스 => 메서드가 해당 인터페이스를 구현한 클래스의 인스턴스를 반환한다는 것을 의미한다.
        B_I b = new B_I();
        return b; // return new B_I();
    }
}

class OuterClass implements Anonymous{
    @Override
    public void method() {

    }

    // 인스턴스 클래스(Instance Class) : 외부 클래스의 인스턴스멤버처럼 다루어짐, 외부 클래스의 인스턴스 멤버들과 관련된 작업용
    // static 변수는 생성할 수 없으나, 상수(static final)은 사용할 수 있음
    class InstanceInner{void HelloInner(){System.out.println("HelloInner");}}

    // 정적 클래스(Static Class) : 주로 외부 클래스에서 static 멤버, 메서드에서 사용될 목적으로 선언됨
    // static 변수를 생성할 수 있다.
    static class StaticInner{
        void HelloStaticInner(){ System.out.println("HellostaticInner"); }
        static void StaticHelloStaticInner(){ System.out.println("StaticHellostaticInner"); }
    }

    void localmethod(){
        // 지역 클래스(Local Class) : 선언된 영역 내부에서만 사용할 수 있음
        // static 변수는 생성할 수 없으나, 상수(static final)은 사용할 수 있음
        class LocalInner{
            void HelloLocal(){
                System.out.println("HelloLocalInner");

                // System.out.println(new OuterClass().localmethod().value);
                System.out.println(value); // 서순의 차이가 있는것을 보임, 인터프리터적 특성
                int value = 40; // value
                System.out.println(value); // 서순의 차이가 있는것을 보임, 인터프리터적 특성
                System.out.println(this.value);
                System.out.println(OuterClass.this.value);
            }
            int value = 30; // this.value
        }
        new LocalInner().HelloLocal();
        int value = 20; // ?
    }
    int value = 10; // OuterClass.this.value

    public void OuterMain(){
        System.out.println("\n# 예제 7-31 405pg ______________________");
        new InstanceInner().HelloInner();
        new StaticInner().HelloStaticInner();
        OuterClass.StaticInner.StaticHelloStaticInner();
        localmethod();
    }
}
interface Anonymous{
    void method();
}
class ExternalClass{
    public void ExternMain(){
        System.out.println("\n# 예제 7-34 408pg ______________________");
        // 우선 내부의 클래스들을 생성하기 위해서는 객체 생성을 해야함
        OuterClass oc = new OuterClass();
        OuterClass.InstanceInner ii1 = oc.new InstanceInner();
        OuterClass.InstanceInner ii2 = new OuterClass().new InstanceInner();
        ii1.HelloInner();

        // static 내부클래스 멤버는 외부클래스의 객체를 생성해야함
        OuterClass.StaticInner ii3 = new OuterClass.StaticInner();
        ii3.HelloStaticInner();
        // static 내부클래스의 static멤버는 외부클래스의 객체를 먼저 생성하지 않아도 됨
        OuterClass.StaticInner.StaticHelloStaticInner();
        // 익명 클래스(Anonymous Class) : 오직 하나의 객체만을 생성할 수 있는 일회용 클래스
        // new 조상클래스이름() {} or
        // new 구현인터페이스이름() {}
        Anonymous anon = new OuterClass() {
            public void method() {
                System.out.println("Hello Anonymous Class");
            }
        };
        anon.method();
    }
}
/*8.내부 클래스(Inner Class)*/
// 내부 클래스의 장점
// 1. 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있다.
// 2. 코드의 복잡성을 줄일 수 있다.(캡슐화)


public class _SJCh07 {
    public static void main(String[] args){
        CaptionTv2.Tv_main();
        Triangle.Triangle_main();
        Circle.Circle_main();

        Child.InheritTestMain();
        new polymorphism().pmain();
        new MyUnit().ATKOperation();
        new A_I().A_Main();
        new OuterClass().OuterMain();
        new ExternalClass().ExternMain();
    }
}








