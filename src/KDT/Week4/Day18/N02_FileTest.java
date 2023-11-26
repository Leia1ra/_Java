package KDT.Week4.Day18;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class N02_FileTest {
    public N02_FileTest() {
        // File : 드라이브 , 폴더 , 파일명으로 객체를 생성하여 파일처리를 할 수 있는 클래스
        File f1 = new File("/Volumes/Disk_2ra/Code/Back_End/Java/_Java/src/KDT/Week4/Day18/newFolder");
        File f2 = new File("/Volumes/Disk_2ra/Code/Back_End/Java/_Java/src/KDT/Week4/Day18/newFolder/FIleTest.txt");
        File f3 = new File(f1,"Test.txt");

        File f4 = new File("/Volumes/Disk_2ra/Code/Back_End/Java/_Java/src/KDT/Week4/Day18/newFolder");
        if(!f4.exists()){ // 폴저 존재 유뮤 확인 : true -> 폴터가 있다
            if (f4.mkdir()){ // 하위 폴더가 없는경우, mkdirs() -> 하위폴더까지 만들어야 할 경우
                System.out.println("폴더가 생성됨");
            } else {
                System.out.println("폴더 생성실패");
            }
        }
        // 파일 생성하기
        if (!f3.exists()){
            try{
                if(f3.createNewFile()){
                    System.out.println("파일이 생성됨");
                }else{
                    System.out.println("파일 생성실패");
                }
            }catch (IOException e){
                e.printStackTrace();
            }

        }
        // 마지막 수정한 날짜
        long lastDate = f2.lastModified();// 1970.1.1 0:0:0부터 날짜와 시간을 밀리초로 표현함
        System.out.println(lastDate);
        Calendar now = Calendar.getInstance();
        now.setTimeInMillis(lastDate);
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
        String lastModified = fmt.format(now.getTime());
        System.out.println("마지막 수정일 : " + lastModified);

        // 특정 드라이브의 폴더, 파일 목록을 구하기
        /*  getPath() : 경로 + 파일
            getName() : 파일명
            getAbsolutePath() : 절대경로 + 파일
            getParent() : 경로*/
        File f5 = new File("/Volumes/Disk_2ra/Code/Back_End/Java/_Java/src/KDT/Week4/Day18/newFolder");
        File[] list = f5.listFiles();
        for(File f : list){
            if(f.isDirectory()){
                if(f.isHidden()){
                    System.out.println("[숨김폴더]" + f.getPath());
                }else {
                    System.out.println("[폴더]" + f.getPath());
                }
            }else{
                if(f.isHidden()){
                    System.out.println("[숨김파일]" + f.getPath());
                }else {
                    System.out.println("[파일]" + f.getPath());
                }
            }
        }

        // 현재 시스템의 드라이브 목록 구하기
        File root = new File("/");
        File[] drive = File.listRoots();
        for(File f : drive){
            System.out.println("[드라이브]" + root.getPath());
        }

        // 용량 확인
        long size = f2.length();
        System.out.println(f2.getName() + "의 파일 크기 -> " + size + "Byte");

        // // 파일 삭제
        // boolean result = f3.delete();
        // System.out.println("삭제 여부 -> " + result);
    }

    public static void main(String[] args){
        new N02_FileTest();
    }
}