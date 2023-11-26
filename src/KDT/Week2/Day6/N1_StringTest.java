package KDT.Week2.Day6;

import java.util.Arrays;

public class N1_StringTest {
    public static void main(String[] args){
        String name1 = "홍길동"; // 200번지
        String name2 = "홍길동"; // 200번지

        String username1 = new String("홍길동");
        String username2 = new String("홍길동");
        System.out.println("name1 -> " + name1); // 300번지
        System.out.println("name2 -> " + name2); // 400번지
        int a = 250;
        System.out.println("#test1___________________________");
        if(name1 == name2) { // 얘는 주소가 같아서 참
            System.out.println("name1과 name2는 같다.");
        } else {
            System.out.println("name1과 name2는 다르다.");
        }

        System.out.println("\n#test2___________________________");
        if(username1 == username2){ // 얘는 주소 비교시 달라서 거짓
            System.out.println("username1과 username2는 같다.");
        } else {
            System.out.println("username1과 username2는 다르다.");
        }

        System.out.println("\n#test3___________________________");
        if(username1.equals(username2)){ // 얘는 값이 같은지를 비교하기에 참
            System.out.println("username1과 username2는 같다.");
        } else {
            System.out.println("username1과 username2는 다르다.");
        }

        System.out.println("\n#test4___________________________");
        name1 = name1 + "입니다.";
        name1 = name1 + "문자열확인중";
        if(name1 == name2) { // 얘는 주소가 같아서 참
            System.out.println("name1과 name2는 같다.");
        } else {
            System.out.println("name1과 name2는 다르다.");
        }

        System.out.println("\n#test5___________________________");
        String str = "Java Programing string Test...";
        System.out.println("charAt()    = 문자열을 배열처럼 -> " + str.charAt(3));
        System.out.println("concat      = 문자열을 이어줌 -> " + str.concat(name1));
        byte[] ascii = str.getBytes();
        System.out.println("ascii       = 문자열을 아스키코드를 구하여 배열로 리턴 -> " + Arrays.toString(ascii));

        System.out.println("indexOf     = 앞에서부터 처음 만나는 문자의 인덱스 -> " + str.indexOf("a"));
        System.out.println("lastIndexOf = 뒤에서부터 처음 만나는 문자의 인덱스 -> " + str.lastIndexOf("a"));

        System.out.println("length      = 글자수 -> " + str.length());

        String str2 = str.replaceAll("a", "에이");
        System.out.println("replaceAll  = 특정 문자 치환 -> " + str2);

        String tel = "010-7229-1197";
        String[] phone = tel.split("-");
        System.out.print("split       = 문자열 나누어 배열로 저장 -> [ ");
        for(String k : phone){
            System.out.print(k + " ");
        }
        System.out.println("]");

        System.out.println("toLowerCase = 소문자로 변환 -> " + str.toLowerCase());
        System.out.println("toUpperCase = 대문자로 변환 -> " + str.toUpperCase());

        System.out.println("substring   = 특정 인덱스부터의 문자열 얻어오기 -> " + str.substring(7));
        System.out.println("substring   = 인덱스 사이의 문자열 얻어오기 -> " + str.substring(5,15));

        String txt = "  java Pro gram ing   ";
        System.out.println("trim        = 양쪽의 공백 문자열 제거 -> " + txt.trim() + "\\ ㅎㅇ");
        String data1 = "JAVA";
        String data2 = "james";
        System.out.println("equals              = 문자열 비교, 대소문자 구별o -> " + data1.equals(data2));
        System.out.println("equalsIgnoreCase    = 문자열 비교, 대소문자 구별x -> " + data1.equalsIgnoreCase(data2));
        // 문자열의 인덱스끼리 비교
        // - 이면 오른쪽의 변수의 문자열이 크다.
        // + 이면 오른쪽의 변수의 문자열이 작다.
        // 0 이면 같다.
        System.out.println("compareTo           = 크기비교, 대소문자 구별o -> " + data1.compareTo(data2));
        System.out.println("compareToIgnoreCase = 크기비교, 대소문자 구별x -> " + data1.compareToIgnoreCase(data2));
        if      (data1.compareTo(data2) > 0)
            System.out.println(data1 + "가 " + data2 + "보다 크다.");
        else if (data1.compareTo(data2) < 0)
            System.out.println(data2 + "가 " + data1 + "보다 크다.");
        else
            System.out.println("서로 같다.");

        int num = 1234;
        String result1 = num + "";
        String result2 = String.valueOf(num);
        char[] chars = {'객','체','지','향'};
        String result3 = String.valueOf(chars);
        System.out.println("valueOf = 다른타임의 데이터 문자열로 변환 -> " + result3);

        // String : 문자열 연산이 적고 멀티쓰레드 환경인 경우
        // StringBuffer : 문자열 연산이 많고, 멀티쓰레드 환경인 경우
        // StringBuilder : 문자열 연신이 많고, 단일쓰레드거나 동기화를 고려하지 않아도 되는 경우

        // int[] arr_a = new int[]{1,2,3};
        // int[] arr_b = arr_a;
        // arr_a[2] = 4;
        // System.out.println(Arrays.toString(arr_b));
    }
}
