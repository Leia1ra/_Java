package KDT.Week3.Day15;

import java.util.Iterator;
import java.util.TreeSet;

public class N02_TreeSetTest {
    String[] data = {"Java", "자바", "Apple", "사과", "Banana", "바나나", "Spring", "스프링", "1234", "Java", "사과", "스프링"};

    public N02_TreeSetTest(){
        // TreeSet : 중복 허용 안함, 입력순서 유지 안함(정렬해준다)
        TreeSet<String> ts = new TreeSet<String>();
        for(int i = 0; i < data.length; ++i){
            ts.add(data[i]);
        }
        Iterator<String> ii = ts.iterator();
        while(ii.hasNext()){
            String txt = ii.next();
            if(ii.hasNext()){
                System.out.print(txt + " -> ");
            }else{
                System.out.print(txt);
            }
        }

        System.out.println("\n------------------------------------------------------------------------");
        Iterator<String> iii = ts.descendingIterator();
        while(iii.hasNext()){
            String txt = iii.next();
            if(iii.hasNext()){
                System.out.print(txt + " -> ");
            }else{
                System.out.print(txt);
            }
        }
    }
    public static void main(String arsg[]){
        new N02_TreeSetTest();
    }
}
