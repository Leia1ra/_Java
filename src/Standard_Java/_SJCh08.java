package Standard_Java;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

class ExceptionHandling{
    void Exmain(){
        try{
            System.out.println(1/0);
        }catch (ArithmeticException a){
            System.out.println("\n# 예제 8-01 400pg ______________________");
            System.out.println("에러메시지 : " + a.getMessage());
            // a.printStackTrace();
            //  java.lang.ArithmeticException: / by zero
            // 	at Standard_Java.ExceptionHandling.Exmain(_SJCh08.java:6)
            // 	at Standard_Java._SJCh08.main(_SJCh08.java:50)
        }
    }

    void throwException(){
        try{
            Exception e = new Exception("고의로 발생");
            throw e;

        } catch (Exception e) {
            System.out.println("\n# 예제 8-09 425pg ______________________");
            System.out.println("에러메시지 : " + e.getMessage());
            // e.printStackTrace();
            //  java.lang.Exception: 고의로 발생
            // 	at Standard_Java.ExceptionHandling.throwException(_SJCh08.java:15)
            // 	at Standard_Java._SJCh08.main(_SJCh08.java:51)
        }
    }
}
/*1.예외처리()*/
// 프로그램이 실행중 어떤 원인에 의해서 오작동을 하거나 비정상적으로 중료되는 경우가 있는데
// 이러한 결과를 초래하는 원인을 프로그램 에러 또는 오류라고 한다.
// 컴파일 에러 : 컴파일 시에 발생하는 에러
// 런타임 에러 : 실행시에 발생하는 에러
// 논리적 에러 실행은 되지만, 의도와 다르게 동작하는 것
//
// 에러(Error)     -> 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
// 예외(Exception) -> 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류
// => Exception클래스와 자손들 (Checked 예외)
//    > 사용자의 실수와 같은 외적요인에 의해 발생하는 예외
// => Exception클래스의 자손인 RuntimeException클래스와 그 자손들 (UnChecked 예외)
//    > 프로그래머의 실수로 발생하는 예외

// 예외처리(Exception Handling)
// 정의 > 프로그램 실행 시 발생할 수 있는 예외에 대비한 코드를 작성하는 것
// 목적 > 프로그램의 비정상 종료를 막고 정상적인 실행상태를 유지하는 것

// printStackTrace()
// -> 예외 발생 당시의 호출스택(Call Stack)에 있었던 메서드의 정보와 예외 메시지를 화면에 출력함
// getMessage()
// -> 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.

class TryWithResource{
    public void resource(){
        System.out.println("\n# 예제 8-20 437pg ______________________");
        int sum = 0;
        try(
            FileInputStream fis = new FileInputStream("score.dat");
            DataInputStream dis = new DataInputStream(fis)
        ){
            int score;
            while (true) {
                score = dis.readInt();
                System.out.println(score);
                sum += score;
            }
        } catch(EOFException e){
            System.out.println("점수의 총합은 " + sum + "입니다");
        } catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
// try문의 () 안에 객체를 생성하는 문장을 넣으면 이 객체는
// 따로 close를 호출하지 않아도 try블럭을 벗어나는 순간 자동적으로 close()가 호출됨


/* 사용자 정의 예외*/
class SpaceException extends Exception{
    SpaceException(String msg){
        super(msg);
    }
}
class MemoryException extends Exception{
    MemoryException(String msg){
        super(msg);
    }
}
class NewExceptionTest{
    static void startInstall() throws SpaceException, MemoryException{
        if(!enoughSpace()){
            throw new SpaceException("설치할 공간이 부족합니다.");
        }
        if(!enoughMemory()){
            throw new MemoryException("메모리가 부족합니다.");
        }
    }
    static void copyFiles(){/*파일을 복사하는 코드를 작성함*/}
    static void deleteTempFiles(){/*파일을 삭제하는 코드를 작성함*/}
    private static boolean enoughSpace() {
        /*설치하는데 필요한 공간이 있는지 확인하는 코드를 작성함*/
        return false;
    }
    private static boolean enoughMemory() {
        /*설치하는데 필요한 메모리 공간이 있는지 확인하는 코드를 작성함*/
        return false;
    }

    public void Installmain(){
        System.out.println("\n# 예제 8-21 440pg ______________________");
        try{
            startInstall();
            copyFiles();
        } catch (MemoryException e) {
            System.out.println("에러메시지 : " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
        } catch (SpaceException e) {
            System.out.println("에러메시지 : " + e.getMessage());
            e.printStackTrace();
            System.out.println("다시 설치를 시도하세요");
        }
    }
}
// throws : 예외를 처리하는 것이 아니라,
// 자신(예외가 발생할 수 있는 메서드)을 호출한 메서드에게 예외를 전달하여 예외처리를 떠맡기는 것










public class _SJCh08 {
    public static void main(String[] args){
        new ExceptionHandling().Exmain();
        new ExceptionHandling().throwException();
        // new TryWithResource().resource();
        new NewExceptionTest().Installmain();
    }
}
