package KDT.KDT_assignment.inheritEX;
class SuperTest{
    int a;
    SuperTest(int a){
        this.a = a;
    }
}
class SubTest extends SuperTest{
    public SubTest(int a) {
        super(a);
    }

    public SubTest(){
        super(10);
        // super.a = 10;
        // this(10);
    }
}

class No1_Main {
    public static void main(String args[]){
        SubTest ob = new SubTest();
    }
}
// 1. this(10);
// 2. super(10);