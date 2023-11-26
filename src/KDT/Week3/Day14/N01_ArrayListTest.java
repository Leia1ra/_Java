package KDT.Week3.Day14;

import KDT.Week3.Day13.N02_StudentMain;

import java.util.ArrayList;
import java.util.List;

public class N01_ArrayListTest {
    N01_ArrayListTest() {

    }
    public void start(){
        // ArrayList : 입력 순서 유지, 중복 객체 허용
        ArrayList arraylist = new ArrayList(); // 근데 보통 이렇게보단
        List<Student> list = new ArrayList<Student>(); // 이렇게 쓴다고 함
        // 같은 데이터 타입만 담을 수 있는 컬렉션 < > -> 제너릭이라고 함, 공백은 Object
        Student stu1 = new Student();
        stu1.setName("이선왕");
        stu1.setGrade(4);

        Student stu2 = new Student(4, "이선왕", "010-7229-1197",100,100,100);
        Student stu3 = new Student(3, "미선뫔", "010-1234-1234",10,10,10);
        list.add(stu1); //0
        list.add(stu2); //2
        list.add(1, stu3); // ADD는 객체를 밀어냄
        // set은 지우고 넣음

        // for(Object o : list) {
        //     Student s = (Student) o;
        //     System.out.println(s.toString());
        // }
        // 제너릭으로 생성된 컬렉션은 한 종류의 객체만 추가할 수 있고
        // 객체를 get()할 경우 형변환을 하지 않아도 된다.
        for(Student s : list){ // 제너릭으로 설정되어 있는것은 원래 데이터타입으로 나오기에 오류가 나지 않음
            System.out.println(s.toString());
        }

        Student getData1 = list.get(1);
        System.out.println(getData1.toString());

        int idx = list.indexOf(stu1);
        System.out.println("stu1.index -> " + idx);
        System.out.println("isEmpty -> " + list.isEmpty());

        System.out.println("size -> " + list.size());
        Student obj = list.remove(1);
        System.out.println("size -> " + list.size());
        System.out.println(obj.toString());

        boolean b = list.remove(stu1);
        System.out.println(b + ", " + list.size());
    }
    public static void main(String args[]){
        new N01_ArrayListTest().start();
    }
}
