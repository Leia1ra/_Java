package KDT.Net;

import com.mysql.cj.exceptions.ConnectionIsClosedException;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class N06_URLTest {
    public static void main(String args[]){
        new N06_URLTest().start();
    }

    public void start() {
        try {
            // URL url = new URL("https://auto.nate.com/news/articleView.html?idxno=38405");
            URL url = new URL("https://www.naver.com");

            // 프로토콜, port, host, 파일명
            System.out.println("프로토콜 -> " + url.getProtocol());
            System.out.println("포드 -> " + url.getPort());
            System.out.println("호스트명 -> " + url.getHost());
            System.out.println("파일명 -> " + url.getFile());
            System.out.println("데이터 -> " + url.getQuery());

            //========================================================
            //1. URL객체를 이용하여 URLConnection 객체를 구한다.
            URLConnection connect = url.openConnection();

            //2. URLConnectio 객체의 통신체널 확보하기
            connect.connect();

            //3. pageHeader정보 얻어오기
            String contentType = connect.getContentType();
            System.out.println(contentType);
            int idx = contentType.indexOf("charset=");
            String encode = contentType.substring(idx+8);
            System.out.println(idx);

            //--------------------------------------------------------
            InputStream is = url.openStream();
            InputStreamReader isr = new InputStreamReader(is, encode);
            BufferedReader br = new BufferedReader(isr);

            FileOutputStream fos = new FileOutputStream(new File("/Volumes/Disk_2ra/Code/Back_End/Java/_Java/src/KDT/Net/newFolder","Test.html"));
            while(true){
                String inData = br.readLine();
                if(inData == null) break;
                inData += "\n";
                fos.write(inData.getBytes(),0, inData.getBytes().length);
                // System.out.println(inData);
            }
            // 읽어오기 완료
            br.close();
            isr.close();
            is.close();
            fos.close();
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
