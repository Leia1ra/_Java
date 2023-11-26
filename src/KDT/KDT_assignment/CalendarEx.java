package KDT.KDT_assignment;
import java.util.Scanner;
import java.util.Calendar;

public class CalendarEx {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();

        System.out.print("년도\t-> ");
        int y = scan.nextInt();
        System.out.print("월\t-> ");
        int m = scan.nextInt();

        cal.set(y, m-1,1);
        System.out.printf("\t\t%d년 %d월\n", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1);
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        int week_of_day = cal.get(Calendar.DAY_OF_WEEK);

        // 달의 마지막 일
        /*int end_of_Month = switch (m){
            case 1,3,5,7,8,10,12 -> 31;
            case 4,6,9,11 -> 30;
            case 2 -> { // 윤년
                if((y % 4 == 0 && y % 100 != 0) || y%400 == 0)
                    yield 29;
                else
                    yield 28;
            }
            default -> 0;
        };*/
        // System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH)); // 테스트용
        int end_of_Month = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        // 달력(공백)
        for(int i = 1; i < week_of_day; i++){
            System.out.print("\t");
        }
        // 달력(날짜)
        for(int i = 1; i <= end_of_Month; i++){
            System.out.printf("%d\t", i);
            if(week_of_day % 7 == 0) {
                System.out.println();
            }
            week_of_day++;
        }
    }
}
