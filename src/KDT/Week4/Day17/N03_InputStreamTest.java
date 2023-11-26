package KDT.Week4.Day17;

import java.io.IOException;
import java.io.InputStream;

public class N03_InputStreamTest {
    public N03_InputStreamTest() {

    }
    public void start(){
        // InputStream : Byte 단위로 입력받는다.
        //               추상클래스 이므로 객체를 생성할 수 없다.
        //               System클래스 멤벼변수 중 in멤버변수가 InputString 객체를 가진다.
        InputStream is = System.in;
        try {
            while(true){
                /* // 입력 데이터 없을때
                int read = is.read();
                System.out.print(read + " -> ");
                if(read == -1) break;
                System.out.println((char) read);
                */

                /*
                byte[] data = new byte[5];
                // 한번에 5byte를 입력받아 data배열에 담고 입력한 byte수를 리턴해준다.
                int cnt = is.read(data);
                System.out.println(new String(data));
                */
                byte[] data = new byte[5];
                int cnt = is.read(data, 1, 3);
                System.out.println(cnt + " -> " + new String(data));
            }
            // System.out.println("---------------------------");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args){
        new N03_InputStreamTest().start();
    }
}
