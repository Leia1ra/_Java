package Standard_Java;

class ObjectClass{
    String v1 = new String("abc");
    String v2 = new String("abc");
    ObjectClass(){
        System.out.println("\n# 예제 8-21 440pg ______________________");
        if(v1.equals(v2)){
            System.out.println("v1 과 v2는 같습니다");
        } else {
            System.out.println("v1 과 v2는 다릅니다");
        }

        System.out.println("참조변수의 값 비교");
        if(v1 == v2){
            System.out.println("v1 과 v2는 같습니다");
        } else {
            System.out.println("v1 과 v2는 다릅니다");
        }
    }
}




public class _SJCH09 {
    public static void main(String[] args){
        new ObjectClass();
    }
}
