package KDT.Alorithm.Day2;

import java.io.*;
// import java.util.Arrays;
import java.util.Scanner;

public class N05_Solution {
    public static void main(String args[]){
        try {
            // setData();
            // 데이터 가져오기
            System.setIn(new FileInputStream("/Volumes/Disk_2ra/Code/Back_End/Java/_Java/src/KDT/Alorithm/N05_input1204.txt"));

            Scanner scan = new Scanner(System.in);
            int cnt = scan.nextInt();

            for(int i=1; i<=cnt; i++){  // 문제 수만큼 반복
                int num = scan.nextInt(); // 문제 번호
                int[] numCnt = new int[101];
                for(int j = 1; j<=1000; j++){ // 천번 반복
                    numCnt[scan.nextInt()]++;
                }
                // System.out.println(Arrays.toString(numCnt));
                // 최빈수
                int maxIdx = 0;
                for(int c=1;c<numCnt.length; c++){
                    if(numCnt[maxIdx] <= numCnt[c]){
                        maxIdx = c;
                    }
                }
                System.out.printf("#%d %d\n", num, maxIdx);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    static void setData(){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            int num = scan.nextInt();
            int[] arr = new int[10];
            for(int j = 1; j<=10; j++){
                arr[scan.nextInt()]++;
            }
            int sum = 0;
            for(int r = 0; r<10; r++){
                sum += arr[r];
            }
            System.out.println("#" + test_case + " " + sum);
        }
    }

}
