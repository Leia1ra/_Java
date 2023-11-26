package KDT.Week4.Day16;
// thread처리를 하는 클래스를 만드는 방법
// Thread클래스를 상속받아 스레드를 구현하는 run()메소드를 오버라이딩을 함
// start()를 호출해준다

public class N05_ThreadTest1 extends Thread {
    int num = 1;
    String name;

    public N05_ThreadTest1(String name){
        this.name = name;
    }
    public void numOutput(){
        while(num != 11){
            System.out.println(num++ + " ");
        }
        System.out.println("DONE!");
    }

    @Override
    public void run() {
        while(num != 100){
            System.out.println(name + " -> " + num++);
        }
        System.out.println("DONE!");
    }

    public static void main(String[] args){
        N05_ThreadTest1 tt1 = new N05_ThreadTest1("#첫번째 스레드");
        N05_ThreadTest1 tt2 = new N05_ThreadTest1("$두번째 스레드");
        tt1.start();
        tt2.start(); // 실행 안됨.
    }
}
