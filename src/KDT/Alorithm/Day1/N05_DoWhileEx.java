package KDT.Alorithm.Day1;

import java.util.Random;

public class N05_DoWhileEx {
    public static void main(String args[])
    {
        Random r = new Random();
        int buffer = 0;
        int i =0;
        do{
            // int rand = (int)(Math.random()*(90-65-1)) + 65;
            int rand = r.nextInt(25)+65;
            System.out.print(rand+" ");
            if(buffer < rand){
                buffer = rand;
            }
            ++i;
        }while(i < 10);
        System.out.println();
        System.out.println(buffer);
    }
}
