package KDT.Week3.Day11;

import java.util.Arrays;
import java.util.Scanner;
enum ErrorException{
    None("none"),
    ZEORDIV("ZeroDivisionError"),
    ARRIDX("ArrayIndexOutOfBounce");
    private final String value;

    ErrorException(String name) {
        this.value = name;
    }
    String GetException(){
        return this.value;
    }
}

public class N03_ExceptionTest1 {
    public static void main(String[] args){
        /*CalendarOOP c = new CalendarOOP();
        c.cal_Assamble();*/
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 정수 -> ");
        int n1 = 2;//scan.nextInt();
        System.out.print("두번째 정수 -> ");
        int n2 = 0;//scan.nextInt();
        int sum = n1 + n2;
        System.out.println("n1 + n2 = " + sum);

        ErrorException[] eex = {
            ErrorException.None,
            ErrorException.None,
        };
        //ErrorException.values();

        int i = 0;
        try{
            int div = sum/n2;
            System.out.println("sum / n2 = " + div);
        }catch (ArithmeticException e){
            eex[i] = ErrorException.ZEORDIV;
            i++;
        }


        try{
            int arr[] = new int[4];
            arr[arr.length] = 120;
            System.out.println(Arrays.toString(arr));
        } catch (IndexOutOfBoundsException e){
            eex[i] = ErrorException.ARRIDX;
            ++i;
        }

        for(ErrorException K : eex){
            switch (K){
                case ZEORDIV:
                    System.out.println(K.GetException());
                    break;
                case ARRIDX:
                    System.out.println(K.GetException());
                    break;
                case None:
                    System.out.println(K.GetException());
            }
        }


    }
}

