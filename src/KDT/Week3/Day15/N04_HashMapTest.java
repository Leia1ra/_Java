package KDT.Week3.Day15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class N04_HashMapTest {

    public N04_HashMapTest(){
        // HashMap : 키와 value를 가지는 컬랙션, 중복을 허용하지 않고 기존 값은 새로운 값으로 덮어쓴다
        HashMap<Integer, MemberVO> hm = new HashMap<Integer, MemberVO>();
        hm.put(100, new MemberVO(100, "이선왕", "010-7229-1197", "함평"));
        hm.put(200, new MemberVO(200, "기선각", "010-7777-7777", "서울"));
        hm.put(300, new MemberVO(300, "니선놘", "010-1234-5678", "익산"));
        hm.put(400, new MemberVO(400, "디선돧", "010-1212-3434", "광주"));

        // get() : 키값이 있을경우 키에 해당하는 객체를 얻어오기
        MemberVO vo = hm.get(300);
        System.out.print(vo.toString());
        System.out.println("\n--------------------------------------------");

        // keySet() : HashMap의 키값들만 Set으로 리턴해주는 기능을 가지고 있음
        Set<Integer> keyList = hm.keySet();
        Iterator<Integer> ii = keyList.iterator();
        while(ii.hasNext()){
            int key = ii.next();
            MemberVO m = hm.get(key);
            System.out.println(m.toString());
        }
        System.out.println("--------------------------------------------");

        // entrySet() : key, value를 하나의 세트(entry)로 만들어 Set으로 리턴해준다.
        Set entryList = hm.entrySet();
        Iterator iii = entryList.iterator();
        while(iii.hasNext()){
            Map.Entry<Integer, MemberVO> entry = (Map.Entry)iii.next();
            Integer key = entry.getKey();
            MemberVO value = entry.getValue();
            System.out.println(value.toString());
        }
    }

    public static void main(String[] args){
        N04_HashMapTest hm = new N04_HashMapTest();
    }
}
class MemberVO{
    private int num;
    private String name;
    private String tel;
    private String addr;

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }

    public MemberVO(){ }
    public MemberVO(int num, String name, String tel, String addr){
        this.num = num;
        this.name = name;
        this.tel = tel;
        this.addr = addr;
    }

    public String toString(){
        return num + "\t" + name + "\t" + "tel" + "\t" + addr;
    }
}
