package KDT.Week3.Day11;

import java.text.MessageFormat;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;

public class N02_FormatTest {
    public N02_FormatTest() {

    }
    public void start(){
        // 오늘날짜 -> 2023-07-31(월) 12:41 오전
        Calendar cal = Calendar.getInstance();

        // SimpleDateFormat : 원하는 형식(Format)으로 날짜 서식 지정
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd(E) hh:mm a");

        // 포멧에 날자 세팅
        String fmtTxt = fmt.format(cal.getTime());
        System.out.println(fmtTxt);

        //2. 숫자데이터의 포멧 만들기
        int numData = 25_426_442;
        DecimalFormat df = new DecimalFormat("$#,###원");
        System.out.println(numData + " -> " +df.format(numData));

        //3. 데이터를 원하는 형식의 문자열로 만들기
        String username = "이선왕";
        String tel = "010-7229-1197";
        String msgFormat = MessageFormat.format("회원명:{0}\t연락처:{1}\t주소:{2}", username,tel,"익산시 익산대로 56길 60");
        System.out.println(msgFormat);

    }

    public static void main(String[] args){
        new N02_FormatTest().start();
    }
}
