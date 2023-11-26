package KDT.Week4.Day16;

public class N04_GenericMain {

    public static void main(String args[]){
        GenericTest<Integer, String> gt1 = new GenericTest(1234,"익산시");
        Integer i = gt1.getNum();
        String s = gt1.getData();
        System.out.println(i + " -> " + s);

        GenericTest<String, MemberVO> gt2 = new GenericTest("홍",new MemberVO());
        String name = gt2.getNum();
        MemberVO vo = gt2.getData();
        System.out.println("name -> " + name + ", data -> " + vo.toString());
    }


}
class GenericTest<K,V>{// K:key - V:Value - E:Element - T:써도는 되는데 연상이 안되서 잘 안쓴다함
    private K num;
    private V data;
    public GenericTest(K num, V data) {
        this.num = num;
        this.data = data;
    }


    public K getNum() {
        return num;
    }
    public void setNum(K num) {
        this.num = num;
    }
    public V getData() {
        return data;
    }
    public void setData(V data) {
        this.data = data;
    }


}