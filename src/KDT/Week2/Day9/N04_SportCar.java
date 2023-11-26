package KDT.Week2.Day9;
import KDT.Week2.Day9.ModfierTest.Car;
public class N04_SportCar extends Car{

    public N04_SportCar(){
        System.out.println("brend(부모) -> " + super.brend);

        // 속도 증가
        speedUp();
        System.out.println("speed -> " + speed);
    }

    public static void main(String args[]){
        System.out.println("\n# Sequence 01 __________________________________");
        N04_SportCar sc = new N04_SportCar();
        System.out.println("brend(객체) -> " + sc.brend);

        // 속도 증가
        System.out.println("\n# Sequence 02 __________________________________");
        System.out.println("speed -> " + sc.speed);

        //다른 패키지에 있는 Car클래스
        System.out.println("\n# Sequence 03 __________________________________");
        Car c = new Car();
        //protected -> 다른패키지에 있는 클래스 쓸거면 상속 받아서 써라
        // c.speedUp(); // protected 메소드는 다른페키지에 있는경우 상속받지 않으면 사용 불가

    }
}
