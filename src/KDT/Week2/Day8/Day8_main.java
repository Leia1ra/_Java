package KDT.Week2.Day8;

public class Day8_main {
    public static void main(String[] args){
        System.out.println("\n# Sequence 01 __________________________");
        N1_Member n1 = new N1_Member();
        System.out.println("\n# Sequence 02 __________________________");
        N1_Member n2 = new N1_Member(300, "이선왕");

        n2.output();

        System.out.println("\n# Sequence 03 __________________________");
        // 객체간 맴버변수의 리터럴은 공유되지 않는다.
        System.out.println("변경 젼 -> n1.num => " + n1.num + ",   \tn2.num =>" + n2.num);
        System.out.println("변경 전 -> n1.name => " + n1.name + ", \tn2.name =>" + n2.name);
        n1.num = 1000;
        n1.name = "왕선이";
        System.out.println("변경 후 -> n1.num => " + n1.num + ", \tn2.num =>" + n2.num);
        System.out.println("변경 후 -> n1.name => " + n1.name + ", \tn2.name =>" + n2.name);

        System.out.println("\n# Sequence 04 __________________________");
        N2_Sample samp1 = new N2_Sample();
        N2_Sample samp2 = new N2_Sample("이선왕");
        System.out.print("임의의 정수 입력 -> ");
        int input = 100;//samp1.scan.nextInt();
        samp1.allsum(input);
        samp1.oddEvenSum(input);


        System.out.println("\n# Sequence 05 __________________________");
        //static 키워드가 없는 변수
        N3_StaticTest1 st1 = new N3_StaticTest1();
        System.out.println("st.num -> " + st1.num);
        System.out.println("st.static_num -> " + st1.static_num);
        // -> 이렇게 쓰는것도 문제는 없으나 지양하는것이 좋음
        // static 맴버변수는 클래스명.멤버변수로 접근한다.
        System.out.println("static_num -> " + N3_StaticTest1.static_num);
        N3_StaticTest1 st2 = new N3_StaticTest1();
        System.out.println("변경전 st2.num -> " +st2.num);
        st2.num = 5678;
        System.out.println("st1.num -> " + st1.num + ", \t\tst2.num -> " + st2.num);

        st1.static_num = 1234;
        N3_StaticTest1.static_num = 2345;
        System.out.println("st1.static_num -> " + st1.static_num + ", st2.static_num -> " + st2.static_num);


        System.out.println("\n# Sequence 06 __________________________");

        System.out.println("st.plus(10, 20) -> " + st1.plus(10,20));
        //N3_StaticTest.plus ~ Static맴버가 아니기에 작성조차 할 수 없음
        System.out.println("StaticTest.minus(100, 200) -> " + N3_StaticTest1.minus(100, 200));
        System.out.println("st1.minus(100, 200) -> " + st1.minus(100, 200));

        System.out.println("\n# Sequence 07 __________________________");
        CalendarOOP c = new CalendarOOP(2222,2);
        c.cal_Assamble();
    }
}
