package KDT.Week3.Day13;

import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class N03_VectorMain {
    public static void main(String[] args){
        VectorTest vt = new VectorTest();
        Vector vec = vt.getData();
        // System.out.println(vtg.get(0));
        // System.out.println(vtg.get(1));
        // System.out.println(vtg.get(2));
        // System.out.println(vtg.get(3));
        // System.out.println(vtg.get(4));
        String name = (String)(vec.elementAt(0));
        System.out.println(name);

        Student stu = (Student)vec.get(1);
        System.out.println("student -> " + stu.toString());

        Calendar cal = (Calendar)vec.get(2);
        System.out.println("cal.getTime() -> " + cal.getTime());

        int num = (int)vec.get(3);
        System.out.println("num -> " + num);

        Random rd = (Random)vec.lastElement();
        System.out.println("Random -> " + rd.nextInt(10));
    }
}
class VectorTest{

    public Vector getData(){
        String name = "홍길동";
        Calendar now = Calendar.getInstance(); // 싱글톤 객체
        Student student = new Student(4,"이선왕","01072291197",100,100,100);
        int num = 5678;
        Random r = new Random();

        // Vector은 List를 상속받고 있으며 입력순서 유지, 같은 객체 여러개 추가 가능
        Vector v = new Vector();
        v.add(name);                // 0
        v.add(now);                 // 1 -> 2
        v.add(1, student);    // 1
        v.add(num);                 // 3
        v.add(r);                   // 4
        return v;
    }
}