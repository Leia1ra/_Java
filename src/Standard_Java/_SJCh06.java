package Standard_Java;

class Tv{
    // Tv의 속성(attribute)
    String color;
    boolean power;
    int channel;
    // Tv의 동작(behavior)

    void power(){ power = !power; }
    void channelUp(){ ++channel; }
    void channelDown(){ --channel; }
    void tvtest(){
        // 예제 6-1 235pg
        System.out.println("\n# 예제 6-1 235pg ______________________");
        // 클래스 --(인스턴스화)--> 인스턴스(객체)
        // 클래스에서 객체를 생성하여 메모리를 할당하면, 해당 객체는 인스턴스라고 부름
        Tv t;           // Tv인스턴스를 참조하기 위한 참조(레퍼런스)변수 t를 선언
        t = new Tv();   // Tv인스턴스(객체)를 생성(t에 Tv의 주소값이 저장)
        t.channel = 7;  // Tv인스턴스의 멤버 변수 channel의 값을 7로 변경
        t.channelDown();// Tv인스턴스의 메서드 channelDown()을 호출
        System.out.println("현재 체널은 " + t.channel + "채널 입니다.");
        // 인스턴스는 참조변수를 통해서만 다룰 수 있으며,
        // 참조(레퍼런스)변수의 타입은 객체(인스턴스)의 타입과 일치해야 한다.

        // 예제 6-2 237pg
        System.out.println("\n# 예제 6-2 237pg ______________________");
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
        t1.channel = 7;
        System.out.println("t1의 channel값을 7로 변경하였습니다.");
        // 같은 클래스의 인스턴스(객체)의 속성(맴버면수)는 서로 다른 값을 유지함
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("!t2의 channel값은 " + t2.channel + "입니다.");

        // 예제 6-3 238pg
        System.out.println("\n# 예제 6-3 238pg ______________________");
        Tv t3_1 = new Tv();
        Tv t3_2 = new Tv();
        System.out.println("t1의 channel값은 " + t3_1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t3_2.channel + "입니다.");
        t3_2 = t3_1;    // 인스턴스의 주소를 저장, t3_2에 t3_1의 주소 저장
        // t3_2의 참조 값은 사용할 수 없음,
        // 메모리는 가비지 컬렉터(Garbage Collector)에 의해 회수됨.
        t3_1.channel = 7;
        System.out.println("t1의 channel값을 7로 변경하였습니다.");
        //
        System.out.println("t1의 channel값은 " + t3_1.channel + "입니다.");
        System.out.println("!t2의 channel값은 " + t3_2.channel + "입니다.");

        // 예제 6-4 242pg
        System.out.println("\n# 예제 6-4 242pg ______________________");
        // 여러 종류의 객체를 하나의 배열로 저장하는 방법 '다형성', 추후에 배울 것.
        Tv[] tvArr2 = {new Tv(), new Tv(), new Tv()};
        // 위와 아래의 내용은 같은 기능을 함.
        Tv[] tvArr1 = new Tv[3];
        for(int i = 0; i<tvArr1.length; ++i){
            tvArr1[i] = new Tv();
            tvArr1[i].channel = i+10;
        }
        for(int i = 0; i<tvArr1.length; ++i){
            tvArr1[i].channelUp();
            System.out.printf("tvArr[%d].channel = %d\n", i, tvArr1[i].channel);
        }

    }
}
// 인스턴스는 참조변수를 통해서만 다룰 수 있으며, 참조(레퍼런스)변수의 타입은 객체(인스턴스)의 타입과 일치해야 한다.
/////////////////////////////////////////////////////////////////////////////////////

class Card{

    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}
