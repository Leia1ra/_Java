package KDT.Week4.Day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class N03_ObjectInputStreamTest {
    public N03_ObjectInputStreamTest() {

    }
    public static void start(){
        // 파일에 저장된 Object 객체를 읽어오기(input)
        try{
            File f = new File(
            "/Volumes/Disk_2ra/Code/Back_End/Java/_Java/src/KDT/Week4/Day19/newFolder/FIleTest.txt"
            );
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            DataVO vo = (DataVO)ois.readObject();
            System.out.println(vo.getNum());
            System.out.println(vo.getName());
            System.out.println(vo.getDate().getTime());
        }catch(IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args){
        N03_ObjectInputStreamTest.start();
    }

}
