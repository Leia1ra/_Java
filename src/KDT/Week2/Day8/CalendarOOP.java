package KDT.Week2.Day8;

import java.util.Calendar;
import java.util.Scanner;

class CalOOPMain {
    public static void main(String[] args) {
        CalendarOOP c = new CalendarOOP();
        c.cal_Assamble();
    }
}


class CalendarOOP {
    static final String RED = "\u001B[31m";
    static final String BLUE = "\u001B[34m";
    static final String EXIT = "\u001B[0m";

    Scanner scan = new Scanner(System.in);
    Calendar cal = Calendar.getInstance();
    int year;
    int month;
    CalendarOOP(){
        System.out.print("년도\t-> ");
        this.year = scan.nextInt();
        System.out.print("월\t-> ");
        this.month = scan.nextInt();
    }
    CalendarOOP(int y, int m){
        this.year = y;
        this.month = m;
    }
    // 달의 시작요일 리턴
    int week_of_day(){
        cal.set(year, month-1,1);
        return cal.get(Calendar.DAY_OF_WEEK);
    }
    // 달의 마지막일 리턴
    int end_of_Month(){
        int end_of_Month = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> { // 윤년
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                    yield 29;
                else
                    yield 28;
            }
            default -> 0;
        };
        return end_of_Month;
    }
    // 출력
    void cal_Print(int wod, int eom){
        System.out.printf("\t\t%d년 %d월\n", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1);
        System.out.println(RED + "일" + EXIT +"\t월\t화\t수\t목\t금\t"+ BLUE + "토" + EXIT);
        // 달력(공백)
        for(int i = 1; i < wod; i++){
            System.out.print("\t");
        }
        // 달력(날짜)
        for(int i = 1; i <= eom; i++){
            if(wod % 7 == 1){
                System.out.print(RED + i + EXIT + "\t") ;
            } else if(wod % 7 == 0){
                System.out.print(BLUE + i + EXIT) ;
                System.out.println();
            } else{
                System.out.print(i + "\t") ;
            }
            wod++;
        }
    }

    void cal_Assamble(){
        int wod = week_of_day();
        int eom = end_of_Month();
        cal_Print(wod, eom);
    }
}

