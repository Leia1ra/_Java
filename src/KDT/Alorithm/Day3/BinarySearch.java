package KDT.Alorithm.Day3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("요소수 -> ");
        int n = scan.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = rand.nextInt(100) + 1;
        }

        // 정렬
        Arrays.sort(arr);// 배열을 오름차순으로
        System.out.println(Arrays.toString(arr));

        System.out.print("찾을 값 : ");
        int key = scan.nextInt();
        
        int idx = binarySearch(arr, n ,key);
        if(idx == -1){
            System.out.println("찾으시는 값이 존재하지 않습니다");
        } else{
            System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
        }
    }

    private static int binarySearch(int[] arr, int n, int key) {
        int pl = 0; // 검색범위의 시작 index = 0;
        int pr = n-1; // 검색범위의 끝 index =  데이터수 - 1
        do{
            int p = (pl + pr)/2; // 중간 index
            if(arr[p] == key){
                return p;
            } else if(arr[p] > key){
                System.out.print(pr + " -> ");
                pr = p - 1;
                System.out.println(pr);
            } else if(arr[p] < key){
                System.out.print(pl + " -> ");
                pl = p + 1;
                System.out.println(pl);
            }
        }while(pr>=pl);
        return -1;
    }
}
