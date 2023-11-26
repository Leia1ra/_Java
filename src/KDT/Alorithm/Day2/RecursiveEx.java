package KDT.Alorithm.Day2;

import java.util.Scanner;

/*
* 두 수를 입력받아 거듭제곱을 구하는 프로그램을 재귀호출로 작성하라
* [입력]
* 5
* 3
*
* [출력]
* 125;
*/
class RecursiveEx {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("[입력]");
        int x = scan.nextInt();
        int y = scan.nextInt();

        System.out.println("\n[출력]");
        System.out.println(power(x,y));
    }
    private static int power(int x, int y){
        if(y == 0) return 1;
        return x * power(x, y-1);
    }
}


