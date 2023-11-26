package KDT.Week2.Day9;
// 클래스명에 final이 있는경우 현재 클래스는 상속할 수 없다.
// public final class N03_1_TV {
public class N03_1_TV {
    int size = 42;
    int channel = 11;
    int volumn = 12;
    final static int MAX_VOLUMN = 30; // final변수 상수는 값을 변경할 수 없다.
    final static int MIN_VOLUMN = 0;

    public N03_1_TV(){
        System.out.println("Tv 실행됨");
        size = 55;
        channel = 3;
        volumn = 15;
    }
    public void volumnUp(){
        ++volumn;
        if(volumn > MAX_VOLUMN){
            volumn = MAX_VOLUMN;
        }
    }

    public final void volumnDown(){
        // 상속은 할 수 있으나, 오버라이딩은 할 수 없다.
        --volumn;
        if(volumn < MIN_VOLUMN){
            volumn = MIN_VOLUMN;
        }
    }
}
