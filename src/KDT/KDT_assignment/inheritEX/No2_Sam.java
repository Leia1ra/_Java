package KDT.KDT_assignment.inheritEX;

class No2_Sam {
    public static void main(String args[]){
        Test ob = new Ex();     // Test ob에 Ex(); 인스턴스의 주소를 대입함
        ob.print();             // 재정의 되었음 상위클래스의 메소드가 가려짐
        System.out.print(ob.a); // Test ob에 Ex()의 객체의 주소가 있음 Test의 a값은 3이기에
    }
}
class Test{
    public int a = 3;
    public void print(){
        a+=5;
        System.out.print("f " + a);
    }
}
class Ex extends Test {
    public int a = 8;
    @Override
    public void print() {
        this.a += 5;
        System.out.print("b ");
    }
}
// b 3