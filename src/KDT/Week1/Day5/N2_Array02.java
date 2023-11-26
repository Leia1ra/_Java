package KDT.Week1.Day5;

public class N2_Array02 {
    public static void main(String a[]){
        int[] num = {25, 68, 15, 45, 69, 12};

        int[] data = new int[]{25, 68, 15, 45, 69, 12};

        String[] colorName = new String[]
                {"red", "blue", "green", "yellow", "pink", "purple"};
        for(int i = 0; i < num.length; i++){
            System.out.printf("%2d -> %4d, %4d, %s\n",i ,num[i], data[i], colorName[i]);
        }
    }
}
