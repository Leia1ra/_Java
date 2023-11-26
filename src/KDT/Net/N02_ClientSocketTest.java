package KDT.Net;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class N02_ClientSocketTest {
    public N02_ClientSocketTest() {
    }
    public void clientStart(){
        try {
            InetAddress ia = InetAddress.getByName("192.168.219.102");

            // Socket클래스는 객체를 생성하면 서버와 접속이 완료
            Socket s = new Socket(ia, 20000);
            System.out.println("서버에 접속되었습니다.");

            // 서버가 보낸 정보 받기
            InputStream is = s.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String inputData = br. readLine();
            System.out.println("서버로부터 -> " + inputData);

            // 클라이언트가 서버로 데이터 보내기
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream(), "UTF-8"));
            pw.println("Client가 서버에 보내는 문자");
            pw.flush();// 보내기 완료

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new N02_ClientSocketTest().clientStart();
    }
}
