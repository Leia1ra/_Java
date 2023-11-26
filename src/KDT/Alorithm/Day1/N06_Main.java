package KDT.Alorithm.Day1;

import java.util.Scanner;
public class N06_Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        while(true){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            if(a > b && a > c && b > c)
                System.out.println(b);
            else if (a > b && a > c && b < c)
                System.out.println(c);

            else if(a < b && a > c && b > c)
                System.out.println(a);
            else if(a < b && a < c && b > c)
                System.out.println(c);

            else if(a > b && a < c && b < c)
                System.out.println(a);
            else if(a < b && a < c && b < c)
                System.out.println(b);
        }
    }
}
