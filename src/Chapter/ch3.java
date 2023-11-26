package Chapter;

// 2장 49페이지 부터
public class ch3 {
    public static void main_ch3(){
        // 2장 50pg 2-10 : if문 사용하기
        System.out.println("\n# 2장 50pg 2-10\t: if문 사용하기__________________");
        If_condition.single_if();

        // 2장 52pg 2-11	: if-else 사용하기
        System.out.println("\n# 2장 52pg 2-11\t: if-else 사용하기______________");
        If_condition.if_else();

        // 2장 54pg 2-12	: 다중 if-else로 학점 매기기
        System.out.println("\n# 2장 54pg 2-12\t: 다중 if-else로 학점 매기기_______");
        If_condition.multiple_if(90);

        // 2장 55pg 2-13	: 중첩 if-else문 사례
        System.out.println("\n# 2장 55pg 2-13\t: 중첩 if-else문 사례____________");
        If_condition.overlap_if(90, 4);

        // 2장 57pg 2-14	: switch 문으로 학점 매기기
        System.out.println("\n# 2장 57pg 2-14\t: switch 문으로 학점 매기기________");
        Switch_condition.grading_Switch(90);

        // 2장 60pg 2-14	: switch 문 활용
        System.out.println("\n# 2장 60pg 2-14\t: switch 문 활용________________");
        Switch_condition.coffee_Switch("에스프레소");

        // 3장 07pg 3-1 : for문을 이용하여 1부터 10까지 합 출력
        System.out.println("\n# 3장 07pg 3-1\t: for문을 이용하여 1부터 10까지 합 출력");
        Iteration_loop.for_loop();

        // 3장 10pg 3-2 : -1이 입력될 때까지 입력된 수의 평균 구하기
        System.out.println("\n# 3장 10pg 3-2\t: -1이 입력될 때까지 입력된 수의 평균 구하기");
        Iteration_loop.while_loop();

        // 3장 13pg 3-3 : a-z까지 출력
        System.out.println("\n# 3장 13pg 3-3\t: a-z까지 출력_____________________");
        Iteration_loop.do_while_loop();

        // 3장 15pg 3-4 : 2중 중첩을 이용한 구구단
        System.out.println("\n# 3장 15pg 3-4\t: 2중 중첩을 이용한 구구단_____________");
        Iteration_loop.overlap_loop();

        // 3장 17pg 3-5	: continue 문을 이용하여 양수 합 구하기
        System.out.println("\n# 3장 17pg 3-5\t: continue 문을 이용하여 양수 합 구하기_");
        Iteration_loop.loop_continue();

        // 3장 19pg 3-6	: break 문을 이용하여 while 문 벗어나기
        System.out.println("\n# 3장 19pg 3-6\t: break 문을 이용하여 while 문 벗어나기_");
        Iteration_loop.loop_break();

        // 3장 27pg 3-7	: 배열에 입력받은 수 중 제일큰수 찾기
        System.out.println("\n# 3장 27pg 3-7\t: 배열에 입력받은 수 중 제일큰수 찾기______");
        Array a = new Array();
        a.array_Access();

        // 3장 29pg 3-8	: 배열 원소의 평균 구하기
        System.out.println("\n# 3장 29pg 3-8\t: 배열 원소의 평균 구하기_______________");
        a.array_Length();

        // 3장 31pg 3-9	: for-each문 활용
        System.out.println("\n# 3장 31pg 3-9\t: for-each문 활용___________________");
        a.ex_foreach();

        // 3장 34pg 3-10	: 2차원 배열로 4년 평점 구하기
        System.out.println("\n# 3장 34pg 3-10\t: 2차원 배열로 4년 평점 구하기__________");
        System.out.println("# 3장 37pg 3-11\t: 비정방형 배열의 생성과 접근____________");
        a.Array_2dimension();

        // 3장 40pg 3-12	: 배열 리턴
        System.out.println("\n# 3장 40pg 3-12\t: 배열 리턴_________________________");
        int intArray[] = a.makeArray();
        for(int k : intArray)
            System.out.print(k + " ");
        System.out.println();

        // 3장 50pg 3-15	: 0으로 나눌 때 발생하는 ArithmeticException 예외 처리
        System.out.println("\n# 3장 50pg 3-15\t: 0으로 나눌 때 발생하는 ArithmeticException 예외 처리");
        a.try_catch_finally(0,5);
    }
}

