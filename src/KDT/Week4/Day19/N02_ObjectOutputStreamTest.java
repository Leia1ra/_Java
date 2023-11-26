package KDT.Week4.Day19;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Calendar;

public class N02_ObjectOutputStreamTest {

    public N02_ObjectOutputStreamTest() {
    }
    public static void start(){
        // 객체를 파일로 쓰기 - 반드시 직렬화가 되어야 한다.
        // 직렬화는 인터페이스인 Serializable을 상속받는다.
        DataVO vo = new DataVO();
        vo.setNum(7777);
        vo.setName("박태환");
        Calendar c = Calendar.getInstance();
        c.set(2024, 5, 19);
        vo.setDate(c);

        try{
            File f = new File(
            "/Volumes/Disk_2ra/Code/Back_End/Java/_Java/src/KDT/Week4/Day19/newFolder/FIleTest.txt"
            );
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(vo);
            oos.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("쓰기완료");
    }
    public static void main(String args[]){
        N02_ObjectOutputStreamTest.start();
    }
}