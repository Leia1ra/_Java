package Standard_Java;

import java.util.*;
interface CollectionTest<E>{
    public void listPrint(E e);
}
class ListTest {
    private void ArrayListEx1(){
        System.out.println("\n# 예제 11-01 585pg _____________________");
        ArrayList list1 = new ArrayList(10);
        list1.add(5);
        list1.add(4);
        list1.add(3);
        list1.add(2);
        list1.add(1);
        list1.add(0);

        ArrayList list2 = new ArrayList(list1.subList(1,4));
        System.out.println(" > 정렬 전 -----------------------------");
        System.out.println("list1 -> " + list1);
        System.out.println("list2 -> " + list2);

        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(" > 정렬 후 -----------------------------");
        System.out.println("list1 -> " + list1);
        System.out.println("list2 -> " + list2);

        System.out.println(" > 추가 전 ----------------------------");
        System.out.println("list1.containAll(list2) : " + list1.containsAll(list2));
        list2.add("B");
        list2.add("C");
        list2.add(3,"A");
        list2.set(3,"AA");
        System.out.println(" > 추가 후 -----------------------------");
        System.out.println("list1 -> " + list1);
        System.out.println("list2 -> " + list2);
        System.out.println("list1.containAll(list2) : " + list1.containsAll(list2));
        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2)); // 변화가 있을때 True; 공통된 요소 외 삭제
        System.out.println("list1 -> " + list1);
        System.out.println("list2 -> " + list2);

        for(int i = 0; i<list1.size(); i++){
            if(list1.contains(list2.get(i))){
                list1.remove(i);
            }
        }

    }

    private void VectorEx1(){
        System.out.println("\n# 예제 11-03 588pg _____________________");
        class print<E> implements CollectionTest{
            @Override
            public void listPrint(Object v) {
                System.out.println("Vector -> " + v);
                System.out.println("size : " + ((Vector) v).size());
                System.out.println("capacity : " + ((Vector) v).capacity());
            }
        }

        Vector v = new Vector(5);
        v.add("1");
        v.add("2");
        v.add("3");
        new print().listPrint((Object)v);

        v.trimToSize();
        System.out.println(" > trim ----------------------------");
        new print().listPrint((Object)v);

        v.ensureCapacity(6);
        System.out.println(" > ensureCapacity ------------------");
        new print().listPrint((Object)v);

        v.clear();
        System.out.println(" > clear ---------------------------");
        new print().listPrint((Object)v);
        /*v.add("2");
        v.removeAllElements();
        new print(v);*/
    }

    private void LinkedListEx1(){
        System.out.println("\n# 예제 11-05 600pg _____________________");
        class Test{
            public static long sequentialAdd(List list){
                long start = System.currentTimeMillis();
                for(int i=0; i<1000000; i++){ list.add(i+""); }
                long end = System.currentTimeMillis();
                return end-start;
            }
            public static long middleAdd(List list){
                long start = System.currentTimeMillis();
                for(int i=0;i<10000;i++){ list.add(500, "X"); }
                long end = System.currentTimeMillis();
                return end-start;
            }
            public static long sequentialRemove(List<String> list){
                long start = System.currentTimeMillis();
                // for (String k : list) { list.remove(k); }
                for(int i=list.size()-1;i>=0;i--){ list.remove(i); }
                long end = System.currentTimeMillis();
                return end-start;

            }
            public static long middleRemove(List list){
                long start = System.currentTimeMillis();
                for(int i=0;i<10000;i++) { list.remove(i); }
                long end = System.currentTimeMillis();
                return end-start;
            }
        }
        ArrayList<String> al = new ArrayList<String>(2000000);
        LinkedList<String> ll = new LinkedList<String>();

        System.out.println("=순차적으로 추가하기=");
        System.out.println("ArrayList : " + Test.sequentialAdd(al));
        System.out.println("LinkedList : " + Test.sequentialAdd(ll));

        System.out.println("=중간에 추가하기=");
        System.out.println("ArrayList : " + Test.middleAdd(al));
        System.out.println("LinkedList : " + Test.middleAdd(ll));

        System.out.println("=중간에서 삭제하기=");
        System.out.println("ArrayList : " + Test.middleRemove(al));
        System.out.println("LinkedList : " + Test.middleRemove(ll));

        System.out.println("=순차적으로 삭제하기=");
        System.out.println("ArrayList : " + Test.sequentialRemove(al));
        System.out.println("LinkedList : " + Test.sequentialRemove(ll));
    }


    public void ListMain() {
        ArrayListEx1();
        VectorEx1();
        LinkedListEx1();

    }
}

class IteratorTest{
    private void IteratorEx1(){
        System.out.println("\n# 예제 11-13 615pg _____________________");
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 1; i<=10; i++){
            list.add(i+"");
        }
        Iterator it = list.iterator();
        while(it.hasNext()){
            String str = (String) it.next();
            if(str.equals("10")){
                System.out.println(str);
            } else {
                System.out.print(str + " > ");
            }
        }
        System.out.println();
    }

    public void IteratorMain(){
        IteratorEx1();
    }
}

class ArraysTest{
    public void ArraysMain(){

    }
}

class SetTest{
    public void SetMain(){
        HashSetEx1();
    }

    @Deprecated(since = "23", forRemoval = true)
    private void HashSetEx1(){
        System.out.println("\n# 예제 11-20 632pg _____________________");
        class Print implements CollectionTest{
            @Override
            public void listPrint(Object v) {
                System.out.println("HashSet -> " + v);
                System.out.println("size : " + ((HashSet) v).size());
            }
        }
        Object[] objArr = new Object[]{"1", new Integer(1), "2", new String("2"), "2", "3", "3", "3"};
        Set hs = new HashSet();
        for(Object k : objArr){
            hs.add(k);
        }
        new Print().listPrint(hs);
    }
}


public class CollectionsFrameWork {
    public static void main(String[] args) {
        new ListTest().ListMain();
        new IteratorTest().IteratorMain();
        new SetTest().SetMain();
    }
}
