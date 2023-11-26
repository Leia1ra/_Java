package KDT.KDT_assignment;

public class GuGudan {
    public static void main(String args[]){
        System.out.printf("%12s","구구단\n");
        for(int i = 1; i <= 9; i+=3){
            for(int _i = 0; _i <= 2; _i++){
                System.out.printf("==%d단==\t",i+_i);
            }
            System.out.println();

            for(int j = 2; j <=9; j++){
                for(int r = i; r <= i+2; r++){
                    System.out.printf("%d*%d=%-2d\t",r ,j, r*j);
                }
                System.out.println();
            }
        }
    }
}
