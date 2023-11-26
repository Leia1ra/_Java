package KDT.Net;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class N02_ServerSocketTest {

    public N02_ServerSocketTest() {
    }
    public void serverStart(){
        // 접속 받기
        try {
            InetAddress ia = InetAddress.getLocalHost();
            System.out.println(ia.getHostAddress());
            // ServerSocket 객체를 접속받을 수 있다.
            ServerSocket ss = new ServerSocket(20000);

            System.out.println("접속 대기중....");
            Socket s = ss.accept();

            // 접속자의 ip를 Socket이 가지고 있다.
            InetAddress clientIa = s.getInetAddress();
            System.out.println(clientIa.getHostAddress() + "클라이언트가 접속하였습니다.");

            // 접속자에게 문자보내기
            OutputStream os = s.getOutputStream(); // 1byte
            OutputStreamWriter osw = new OutputStreamWriter(os);// 1문자
            PrintWriter pw = new PrintWriter(osw);// 1줄

            pw.println("안녕...hi");
            pw.flush();// 보내기 완료

            // 클라이언트가 보낸 문자 받기
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream(),"UTF-8"));
            String indata = br.readLine();
            System.out.println("클라이언트로부터 -> " + indata);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new N02_ServerSocketTest().serverStart();
    }
}