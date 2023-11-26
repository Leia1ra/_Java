package KDT.Alorithm.Day4;

import java.util.Arrays;
import java.util.Scanner;

public class SwitchONOFF {
    static int[] switches;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        switches = new int[scan.nextInt()];
        for(int i = 0; i<switches.length; i++){
            int a = scan.nextInt();
            switches[i] = a;
        }
        int stuCnt = scan.nextInt();
        for(int i = 0; i<stuCnt; i++){
            int gender = scan.nextInt();
            int switNo = scan.nextInt();
            switch(gender){
                case 1:
                    mail(switNo);
                    break;
                case 2:
                    femail(switNo);
                    break;
                default:
                    break;
            }
        }
        for(int k : switches){
            System.out.print(k + " ");
        }
    }
    private static void mail(int switNo){
        for(int i = switNo; i<=switches.length; i+=switNo){
            switches[i-1] ^= 1;
            System.out.println(Arrays.toString(switches));
        }
    }
    private static void femail(int switNo) {
        int s = switNo - 1; // 2 4
        int left = s - 1;   // 1 3
        int right = s + 1;  // 3 5

        while(true){
            if((left <=0 || right >= switches.length) || switches[left] != switches[right] ){
                System.out.println(left + ", gd " + right);
                break;
            }left--;
            right++;
            System.out.println(left + ", " + right);
        }
        for(int i = left+1; i<=right-1; i++){
            switches[i] ^= 1;
            System.out.println(i + Arrays.toString(switches));
        }


    }
}