package KDT.Week2.Day6;

import java.util.StringTokenizer;

public class N3_StringTokenizerTest {
    public static void main(String[] args){
        StringTokenizer st = new StringTokenizer("빨강,,,,노랑,파랑/초록,,,",",/");
        System.out.println("토큰 수 -> " + st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

    }
}
