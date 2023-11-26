package KDT.Week1.api;

import java.util.Calendar;

public class D4_N10CalendarTest {
    public static void main(String[] args) {
        //
        Calendar date = Calendar.getInstance();
        System.out.println(date);

        date.set(2024, Calendar.MARCH, 15);// 년월일 변경
        date.set(Calendar.MONTH, 6); // 월 변경 3 -> 7월
        date.set(Calendar.YEAR, 2022); // 년 변경

        int year = date.get(Calendar.YEAR); // ()안에 1이라고 써도 됨
        int month = date.get(Calendar.MONTH) + 1;
        int day = date.get(Calendar.DATE);

        String ampm = (date.get(Calendar.AM_PM) == 0)? "오전" : "오후";
        int hour = date.get(Calendar.HOUR);
        int _24hour = date.get(Calendar.HOUR_OF_DAY);
        int minute = date.get(Calendar.MINUTE);
        String day_of_Week = switch (date.get(Calendar.DAY_OF_WEEK)) {
            case 1 -> "일";
            case 2 -> "월";
            case 3 -> "화";
            case 4 -> "수";
            case 5 -> "목";
            case 6 -> "금";
            case 7 -> "토";
            default -> "";
        };
        // 2023년 07월 20일 오후 4시 36분(목)
        System.out.printf("%d년 %d월 %d일 %s %d시 %d분(%s)\n",
                year, month, day, ampm, hour, minute,day_of_Week);
        // 2023-07-20(목) 16:36;
        System.out.printf("%d-%d-%d(%s) %d:%d\n",
                year, month, day, day_of_Week, _24hour, minute);
    }
}
