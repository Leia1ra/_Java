package KDT.KDT_assignment;
import java.util.Scanner;
import java.util.Random;
public class RandNumGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Answer gameStart = new Answer(rand.nextInt(100) + 1);
        int count = 0;
        int r;
        do {
            ++count;
            r = gameStart.input();
        } while (gameStart.check(r, count));
    }
}
class Answer{
    int number;
    Answer(int a){
        System.out.println("숫자맞추기게임");
        number = a;
        System.out.println(number);
    }
    int input(){
        Scanner scan = new Scanner(System.in);
        int num;
        do {
            System.out.print("1~100사이의 정수를 입력하세요 -> ");
            num = scan.nextInt();
            if(num > 100)
                System.out.println("100보다 큰 값을 입력하셨습니다.");
            else if(num < 1)
                System.out.println("1보다 작은 값을 입력하셨습니다.");
        }while(num < 1 && num > 100);
        return num;
    }
    boolean check(int num, int count){
        if(number == num){
            System.out.println("맞추었습니다...난수 => " + num);
            System.out.printf("%d번만에 맞추었습니다...", count);
            return false;
        } else if(number < num){
            System.out.println("더 작은값을 입력하세요");
        } else if(number > num){
            System.out.println("더 큰값을 입력하세요");
        }
        return true;
    }
}
