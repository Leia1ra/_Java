package KDT.Week1.Day2;

public class N2_PrintTest {
    public static void main(String[] args){
        // 출력문(콘솔)
        // println()    : 한줄 출력하고 줄바꿈
        // print()      : 문자를 출력후 줄바꿈하지 않는다
        // printf()     : 데이터 출력시 패턴을 설정하여 출력한다.

        // 제어문자 : \", \', \n(newline:줄바꿈), \t(tab:들여쓰기), \b(backspace:한칸 뒤로..?)
        System.out.println("println()\"메소드\'를 이용한 출력문\t" + 100);
        System.out.println(200);

        System.out.print("여러번 ");
        System.out.print("출력해도 ");
        System.out.print("실행해도 ");
        System.out.println("한줄에 출력");

        double num = 10/3.0;
        System.out.println(num);
        // printf()메소드는 format을 이용하여 자릿수 설정 가능
        // printf("출력포멧형식", 변수,...); %-3d  -를 넣으면 정렬방향이 달라짐

        // 정수형 %d : %8d -> 정수를 끝에서 8칸에 맞추어 출력함
        // 8진수  %o
        // 16진수 %x
        int x = 12345, y = 20;
        System.out.printf("x : %d\n", x);
        System.out.printf("y : %5d\n", y);
        System.out.printf("x : %5d, y: %-5d\n",x , y);

        // 실수형 %f : %8.2f -> %총자릿수.소수점이하자릿수f
        System.out.printf("num : %f, format : %-5.2f\n",num,num);

        // 문자형 %s : %10s -> %총자릿수s
        // 문자형 %c -> char
        String name = "홍길동";
        String lastname = "gildong";
        System.out.printf("str = %s, str : %10s",name,lastname);
    }
}
