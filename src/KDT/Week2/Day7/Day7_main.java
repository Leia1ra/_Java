package KDT.Week2.Day7;

public class Day7_main {
    public Day7_main(){}

    public static void main(String[] args){
                        // 객체 생성 // 생성자 메소드와 관련됨
        N1_ClassTest n1 = new N1_ClassTest();
        N1_ClassTest n2 = new N1_ClassTest(100);
        N1_ClassTest n3 = new N1_ClassTest("Red");
        N1_ClassTest n4 = new N1_ClassTest(200, "Pink");

        // 객체 내의 메소드를 호출하여 기능을 실행함.
        // 레퍼런스명.메소드명();
        int returnValue1 = n1.getNum();
        System.out.println(" => return Value1 -> " + returnValue1);
        int returnValue2 = n1.getNum();
        System.out.println(" => return Value2 -> " + returnValue2);
        int returnValue3 = n1.getNum(10000);
        System.out.println(" => return Value3 -> " + returnValue3);
        int returnValue4 = n2.getNum();
        System.out.println(" => return Value4 -> " + returnValue4);
        // 같은 레퍼런스에선 객체 내부의 데이터는 업데이트 되지만
        // 다른 레퍼런스의 객체의 값에 영향을 주지는 못함
        // (static메서드는 객채간 메모리를 공유, 객체 변수(레퍼런스)접근은 불가능하다고 함.)
        n1.setName(); // 반환형이 없는(void) 리턴값이 없으므로 변수에 대입할 수 없음.

        // 객체 내의 맴버 변수 사용하기
        System.out.println("\n#8 객체 내의 맴버 변수 사용하기 __ __ __ __ __ __ __ __ __");
        System.out.println("n1.name -> " + n1.name);
        String str = n1.scan.nextLine();
        System.out.println("str -> " + str);
    }
}
