package Chapter;
// 객체 지향 특성 :
// 1. 캡슐화 : 객체를 캡슐로 싸서 내부를 볼 수 없게 하는 것
// >> 클래스(class): 객체 모양을 선언한 틀(캡슐화), 메소드(맴버 함수)와 필드(맴버 변수)는 모두 클래스 내에 구현
// >> 객체 : 클래스의 모양대로 생성된 실체(instance), 객체 내 데이터에 대한 보호(외부 접근 제한)
// 2. 상속 : 상위 개체의 속성이 하위 개체에 물려짐, 하위 객체가 상위 개체의 속성을 모두 가지는 관계
// >> 부모 클래스 : 수퍼 클래스
// >> 하위 클래스 : 서브 클래스 : 부모 클래스를 재사용하고 새로운 특성 추가
// class human extends Animal{~}
// 3. 다형성 : 같은 이름의 메소드가 클래스나 객체에 따라 다르게 동작하도록 구현
// >> 메소드 오버로딩 : 같은 이름이지만 다르게 작동하는 여러 메소드
// >> 메소드 오버라이딩 : 부모 클래스의 메소드를 서브 클래스마다 다르게 구현

// 클래스 : 객체를 만들어내기 위한 설계도 혹은 틀, 객체의 속성(state)과 행동(behavior)포함
// 객체 : 클래스의 모양 그대로 찍어낸 실체(인스턴스(instance)), 메모리 공간을 갖는 구체적인 실체
// 레퍼런스 : 변수이름에 불과한 '호칭',
// class Animal{} > main{} > Animal cat;(객체, 레퍼런스),cat = new Animal();(인스턴스)

// 필드(field) : 객체 내에 값을 저장하는 멤버 변수
// 메소드(method) : 멤버 함수이며 객체의 행동을 구현
// 생성자 : 클래스의 이름과 동일한 특별한 메소드, 객체가 생성될 때 자동으로 한번 호출되는 메소드
public class ch4 {
    public static void main_ch4(){
        // 4장 17pg 4-1	: Circle 클래스의 객체 생성 및 활용
        System.out.println("\n# 4장 17pg 4-1\t: Circle 클래스의 객체 생성 및 활용___");
        Basic_Class Circle_1;         // Basic_Class 객체(레퍼런스) 생성
        Circle_1 = new Basic_Class(); // Circle_1 객체(인스턴스) 생성
        Circle_1.radius = 10;         // Circle_1 반지름을 10으로 설정
        Circle_1.name = "자바 ㅈ노잼";   // Circle_1 이름을 설정
        double area1 = Circle_1.getArea();
        System.out.println(Circle_1.name + "의 면적은 " + area1);

        Basic_Class Circle_2;         // Basic_Class 객체(레퍼런스) 생성
        Circle_2 = new Basic_Class(); // Circle_2 객체(인스턴스) 생성
        Circle_2.radius = 15;         // Circle_2 반지름을 15으로 설정
        Circle_2.name = "자바 개노잼";   // Circle_2 이름을 설정
        double area2 = Circle_2.getArea();
        System.out.println(Circle_2.name + "의 면적은 " + area2);

        // 4장 20pg 4-3	: 두 개의 생성자를 가진 Circle 클래스
        System.out.println("\n# 4장 20pg 4-3\t: 두 개의 생성자를 가진 Circle 클래스__");
        Constructor Circle_3 = new Constructor(10, "자바 쌉노잼"); // 매개변수를 가진 생성자와 연결됨
        System.out.println(Circle_3.name + "의 면적은 " + Circle_3.getArea());

        // 4장 22pg 4-4	: 생성자를 선언 및 활용 연습
        System.out.println("\n# 4장 22pg 4-4\t: 생성자를 선언 및 활용 연습__________");
        Book littlePrince = new Book("어린왕자","생텍쥐페리");
        Book loveStory = new Book("춘향전");
        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);