class If_condition {
    static void single_if(){
//        Scanner scan = new Scanner(System.in);
        int score = 90;//scan.nextInt(); // 귀찮음
        if(score >= 80)
            System.out.println(score + "점, 축하합니다! 합격입니다.");
//        scan.close();
    }
    static void if_else(){
//        Scanner scan = new Scanner(System.in);
        int num = 90;//scan.nextInt();
        if(num % 3 ==0)
            System.out.println(num + "은 3의 배수입니다.");
        else
            System.out.println(num + "3의 배수가 아닙니다.");
//        scan.close();
        String s = (num % 3 == 0) ? ((num + "은 3의 배수입니다.")) : ((num + "3의 배수가 아닙니다."));
        System.out.println(s);
    }
    static void multiple_if(int score) {
        char grade;
//        Scanner scan = new Scanner(System.in);
//        System.out.print("점수를 입력하세요 : ");
//        int score = scan.nextInt(); // 트리거가 이건듯
        if(score >= 90)
            grade = 'A';
        else if (score >= 80)
            grade = 'B';
        else if (score >= 70)
            grade = 'B';
        else if (score >= 60)
            grade = 'D';
        else
            grade = 'F';
        System.out.println("성적은 " + score + "점으로, 학점은 " + grade + " 입니다.");
//        scan.close();
    }
    static void overlap_if(int score, int year){
//        Scanner scan = new Scanner(System.in);
//        System.out.print("점수를 입력하세요 : ");
//        int score = scan.nextInt();
//        System.out.print("학년을 입력하세요 : ");
//        int year = scan.nextInt();
//        scan.close();
        if(score >=60){
            if(year != 4)
                System.out.println("합격!");
            else if(score >= 70) // 윗 결과에서 year = 4가 아니라면 윗 구문을 출력하므로 아래로 넘어오려면 year = 4여야함 = 굳이 쓸필요 없다는 의미
                System.out.println("합격!");
            else System.out.println("불합격");
        }
        else System.out.println("불합격");
    }
}
class Switch_condition {
    static void grading_Switch(int score){
        char grade;
//        Scanner scan = new Scanner(System.in);
//        System.out.print("점수를 입력하세요 : ");
//        int score = scan.nextInt();
//        scan.close();
        switch(score / 10){
            case 10:
            case 9:
                grade = 'A';    break;
            case 8:
                grade = 'B';    break;
            case 7:
                grade = 'C';    break;
            case 6:
                grade = 'D';    break;
            default:
                grade = 'F';
        }
        System.out.println("성적은 " + score + "점으로, 학점은 " + grade + "입니다.");
    }
    static void coffee_Switch(String order){
        int price = 0;
        switch(order){
            case "에스프레소":
            case "카푸치노":
            case "카페라떼":
                price = 3500;
                break;
            case "아메리카노":
                price = 2000;
                break;
            default:
                System.out.println("메뉴에 없습니다.");
        }
        if(price != 0)
            System.out.println(order + "는 " + price + "₩ 입니다.");
    }
}
class Iteration_loop{
    static void for_loop(){
        int sum = 0;
        for(int i =0; i <= 10; i++){ // 초기값; 조건식; 증감값
            sum += i;
            System.out.print(i);
            if(i<=9)
                System.out.print(" + ");
            else{
                System.out.print(" = ");
                System.out.println(sum);
            }
        }
    }
    static void while_loop(){
        int count = 0;
        double sum = 0;
        int[] n = new int[]{10,-20,30,40,-1};

        while(n[count] != -1){
            sum += n[count];
            ++count;
        }
        if(count == 0) System.out.println("입력된 수가 없습니다.");
        else{
            System.out.println("정수의 개수는 " + (count) + "개이며");
            System.out.println("총 합은 " + sum + "으로, 평균은 " + sum/(count) + " 입니다.");
        }
    }
    static void do_while_loop(){
        // 무조건 최소 한번 작업문을 실행함
        char c = 'a';
        do{
            System.out.print(c);
            c = (char)(c + 1);
        } while(c <= 'z');
    }
    static void overlap_loop(){
        for(int i = 1; i < 10; ++i){
            for(int j = 1; j < 10; ++j){
                System.out.print(i + "*" + j + "=" + i*j);
                System.out.print('\t');
            }
            System.out.println();
        }
    }
    static void loop_continue(){
        // continue : 반복문을 빠져 나가지 않으면서 다음 반복으로 진행
        int[] num = new int[]{5, -2, 6, 10, -4};
        // int num2[] = new int[5];
        int sum = 0;
        for(int i = 0; i<num.length; i++){
            if(num[i] <= 0)
                continue;
            else
                sum += num[i];
        }
        System.out.printf("양수의 합은 %d\n", sum);
    }
    static void loop_break(){
        // 반복문 하나를 완전히 빠져 나갈 때 사용
        String[] text = new String[]{"Java","no","jam","exit"};
        int i = 0;
        while(true){
            System.out.println(">>" + text[i]);
            if(text[i] == "exit")
                break;
            ++i;
        }
        System.out.println("종료");
    }
}
class Array{
    // 배열(Array) : 인덱스와 대응하는 데이터들로 이루어진 자료 구조, 한 번에 많은 메모리 공간 할당 가능
    // 배열 선언은 int intArray[];
    //      또는 int[] intArray;
    // 배열 생성은 intArray = new int[10]; 이건 안되는데?
    //      또는 int intArray[] = new int[10];
    //         |배열타입|레퍼런스변수|배열선언| = |배열생성|타입|원소개수|768
    // 배열 선언 시 초기화는 int intArray[] = {0,1,2,3,4,5,6,7,8,9};
    // 하나의 배열을 다수의 레퍼런스가 참조 가능
    int[] intArray = new int[]{5,10,20,25,300,100};
    void array_Access(){
        int max = 0;
        // Scanner scan = new Scanner(System.in);
        // for (int i = 0; i<5; ++i){
        //     intArray[i] = scan.nextInt();
        // }
        // scan.close();
        for(int n : intArray){
            if (n > max) {
                max = n;
            }
        }
        System.out.println("가장 큰 수는 " + max + "입니다.");
    }
    void array_Length() {
        int sum = 0;
        for (int i : intArray)
            sum += i;
        System.out.println("평균은 " + (double) sum / intArray.length + "입니다.");
    }
    void ex_foreach(){
        enum Week{월, 화, 수, 목, 금, 토, 일}
        int sum = 0;
        String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
        for(String s : names)
            System.out.print(s + " ");
        System.out.println();
        for(Week day : Week.values())
            System.out.print(day + "요일 ");
        System.out.println();
    }
    void Array_2dimension(){
        double[][][] s = {
                {
                    {3.0, 3.5, 4.0, 4.5},
                    {3.5, 3.5, 4.5, 4.5, 3.0}
                },
                {
                    {3.5, 4.0, 4.0},
                    {4.0, 4.5}
                },
                {
                    {4.0, 4.0, 4.0, 4.0},
                    {4.5, 4.5, 4.5, 4.5}
                },
                {
                    {3.5, 4.0},
                    {4.0}
                }
        };
        int i=0;
        int j=0;
        double sum = 0;
        System.out.print("행 : " + s.length);
        System.out.println(" | 열 : " + s[0].length);
        for(double[][] x : s){
            System.out.print(++i + "면 " + x.length + "행 ");
            for(double[] y : x){
                System.out.print(y.length + "열(합:");
                j += y.length;
                double sum_column = 0;
                for (double z : y){
                    sum_column += z;
                    sum += z;
                }
                System.out.print(sum_column + ")\t");
            }
            System.out.println(" | ");
        }
        System.out.println("평균 : " + sum/(j));
    }
    int[] makeArray(){
        int temp[] = new int[]{0,1,2,3};
        return temp;
    }
    // 컴파일 오류 : 문법에 맞지 않게 작성된 코드, 컴파일 시 발견
    // 예외(Exception) : 오작동이나 결과에 악영향을 미칠 수 있는 실행 중 발생한 오류
    void try_catch_finally(int divisor, int dividend){
        // try : 예외가 발생할 가능성이 있는 실행문(try 블록)
        // catch(처리할 예외 타입선온)
        //      예외 처리문(catch 블록)
        // finally : 예외 발생 여부과 상관없이 무조건 실행되는 문장
        try{
            System.out.println(dividend+ "를 " + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("끝");
        }
    }
}































