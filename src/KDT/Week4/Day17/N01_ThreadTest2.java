package KDT.Week4.Day17;
// 스레드 생성 방법2
// 인터페이스 Runnable 상속받아 스레드 구현


public class N01_ThreadTest2 implements Runnable{
    String msg;

    N01_ThreadTest2(){

    }
    N01_ThreadTest2(String msg){
        this.msg = msg;
    }
    @Override // 스레드 구현이 가능한 메소드 오버라이딩
    public void run() {
        for(int i = 1; i <= 1000; ++i){
            System.out.println(msg + " -> " +i);
        }
    }

    public static void main(String args[]){
        N01_ThreadTest2 tt1 = new N01_ThreadTest2("!첫번째 Thread");
        N01_ThreadTest2 tt2 = new N01_ThreadTest2("@두번째 Thread");
        N01_ThreadTest2 tt3 = new N01_ThreadTest2("#세번째 Thread");

        Thread t1 = new Thread(tt1);
        Thread t2 = new Thread(tt2);
        Thread t3 = new Thread(tt3);

        t1.start();
        t2.start();
        t3.start();
    }
}
