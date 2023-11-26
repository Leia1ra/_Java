package KDT.Net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class N03_UniCastSend {
    public static void main(String[] args){
        new N03_UniCastSend().sendStart();
    }
   private void sendStart() {
        try{
            String data = "Java 네트워크 프로그래밍";
            DatagramSocket ds = new DatagramSocket();
            InetAddress ia = InetAddress.getByName("192.168.219.102");
            DatagramPacket dp = new DatagramPacket(data.getBytes(), data.getBytes().length, ia, 9999);
            ds.send(dp);
            System.out.println("보내기 완료");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}