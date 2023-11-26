package KDT.KDT_assignment;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Lotto {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();


        int loop_time;
        int flag = 1;
        int[] lotto_nums = new int[6];

        while(flag == 1){
            System.out.print("게임수 -> ");
            loop_time = scan.nextInt();
            for(int i = 1; i <= loop_time; i++){
                for(int idx = 0; idx<lotto_nums.length; idx++){
                    lotto_nums[idx] = rand.nextInt(45) + 1;
                    //중복 검사
                    for (int duplication = 0; duplication < idx; duplication++){
                        if (lotto_nums[duplication] == lotto_nums[idx]) {
                            idx--;
                            break;
                        }
                    }
                }
                int bonus = rand.nextInt(45) + 1;
                for (int duplication = 0; duplication < lotto_nums.length; duplication++){
                    if (lotto_nums[duplication] == bonus) {
                        bonus = rand.nextInt(45) + 1;
                        break;
                    }
                }
                Arrays.sort(lotto_nums);
                System.out.printf("%d게임 -> %s \t, bonus = %d\n", i, Arrays.toString(lotto_nums), bonus);
            }
            do{
                System.out.print("계속하시겠습니까(1:예, 2:아니오)? ");
                flag = scan.nextInt();
                if(flag != 1 && flag != 2){
                    System.out.println("잘못입력하셨습니다.");
                }
            }while(flag != 1 && flag != 2);
        }
    }
}