        // 4장 30pg 4-5	: this()로 다른 생성자 호출
        System.out.println("\n# 4장 30pg 4-5\t: this()로 다른 생성자 호출_________");
        this_Member this_none = new this_Member();
        this_Member this_littlePrince = new this_Member("어린왕자","생텍쥐페리");
        this_Member this_loveStory = new this_Member("춘향전");
        this_none.show(0,"자바노잼","인 정");
        this_littlePrince.show(1);
        this_loveStory.show(2);
        /*객체의 치환은 객체가 복사되는 것이 아니며 레퍼런스가 복사된다*/
        this_Member ob1 = this_littlePrince;
        this_loveStory = this_littlePrince;
        System.out.println(this_littlePrince.title + " \t" + this_littlePrince.author);
        System.out.println(this_loveStory.title + " \t" + this_loveStory.author);
        ob1.show(0);
        this_littlePrince.show(1);
        this_loveStory.show(2);

        // 4장 34pg 4-6	: Circle 객체 배열 만들기
        System.out.println("\n# 4장 34pg 4-6\t: Circle 객체 배열 만들기___________");
        Circle_Array[] c = new Circle_Array[5];
        for(int i = 0; i < c.length; i++){
            c[i] = new Circle_Array(i);
        }
        for(Circle_Array ca : c){
            System.out.println(ca.getArea());
        }

        // 4장 35pg 4-7	: 객체 배열 만들기 연습
        System.out.println("\n# 4장 35pg 4-7\t: 객체 배열 만들기 연습______________");
        Book_Array[] b = new Book_Array[2];
        String[] title = new String[]{"사랑의 기술", "시간의 역사"};
        String[] author = new String[]{"에리히 프롬", "스티븐 호킹"};
        for(int i = 0; i < b.length; i ++){
            b[i] = new Book_Array(title[i], author[i]);
        }
        for(Book_Array k : b)
            System.out.println("(" + k.title + ", " + k.author + ")");

        // 4장 41pg 4-8	: 인자로 배열이 전달되는 예
        System.out.println("\n# 4장 41pg 4-8\t: 인자로 배열이 전달되는 예___________");
        char a[] = new char[]{'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
        Call_by_Reference ref = new Call_by_Reference(a);
        ref.replaceSpace();
        ref.printCharArray();

        // 4장 41pg 4-10	: 멤버의 접근 지정자
        System.out.println("\n# 4장 41pg 4-10\t: 멤버의 접근 지정자_______________");
        AccessEx acc = new AccessEx();

        /*static 멤버를 객체의 멤버로 접근하는 사례*/
        System.out.println("\n# static 멤버를 객체의 멤버로 접근하는 사례_____________");
        StaticEx sta = new StaticEx();
        sta.object_Member_Access();
        /*static 멤버를 클래스 이름으로 접근하는 사례*/
        System.out.println("# static 멤버를 클래스 이름으로 접근하는 사례____________");
        sta.class_Name_Access();

    }
}
class Basic_Class{
    int radius;     // 원의 반지름 필드
    String name;    // 원의 이름 필드
    /*Basic_Class(){
        // 기본 생성자(Default constructor), 앞에 접근제어자 선언ㄱㄴ
        // 클래스에 생성자가 하나도 없는 경우, 컴파일러에 의해 자동으로 삽입됨
        // 개발자가 클래스에 생성자를 하나라도 작성한 경우에, 매개변수를 필요로 한다면 오류 발생
    }*/
    double getArea(){
        return 3.14 * Math.pow(radius,2);
    }
}
class Constructor/*생성자*/{
    // 생성자는 메소드, 클래스 이름과 반드시 동일, 여러개 작성 가능(overloading)
    // new를 틍해 객체를 생성할 때, 객체당 한 번 호출함
    // 생성자의 목적은 객체 초기화, 리턴 타입을 지정할 수 없음
    // 생성자는 객체가 생성될 때 반드시 호출됨.(개발자가 안하면 컴파일러가 자동으로 생성자 삽입)
    int radius;
    String name;
    Constructor(){ // 매개 변수 없는 생성자
        radius = 1;
        name = "";
    }
    Constructor(int r, String n){ // 매개 변수를 가진 생성자
        radius = r;
        name = n;
    }
    double getArea(){
        return 3.14 * Math.pow(radius,2);
    }
}
class Book{
    String title;
    String author;
    Book(String t){
        title = t; author = "작자 미상";
    }
    Book(String t, String a){
        title = t; author = a;
    }
}
class this_Member/*this 생성자*/{
    // 객체 자신에 대한 레퍼런스
    // > 컴파일러에 의해 자동 관리, 개발자는 사용하기만 하면 됨
    // > this.멤버 형태로 멤버 사용
    // this의 필요성
    // 1. 객체의 멤버 변수와 메소드 변수의 이름이 같은경우
    // 2. 다른 메소드 호출 시 객체 자신의 레퍼런스를 전달할 때 // 4장 27pg참고
    // 3. 메소드가 객체 자신의 레퍼런스를 반환할
    String title, author;
    void show(int Section){
        System.out.println(Section + " \t" +title + " \t" + author);
    }
    void show(int Section, String title, String author){
        this.title = title;
        this.author = author;
        show(Section);
    } // 이게 메소드 오버로딩, 리턴 타입은 달라도 괜찮은데 매개변수의 개수나 타입은 달라야함
    this_Member(){
        this("빈 책","빈 저자");
        System.out.println("생성자 호출됨");
    }
    this_Member(String title){
        this(title, "작자미상");
    }
    this_Member(String t, String a) {
        this.title = t;
        this.author = a;
    }
}
class Circle_Array{
    int radius;
    Circle_Array(int radius){
        this.radius = radius;
    }
    double getArea(){
        return 3.14 * Math.pow(radius,2);
    }
}
class Book_Array{
    String title, author;
    Book_Array(String t, String a){
        this.title = t;
        this.author = a;
    }
}
class Call_by_Reference{
    char[] c;
    Call_by_Reference(char[] _char){
        this.c = _char;
    }
    void replaceSpace(){
        // for(char k : c){
        //     if(k == ' '){
        //         k = ',';
        //     }
        // }
        for(int i = 0; i<c.length; i++){
            if(c[i] == ' ')
                c[i] = ',';
        }
    }
    void printCharArray(){
        for(char k : c)
            System.out.print(k);
        System.out.println();
    }
}
class Garbage_collection{
    // Garbage(가비지)는 레퍼런스가 하나도 없는 객체를 의미함, 누구도 사용할 수 없게 된 메모리.
    // 이름 레퍼런스 = new 객체
    private void garbageEx(){
        String reference_a = new String("객체Good"); // <- 가비지가 됨.
        String reference_b = new String("객체Bad");
        String reference_c = new String("객체Normal"); // <- 다른 레퍼런스에 의해 버려지지 않으므로 가비지가 아님
        String reference_d, reference_e;
        reference_a = null;
        reference_d = reference_c;
        reference_c = null;
    }
}

