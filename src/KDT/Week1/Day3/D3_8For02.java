package KDT.Week1.Day3;

public class D3_8For02 {
    public static void main(String a[]){
        for(int i = 1; i <= 5; ++i){
            System.out.println("i -> " + i);
            for(int j = 1; j < 5; ++j){
                System.out.println("["+ i + "] j -> " + j);
            }
        }
    }
}
