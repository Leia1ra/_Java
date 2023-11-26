package KDT.Net;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Objects;

public class N04_FileUnicastReceive {
    public void fileReceive(){
        try{
            DatagramSocket ds = new DatagramSocket(10200);
            // 512byte를 한번에 전송받을 패킷객체 생성
            byte receiveData[] = new byte[512];
            DatagramPacket dp = new DatagramPacket(receiveData, receiveData.length);
            FileOutputStream fos = null;
            while(true){
                // 받기
                System.out.println("전송 받기 대기중... ...");
                ds.receive(dp);

                byte[] data = dp.getData(); // 전송받은 데이터
                int lng = dp.getLength(); // 전송받은 byte수를 구하기

                String txt = new String(data, 0, lng);
                // System.out.println(txt.substring(0,13) + ", " + lng);
                // 파일명 전송 : 파일생성
                if(lng>=13 && txt.substring(0, 13).equals("**%SendStart[")){
                    // 파일 생성
                    fos = new FileOutputStream(
                            new File(
                            "/Volumes/Disk_2ra/Code/Back_End/Java/_Java/src/KDT/Net/newFolder/testFolder",
                             txt.substring(13)));
                    System.out.println("파일생성됨.");
                } else if (txt.substring(0, 12).equals("**EndStart[[")) {// 마지막 알림 : close
                    fos.close();
                    ds.close();
                    System.out.println("전송받기 완료");
                    break;
                }
                else if (lng>0) {
                    fos.write(data, 0, lng);
                }
                // 내용 : 파일로 쓰기
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new N04_FileUnicastReceive().fileReceive();
    }
}
