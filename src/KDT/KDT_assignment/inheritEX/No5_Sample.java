package KDT.KDT_assignment.inheritEX;

class No5_Sample {
    public static void main(String[] args){
        No5_Sample_Ex o = new No5_Sample_Ex();

        No5_Sample_Test i = new No5_Sample_Test();

        int n = 10;

        i.setX(n); // test.setX(10) -> test.x = 10;
        o.setY(i); //
        System.out.println(o.getY().getX());
    }
}
class No5_Sample_Test {
    int x;
    public void setX(int x){
        this.x = x;
    }
    public int getX(){
        System.out.println("hi");
        return x+1;
    }
}
class No5_Sample_Ex {
    No5_Sample_Test y;
    public void setY(No5_Sample_Test y){
        this.y = y;
    }
    public No5_Sample_Test getY(){
        System.out.println("hello?");
        return y;
    }
}
