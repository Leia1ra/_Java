package KDT.Week1.Day5;

public class N1_Array01 {
    public static void main(String args[]){
        int num = 10;

        int[] dataInt;
        int numArr[];
        numArr = new int[5];

        numArr[1] = 90;
        System.out.println(numArr);
        for(int k : numArr){
            System.out.print(k + " ");
        }
        System.out.println("\n");

        for(int idx = 0; idx < numArr.length; idx++){
            System.out.print("numArr[" + idx + "] -> " + numArr[idx] + "\n");
        }
        System.out.println();

        String name[] = new String[5];
        name[1] = "홍길동";
        name[3] = "이순신";
        for(String s : name){
            System.out.println(s);
        }
    }
}
