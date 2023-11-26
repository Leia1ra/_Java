package KDT.Net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class N03_UniCastRecieve {
    public static void main(String[] args){
        new N03_UniCastRecieve().receiveStart();
    }

    private void receiveStart() {
        try{
            DatagramSocket ds = new DatagramSocket(9999);
            byte[] data = new byte[1024];
            DatagramPacket dp = new DatagramPacket(data, data.length);
            System.out.println("받기 대기중... ...");
            ds.receive(dp);

            // 받은 후 처리
            byte[] receiveData = dp.getData();

            System.out.println("length -> " + dp.getLength());
            System.out.println(new String(receiveData,0, dp.getLength(),"UTF-8"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
