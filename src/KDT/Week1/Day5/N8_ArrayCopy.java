package KDT.Week1.Day5;

import java.util.Arrays;

public class N8_ArrayCopy {
    public static void main(String a[]){
        int[] arrOrg = {25, 76, 45, 91, 12};
        final int TEN = 10;
        int arrTag[] = new int[TEN];

        System.arraycopy(arrOrg, 1, arrTag, 3,3);
        for(int i = 0; i<arrTag.length; i++){
            System.out.println(arrTag[i]);
        }

        System.out.println(Arrays.toString(arrTag));
    }
}
