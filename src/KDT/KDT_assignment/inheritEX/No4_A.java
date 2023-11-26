package KDT.KDT_assignment.inheritEX;

class No4_A {
    public void test(){

    }
    public String test(String a){
        return "a";
    }
    public double test(int x){
        return 1.0;
    }
    public static void main(String[] args){
        No4_A t = new No4_A();
        System.out.println(t.test(25));
    }
}// 우선 생성자가 같아서 실행될 리는 없고
// 된다고 해도 1.0 나올듯