class CardTest{
    public static void Cardmain(){
        System.out.println("\n# 예제 6-5 248pg ______________________");
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Heart";
        c2.number = 4;

        System.out.println("-> c1 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("-> c2 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");

        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
        c1.width = 50; c1.height = 80;
        System.out.println("-> c1 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("-> c2 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
        // 인스턴스(객체)변수는 인스턴스(객체)가 생성될 때 마다 생성되므로 인스턴스마다 각기 다른 값을 유지할 수 있지만,
        // 클래스 변수(static 변수)는 모든 인스턴스가 하나의 저장공간을 공유하므로, 항상 공통된 값을 갖는다.
    }
}
// 인스턴스(객체)변수는 인스턴스(객체)가 생성될 때 마다 생성되므로 인스턴스마다 각기 다른 값을 유지할 수 있지만,
// 클래스 변수(static 변수)는 모든 인스턴스가 하나의 저장공간을 공유하므로, 항상 공통된 값을 갖는다.
/////////////////////////////////////////////////////////////////////////////////////

class MyMath{
    // 메소드의 반환 타입이 지정된 이상 무조건 return문이 작성되어야 함
    // 반환타입 메서드이름(매개변수)
    long add(long a, long b){ // 매개변수도 하나의 지역변수로 간주됨.
        long result = a + b;
        return result;
        // return a + b // 로 할 수 있음
    }
    long sub(long a, long b){return a-b;}
    long mul(long a, long b){return a*b;}
    double div(double a, double b){return a/b;}
    public static void Mathmain(){
        System.out.println("\n# 예제 6-6 256pg ______________________");
        MyMath mm = new MyMath();
        System.out.println("add(5L, 3L) -> " + mm.add(5L, 3L));
        System.out.println("sub(5L, 3L) -> " + mm.sub(5L, 3L));
        System.out.println("mul(5L, 3L) -> " + mm.mul(5L, 3L));
        System.out.println("div(5L, 3L) -> " + mm.div(5L, 3L));
    }
}
// 매개변수도 하나의 지역변수로 간주됨.
/////////////////////////////////////////////////////////////////////////////////////

// !JVM(Java Virtual Machine)메모리구조
// ||======================================================================================
// || # Method Area
// ||  -> class data [cv : Class variable]
// ||  -> class data
// || [프로그램 실행중 어떤 클래스가 사용되면, JVM은 해당 클래스의 클래스파일(.class)을 읽어서 분석하여]
// || [클래스에 대한 정보(클래스 데이터)를 이곳에 저장한다.]
// || [이 때, 그 클래스의 클래스 변수(class variable)도 이 영역에 함께 생성된다.]
// ||======================================================================================
// || # Call stack
// ||  -> main [lv : Local variable]
// || /* 레퍼런스형 변수들이 저장되는 공간 -> 레퍼런스형 변수들이 힙영역에 저장된 인스턴스의 주소를 저장한다.*/
// || [호출스택은 메서드의 작업에 필요한 메모리 공간을 제공한다.]
// || [메서드가 호출되면, 호출스택에 호출된 메서드를 위한 메모리가 할당되며,]
// || [이 메모리는 메서드가 작업을 수행하는 동안 지역변수(매개변수 포함)들과 연산의 중간결과 등을 저장하는데 사용된다.]
// || [그리고 메서드가 작업을 마치면 할당되었던 메모리공간은 반환되어 비워진다.]
// ||======================================================================================
// || # Heap
// ||  -> 인스턴스 [iv : Instance variable]
// ||  -> 인스턴스(객체)
// ||  -> 인스턴스(객체)
// || /* 인스턴스(객체)들이 저장되는 공간*/
// || [인스턴스가 생성되는 공간. 프로그램 실행 중 생성되는 인스턴스는 모두 이곳에 생성된다.]
// || [즉, 인스턴스변수(instance variable)들이 생성되는 공간이다.]
// ||======================================================================================
class Data {
    int x;
}
class Primitive_And_Reference{
    public static void Assambled_main(){
        System.out.println("\n# 예제 6-9 264pg ______________________");
        Primitive_And_Reference p = new Primitive_And_Reference();
        p.Primitive_main();
        System.out.println();
        Primitive_And_Reference r = new Primitive_And_Reference();
        r.Reference_main();

        System.out.println("\n# 예제 6-14 268pg ______________________");
        Data test = new Data();
        test.x = 100;
        Primitive_And_Reference d = new Primitive_And_Reference();

        Data tmp = d.copy(test);
        test = d.copy(test);
        d.Reference_Parameter_change(test);
        System.out.println("test -> " + test.x);
        System.out.println("tmp  -> " + tmp.x);
    }
    public void Primitive_main(){
        Data d = new Data();
        d.x = 10;

        System.out.println("Primitive_Parameter : x -> " + d.x);

        Primitive_Parameter_change(d.x);
        System.out.println("After change (d.x)");
        System.out.println("Primitive_Parameter : x -> " + d.x);
    }
    void Primitive_Parameter_change(int x){ // 기본형 매개변수 -> 값을 읽기만 할 수 있다.
        x = 1000;
        System.out.println("Primitive_Parameter_change(int x) : x -> " + x);
    }


    public void Reference_main(){
        Data d = new Data();
        d.x = 10;

        System.out.println("Reference_Parameter : x -> " + d.x);

        Reference_Parameter_change(d);
        System.out.println("After change (d.x)");
        System.out.println("Reference_Parameter : x -> " + d.x);
    }
    void Reference_Parameter_change(Data d){ // 참조형 매개변수 -> 값을 읽기&쓰기를 모두 할 수 있다.
        d.x = 1000;
        System.out.println("Reference_Parameter_change(Data d) : x -> " + d.x);
    }

    Data copy(Data d) { // 반환타입이 참조형이라는 것은 메서드가 '객체의 주소'를 반환한다는 것을 의미한다.
        Data tmp = new Data();
        tmp.x = d.x * 100;
        return tmp;
    }
}
// 기본형 매개변수 -> 값을 읽기만 할 수 있다.
// 참조형 매개변수 -> 값을 읽기&쓰기를 모두 할 수 있다.
// 반환타입이 참조형이라는 것은 메서드가 '객체의 주소'를 반환한다는 것을 의미한다.
class Recursive_call{

    Recursive_call(int n){
        System.out.println("\n# 예제 6-15 271pg ______________________");
        int result = factorial(n);
        System.out.println(n + "! = " + result);
    }
    int factorial(int n){
        int result;
        if(n==1)
            result = 1;
        else
            result = n*factorial(n-1);
        return result;
    }
}
//재귀호출은 매개변수의 유효성 검사가 되지 않는 한, 스택 오버플로우에러의 가능성이 있다.
/////////////////////////////////////////////////////////////////////////////////////

class MyMath2{
    long a, b;
    long add2(){return a + b;}
    long sub2(){return a - b;}
    long mul2(){return a * b;}
    long div2(){return a / b;}

    static long add2(long a, long b){return a + b;}
    static long sub2(long a, long b){return a - b;}
    static long mul2(long a, long b){return a * b;}
    static long div2(long a, long b){return a / b;}

    MyMath2(long a, long b){
        System.out.println("\n# 예제 6-19 279pg ______________________");
        System.out.println("Static 메소드 실행중입니다.");
        System.out.print(MyMath2.add2(200L, 100L) + " \t ");
        System.out.print(MyMath2.sub2(200L, 100L) + " \t ");
        System.out.print(MyMath2.mul2(200L, 100L) + " \t ");
        System.out.println(MyMath2.div2(200L, 100L) + " \t ");

        System.out.println("Instance 메소드 실행중입니다.");
        this.a = a;
        this.b = b;
        System.out.print(add2() + " \t ");
        System.out.print(sub2() + " \t ");
        System.out.print(mul2() + " \t ");
        System.out.println(div2() + " \t ");
    }
}
// 1. 클래스를 설개할 때 , 멤버 변수 중 모든 인스턴스에 공통으로 사용하는 것에 Static을 붙인다.
// 2. 클래스 변수(static 변수)는 인스턴스를 생성하지 않아도 사용할 수 있다.
// 3. 클래스 메서드(static method)는 인스턴스 변수를 사용할 수 없다.
// -> 인스턴스 맴버가 존재하는 시점에 클래스 맴버는 항상 존재하지만, 클래스 멤버가 존재하는 시점에 인스턴스 멤버가 존재하지 않을 수 있기 때문에
// 4. 메서드 내에서 인스턴스 변수를 사용하지 않는다면, static을 붙이는 것을 고려한다.
/////////////////////////////////////////////////////////////////////////////////////

class VarArgsEx{
    String result = "";
    VarArgsEx(){
        System.out.println("\n# 예제 6-22 289pg ______________________");
    }
    String concatenate(String delim){
        System.out.println("아무튼 뭐 쥰네 많이 실행중~");
        return delim;
    }
    String concatenate(String delim, String...args){ // + 가변인자(Varargs : Variable arguments)
        for(String str : args){
            this.result += str + delim;
        }
        return result;
    }
}
/*4.오버로딩(Overloading)*/
// -> 사전적인 의미로는 '과적하다' 즉 많이 싣는것을 뜻한다.
// 한 클래스에 같은 이름의 메서드를 여러 개 정의하는 것을 '메서드 오버로딩(method overloading)'이라고 한다.
// 조건 1. 메서드의 이름이 같아야 한다.
// 조건 2. 매개변수의 개수 또는 타입이 달라야 한다.

// + 가변인자(Varargs : Variable arguments)
// -> 변수타입 ... 변수이름
// 매개변수의 개수를 동적으로 지정해줄 수 있는 기능
/////////////////////////////////////////////////////////////////////////////////////

class Car{
    String color;
    String gearType;
    int door;

    Car(){ // 기본생성자
        System.out.println("Car생성자 실행");
        try{
            Car c = null; // Car 클래스 타입 레퍼런스 변수 cartest
            System.out.println(c.getClass());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    } // 클래스에 정의된 생성자가 하나도 없을때 컴파일러에 의해서 기본생성자가 추가됨
    Car(String c){
        this(c,"Auto",4); // ^ this(~)를 통하여 호출시작
        System.out.println("!호출완료");
    }
    Car(String c, String g, int door){ // ^ this()에 의하여 호출됨
        System.out.println("Car(String c, String g, int d)생성자 호출됨");
        color = c; // 생성자 매개변수로 선언된 지역변수 c의 값을 인스턴스 변수 color에 저장
        this.gearType = g; // 이름이 다르니 상관은 없으나 같은경우에는 구별 불가능
        this.door = door; // this.door 은 인스턴스변수, door은 지역변수
        // door = door이라고 한 경우는 둘 다 지역변수로 간주된다.
        // 근데 그냥 보기 편할라고 쓰는거지 안써도 컴파일러가 넣는데
        // this는 참조변수로 인스턴스 자신을 가리킨다. 참조변수를 통해 인스턴스 멤버에 접근할 수 있는것처럼
        // this로 인스턴스 변수에 접근할 수 있는 것이다.
    }
    Car(Car c){ // 인스턴스 복사를 위한 생성자
        this.color = c.color;
        this.gearType = c.gearType;
        this.door = c.door;
    }

    static void CarMain(){
        System.out.println("\n# 예제 6-24 295pg ______________________");
        new Car();
        Car c1 = new Car("Red");
        Car c2 = new Car(c1);
        System.out.println("c1.color -> " + c1.color + ", c1.gearType -> " + c1.gearType + ", c1.door ->" + c1.door);
        System.out.println("c2.color -> " + c2.color + ", c2.gearType -> " + c2.gearType + ", c2.door ->" + c2.door);

    }
}
/*5.생성자(Constructor)*/
// -> '인스턴스 초기화 메서드', 연산자 new가 인스턴스를 생성하는 것이지 생성자가 인스턴스를 생성하는 것이 아님
// 1. 생성자의 이름은 클래스의 이름과 같아야 한다.
// 2. 생성자는 리턴값이 없다.

// 1    2   3   4
// Card c = new Card();
// 레퍼런스타입 레퍼런스변수 = 연산자new 인스턴스(객체)
// 1. 연산자 new에 의해서 매모리(heap)에 Card클래스의 인스턴스가 생성된다.
// 2. 생성자 Card()가 호출되어 수행된다.
// 3. 연산자 new의 결과로, 생성된 Card인스턴스의 주소가 반환되어 참조변수 c에 저장된다.

// this 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소로 저장되어 있다.
//      모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재한다.
// this(), this(매개변수) 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용한다.
/////////////////////////////////////////////////////////////////////////////////////

class BlockTest{
    // 1. 명시적 초기화
    int i = 0;
    static int j = 0;
    // BlockTest e = new BlockTest("생성자"); // 참조형 변수의 초기화
    // 2. 생성자
    BlockTest(String constructor, int i){
        j = i;
        System.out.println(constructor + ": i -> " + this.i);
        this.i = i;
    }
    BlockTest(){

    }
    // 초기화 블럭
    { // 인스턴스 초기화 블럭
        i = 10;
    }
    static{ // 클래스 초기화 블럭
        j = 1;
    }
    static void BlockTestMain(){
        System.out.println("\n# 예제 6-27 303pg ______________________");
        BlockTest e = new BlockTest("생성자", 11);
        System.out.println("e.i -> "+ e.i + ", e.j -> " + BlockTest.j);
    }

}
/*6.변수의 초기화*/
// 멤버 변수(클래스변수와 인스턴스변수)와 배열의 초기화는 선택적이지만 지역변수의 초기화는 필수적이다.
// 초기화 방법
// 1. 명시적 초기화(explicit initialization)
// 2. 생성자(constructor)
// 3. 초기화 블럭(initialization block)
//  -> 인스턴스 초기화 블럭 : 인스턴스 변수를 초기화 하는데 사용
//  -> 클래스 초기화 블력  : 클래스 변수를 초기화 하는데 사용
// 초기화 시점
// -> 클래스 변수의 초기화 시점 : 클래스가 처음 로딩될 때 단 한번 초기화 된다.
//      => 초기화 순서 : 기본값 -> 명시적 초기화 -> 클래스 초기화 블럭 (-> 생성자)
// -> 인스턴스 변수의 초기화 시점 : 인스턴스 변수가 생성될 때마다 각 인스턴스 별로 초기화가 이루어진다.
//      => 초기화 순서 : 기본값 -> 명시적 초기화 -> 인스턴스 초기화 블럭 -> 생성자




public class _SJCh06 {
    public static void main(String[] a){
        Tv tv = new Tv();
        tv.tvtest();

        CardTest.Cardmain();
        MyMath.Mathmain();

        Primitive_And_Reference.Assambled_main();
        Recursive_call r = new Recursive_call(3);
        MyMath2 mm = new MyMath2(300, 200);

        VarArgsEx varargs = new VarArgsEx();
        varargs.concatenate("-", new String[]{"ㅎㅇ", "hello", "hi"});
        System.out.println(varargs.result);
        varargs.concatenate("-","1","2","3");
        System.out.println(varargs.result);

        Car.CarMain();
        BlockTest.BlockTestMain();
    }
}













