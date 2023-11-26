package KDT.Net;

import com.sun.source.doctree.IndexTree;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public InetAddressTest(){

    }
    public static void start(){
        // InetAddress : 현재 PC의 IP 주소, 도메인의 IP를 얻을 수 있다.
        // 내컴퓨터의 IP 구하기
        try {
            InetAddress ia1 = InetAddress.getLocalHost();
            System.out.println("ia1.getHostAddress() -> " + ia1.getHostAddress());
            System.out.println("ia1.getHostName()    -> " + ia1.getHostName());
            System.out.println("===================================================");

            // url주소를 이용하여 inetAddress객체 생성(www.naver.com)
            InetAddress ia2 = InetAddress.getByName("www.naver.com");
            System.out.println("ia2.getHostAddress() -> " + ia2.getHostAddress());
            System.out.println("ia2.getHostName()    -> " + ia2.getHostName());
            System.out.println("===================================================");

            // ip주소를 이용하여 InetAddress객체 생성
            InetAddress ia3 = InetAddress.getByName("223.130.200.107");
            System.out.println("ia3.getHostAddress() -> " + ia3.getHostAddress());
            System.out.println("ia3.getHostName()    -> " + ia3.getHostName()); // ip를 구한다고 해서 도메인굴 해주지는 않음
            System.out.println("===================================================");

            // InetAddress전체 구하기
            InetAddress[] ia4 = InetAddress.getAllByName("www.naver.com");
            for(InetAddress k : ia4){
                System.out.println("ia4.getHostAddress() -> " + k.getHostAddress());
                System.out.println("ia4.getHostName()    -> " + k.getHostName());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
    public static void main(String args[]){
        InetAddressTest.start();
    }
}
