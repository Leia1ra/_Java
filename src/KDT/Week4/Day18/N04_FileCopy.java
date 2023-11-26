package KDT.Week4.Day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class N04_FileCopy {

    public N04_FileCopy() {
    }
    public static void start(){
        try{
            File source = new File(
                    "/Volumes/Disk_2ra/Code/Back_End/Java/_Java/src/KDT/Week4/Day18/newFolder/cheetah.jpg"
            );
            System.out.println(source.getName());
            File target = new File(
                    "/Volumes/Disk_2ra/Code/Back_End/Java/_Java/src/KDT/Week4/Day18/newFolder/testFolder",
                    source.getName()
            );
            File target2 = new File(
                    "/Volumes/Disk_2ra/Code/Back_End/Java/_Java/src/KDT/Week4/Day18/newFolder/testFolder",
                    "newCheetah.jpg"
            );

            // 1. 입력스트림(byte) 만들기
            FileInputStream fi = new FileInputStream(source);
            FileOutputStream fo = new FileOutputStream(target);
            FileOutputStream fo2 = new FileOutputStream(target2);

            /*while(true){
                int byteData = fi.read();
                if(byteData == -1) break;
                fo.write(byteData);
            }*/
            byte[] data = new byte[(int) source.length()];
            fi.read(data, 0, data.length);
            fo2.write(data,0, data.length);


            fi.close();
            fo.close();
        }catch (Exception e){

        }
    }
    public static void main(String[] args){
        N04_FileCopy.start();
    }
}
