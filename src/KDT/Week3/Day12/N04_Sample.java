package KDT.Week3.Day12;

public class N04_Sample {
    int num = 9999;
    public N04_Sample() {
    }
    // 합
    public void sum(){
        int sum = 0;
        for(int i = 1; i<=100;i++)
            sum += i;
        System.out.println("sum -> " + sum);
    }
    // 합
    public void oddsum(){
        int sum = 0;
        for(int i = 1; i<=100; i+=2)
            sum += i;
        System.out.println("oddsum -> " + sum);
    }
}
