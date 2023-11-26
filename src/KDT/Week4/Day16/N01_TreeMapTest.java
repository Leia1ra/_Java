package KDT.Week4.Day16;

import java.lang.reflect.Member;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class N01_TreeMapTest {
    public N01_TreeMapTest() {
        TreeMap<Integer, MemberVO> tm = new TreeMap<Integer, MemberVO>();
        tm.put(600, new MemberVO(600,"이선왕", "010-7229-1197", "함평군"));
        tm.put(100, new MemberVO(100, "기선각", "010-7777-7777", "서울시"));
        tm.put(200, new MemberVO(200, "니선놘", "010-1234-5678", "익산"));
        tm.put(300, new MemberVO(300, "디선돧", "010-1212-3434", "광주"));
        tm.put(400, new MemberVO(400, "라선뢀", "010-1212-3434", "광주"));

        // key를 이용하여 객체 얻어오기
        MemberVO vo = tm.get(100);
        System.out.println(vo.toString());
        System.out.println("-----------------------------------------");

        Set<Integer> keySet = tm.keySet();
        Iterator<Integer> keyList = keySet.iterator();
        while(keyList.hasNext()){
            Integer key = keyList.next();
            MemberVO voiter = tm.get(key);
            System.out.println(voiter.toString());
        }
        System.out.println("-----------------------------------------");

        // value만 얻어오기
        Collection<MemberVO> memberList = tm.values();
        Iterator<MemberVO> valueList = memberList.iterator();
        while(valueList.hasNext()){
            MemberVO voiter = valueList.next();
            System.out.println(voiter);
        }
    }

    public static void main(String args[]){
        new N01_TreeMapTest();
    }
}
