package KDT.Week2.Day9.ModfierTest;

public class Car {
    protected String brend = "그랜저";
    String color = "white";
    final static int MAX_SPEED = 180;
    final static int MIN_SPEED = 0;
    protected int speed = 0;


    public Car(){
    // protected Car(){
        System.out.println("car()생성자 메소드 실행됨...");
    }
    protected void speedUp(){
        ++speed;
        if(speed > MAX_SPEED)
            speed = MAX_SPEED;
    }

    public void speedDown(){
        --speed;
        if(speed < MIN_SPEED)
            speed = MIN_SPEED;
    }

}
