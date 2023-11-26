package KDT.Net;

import java.io.IOException;
import java.net.*;

public class N05_MultiCastReceive {
    private void start() {
        try{
            int port = 15000;
            MulticastSocket ms = new MulticastSocket(port);
            InetAddress ia = InetAddress.getByName("224.100.100.23");
            InetSocketAddress isa = new InetSocketAddress(ia,port);

            NetworkInterface nif = NetworkInterface.getByName("ira");
            ms.joinGroup(isa, nif);

            byte data[] = new byte[512];
            DatagramPacket dp = new DatagramPacket(data, data.length);
            System.out.println("전송받기 대기중");
            ms.receive(dp);

            /////////////////////////////////
            byte[] receiveData = dp.getData();
            String receiveStr = new String(receiveData,0 , dp.getLength());
            System.out.println("받은 문자열 -> " + receiveStr);
            ms.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new N05_MultiCastReceive().start();
    }

}
