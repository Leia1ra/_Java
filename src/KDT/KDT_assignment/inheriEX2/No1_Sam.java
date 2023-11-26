package KDT.KDT_assignment.inheriEX2;

public class No1_Sam {
    public static void main(String args[]){
        Ex x = new Ex();
        System.out.println(x.add(10,5));
    }
}
class Test{
    protected int add(int a, int b) {return a + b;}
}
class Ex extends Test{
    protected int add(int a, int b){
        int x = super.add(10,5);
        return x;
    }
}