package KDT.KDT_assignment.inheriEX2;

public class No2_Cclass {
    public static void main(String args[]){
        No2_Bclass ob = new No2_Bclass(420);
        System.out.print(ob.a);
    }
}
class No2_Aclass {
    public int a;
    No2_Aclass(int a){
        this.a = a;
    }
}
class No2_Bclass extends No2_Aclass {
    protected No2_Bclass(int a ){
        super(a);
    }
}