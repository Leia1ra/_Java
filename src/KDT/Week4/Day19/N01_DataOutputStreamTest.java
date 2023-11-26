package KDT.Week4.Day19;

import javax.xml.crypto.Data;
import java.io.*;

public class N01_DataOutputStreamTest {
    public N01_DataOutputStreamTest() {

    }
    public static void start(){
        // DataInputStream, DataOutputStream : 원 데이터의 크기만큼 바이트를 확보하여 정보 1개를 저장한다.
        int inData = 1234;
        double dbData = 234.56;
        char charData = '한';
        boolean booData = true;

        try{
            FileOutputStream fos = new FileOutputStream(
            "/Volumes/Disk_2ra/Code/Back_End/Java/_Java/src/KDT/Week4/Day19/newFolder/FileTest.txt"
            );
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeInt(inData);
            dos.writeDouble(dbData);
            dos.writeChar(charData);
            dos.writeBoolean(booData);
            dos.close();
            fos.close();

            // Data 크기만큼 읽어오기
            File file = new File(
            "/Volumes/Disk_2ra/Code/Back_End/Java/_Java/src/KDT/Week4/Day19/newFolder/FileTest.txt"
            );
            FileInputStream fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);
            int intread = dis.readInt();
            double dbread = dis.readDouble();
            char chread = dis.readChar();
            boolean boread = dis.readBoolean();
            System.out.println(intread + ", " + dbread + ", " + chread + ", " + boread);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
        N01_DataOutputStreamTest.start();
    }
}
