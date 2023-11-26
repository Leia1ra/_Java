package KDT.Week3.Day14;

import java.util.LinkedList;

public class N02_LinkedListTest {
    public N02_LinkedListTest() {
    }
    public void start(){
        //LinkedList : List인터페이스를 상속받고 있으므로 순위는 유지, 중복객체
        LinkedList<String> ll = new LinkedList<String>();
        ll.offer("홍길동");
        ll.offer(new String("세종대왕"));
        ll.offer("이순신");
        ll.offer("안중근");

        System.out.println("Size() -> " + ll.size());
        while(!ll.isEmpty()){
            // 안중근 이순신 세종대왕 홍길동 -> Front
            String name = ll.pop(); // 먼저 저장된 객체를 꺼내고 컬랙션에 객체를 제거함
            // 안중근 이순신 세종대왕 -> Front
            System.out.println("Size() -> " + ll.size());
        }
        System.out.println("isEmpty() -> " + ll.isEmpty());
    }
    public static void main(String[] args){
        new N02_LinkedListTest().start();
    }
}
