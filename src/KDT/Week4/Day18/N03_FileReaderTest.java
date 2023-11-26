package KDT.Week4.Day18;

import java.io.*;

public class N03_FileReaderTest {

    public N03_FileReaderTest() {

    }
    public static void start(){
        // 파일에서 데이터 읽어오기
        try {
            File f = new File(
                    "/Volumes/Disk_2ra/Code/Back_End/Java/_Java/src/KDT/Week4/Day18/newFolder",
                    "FileTest.txt"
            );
            FileReader fr = new FileReader(f); // 1번에 1글자씩 읽어온다.
            BufferedReader br = new BufferedReader(fr);// 한줄씩 읽어오기

            while(true){
                String inData = br.readLine();
                if(inData == null) break;
                System.out.println(inData);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        N03_FileReaderTest.start();
    }
}
