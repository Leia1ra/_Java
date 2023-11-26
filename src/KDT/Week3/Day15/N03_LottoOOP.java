package KDT.Week3.Day15;

import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class N03_LottoOOP {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        do{
            System.out.print("게임 수 -> ");
            int cnt = scan.nextInt();
            int rand; // 보너스 번호로 사용한다.
            // 번호생성
            for(int i = 1; i<=cnt; i++){
                // 번호 저장할 객체, 중복제거, 정렬
                TreeSet<Integer> lotto = new TreeSet<Integer>();
                while(true){
                    rand = r.nextInt(45) + 1;
                    lotto.add(rand);
                    // 번호 7개 있으면 반복문 중지
                    if(lotto.size() >= 7){
                        break;
                    }
                }
                // ts에서 rand(보너스 번호)를 제거함
                lotto.remove(rand);
                //출력
                System.out.print(i+"게임 -> ");
                System.out.print(lotto);
                System.out.println(", 보너스 -> " + rand);
            }
        }while(true);
    }
}

// 규칙 1, 배열 사용하지 말것
class Lotto{
    static final int L_MAX = 7;
    Scanner scan = new Scanner(System.in);
    TreeSet<Integer> l_Num;

    public Lotto() {

    }
    TreeSet<Integer> NumCreater(int g){
        l_Num = new TreeSet<Integer>();
        for(int i = 0; i<L_MAX; i++){

        }

        return l_Num;
    }
}
