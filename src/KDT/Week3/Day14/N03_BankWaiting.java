package KDT.Week3.Day14;

import java.text.SimpleDateFormat;
import java.util.*;

public class N03_BankWaiting {
    public static void main(String args[]){
        Bank bw = new Bank();
        bw.bankStrat();

    }
}
class Bank{
    public static int count = 1; // 번호를 카운트할 변수
    // 손님정보(날짜, 시간, 부여번호)를 vo객체를 담을 Queue 기능의 컬렉션 객체 생성
    public static LinkedList<PersonVO> waitingList = new LinkedList<PersonVO>();
    Scanner scan = new Scanner(System.in);
    public Bank() {
    }
    public void bankStrat(){
        while(true){
            String menu;
            System.out.print("[1. in(손님), 2.out(은행원)] -> ");
            menu = scan.nextLine();

            switch (menu){
                case "1": inGuest();break;
                case "2": outGuest(); break;
                default:System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
    public void inGuest(){// 손님정보가 있는 객체 생셩
        Calendar now = Calendar.getInstance();
        PersonVO vo = new PersonVO();
        vo.setNum(count++);
        vo.setDateTime(now);

        // 대기열에 추가하기
        waitingList.offer(vo);

        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm (E)"); // E 는 요일을 의미
        String nowTxt = fmt.format(now.getTime());
        // Message출력
        System.out.println("대기인수 : " + waitingList.size() + " -> " + nowTxt + "\t, 번호 : " + vo.getNum());
    }
    public void outGuest(){
        //1. 먼저 입력된객체를 가지고 나오면
        try {
            PersonVO processing = waitingList.pop();
            System.out.println("대기인수 : " + waitingList.size() + ", 호출번호 : " + processing.getNum());
        }catch (NoSuchElementException ne){
            System.out.println("대기자가 존재하지 않습니다.");
        }

    }
}


class PersonVO {
    // Value Object
    private int num; // 부여 번호
    private Calendar dateTime;

    public int getNum() {
        return num;
    } public void setNum(int num) {
        this.num = num;
    }

    public Calendar getDateTime() {
        return dateTime;
    } public void setDateTime(Calendar dateTime) {
        this.dateTime = dateTime;
    }

    public PersonVO() {
    }
    public PersonVO(int num, Calendar dateTime) {
        this.num = num;
        this.dateTime = dateTime;
    }
}
/*
* 메뉴[1. in(손님), 2.out(은행원)] 1
* 대기인수 : 1 --> 2023-08-03 10:39, 번호:1
*
* 메뉴[1. in(손님), 2.out(은행원)] 1
* 대기인수 : 2 --> 2023-08-03 10:39, 번호:2
*
* 메뉴[1. in(손님), 2.out(은행원)] 2
* 대기인수 : 1 --> 호출번호 : 1
*
* 메뉴[1. in(손님), 2.out(은행원)] 1
* 대기인수 : 2 --> 2023-08-03 10:39, 번호:3
*/