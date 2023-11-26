package KDT.KDT_assignment.inheritEX;



// [2] 실행 결과 : 1234
class X{
    X(){
        System.out.print(1);
    }
    X(int x) {
        this();
        System.out.print(2);
    }
}
class No3_Y extends X{
    No3_Y(){
        super(6);
        System.out.print(3);
    }
    No3_Y(int y){ // #2
        this();
        System.out.println(4);
    }
    public static void main(String args[]){ // #1
        new No3_Y(5);
    }
}
