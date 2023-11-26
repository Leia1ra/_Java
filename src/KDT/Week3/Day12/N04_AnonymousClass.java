package KDT.Week3.Day12;

public class N04_AnonymousClass {
    String name = "이선왕";
    public N04_AnonymousClass(){

    }
    // 1. 클래스 영역에 정의된 클래스
    // -> N02 확인
    // 2. 메소드 내의 내부 클래스
    // -> N03 확인
    // 3. 익명의 내부 클래스
    public void start(){
        // 익명의 내부 클래스
        N04_Sample s = new N04_Sample(){ // 상속과 비슷한 관계가 있음, 특정 메서드를 오버라이딩하는게 주목적
            //N04_Sample의 sum 메소드 오버라이딩
            @Override
            public void sum(){
                int evenSum = 0;
                for(int i = 0; i<=100; i+=2)
                    evenSum += i;
                System.out.println("evenSum -> " + evenSum);
            }
            public void print(){
                System.out.println(num + " -> " + name);
            }
        };//.sum();//.print(); // 이정도 크기의 객체를 익명으로 만들었고 Sample의 이름을 빌림
        s.sum();
        // s.print();// 익명의 내부클래스에서 추가한 메소드는 숨김처리
        // $1만 붙고 이름은 생기지 않음 이래서 익명임
    }
    public static void main(String[] args){
        new N04_AnonymousClass().start();
    }
}
