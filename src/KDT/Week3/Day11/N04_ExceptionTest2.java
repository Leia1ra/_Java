package KDT.Week3.Day11;

enum Error{
    INPUTMISS("InputMissMatchException"),
    ZERODIV("ZeroDivisonError"),
    ARRIDX("ArrayIndexOutOfBounce");

    Error(String msg) {

    }
}

public class N04_ExceptionTest2 {
    public static void main(String[] args){
        try{
            int n1 = 10;
            int n2 = 0;
            int divide = n1/n2;
            System.out.println(divide);
            int[] arr = new int[4];
            arr[arr.length] = 120;
        }catch (ArithmeticException e){
            System.out.println(e.getClass());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            // Error E = new Error(e.toString());
            switch (e.toString()){
            }
        }finally{
            System.out.println("Finally 는 무조건 실행");
        }
    }
}
