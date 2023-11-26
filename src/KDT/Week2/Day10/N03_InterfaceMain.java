package KDT.Week2.Day10;

// 인터페이스를 상속(implements)받아 모든 메소드를 오버라이딩 해야힌다.
// 여러개를 상속받을 수 있다.
public class N03_InterfaceMain implements N03_InterfaceA, N03_InterfaceB{
    public N03_InterfaceMain(){

    }

    @Override
    public int add(int a, int b) {
        if(a<=MIN || a>=MAX)
            a = 0;
        return a+b;
    }
    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    @Override
    public int mul(int a, int b) {
        return a*b;
    }
    @Override
    public int div(int a, int b) {
        return a/b;
    }
////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args){
        System.out.println("\n# Sequence 01 __________________________________");
        N03_InterfaceMain im = new N03_InterfaceMain();
        System.out.println("im.add(50,100) -> " + im.add(50,100));
        System.out.println("im.sub(100,50) -> " + im.sub(100,50));
        System.out.println("im.mul(100,10) -> " + im.mul(100,10));
        System.out.println("im.div(100,10) -> " + im.div(100,10));

        System.out.println("\n# Sequence 01 __________________________________");
        // 해당하는 인터페이스에 없는 메소드는 사용할 수 없음
        N03_InterfaceA ia = new N03_InterfaceMain();
        System.out.println(ia.getClass().getName() + " -> ia.add(40,40) -> "  + ia.add(40,40));
        System.out.println(ia.getClass().getName() + " -> ia.sub(40,40) -> " + ia.sub(40,40));

        // B는 C를 상속받았기에 div 메소드를 사용할 수 있음
        N03_InterfaceB ib = new N03_InterfaceMain();
        System.out.println(ib.getClass().getName() + " -> ib.mul(40,40) -> "  + ib.mul(40,40));
        System.out.println(ib.getClass().getName() + " -> ib.div(40,40) -> "  + ib.div(40,40));

        N03_InterfaceC ic = new N03_InterfaceMain();
        System.out.println(ic.getClass().getName() + " -> ic.div(40,40) -> " + ic.div(40,40));
        N03_InterfaceA test = (N03_InterfaceA) ic;
        System.out.println(test.getClass().getName() + " -> test.add(40,40) -> " + test.add(40,40));
        System.out.println(test.getClass().getName() + " -> test.sub(40,40) -> " + test.sub(40,40));
    }
}
