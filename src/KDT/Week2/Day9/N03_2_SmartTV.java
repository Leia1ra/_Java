package KDT.Week2.Day9;

public class N03_2_SmartTV extends N03_1_TV{
// final 부모 클래스는 존재할 수 없음.
    public N03_2_SmartTV(){
        System.out.println("SmartTv 실행됨");
        size = 65;
        // channel = 3;
        // volumn = 15;
    }
    public void start(){
        System.out.println("MAX_VOLUMN -> " + MAX_VOLUMN);

        System.out.println("volumn 변경전 -> " + super.volumn);
        volumnDown();
        System.out.println("volumn 변경후 -> " + super.volumn);
    }

    // 상위클래스의 final메소드는 오버라이딩을 할 수 없다.
    // public void volumnDown(){
    //
    // }

    public static void main(String[] agrs){
        System.out.println("\n# Sequence 01 __________________________");
        N03_2_SmartTV sTv = new N03_2_SmartTV();

        System.out.println("\n# Sequence 02 __________________________");
        sTv.start();
        // final 필드 : 수정 불가 필드
        // finla 클래스 : 부모로 사용할 수 없음
        // final 메소드 : 자식클래스에서 재정의 할 수 없음
    }
}