class AccessSample {
    private int a;   // private   // 외부로부터 완벽 차단, 같은 클래스 내에서만 사용 가능
    int b;           // default   // 동일한 패키지 내에서만 사용 가능,
                     // >> package-private라고도 함
    protected int c; // protected // 동일한 패키지와 자식 클래스에서 허용
                     // >> 상속받은 서브(자식) 클래스는 다른 패키지에 있어도 접근 가능
    public int d;    // public    // 모든 클래스에서 허용

    AccessSample(){this.a = 10;}
}
class AccessEx extends AccessSample{
    void Access(){
        AccessSample classA = new AccessSample();
        // classA.a = 10;
        b = 10;
        c = 10;
        d = 10;
    }
}

class StaticSample{
    void g(){m = 20;}
    void h(){m = 30;}

    static int m;
    static void f(){m = 5;}
}

class StaticEx{
    void object_Member_Access()/*static 멤버를 객체의 멤버로 접근하는 사례*/{
        StaticSample s1, s2;
        s1 = new StaticSample();
        System.out.print("[s1 시작] > "+ s1.m + "\t > ");
        s1.g();
        System.out.print(s1.m + "[s1.g():20] > ");
        s1.m = 50;
        System.out.println(s1.m + "[s1.m = 50]");

        s2 = new StaticSample();
        System.out.print("[s2 시작] > " + s1.m + "\t > ");
        s2.h();
        System.out.print(s1.m + "[s2.h():30] > ");
        s2.f();
        System.out.println(s1.m + "[s2.f():5]");
    }
    void class_Name_Access()/*static 멤버를 클래스 이름으로 접근하는 사례*/{
        StaticSample.m = 10;
        StaticSample s1 = new StaticSample();
        System.out.print(s1.m + " > ");
        s1.f();
        StaticSample.f();
        System.out.println(s1.m);
    }
}























