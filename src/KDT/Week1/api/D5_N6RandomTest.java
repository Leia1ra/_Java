package KDT.Week1.api;
import java.util.Random;
public class D5_N6RandomTest {
    public static void main(String[] args){
        Random r = new Random();

        for(int i = 1; i <= 100; i++){
            // boolean b = r.nextBoolean();
            // double b = r.nextDouble(10);
            int b = r.nextInt(25)+1;

            System.out.print(b + "\t");
            if(i%10 == 0)
                System.out.println();
        }

    }
}
