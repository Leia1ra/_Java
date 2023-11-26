package KDT.Alorithm.Day1;

public class N03_ForEx {
    public static void main(String args[]){
        for(int i = 1; i<=50; ++i){
            int j;
            for(j = 2; j<=i; ++j){
                if(i%j == 0)
                    break;
            }
            if(i==j){
                System.out.print(i + " ");
            }
        }
    }
}
