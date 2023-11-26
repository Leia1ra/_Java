package KDT.Week3.Day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class N06_ExceptionTest4 {
    Scanner scan = new Scanner(System.in);

    public N06_ExceptionTest4() throws InputMismatchException, ArithmeticException{ // 오류를 떠넘겨줌
        int x = inData("First");
        int y = inData("Second");
        sum(x,y);

    }
    public int inData(String msg) throws InputMismatchException {
        System.out.print(msg + " -> ");
        return scan.nextInt();
    }
    //합
    public void sum(int x, int y){
        System.out.println("합 -> " +(x + y));
        div(x, y);
    }
    public void div(int x, int y) throws ArithmeticException{
        System.out.println("몫 -> " +(x / y));
        getData();
    }
    public void getData() throws ArrayIndexOutOfBoundsException{
        int a[] = {10,20,30};
        int s = 0;
        /*for(int k : a){
            s += k;
        }*/
        for(int i = 0; i<=a.length; i++){
            s += a[i];
        }
        System.out.println("배열의 합 -> " + s);
    }
    public static void main(String args[]){
        try{
            new N06_ExceptionTest4();
        }catch (InputMismatchException i){
            System.out.println(i.getClass());
        }catch (ArithmeticException a){
            System.out.println(a.getClass());
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println(a.getClass());
        }
    }
}
