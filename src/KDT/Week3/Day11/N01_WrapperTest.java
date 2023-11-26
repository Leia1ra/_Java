package KDT.Week3.Day11;

public class N01_WrapperTest {
    public N01_WrapperTest(){

    }
    public void start(){
        int a = 10;
        int b = 3;
        Integer i1 = new Integer(5);
        Integer i2 = new Integer("12");

        String data = "24";// 문자화된 숫자 -> int (Integer)
        int c = Integer.parseInt(data);
        Integer d = Integer.valueOf(data);

        // 기본 데이터 타입은 상수를 직접가진다.
        // 객체형은 해당클래스의 기능을 모두 가진다.
        System.out.println("바이트 수 -> " + d.SIZE);
        int e = Integer.bitCount(31);
        System.out.println("e -> " + e);

        int f = Integer.parseInt("17");
        Integer g = a; // 오토박싱 : v1.5 이상 -> 객체형 = 기본타입데이터 대입
        int h = g; // 오토 언박싱: v1.5이상 -> 기본타입 = 객체형 대입
        System.out.println("max -> " + Integer.max(a, b));
        System.out.println("reverse -> " + Integer.reverse(a));
        //1010 0000 0000 0000 0000 0000 0000 0000
        System.out.println("29 -> " + Integer.toHexString(29)+ ", " + Integer.toOctalString(29) + ", " + Integer.toBinaryString(29));
    }
    public static void main(String[] args){
        N01_WrapperTest wt = new N01_WrapperTest();
        wt.start();
    }
}
