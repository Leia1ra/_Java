package KDT.Week3.Day15;

import java.util.HashSet;
import java.util.Iterator;

public class N01_HashSetTest {
    //            a       b   a           b   a
    int[] data = {56, 54, 78, 56, 85, 90, 78, 56, 45};
    public N01_HashSetTest(){
        // 오토 언박싱
        // Integer a = 10;
        // int b = a;

        // HashSet : 입력순서 유지 안함, 중복데이터 허용 안함.
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int d : data){
            hs.add(d);
        }
        System.out.println("Size -> " + hs.size());

        // HashSet객체를 얻어오기
        Iterator<Integer> ii = hs.iterator();

        // hasNext() : 다음 객체 존재유무 확인
        // next() : 다음 객체 확인
        while(ii.hasNext()){
            int obj = ii.next(); // 이게 오토 언박싱, ii 는 Integer
            if(ii.hasNext()){
                System.out.print(obj + " -> ");
            }else{
                System.out.print(obj);
            }

        }
    }
    public static void main(String[] args){
        new N01_HashSetTest();

    }
}
