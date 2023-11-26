package KDT.KDT_assignment;
import java.util.Scanner;
public class Diamond {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int max;
        do{
            System.out.print("임의의 홀수입력(1~49) -> ");
            max = scan.nextInt();
        }while(max % 2 == 0 || max > 50);

        char word = 'A';
        for(int i = 1; i <= max; i += 2){
            for(int space = 1; space <= (max-i)/2; space++){
                System.out.print(" ");
            }
            for(int w = 1; w <= i; w++){
                if(word >= (int)'A' && word <= (int)'Z'){
                    System.out.printf("%c",word++);
                }else{
                    word = 'A';
                    System.out.printf("%c",word++);
                }
            }
            System.out.println("");
        }
        for(int i = max-2; i >= 0; i -= 2){
            for(int space = 1; space <= (max-i)/2; space++){
                System.out.print(" ");
            }
            for(int w = 1; w <= i; w++){
                if(word >= (int)'A' && word <= (int)'Z'){
                    System.out.printf("%c",word++);
                }else{
                    word = 'A';
                    System.out.printf("%c",word++);
                }
            }
            System.out.println("");
        }

        scan.close();
    }
}
