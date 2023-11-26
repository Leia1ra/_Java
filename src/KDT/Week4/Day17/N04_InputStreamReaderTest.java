package KDT.Week4.Day17;

import java.io.InputStreamReader;
import java.util.Arrays;

public class N04_InputStreamReaderTest {
    public N04_InputStreamReaderTest() {
        // InputStreamReader : 문자단위로 입력받는 클래스
        InputStreamReader isr = new InputStreamReader(System.in);
        try{
            /*
            while(true){
                int code = isr.read();
                System.out.println(code + " -> " + String.valueOf((char)code));
                switch (code) {
                    case 10:
                        break;
                }
            }
            */
            /*
            char[] inData = new char[10];
            int cnt = isr.read(inData);
            System.out.println(cnt + " -> " + String.valueOf(inData));
            */
            // 배열의 원하는 위치와 갯수를 지정하여 입력받기
            char[] inData = new char[10];
            int cnt = isr.read(inData, 2, 4);
            System.out.println(cnt + " -> " + new String(inData));


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
        new N04_InputStreamReaderTest();
    }
}
