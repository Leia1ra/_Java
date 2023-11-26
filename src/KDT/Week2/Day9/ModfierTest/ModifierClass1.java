package KDT.Week2.Day9.ModfierTest;

public class ModifierClass1 {
    protected String productName = "Protected 다른패키지에 있음";
    protected int price = 100;
    public ModifierClass1(int a){
        System.out.println(a + productName + price);
    }
    protected ModifierClass1(){
        System.out.println(productName + price);
    }

    public void Public(){
        System.out.println("Public_Test Hello");
    }
    protected void Protected(){
        System.out.println("Protected_Test Hello");
    }
    void Default(){
        System.out.println("Default_Test and Package-private Hello");
    }

    private void Private(){
        System.out.println("Private_Test Hello");
    }
}
