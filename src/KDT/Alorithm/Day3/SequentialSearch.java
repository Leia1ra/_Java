package KDT.Alorithm.Day3;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
public class SequentialSearch {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("요소수 -> ");
        int n = scan.nextInt();

        // 값을 저장할 배열을 생성한다.
        int x[] = new int[n];

        for(int i = 0; i<x.length; i++){
            System.out.print("x[" + i + "] : ");
            // x[i] = scan.nextInt();
            x[i] = rand.nextInt(100) + 1;
            System.out.println(x[i]);
        }

        // 찾을 값
        System.out.print("검색할 값 -> ");
        int k = scan.nextInt();

        int idx1 = linearSearchFor(x, n, k);
        if(idx1 == -1){
            System.out.println("찾으시는 값이 존재하지 않습니다");
        } else{
            System.out.println(k + "은(는) x[" + idx1 + "]에 있습니다.");
        }

        int idx2 = linearSearchWhile(x, n, k);
        if(idx2 == -1){
            System.out.println("찾으시는 값이 존재하지 않습니다");
        } else{
            System.out.println(k + "은(는) x[" + idx2 + "]에 있습니다.");
        }
    }

    private static int linearSearchFor(int[] x, int n, int key){
        for(int i = 0; i<n; i++){
            if(x[i] == key){
                return i;
            }
        }
        return -1;
    }

    private static int linearSearchWhile(int[] x, int n, int key){
        int i = 0;
        while(i<n){
            if(x[i] == key){
                return i;
            }
            ++i;
        }
        return -1;
    }
}
