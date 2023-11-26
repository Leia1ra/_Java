package KDT.Week2.Day9;

public class ModifierClass2 {
    protected String productName = "컴퓨터";
    protected int price = 120;
    public ModifierClass2(int a){
        System.out.println(a + productName + price);
    }
    protected ModifierClass2(){
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
