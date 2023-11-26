package KDT.Week1.api;

import java.util.Arrays;
import java.util.Collections;

public class D5_N9ArraysTest {
    public static void main(String a[]){
        int data1[] = {52, 12, 95, 78, 45, 19, 52, 32};

        System.out.println("정렬 전 -> " + Arrays.toString(data1));
        Arrays.sort(data1);
        System.out.println("정렬 후 -> " + Arrays.toString(data1));

        // 배열의 일부값만 정렬하기
        int data2[] = {52, 86, 95, 75, 41, 15, 93, 46, 25};
        System.out.println("정렬 전 => " + Arrays.toString(data2));

        Arrays.sort(data2,2 ,5);
        System.out.println("정렬 후 => " + Arrays.toString(data2));

        // 문자형 배열 정렬
        String[] data3 = new String[]{"2", "홍", "A"};
        System.out.println("정렬 전 -> " + Arrays.toString(data3));
        Arrays.sort(data3);
        System.out.println("정렬 후 -> " + Arrays.toString(data3));
        // 내림차순으로 정렬
        Arrays.sort(data3, Collections.reverseOrder());
        System.out.println("내림차순 -> " + Arrays.toString(data3));

        // 배열 복사
        int[] data4 = Arrays.copyOfRange(data2, 3,7);
        System.out.println(Arrays.toString(data4));
    }
}
