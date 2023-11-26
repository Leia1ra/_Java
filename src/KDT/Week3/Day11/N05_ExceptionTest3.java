package KDT.Week3.Day11;

public class N05_ExceptionTest3 {
    public N05_ExceptionTest3() {

    }
    public void start() throws ClassNotFoundException{
        Class cls = Class.forName("java.lang.String2");
    }

    public static void main(String args[]){
        N05_ExceptionTest3 et3 = new N05_ExceptionTest3();
        try {
            et3.start();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            // throw new RuntimeException(e);
        }
    }

}
