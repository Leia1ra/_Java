package KDT.Week2.Day9;

import KDT.Week2.Day9.ModfierTest.ModifierClass1;

public class N01_ModifierTest extends ModifierClass1{
    public static void main(String args[]){
        ModifierClass1 otherPackage = new ModifierClass1(1);
        ModifierClass2 same_Package = new ModifierClass2();
        // public 접근제한자     : (사용범위) : class(클래스), field(맴버,필드), constructor(생성자), method(메소드)
        //                  -> 어디에서든 접근을 허용한다. (공용)
        otherPackage.Public();

        // protected 접근제한자  : (사용범위) : field(맴버,필드), constructor(생성자), method(메소드)
        //                  -> 상속받은 클래스와 같은 패키지 내의 클래스만 접근을 허용한다.
        // otherPackage.Protected(); // -> 같은 클래스가 아니기에
        // 생성자가 protected이고 다른 패키지에 있으면 에러
        // ModifierClass1 protected_otherPackage = new ModifierClass1();
        same_Package.Protected();
        // System.out.println(ModifierClass1.productName); // static으로 만들어 줘야 함 메인문이 static이라

        // default 접근제한자    : (사용범위) : class(클래스), field(맴버,필드), constructor(생성자), method(메소드)
        //                  -> 같은 패키지내의 클래스만 접근을 허용한다.
        same_Package.Default();

        // private 접근제한자    : (사용범위) : field(맴버,필드), constructor(생성자), method(메소드)
        //                  -> 모든 외부의 클래스에서 접근을 제한한다.
        // samePackage.Private();
        N01_ModifierTest SamClass = new N01_ModifierTest();
        SamClass.Private_hello();

    }
    private void Private_hello(){
        System.out.println("Private_hello");
    }
}
