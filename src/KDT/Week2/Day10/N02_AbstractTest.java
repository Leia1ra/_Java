package KDT.Week2.Day10;

abstract class Abstract extends AbstractSuper {
// 추상 클래스는 추상 메소드를 1개 이상 포함하고 있는 클래스이다.
// 왼쪽이 abstract를 표기하여야 한다.
// 추상 클래스는 사용할때 반드시 상속을 받아야 한다. 또한 오버라이딩을 하여야 한다.
    public Abstract(){

    }
    public void method1(){
        System.out.println("method1() 실행됨");
    }
    // 반환형, 메소드명, 매개변수를 정의하고 실행부가 없는 메소드를 추상메소드라고 한다.
    // 추상메소드는 반환형 이전에 abstract키워드를 기술해야 힌다
    public abstract void plus(int a, int b);
    public abstract int minus(int x, int y);
}
abstract class AbstractSuper{
    public AbstractSuper(){

    }
    public abstract void multiple();
}

//1. 추상클래스 상속
public class N02_AbstractTest extends Abstract{
    public N02_AbstractTest(){

    }
    @Override
    public void plus(int a, int b){
        System.out.println(a + " + " + b + " = " + (a+b));
    }

    @Override
    public int minus(int a, int b){
        return a-b;
    }
    @Override
    public void multiple() {
        System.out.println("multiple()메소드 실행됨");
    }
    public static void main(String args[]){
        System.out.println("\n# Sequence 01 __________________________________");
        // 추상클래스는 미완의 메소드가 포함되어 있으므로 객체를 생성할 수 없다.
        // Abstract at = new Abstract();
        N02_AbstractTest am = new N02_AbstractTest();
        am.method1();
        am.plus(45,55);
        am.multiple();
    }
}

