package KDT.Week4.Day18;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N01_BufferReaderTest {
    public N01_BufferReaderTest() {
    }
    static public void start(){
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String txt = br.readLine();
            System.out.println(txt);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        N01_BufferReaderTest.start();
    }
}
