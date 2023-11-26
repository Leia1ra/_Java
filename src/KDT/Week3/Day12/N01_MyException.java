package KDT.Week3.Day12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class N01_MyException extends Exception {
    enum Error{

    }
    public N01_MyException(){
        super("양의 정수를 입력하셔야 합니다.");
    }
    public N01_MyException(String msg){
        // 상위클래스의 생성자메소드 호출
        super(msg);
    }
}
class MyExceptionMain {
    public MyExceptionMain() {
        int max = inData();
        sumOutput(max);
    }

    public int inData(){
        Scanner scan = new Scanner(System.in);

        int max = 0;
        while(true){
            try{
                System.out.print("1~100사이의 정수를 입력하세요 -> ");
                max = Integer.parseInt(scan.nextLine());
                //n의 값이 1~100사이의 값이 아니면 예외발생( <- MyException으로 )
                if(max < 1 || max>100){
                    // 강제로 예외발생 : throw
                    throw new N01_MyException("1~100사이의 값을 입력하여야 합니다.");
                }
                break;
            }catch (InputMismatchException ime){
                System.out.println("정수를 입력하지 않았습니다.");
                ime.printStackTrace();
            }catch (N01_MyException me){
                System.out.println(me.getMessage());
            }
        }
        return max;
    }
    public void sumOutput(int max){
        int sum = 0;
        for(int i = 1; i<=max; ++i){
            sum += i;
        }
        System.out.println("1~"+max+"까지의 합은 " + sum);
    }

    public static void main(String[] args){
        new MyExceptionMain();
    }
}