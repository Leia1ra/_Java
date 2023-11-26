package KDT.Week2.Day6;

public class N2_StringBufferTest {
    public static void main(String args[]){

        // String : 문자열 연산이 적고 멀티쓰레드 환경인 경우
        // StringBuffer : 문자열 연산이 많고, 멀티쓰레드 환경인 경우
        // StringBuilder : 문자열 연신이 많고, 단일쓰레드거나 동기화를 고려하지 않아도 되는 경우
        String name = "홍길동";
        StringBuffer sb1 = new StringBuffer("이선왕");
        StringBuffer sb2 = new StringBuffer(100);
        StringBuffer sb3 = new StringBuffer("String Buffer Test!");

        // 공간확인
        System.out.println("\n#문자열 공간 확인_________________________________");
        System.out.println("sb1 = " + sb1.capacity() + ", sb2 = " + sb2.capacity() + ", sb3 = " + sb3.capacity());

        // 문자열을 마지막에 추가하기
        System.out.println("\n#문자열을 마지막에 추가하기__________________________");
        sb1.append("의 " + sb3);
        sb1.append(1234);
        System.out.println("sb1 -> " + sb1);
        System.out.println("sb2 -> " + sb2.toString()); // 정확한 출력은 이게 정석인데 생략 가능
        System.out.println("sb3 -> " + sb3);

        // 문자열 삽입
        System.out.println("\n#문자열 삽입_____________________________________");
        sb1.insert(24, " (스트링) ");
        System.out.println("sb1 -> " + sb1);

        // 문자열 삭제
        System.out.println("\n#문자열 삭제_____________________________________");
        sb1.delete(24,35);
        System.out.println("sb1 -> " + sb1);

        // 문자열 뒤집기
        System.out.println("\n문자열 뒤집기_____________________________________");
        sb1.reverse();
        System.out.println("sb1 -> " + sb1);
    }
}
