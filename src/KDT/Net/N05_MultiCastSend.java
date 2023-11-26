package KDT.Net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class N05_MultiCastSend {
    public void start(){
        String msg = "멀티케스트를 이용한 데이터 전송하기 연습중";
        try{
            MulticastSocket ms = new MulticastSocket(15000);

            InetAddress ia = InetAddress.getByName("224.100.100.23");
            DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, ia, 15000);

            ms.send(dp);// 공용아이피로 정보 보내기
            System.out.println("전송완료");
            ms.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
        new N05_MultiCastSend().start();
    }
}
