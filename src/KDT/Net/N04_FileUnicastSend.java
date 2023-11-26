package KDT.Net;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.*;

public class N04_FileUnicastSend {
    public void fileSend(){
        try{
            DatagramSocket ds = new DatagramSocket();
            InetAddress ia = InetAddress.getByName("192.168.219.102");
            // 파일 전송
            // 1. 파일명 보내기
            String filename = "**%SendStart["+ "cheetah.jpg";
            DatagramPacket dp = new DatagramPacket(
                    filename.getBytes(),
                    filename.getBytes().length,
                    ia,10200
            );
            ds.send(dp);

            // 2. 파일의 내용
            File f = new File("/Volumes/Disk_2ra/Code/Back_End/Java/_Java/src/KDT/Net/newFolder/cheetah.jpg");
            FileInputStream fis = new FileInputStream(f);

            while(true){
                byte indata[] = new byte[512];
                int inBytes = fis.read(indata, 0, indata.length);
                if(inBytes == -1) break;

                // 보내기
                dp = new DatagramPacket(indata,inBytes, ia, 10200);
                ds.send(dp);
            }
            fis.close();
            // 3. 마지막 알림정보
            String endMsg = "**EndStart[[";
            dp = new DatagramPacket(endMsg.getBytes(), endMsg.length(), ia, 10200);
            ds.send(dp);
            ds.close();
            System.out.println("보내기 완료됨");
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new N04_FileUnicastSend().fileSend();
    }
}
