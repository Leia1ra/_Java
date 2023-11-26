package KDT.Week4.Day16;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class N03_PropertiesTest {
    public N03_PropertiesTest() {
        // Properties : 키와 value가 String이어야 한다.
        Properties prop = new Properties();

        prop.setProperty("/", "/index.jsp");
        prop.setProperty("/boardList", "/board/boardList.jsp");
        prop.setProperty("/member", "/member/memberFrom.jsp");
        prop.setProperty("/notice", "/notice/noticeView.jsp");

        String page = prop.getProperty("/notice");
        System.out.println("/notice -> " + page);

        Enumeration keyList = prop.propertyNames();
        while(keyList.hasMoreElements()){
            String key = (String)keyList.nextElement();
            String value = prop.getProperty(key);
            System.out.printf("%-10s -> %s\n", key,value);
        }
        try {
            prop.store(new FileOutputStream("output.txt"), "Properties Example");
            prop.storeToXML(new FileOutputStream("output.xml"), "Properties Example");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new N03_PropertiesTest();
    }
}
