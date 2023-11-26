package KDT.KDT_assignment;
import java.util.Scanner;
public class Dim2_Array_achievement {
    public static void main(String a[]){
        final int SUBJECT = 3;
        final int PROCESS = SUBJECT + 3;

        final int TOTAL = PROCESS - 3;
        final int AVERAGE = PROCESS - 2;
        final int RANK = PROCESS - 1;

        Scanner scan = new Scanner(System.in);

        System.out.print("학생수 -> ");
        int student = scan.nextInt();
        StringBuilder[] menu = new StringBuilder[]{
                new StringBuilder("이름"),
                new StringBuilder("국어"),
                new StringBuilder("영어"),
                new StringBuilder("수학"),
                new StringBuilder("총점"),
                new StringBuilder("평균"),
                new StringBuilder("석차")
        };

        StringBuilder[] st_name = new StringBuilder[student + 2];
        int[][] st_grade = new int[student + 2][PROCESS];

        // 데이터 처리
        for(int st_count = 0; st_count < student; ++st_count){
            // 학생 이름 입력
            System.out.printf("학생%s -> ", menu[0]);
            st_name[st_count] = new StringBuilder(scan.next());
            // 학생 성적 입력/처리
            for(int sub_count = 0; sub_count < SUBJECT; ++sub_count){
                System.out.printf("%s -> ", menu[1+sub_count]);
                st_grade[st_count][sub_count] = scan.nextInt();
                st_grade[st_count][TOTAL] += st_grade[st_count][sub_count];
            }
            st_grade[st_count][AVERAGE] = st_grade[st_count][TOTAL]/SUBJECT;
        }

        // 석차 처리
        for(int i = 0; i < student; ++i){
            int buffer = 1;
            // 1명씩 전체 학생과 비교
            for(int j = 0; j < student; ++j){
                // 큰 값이 나올때마다 등수 올려주기
                if(st_grade[j][AVERAGE] > st_grade[i][AVERAGE])
                    ++buffer;
            }
            // 등수 저장
            st_grade[i][RANK] = buffer;
        }

        // 전체 성적 처리
        st_name[student] = new StringBuilder("총점");
        st_name[student+1] = new StringBuilder("평균");

        for(int culumn = 0; culumn < SUBJECT; ++culumn){
            int sum = 0;
            for(int row = 0; row < student; ++row){
                sum += st_grade[row][culumn];
            }
            st_grade[student][culumn] = sum;
            st_grade[student+1][culumn] = sum/student;
        }

        // 출력
        for(StringBuilder k : menu){
            System.out.printf("%-6s", k);
        }
        System.out.println();

        for(int i = 0; i < st_grade.length; ++i){
            System.out.printf("%-6s",st_name[i]);
            for(int p : st_grade[i]){
                if(i >= student && p == 0)
                    System.out.printf("%-7s", "-");
                else
                    System.out.printf("%-7s",p);
            }
            System.out.println();
        }
    }
}
