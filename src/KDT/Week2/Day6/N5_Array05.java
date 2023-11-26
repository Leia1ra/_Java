package KDT.Week2.Day6;

import java.util.Arrays;

public class N5_Array05 {
    public static void main(String[] args){
        // 2차원 배열
        int num[][] = new int[5][5];
        num[2][1] = 90;
        num[0][2] = 85;
        num[4][3] = 75;
        // System.out.println(num.length);
        for(int i = 0; i < num.length; i++){
            System.out.println(Arrays.toString(num[i]));
        }
        System.out.println();
        // 행의 수
        for(int i = 0; i < num.length; i++){
            // 열의 수
            for(int j = 0; j < num[i].length; j++){
                System.out.printf("%-3d",num[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        // 2차원배열의 배열 생성시 초기갑 설정하기
        String[][] jusorok = {
                {"홍길동", "010-1234-1234", "aaa@naver.com"},
                {"이순신", "010-5678-5678", "bbb@naver.com"},
                {"안중근", "010-9090-9090", "ccc@naver.com"}
        };
        for(String[] k : jusorok){
            for(String p : k){
                System.out.print(p + "\t");
            }
            System.out.println();
        }

        // 2차원의 행마다 열의 수를 다르게 설정하기
        int data[][] = new int [3][];
        int idx = 3;
        for(int i = 0; i < data.length; ++i){
            data[i] = new int[idx];
            ++idx;
        }
        data[2][1] = 100;
        data[1][2] = 90;
        data[0][0] = 80;
        for(int a[] : data){
            for(int b: a){
                System.out.printf("%-4d",b);
            }
            System.out.println();
        }
    }
}
