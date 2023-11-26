package KDT.Week1.api;

public class D5_N5MathTest {
    public static void main(String[] a){
        System.out.println("abs -> " + Math.abs(-12.456));
        System.out.println("ceil -> " + Math.ceil(12.34));
        System.out.println("floor -> " + Math.floor(1234.56));
        System.out.println("max -> " + Math.max(1, 100));
        System.out.println("min -> " + Math.min(1, 100));
        System.out.println("pow -> " + (int)Math.pow(12,2));
        System.out.println("round -> " + Math.round(23.5));
        System.out.println("sqrt -> " + Math.sqrt(25));

        System.out.println("random -> " + (Math.random()) + "\n");

        for(int i = 0; i < 100; i++){
            // n ~ n+r까지 구하고 싶으면 random()*(r+1) + n하면 됨
            double ran = (int)(Math.random()*(40-15+1)+15);
            System.out.println((int)ran);
        }
    }
}
